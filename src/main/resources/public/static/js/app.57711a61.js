(function(t){function e(e){for(var s,n,o=e[0],c=e[1],u=e[2],d=0,f=[];d<o.length;d++)n=o[d],Object.prototype.hasOwnProperty.call(r,n)&&r[n]&&f.push(r[n][0]),r[n]=0;for(s in c)Object.prototype.hasOwnProperty.call(c,s)&&(t[s]=c[s]);l&&l(e);while(f.length)f.shift()();return i.push.apply(i,u||[]),a()}function a(){for(var t,e=0;e<i.length;e++){for(var a=i[e],s=!0,o=1;o<a.length;o++){var c=a[o];0!==r[c]&&(s=!1)}s&&(i.splice(e--,1),t=n(n.s=a[0]))}return t}var s={},r={app:0},i=[];function n(e){if(s[e])return s[e].exports;var a=s[e]={i:e,l:!1,exports:{}};return t[e].call(a.exports,a,a.exports,n),a.l=!0,a.exports}n.m=t,n.c=s,n.d=function(t,e,a){n.o(t,e)||Object.defineProperty(t,e,{enumerable:!0,get:a})},n.r=function(t){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(t,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(t,"__esModule",{value:!0})},n.t=function(t,e){if(1&e&&(t=n(t)),8&e)return t;if(4&e&&"object"===typeof t&&t&&t.__esModule)return t;var a=Object.create(null);if(n.r(a),Object.defineProperty(a,"default",{enumerable:!0,value:t}),2&e&&"string"!=typeof t)for(var s in t)n.d(a,s,function(e){return t[e]}.bind(null,s));return a},n.n=function(t){var e=t&&t.__esModule?function(){return t["default"]}:function(){return t};return n.d(e,"a",e),e},n.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},n.p="/";var o=window["webpackJsonp"]=window["webpackJsonp"]||[],c=o.push.bind(o);o.push=e,o=o.slice();for(var u=0;u<o.length;u++)e(o[u]);var l=c;i.push([0,"chunk-vendors"]),a()})({0:function(t,e,a){t.exports=a("56d7")},"0527":function(t,e,a){},"21dc":function(t,e,a){},2459:function(t,e,a){},2487:function(t,e,a){"use strict";var s=a("d7d5"),r=a.n(s);r.a},"2e88":function(t,e,a){},"3fbb":function(t,e,a){"use strict";var s=a("0527"),r=a.n(s);r.a},"56d7":function(t,e,a){"use strict";a.r(e);a("e260"),a("e6cf"),a("cca6"),a("a79d");var s=a("2b0e"),r=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{attrs:{id:"app"}},["/"!==this.$route.path?a("app-sidebar"):t._e(),a("router-view")],1)},i=[],n=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"container",class:{show:t.showSidebar}},[a("div",{staticClass:"control"},[a("i",{staticClass:"fas fa-angle-double-right",on:{click:t.showNav}})]),a("div",{staticClass:"navigation-icons"},[a("router-link",{attrs:{to:"/principal"}},[a("i",{staticClass:"fas fa-home"})]),a("router-link",{attrs:{to:"/perfil"}},[a("i",{staticClass:"far fa-id-card"})]),a("i",{staticClass:"fas fa-user-circle"}),a("i",{staticClass:"fas fa-comment-dots"}),a("i",{staticClass:"fas fa-info-circle"})],1),a("div",{staticClass:"navigation-links"},[a("transition-group",{attrs:{name:"fade"}},[a("div",{directives:[{name:"show",rawName:"v-show",value:t.showLink,expression:"showLink"}],key:"1"},[a("router-link",{attrs:{to:"/principal"}},[t._v(" Home ")])],1),a("div",{directives:[{name:"show",rawName:"v-show",value:t.showLink,expression:"showLink"}],key:"2"},[a("router-link",{attrs:{to:"/perfil"}},[t._v(" Perfil ")])],1),a("div",{directives:[{name:"show",rawName:"v-show",value:t.showLink,expression:"showLink"}],key:"3"},[t._v("About Me")]),a("div",{directives:[{name:"show",rawName:"v-show",value:t.showLink,expression:"showLink"}],key:"4"},[t._v("Contact")]),a("div",{directives:[{name:"show",rawName:"v-show",value:t.showLink,expression:"showLink"}],key:"5"},[t._v("FAQ")])])],1)])},o=[],c={data:function(){return{showSidebar:!1,showLink:!1}},methods:{showNav:function(){var t=this;this.showSidebar?(this.showLink=!1,setTimeout((function(){t.showSidebar=!1}),500)):(this.showSidebar=!0,setTimeout((function(){t.showLink=!0}),500))}}},u=c,l=(a("f35b"),a("2877")),d=Object(l["a"])(u,n,o,!1,null,"604c6bc4",null),f=d.exports,p=(a("d3b7"),a("2f62")),v=a("bc3a"),m=a.n(v),h=m.a.create({baseURL:"/api",timeout:1e4,proxy:!0}),g={hello:function(){return h.get("/hello")},getUser:function(t){return h.get("/user/"+t)},createUser:function(t,e){return h.post("/user/"+t+"/"+e)},getSecured:function(t,e){return h.get("/secured/",{auth:{username:t,password:e}})},getAtleta:function(t){return h.post("/autenticar/atleta",{tokenStrava:t})},login:function(t){return h.post("/atleta")},getVersao:function(){return h.get("/sistema/versao")}};s["default"].use(p["a"]);var b=new p["a"].Store({state:{loginSuccess:!1,loginError:!1,userName:null,userPass:null},mutations:{login_success:function(t,e){t.loginSuccess=!0,t.userName=e.userName,t.userPass=e.userPass},login_error:function(t,e){t.loginError=!0,t.userName=e.userName}},profile:function(){return{id:0,idStrava:0,firstName:"",lastName:"",city:"",state:"",profile:""}},actions:{login:function(t,e){var a=this,s=t.commit,r=e.token;return new Promise((function(t,e){console.log("Accessing backend with token: '"+r),g.getAtleta(r).then((function(e){console.log("Response: '"+e.data+"' with Statuscode "+e.status),200==e.status&&(a.profile=e.data,console.log(a.profile.profile),console.log("Login successful"),s("login_success",{tokenStrava:r})),t(e)})).catch((function(t){console.log("Error: "+t),s("login_error",{tokenStrava:r}),e("Invalid credentials!")}))}))}},getters:{isLoggedIn:function(t){return t.loginSuccess},hasLoginErrored:function(t){return t.loginError},getUserName:function(t){return t.userName},getUserPass:function(t){return t.userPass}}}),w={name:"app",components:{"app-sidebar":f},data:function(){return{isLogado:b.state.loginSuccess}}},_=w,y=(a("5c0b"),Object(l["a"])(_,r,i,!1,null,null,null)),k=y.exports,C=(a("45fc"),a("8c4f")),L=function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("div",{staticClass:"login",attrs:{align:"center"}},[t.isLoading?s("div",{staticClass:"loading"},[s("app-loading")],1):t._e(),t.isLoading?t._e():s("div",{staticClass:"boxLogin"},[s("img",{staticClass:"logo",attrs:{src:a("f796")}}),s("form",{on:{submit:function(e){return e.preventDefault(),t.handleSubmit(e)}}},[s("div",{staticClass:"form-group"},[s("label",{attrs:{for:"username"}},[t._v("Username")]),s("input",{directives:[{name:"model",rawName:"v-model",value:t.username,expression:"username"}],staticClass:"form-control",class:{"is-invalid":t.submitted&&!t.username},attrs:{type:"text",name:"username"},domProps:{value:t.username},on:{input:function(e){e.target.composing||(t.username=e.target.value)}}}),s("div",{directives:[{name:"show",rawName:"v-show",value:t.submitted&&!t.username,expression:"submitted && !username"}],staticClass:"invalid-feedback"},[t._v("Username is required")])]),s("div",{staticClass:"form-group"},[s("label",{attrs:{htmlFor:"password"}},[t._v("Password")]),s("input",{directives:[{name:"model",rawName:"v-model",value:t.password,expression:"password"}],staticClass:"form-control",class:{"is-invalid":t.submitted&&!t.password},attrs:{type:"password",name:"password"},domProps:{value:t.password},on:{input:function(e){e.target.composing||(t.password=e.target.value)}}}),s("div",{directives:[{name:"show",rawName:"v-show",value:t.submitted&&!t.password,expression:"submitted && !password"}],staticClass:"invalid-feedback"},[t._v("Password is required")])]),t._m(0),s("div",{staticClass:"form-group"},[s("form",{on:{submit:function(e){return e.preventDefault(),t.callLogin()}}},[s("b-btn",{staticClass:"btnLoginStrava",attrs:{type:"submit"}})],1)])])])])},S=[function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"form-group"},[a("button",{staticClass:"btnLogin"},[t._v("Login")])])}],x=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{directives:[{name:"show",rawName:"v-show",value:t.loading,expression:"loading"}],staticClass:"v-spinner"},[a("div",{staticClass:"v-beat v-beat-odd",style:t.spinnerStyle}),a("div",{staticClass:"v-beat v-beat-even",style:t.spinnerStyle}),a("div",{staticClass:"v-beat v-beat-odd",style:t.spinnerStyle})])},N=[],P={name:"BeatLoader",props:{loading:{type:Boolean,default:!0},color:{type:String,default:"#81B121"},size:{type:String,default:"15px"},margin:{type:String,default:"2px"},radius:{type:String,default:"100%"}},data:function(){return{spinnerStyle:{backgroundColor:this.color,height:this.size,width:this.size,margin:this.margin,borderRadius:this.radius}}}},O=P,j=(a("2487"),Object(l["a"])(O,x,N,!1,null,null,null)),E=j.exports,$={name:"login",data:function(){return{isLoading:!1,username:"",password:"",submitted:!1}},components:{"app-loading":E},methods:{callLogin:function(){location.href="https://www.strava.com/oauth/authorize?client_id=36149&response_type=code&redirect_uri=http://localhost:8080&approval_prompt=force&scope=profile:write,activity:read_all"}},created:function(){var t=this;this.data=this.$router.currentRoute.query,void 0==this.data.code&&null==this.data.code||(this.isLoading=!0,m()({method:"post",url:"https://www.strava.com/oauth/token",headers:{Authorization:"Bearer "+this.data.code,"Content-Type":"application/json"},data:{client_id:36149,client_secret:"c45f33fb7c6d499516e21fb02340d777bf3c77fd",code:this.data.code,grant_type:"authorization_code"}}).then((function(e){t.data=e.data,200==e.status&&t.$store.dispatch("login",{token:t.data.access_token}).then((function(){t.$router.push("/principal"),t.isLoading=!1})).catch((function(e){t.loginError=!0,t.errors.push(e),t.error=!0,t.isLoading=!1}))})))}},A=$,q=(a("5ffc"),Object(l["a"])(A,L,S,!1,null,"fa9fe510",null)),U=q.exports,z=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"divPrincipal"},[a("b-card",{staticClass:"overflow-hidden",staticStyle:{"max-width":"540px"},attrs:{"no-body":""}},[a("b-row",{attrs:{"no-gutters":""}},[a("b-col",{attrs:{md:"6"}},[a("b-card-img",{staticClass:"rounded-0",attrs:{src:"https://picsum.photos/400/400/?image=20"}})],1),a("b-col",{attrs:{md:"6"}},[a("b-card-body",{attrs:{title:"Última corrida"}},[a("b-card-text",[t._v(" aqui ")])],1)],1)],1)],1)],1)},T=[],M={data:function(){return{isLoading:!1,username:"",password:"",submitted:!1}}},B=M,R=(a("9afc"),Object(l["a"])(B,z,T,!1,null,null,null)),I=R.exports,D=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{attrs:{id:"app"}},[a("div",{staticClass:"user-profile"},[a("div",{staticClass:"profile-card"},[a("img",{staticClass:"profile-card__avatar",attrs:{src:t.perfil.profile}}),a("h1",[t._v(t._s(t.perfil.firstName)+" "+t._s(t.perfil.lastName))]),a("h1",{staticClass:"profile-card__title"}),a("p",{staticClass:"profile-card__subtitle"},[t._v(t._s(t.perfil.city))])])])])},F=[],J=a("2fa7"),H={name:"perfil",data:function(){return{perfil:Object(J["a"])({id:0,profile:"",firstName:"",lastName:"",city:"",state:""},"profile","")}},created:function(){this.perfil=b.profile,console.log("Profile: "+this.perfil.firstName)}},Q=H,V=(a("3fbb"),Object(l["a"])(Q,D,F,!1,null,null,null)),G=V.exports;s["default"].use(C["a"]);var K=new C["a"]({mode:"history",routes:[{path:"/",component:U},{path:"/perfil",component:G,meta:{requiresAuth:!0}},{path:"/principal",component:I,meta:{requiresAuth:!0}},{path:"*",redirect:"/"}]});K.beforeEach((function(t,e,a){t.matched.some((function(t){return t.meta.requiresAuth}))?b.getters.isLoggedIn?a():a({path:"/login"}):a()}));var W=K,X=a("5f5b");a("f9e3"),a("2dd8");s["default"].config.productionTip=!1,s["default"].use(X["a"]),new s["default"]({router:W,store:b,render:function(t){return t(k)}}).$mount("#app")},"5c0b":function(t,e,a){"use strict";var s=a("9c0c"),r=a.n(s);r.a},"5ffc":function(t,e,a){"use strict";var s=a("2459"),r=a.n(s);r.a},"9afc":function(t,e,a){"use strict";var s=a("21dc"),r=a.n(s);r.a},"9c0c":function(t,e,a){},d7d5:function(t,e,a){},f35b:function(t,e,a){"use strict";var s=a("2e88"),r=a.n(s);r.a},f796:function(t,e,a){t.exports=a.p+"static/img/runner.bbab76d1.png"}});
//# sourceMappingURL=app.57711a61.js.map