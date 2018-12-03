
<#include "init.ftl">

<input type="hidden" id="employeeTitle" name="employeeTitle" value="${(employee.title)!}">
<input type="hidden" id="employeeFullName" name="employeeFullName" value="${(employee.fullName)!}">

<div class="application theme--light">
  	<object id="plugin0" type="application/x-cryptolib05plugin" width="0" height="0"></object>
	<div id="dossierViewJX" style="width: 100%;"> 
    </div>	
</div>

<script type="text/javascript">
	document.addEventListener('DOMContentLoaded', function (event) {
		var stateWindow = "${(stateWindow)!}";
		var dossierId = '${(dossierId)!}';
		var dossierPartNo = "${(dossierPartNo)!}";
		var emailAddress = '${(user.emailAddress)!}';
		var agencies = '${(agencies)!}';
		var isAdminUser = '${(isAdminUser)!}';

		console.log('isAdminUser++++++++++', isAdminUser);
		
		funLoadVue(stateWindow, dossierId, dossierPartNo, emailAddress, agencies, isAdminUser);
	});
	history.pushState(null, document.title, location.href);
	window.addEventListener('popstate', function (event) {
		history.pushState(null, document.title, location.href);
	});
</script>
