(this.webpackJsonp=this.webpackJsonp||[]).push([[32],{5018:function(e,t,a){"use strict";a.r(t);var n=a(2),i=a.n(n),o=a(22),r=a.n(o),l=a(1213),s=a(1655),c=a(1679),m=a(1666),p=a(1262),d=a(4994),g=a(4991),u=a(1238),h=a.n(u),f=a(1462),E=a(25);const x=Object(m.a)(e=>({root:{position:"relative",display:"flex"},imageBox:{width:"100%",height:"auto"},arrows:{position:"absolute",zIndex:2,display:"flex",flex:1,height:"100%",background:"#00000044",justifyContent:"center",alignItems:"center",cursor:"pointer","& span":{fontSize:60,color:e.palette.getContrastText("#000000")}},arrowLeft:{left:0},arrowRight:{right:0},slideContainer:{width:"100%",zIndex:1,display:"flex",flex:1,justifyContent:"center"},slideContentWrapper:{position:"absolute",background:"#00000044",color:e.palette.getContrastText("#000000"),bottom:0,padding:e.spacing(2)},slideContentTitle:{fontWeight:e.typography.fontWeightLight,fontSize:e.typography.h3.fontSize},slideContentContent:{fontWeight:e.typography.fontWeightLight,fontSize:e.typography.body1.fontSize}}));var v=function(){const e=x(),t=Object(p.a)(),[a,o]=Object(n.useState)(0),[r,l]=Object(n.useState)("left"),s=t.custom.landingPage.carousel.slides,c=()=>{l("right"),o(0===a?s.length-1:a-1)};return i.a.createElement("div",{className:e.root},i.a.createElement("div",{className:h()(e.arrowLeft,e.arrows),onKeyDown:c,onClick:c},i.a.createElement(g.a,null,"chevron_left")),i.a.createElement("div",{className:h()(e.arrowRight,e.arrows),onKeyDown:c,onClick:()=>{l("left"),a===s.length-1?o(0):o(a+1)}},i.a.createElement(g.a,null,"chevron_right")),s.map((t,n)=>i.a.createElement(d.a,{direction:r,in:a===n,timeout:{enter:500,exit:0},key:t.src,mountOnEnter:!0,unmountOnExit:!0},i.a.createElement("div",{className:e.slideContainer},i.a.createElement("div",{className:h()(e.slideContentWrapper,"slideContentWrapper")},i.a.createElement("div",{className:h()(e.slideContentTitle,"slideContentTitle")},i.a.createElement(f.a,{html:t.title})),i.a.createElement("div",{className:e.slideContentContent},i.a.createElement(f.a,{html:t.content}))),i.a.createElement("img",{alt:"slider",className:e.imageBox,src:E.app.context+t.src})))))},y=a(1412),C=a(1225),b=a(212),N=a(1273),W=a(352),T=a(2193);const w=Object(m.a)(()=>({tagedApisWrapper:{display:"flex",flexDirection:"row",flexWrap:"wrap"}}));function j(e){const t=w(),a=Object(y.a)(),[o,r]=Object(n.useState)(null),[l,s]=Object(n.useState)(!1),{tag:c,maxCount:m}=e,p=Object(n.useContext)(b.c);return Object(n.useEffect)(()=>{(new W.a).getAllAPIs({query:"tag:"+c,limit:m}).then(e=>{r(e.obj)}).catch(e=>{const{status:t,response:n}=e,i=a.formatMessage({defaultMessage:"Invalid tenant domain",id:"LandingPage.ApisWithTag.invalid.tenant.domain"});n&&901300===n.body.code&&(p.setTenantDomain("INVALID"),C.a.error(i)),404===t&&s(!0)})},[]),l?i.a.createElement(N.a,null):o&&i.a.createElement("div",{className:t.tagedApisWrapper},o.list.map(e=>i.a.createElement(T.a,{api:e,key:e.id})))}j.propTypes={tag:r.a.shape({}).isRequired,maxCount:r.a.shape({}).isRequired};var k=j;function O(e){const{classes:t,theme:a,index:n}=e,o=a.custom.landingPage.parallax.content[n];return i.a.createElement(i.a.Fragment,null,i.a.createElement("div",{className:t.parallax,style:{backgroundImage:'url("'+E.app.context+o.src+'")'}},i.a.createElement("div",{className:h()(t.slideContentWrapper,"slideContentWrapper")},i.a.createElement("div",{className:h()(t.slideContentTitle,"slideContentTitle")},i.a.createElement(f.a,{html:o.title})),i.a.createElement("div",{className:t.slideContentContent},i.a.createElement(f.a,{html:o.content})))))}O.propTypes={classes:r.a.shape({}).isRequired,index:r.a.shape({}).isRequired,theme:r.a.shape({}).isRequired};var S=Object(l.a)(e=>({parallax:{minHeight:200,backgroundAttachment:"fixed",backgroundPosition:"center",backgroundRepeat:"no-repeat",backgroundSize:"cover",position:"relative",marginTop:e.spacing(3),marginBottom:e.spacing(3)},slideContentWrapper:{position:"absolute",background:"#00000044",color:e.palette.getContrastText("#000000"),top:e.spacing(3),padding:e.spacing(2),margin:"0 100px",alignItem:"center"},slideContentTitle:{fontWeight:e.typography.fontWeightLight,fontSize:e.typography.h3.fontSize},slideContentContent:{fontWeight:e.typography.fontWeightLight,fontSize:e.typography.body1.fontSize}}),{withTheme:!0})(O);const B=Object(m.a)(()=>({root:{paddingTop:20,paddingBottom:20}}));var z=function(){const e=B(),t=Object(p.a)(),{custom:{landingPage:{contact:{contactHTML:a}}}}=t;return i.a.createElement("div",{className:e.root},i.a.createElement(f.a,{html:a}))};function R(e){const{classes:t,theme:a}=e,{custom:{landingPage:{carousel:{active:n},listByTag:{active:o,content:r},parallax:{active:l},contact:{active:m}}}}=a;return i.a.createElement("div",{className:t.superRoot},i.a.createElement("div",{className:t.root},i.a.createElement(c.a,{container:!0,spacing:3},n&&i.a.createElement(c.a,{item:!0,xs:12},i.a.createElement(v,null)),o&&r.length>0&&i.a.createElement(c.a,{item:!0,xs:12},i.a.createElement(s.a,{variant:"h2",gutterBottom:!0},r[0].title),r[0].description&&i.a.createElement(s.a,{variant:"body1",gutterBottom:!0},r[0].description),i.a.createElement(k,{tag:r[0].tag,maxCount:r[1].maxCount})))),l&&i.a.createElement("div",{className:t.fullWidthBack},i.a.createElement(S,{index:0})),i.a.createElement("div",{className:t.root},i.a.createElement(c.a,{container:!0,spacing:3},o&&r.length>1&&i.a.createElement(c.a,{item:!0,xs:12},i.a.createElement(s.a,{variant:"h2",gutterBottom:!0},r[1].title),r[1].description&&i.a.createElement(s.a,{variant:"body1",gutterBottom:!0},r[1].description),i.a.createElement(k,{tag:r[1].tag,maxCount:r[1].maxCount})))),l&&i.a.createElement("div",{className:t.fullWidthBack},i.a.createElement(S,{index:1})),m&&i.a.createElement("div",{className:t.root},i.a.createElement(s.a,{variant:"h2",gutterBottom:!0},"Contact Us"),i.a.createElement(z,null)))}R.propTypes={classes:r.a.shape({}).isRequired,theme:r.a.shape({}).isRequired};t.default=Object(l.a)(()=>({root:{flexGrow:1,margin:"0 100px",alignItem:"center"},fullWidthBack:{},superRoot:{display:"flex",flexDirection:"column"}}),{withTheme:!0})(R)}}]);
//# sourceMappingURL=Landing.57dcfe6300cc8cc1278a.bundle.js.map