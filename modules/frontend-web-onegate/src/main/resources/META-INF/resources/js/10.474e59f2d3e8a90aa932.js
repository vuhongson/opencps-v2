webpackJsonp([10],{291:function(t,e,n){var o=n(42)(n(310),n(319),null,null);t.exports=o.exports},310:function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var o=n(44),s=n.n(o),i=n(207);e.default={props:["index"],data:function(){return{keywords:"",selected:[],headers:[{text:"STT",align:"center",sortable:!1,class:"stt_column"},{text:"Mã hồ sơ",align:"center",sortable:!1},{text:"Người đăng ký",align:"center",sortable:!1},{text:"Tên thủ tục",align:"center",sortable:!1},{text:"Địa chỉ",align:"center",sortable:!1},{text:"Ngày giờ hẹn trả",align:"center",sortable:!1},{text:"Thời hạn",align:"center",sortable:!1},{text:"",align:"center",sortable:!1,class:"action_column"}],danhSachHoSoTables:[],itemperpage:15,pages:0,page:1,total:0}},computed:{loadingTable:function(){return this.$store.getters.loadingTable},trangThaiHoSoList:function(){return this.$store.getters.loadtrangThaiHoSoList}},watch:{index:function(t){var e=this;e.$store.dispatch("setCurrentIndex",e.index),e.selected=[],e.keywords="",e.page=1;var n={keywords:e.keywords,status:e.trangThaiHoSoList[t],start:e.page*e.itemperpage-e.itemperpage,end:e.page*e.itemperpage};e.$store.getters.danhSachHoSo(n).then(function(t){e.danhSachHoSoTables=t.data,e.total=t.total,e.pages=Math.ceil(e.total/e.itemperpage)})},page:function(t){var e=this;e.page=t,e.loadDataTable()}},created:function(){var t=this;t.page=1,t.$nextTick(function(){t.$store.dispatch("setCurrentIndex",t.index),t.loadDataTable()})},methods:{checkAction:function(t){return"new"===t?"print,send,delete":"releasing"===t?"result,ticket":"done"===t?"view,ticket":"waiting"===t?"view,ticket":"receiving"===t?"view,ticket":"correcting"===t?"view,ticket":"processing"===t?"view,ticket":void 0},checkPrint:function(t,e){return!t.applicantName&&!t.address},showMultiDelete:function(t){return"new"===t},keywordSearch:function(){var t=this;t.page=1,t.loadDataTable()},loadDataTable:function(){var t=this,e={keywords:t.keywords,status:t.trangThaiHoSoList[t.index],start:t.page*t.itemperpage-t.itemperpage,end:t.page*t.itemperpage};t.$store.getters.danhSachHoSo(e).then(function(e){t.danhSachHoSoTables=e.data,t.total=e.total,t.pages=Math.ceil(t.total/t.itemperpage)})},chuyenXuLy:function(t){var e=this,n={dossierId:t.dossierId,actionCode:1e4};e.$root.$confirm.open("Thông báo","Bạn chắc chắn muốn thực hiện thao tác này?",{color:"blue darken-4"}).then(function(t){e.$store.dispatch("postAction",n).then(function(t){i.b("success","Xử lý thành công"),e.loadDataTable()}).catch(function(t){i.b("error","Xử lý thất bại")})}).catch(function(t){console.log("kkk")})},traKetQua:function(t){var e=this,n={dossierId:t.dossierId,actionCode:3e4};e.$root.$confirm.open("Thông báo","Bạn chắc chắn muốn thực hiện thao tác này?",{color:"blue darken-4"}).then(function(t){e.$store.dispatch("postAction",n).then(function(t){i.b("success","Xử lý thành công"),e.loadDataTable()}).catch(function(t){i.b("error","Xử lý thất bại")})}).catch(function(t){console.log("kkk")})},moveProcess:function(){var t=this;t.$root.$confirm.open("Thông báo","Bạn chắc chắn muốn thực hiện thao tác này?",{color:"blue darken-4"}).then(function(e){for(var n=[],o=0;o<t.selected.length;o++)if(!t.selected[o].applicantName&&!t.selected[o].address)return void t.$root.$confirm.open("Thông báo","Bạn phải điền đầy đủ thông tin của hồ sơ trước khi thực hiện thao tác này?",{color:"blue darken-4"}).then(function(t){}).catch(function(t){});if(t.selected.forEach(function(e){var o={dossierId:e.dossierId,actionCode:1e4};n.push(t.$store.dispatch("postAction",o))}),0===n.length)return void i.b("error","Bạn chưa chọn hồ sơ nào");s.a.all(n).then(function(e){i.b("success","Xử lý thành công"),t.loadDataTable()}).catch(function(t){i.b("error","Xử lý thất bại")})}).catch(function(t){console.log("kkk")}),console.log(t.selected)},moveRelease:function(){var t=this;t.$root.$confirm.open("Thông báo","Bạn chắc chắn muốn thực hiện thao tác này?",{color:"blue darken-4"}).then(function(e){for(var n=[],o=0;o<t.selected.length;o++)if(!t.selected[o].applicantName&&!t.selected[o].address)return void t.$root.$confirm.open("Thông báo","Bạn phải điền đầy đủ thông tin của hồ sơ trước khi thực hiện thao tác này?",{color:"blue darken-4"}).then(function(t){}).catch(function(t){});if(t.selected.forEach(function(e){var o={dossierId:e.dossierId,actionCode:3e4};n.push(t.$store.dispatch("postAction",o))}),0===n.length)return void i.b("error","Bạn chưa chọn hồ sơ nào");s.a.all(n).then(function(e){i.b("success","Xử lý thành công"),t.loadDataTable()}).catch(function(t){i.b("error","Xử lý thất bại")})}).catch(function(t){console.log("kkk")}),console.log(t.selected)},deleteDosier:function(t,e){var n=this;n.$root.$confirm.open("Xóa","Bạn có muốn xoá hồ sơ này?",{color:"red"}).then(function(o){if(t){n.$store.dispatch("deleteDossier",t).then(function(t){n.danhSachHoSoTables.splice(e,1)})}}).catch(function(t){console.log("kkk")}),console.log(n.selected)},moveDelete:function(){var t=this;t.$root.$confirm.open("Xóa","Bạn có chắc chắn muốn xoá các mục đã chọn?",{color:"red"}).then(function(e){var n=[];if(t.selected.forEach(function(e){n.push(t.$store.dispatch("deleteDossier",e.dossierId))}),0===n.length)return void i.b("error","Bạn chưa chọn hồ sơ nào");s.a.all(n).then(function(e){t.selected&&t.selected.forEach(function(e){t.danhSachHoSoTables.splice(t.danhSachHoSoTables.findIndex(function(t){return e.dossierId===t.dossierId}),1)}),i.b("success","Xử lý thành công")}).catch(function(t){i.b("error","Xử lý thất bại")})}).catch(function(t){}),console.log(t.selected)},toDetailDossier:function(t,e){var n="/group/cong-xu-ly/mot-cua-dien-tu#/danh-sach-ho-so/"+t+"/tiep-nhan-ho-so/"+e;window.location.href=n},toDetailPhieuHen:function(t,e){var n=this;n.$store.commit("setPrintPH",!0),console.log(n.$store.getters.printPH);var o="/group/cong-xu-ly/mot-cua-dien-tu#/danh-sach-ho-so/"+t+"/tiep-nhan-ho-so/"+e+"/phieu-hen";window.open(o,"_blank")},durationText:function(t,e){var n;if(1===e&&t>8){var o=Math.floor(t/8)+" ngày",s=void 0;s=t%8!=0?8*(t/8-Math.floor(t/8))+" giờ":"",n=o+" "+s}else 0===e?n=t+" ngày":1===e&&t<=8&&(n=t+" giờ");return n}}}},319:function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",[t.loadingTable?n("content-placeholders",{staticClass:"mt-3"},[n("content-placeholders-text",{attrs:{lines:1}})],1):n("div",{staticClass:"row-header",staticStyle:{"margin-top":"6px"}},[n("div",{staticClass:"background-triangle-big"},[t.trangThaiHoSoList?n("span",[t._v(t._s(t.trangThaiHoSoList[t.index].title))]):t._e()]),t._v(" "),n("div",{staticClass:"layout row wrap header_tools row-blue"},[n("div",{staticClass:"flex text-ellipsis"},[n("v-text-field",{attrs:{placeholder:"Nhập từ khoá ...","prepend-icon":"search",solo:""},nativeOn:{change:function(e){return t.keywordSearch(e)}},model:{value:t.keywords,callback:function(e){t.keywords=e},expression:"keywords"}})],1),t._v(" "),n("div",{staticClass:"flex text-right",staticStyle:{"margin-left":"auto"}},["new"===t.trangThaiHoSoList[t.index].id?n("v-btn",{staticClass:"my-0 mx-0 btn-border-left",attrs:{flat:""},on:{click:t.moveProcess}},[n("v-icon",{attrs:{size:"16"}},[t._v("send")]),t._v("\n          Chuyển hồ sơ vào xử lý\n        ")],1):t._e(),t._v(" "),"release"===t.trangThaiHoSoList[t.index].id?n("v-btn",{staticClass:"my-0 mx-0 btn-border-left",attrs:{flat:""},on:{click:t.moveRelease}},[n("v-icon",{attrs:{size:"16"}},[t._v("send")]),t._v("\n          Trả kết quả\n        ")],1):t._e(),t._v(" "),t.showMultiDelete(t.trangThaiHoSoList[t.index].id)?n("v-btn",{staticClass:"my-0 mx-0",attrs:{flat:""},on:{click:t.moveDelete}},[n("v-icon",{attrs:{size:"16"}},[t._v("delete")]),t._v("\n          Xóa\n        ")],1):t._e()],1)])]),t._v(" "),t.loadingTable?n("content-placeholders",[n("content-placeholders-img"),t._v(" "),n("content-placeholders-heading")],1):n("div",[n("v-data-table",{staticClass:"table-landing table-bordered",attrs:{headers:t.headers,items:t.danhSachHoSoTables,"total-items":t.total,"item-key":"dossierId","select-all":"","hide-actions":"","no-data-text":"Không tìm thấy "+t.trangThaiHoSoList[t.index].title,"no-results-text":"Không tìm thấy "+t.trangThaiHoSoList[t.index].title},scopedSlots:t._u([{key:"headerCell",fn:function(e){return[n("v-tooltip",{attrs:{bottom:""}},[n("span",{attrs:{slot:"activator"},slot:"activator"},[t._v("\n            "+t._s(e.header.text)+"\n          ")]),t._v(" "),n("span",[t._v("\n            "+t._s(e.header.text)+"\n          ")])])]}},{key:"items",fn:function(e){return[n("td",[n("v-checkbox",{attrs:{primary:"","hide-details":""},model:{value:e.selected,callback:function(n){t.$set(e,"selected",n)},expression:"props.selected"}})],1),t._v(" "),n("td",{staticClass:"text-xs-center stt_column"},[t._v(t._s(e.index+1))]),t._v(" "),n("td",{staticClass:"text-xs-left"},[t._v(t._s(e.item.dossierIdCTN))]),t._v(" "),n("td",{staticClass:"text-xs-left"},[t._v(t._s(e.item.applicantName))]),t._v(" "),n("td",{staticClass:"text-xs-left"},[n("a",{attrs:{title:"Chi tiết hồ sơ",href:"/group/cong-xu-ly/mot-cua-dien-tu#/danh-sach-ho-so/"+t.index+"/tiep-nhan-ho-so/"+e.item.dossierId}},[n("span",[t._v(t._s(e.item.serviceName))])])]),t._v(" "),n("td",{staticClass:"text-xs-left"},[t._v(t._s(e.item.address))]),t._v(" "),n("td",{staticClass:"text-xs-left"},[t._v(t._s(e.item.dueDate))]),t._v(" "),n("td",{staticClass:"text-xs-left"},[t._v(t._s(t.durationText(e.item.processBlock,e.item.processUnit))+" "),e.item.processBlock?n("span",[t._v("làm việc")]):t._e()]),t._v(" "),n("td",{staticClass:"text-xs-left px-0"},[n("v-tooltip",{attrs:{top:""}},[n("v-btn",{staticClass:"mx-0 my-0",staticStyle:{width:"30px",height:"30px"},attrs:{slot:"activator",icon:""},on:{click:function(n){t.toDetailDossier(t.index,e.item.dossierId)}},slot:"activator"},[n("v-icon",{staticClass:"mx-0",staticStyle:{color:"#1976d2"},attrs:{size:"16"}},[t._v("visibility")])],1),t._v(" "),n("span",[t._v("Xem hồ sơ")])],1),t._v(" "),t.checkAction(t.trangThaiHoSoList[t.index].id).includes("send")?n("v-tooltip",{attrs:{top:""}},[n("v-btn",{staticClass:"mx-0 my-0",staticStyle:{width:"30px",height:"30px"},attrs:{slot:"activator",icon:"",disabled:t.checkPrint(e.item)},on:{click:function(n){t.toDetailPhieuHen(t.index,e.item.dossierId)}},slot:"activator"},[n("v-icon",{staticClass:"mx-0",staticStyle:{color:"#1976d2"},attrs:{size:"16"}},[t._v("print")])],1),t._v(" "),n("span",[t._v("In phiếu hẹn")])],1):t._e(),t._v(" "),t.checkAction(t.trangThaiHoSoList[t.index].id).includes("send")?n("v-tooltip",{attrs:{top:""}},[n("v-btn",{staticClass:"mx-0 my-0",staticStyle:{width:"30px",height:"30px"},attrs:{slot:"activator",icon:"",disabled:t.checkPrint(e.item)},on:{click:function(n){t.chuyenXuLy(e.item)}},slot:"activator"},[n("v-icon",{staticClass:"mx-0",staticStyle:{color:"#1976d2"},attrs:{size:"16"}},[t._v("send")])],1),t._v(" "),n("span",[t._v("Chuyển hồ sơ vào xử lý")])],1):t._e(),t._v(" "),t.checkAction(t.trangThaiHoSoList[t.index].id).includes("ticket")?n("v-tooltip",{attrs:{top:""}},[n("v-btn",{staticClass:"mx-0 my-0",staticStyle:{width:"30px",height:"30px"},attrs:{slot:"activator",icon:""},slot:"activator"},[n("v-icon",{staticClass:"mx-0",staticStyle:{color:"#1976d2"},attrs:{size:"16"}},[t._v("description")])],1),t._v(" "),n("span",[t._v("Phiếu kiểm soát")])],1):t._e(),t._v(" "),t.checkAction(t.trangThaiHoSoList[t.index].id).includes("result")?n("v-tooltip",{attrs:{top:""}},[n("v-btn",{staticClass:"mx-0 my-0",staticStyle:{width:"30px",height:"30px"},attrs:{slot:"activator",icon:"",to:"/danh-sach-ho-so/"+t.index+"/tra-ket-qua/"+e.item.dossierId},slot:"activator"},[n("v-icon",{staticClass:"mx-0",staticStyle:{color:"#1976d2"},attrs:{size:"16"}},[t._v("send")])],1),t._v(" "),n("span",[t._v("Trả kết quả")])],1):t._e(),t._v(" "),t.checkAction(t.trangThaiHoSoList[t.index].id).includes("delete")?n("v-tooltip",{attrs:{top:""}},[n("v-btn",{staticClass:"mx-0 my-0",staticStyle:{width:"30px",height:"30px"},attrs:{slot:"activator",icon:""},on:{click:function(n){t.deleteDosier(e.item.dossierId,e.index)}},slot:"activator"},[n("v-icon",{staticClass:"mx-0",attrs:{size:"16",color:"red darken-3"}},[t._v("delete")])],1),t._v(" "),n("span",[t._v("Xoá")])],1):t._e()],1)]}}]),model:{value:t.selected,callback:function(e){t.selected=e},expression:"selected"}}),t._v(" "),n("div",{staticClass:"mt-3 text-xs-right table-footer"},[n("div",{staticClass:"left"},["new"===t.trangThaiHoSoList[t.index].id?n("v-btn",{staticClass:"my-0 mx-0 mr-2",attrs:{outline:"",color:"indigo"},on:{click:t.moveProcess}},[n("v-icon",{attrs:{size:"16"}},[t._v("send")]),t._v("\n          Chuyển hồ sơ vào xử lý\n        ")],1):t._e(),t._v(" "),"release"===t.trangThaiHoSoList[t.index].id?n("v-btn",{staticClass:"my-0 mx-0 mr-2",attrs:{outline:"",color:"indigo"},on:{click:t.moveRelease}},[n("v-icon",{attrs:{size:"16"}},[t._v("send")]),t._v("\n          Trả kết quả\n        ")],1):t._e(),t._v(" "),t.showMultiDelete(t.trangThaiHoSoList[t.index].id)?n("v-btn",{staticClass:"my-0 mx-0 mr-2",attrs:{outline:"",color:"indigo"},on:{click:t.moveDelete}},[n("v-icon",{attrs:{size:"16"}},[t._v("delete")]),t._v("\n          Xóa\n        ")],1):t._e()],1),t._v(" "),n("span",{staticClass:"mr-2"},[n("i",[t._v("Tổng số "),n("span",{staticClass:"red--text"},[t._v(t._s(t.total))]),t._v(" kết quả được tìm thấy")])]),t._v(" "),n("v-pagination",{attrs:{length:t.pages},model:{value:t.page,callback:function(e){t.page=e},expression:"page"}})],1)],1)],1)},staticRenderFns:[]}}});
//# sourceMappingURL=10.474e59f2d3e8a90aa932.js.map