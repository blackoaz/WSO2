/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
import React from 'react';
import { Toolbar, AppBar } from '@material-ui/core';
import { withStyles } from '@material-ui/core/styles';
import Typography from '@material-ui/core/Typography';
import Box from '@material-ui/core/Box';
import Button from '@material-ui/core/Button';
import PropTypes from 'prop-types';
import Footer from 'AppComponents/Base/Footer/Footer';
import { FormattedMessage } from 'react-intl';
import Configurations from 'Config';
import ErrorDetails from './ErrorDetails';

const styles = (theme) => {
    return {
        appBar: {
            position: 'relative',
            background: theme.palette.background.appBar,
        },
        typoRoot: {
            marginLeft: theme.spacing(3),
            marginRight: theme.spacing(3),
            textTransform: 'capitalize',
        },
        brandLink: {
            color: theme.palette.primary.contrastText,
        },
        toolbar: {
            minHeight: 56,
            [`${theme.breakpoints.up('xs')} and (orientation: landscape)`]: {
                minHeight: 48,
            },
            [theme.breakpoints.up('sm')]: {
                minHeight: 64,
            },
        },
        menuIcon: {
            color: theme.palette.getContrastText(
                theme.palette.background.appBar,
            ),
            fontSize: 35,
        },
        errorDisplay: {
            display: 'flex',
            flexDirection: 'row',
        },
        errorDisplayContent: {
            width: 960,
            display: 'flex',
            flexDirection: 'column',
            overflow: 'auto',
        },
        errorTitle: {
            display: 'flex',
            alignItems: 'center',
            paddingTop: theme.spacing(2),
            paddingBottom: theme.spacing(2),
            '& h2': {
                paddingLeft: theme.spacing(2),
            },
        },
        link: {
            color: theme.palette.getContrastText(
                theme.palette.background.default,
            ),
        },
    };
};
/**
 * Error boundary for the application.catch JavaScript errors anywhere in their child component tree,
 * log those errors, and display a fallback UI instead of the component tree that crashed.
 * Error boundaries catch errors during rendering, in lifecycle methods,
 * and in constructors of the whole tree below them.
 * @class AppErrorBoundary
 * @extends {Component}
 */
class AppErrorBoundary extends React.Component {
    /**
     * Creates an instance of AppErrorBoundary.
     * @param {any} props @inheritDoc
     * @memberof AppErrorBoundary
     */
    constructor(props) {
        super(props);
        this.state = {
            hasError: false,
            isDetailsOpen: false,
        };
    }

    /**
     * The componentDidCatch() method works like a JavaScript catch {} block, but for components.
     * @param {Error} error is an error that has been thrown
     * @param {Object} info info is an object with componentStack key. The property has information about component
     * stack during thrown error.
     * @memberof AppErrorBoundary
     */
    componentDidCatch(error, info) {
        this.setState({ hasError: true, error, info });
    }

    /**
     * Return error handled UI
     * @returns {React.Component} return react component
     * @memberof AppErrorBoundary
     */
    render() {
        // eslint-disable-next-line no-unused-vars
        const { hasError, error, info, isDetailsOpen } = this.state;
        const { children, classes, theme } = this.props;
        // eslint-disable-next-line no-unused-vars
        const errorStackStyle = {
            background: '#fff8dc',
        };
        if (hasError) {
            return (
                <>
                    <AppBar className={classes.appBar} position='fixed'>
                        <Toolbar className={classes.toolbar}>
                            <div
                                className={classes.errorDisplay}
                                style={{ width: '100%' }}
                            >
                                <div className={classes.errorDisplayContent}>
                                    <a href={Configurations.app.context}>
                                        <img
                                            src={
                                                Configurations.app.context +
                                                theme.custom.logo
                                            }
                                            alt={`${theme.custom.title.prefix} ${theme.custom.title.suffix}`}
                                            style={{
                                                height: theme.custom.logoHeight,
                                                width: theme.custom.logoWidth,
                                            }}
                                        />
                                    </a>
                                </div>
                            </div>
                        </Toolbar>
                    </AppBar>
                    <Box
                        bgcolor='#f1f1f1'
                        flexDirection='column'
                        justifyContent='flex-start'
                        alignItems='center'
                        display='flex'
                        height={1}
                    >
                        <Box pt={2} display='flex'>
                            <img
                                src={`${Configurations.app.context}/site/public/images/robo.png`}
                                alt='OOPS'
                            />
                        </Box>
                        <Box pt={4} display='flex'>
                            <Typography variant='h2' gutterBottom>
                                <FormattedMessage
                                    id='Apis.Shared.AppErrorBoundary.something.went.wrong'
                                    defaultMessage='Oops! This is embarrassing'
                                />
                            </Typography>
                        </Box>
                        <Box pt={1} display='flex' color='text.secondary'>
                            <Typography variant='body1' gutterBottom>
                                Something went terribly wrong. Will you please
                                refresh and try again.
                            </Typography>
                        </Box>
                        <Box display='flex' mt={6}>
                            {/* eslint-disable-next-line no-restricted-globals */}
                            <Button onClick={()=> location.reload()} color='primary' variant='outlined'>
                                Refresh
                            </Button>
                            <Box ml={2} display='inline'>
                                <Button
                                    variant='outlined'
                                    onClick={() =>
                                        this.setState({ isDetailsOpen: true })
                                    }
                                >
                                    Details
                                </Button>
                            </Box>
                        </Box>
                    </Box>
                    {isDetailsOpen && (
                        <ErrorDetails
                            error={error}
                            handleClose={() =>
                                this.setState({ isDetailsOpen: false })
                            }
                        />
                    )}
                    <Footer />
                </>
            );
        } else {
            return children;
        }
    }
}

AppErrorBoundary.propTypes = {
    children: PropTypes.node.isRequired,
    classes: PropTypes.shape({
        appBar: PropTypes.string,
        toolbar: PropTypes.string,
        errorDisplay: PropTypes.string,
        errorDisplayContent: PropTypes.string,
        errorTitle: PropTypes.string,
        link: PropTypes.string,
    }).isRequired,
    theme: PropTypes.shape({
        custom: PropTypes.shape({
            logo: PropTypes.string,
            title: PropTypes.shape({}),
        }),
    }).isRequired,
};

export default withStyles(styles, { withTheme: true })(AppErrorBoundary);
