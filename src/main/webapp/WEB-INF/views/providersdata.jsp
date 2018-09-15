<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8" />
<title>Person List</title>
<!-- <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.css"> -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/style.css" />

<script type="text/javascript" charset="utf8"
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript" charset="utf8"
	src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js"></script>

<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css" />

<script type="text/javascript">
	$(document).ready(function() {
		$('#myTable').DataTable({
			"scrollY" : 400,
			"scrollX" : true
		});

	});
</script>
</head>
<body>

	<form action="${pageContext.request.contextPath}/providerDataList"
		method="post">
		<div align="center" style="padding-top: 50px">
			<input type="text" name="lastname"> <input type="submit"
				value="Search By LastName">
		</div>
		<br /> <br />
		
		<c:if test="${not empty providersData}">
		<h1 align="center">Provider Data List</h1>
			<div id="myDiv">
				<table id="myTable" class="display ">
					<thead>
						<tr>
							<th>National Provider Identifier</th>
							<th>Last Name/Organization Name of the Provider</th>
							<th>First Name of the Provider</th>
							<th>Middle Initial of the Provider</th>
							<th>Credentials of the Provider</th>
							<th>Gender of the Provider</th>
							<th>Entity Type of the Provider</th>
							<th>Street Address 1 of the Provider</th>
							<th>Street Address 2 of the Provider</th>
							<th>City of the Provider</th>
							<th>Zip Code of the Provider</th>
							<th>State Code of the Provider</th>
							<th>Country Code of the Provider</th>
							<th>Provider Type</th>
							<th>Medicare Participation Indicator</th>
							<th>Place of Service</th>
							<th>HCPCS Code</th>
							<th>HCPCS Description</th>
							<th>HCPCS Drug Indicator</th>
							<th>Number of Services</th>
							<th>Number of Medicare Beneficiaries</th>
							<th>Number of Distinct Medicare Beneficiary/Per Day Services</th>
							<th>Average Medicare Allowed Amount</th>
							<th>Average Submitted Charge Amount</th>
							<th>Average Medicare Payment Amount</th>
							<th>Average Medicare Standardized Amount</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${providersData}" var="provider">
							<tr>
								<td>${provider.nationalProviderIdentifier}</td>
								<td>${provider.lastName}</td>
								<td>${provider.firstName}</td>
								<td>${provider.middleInitial}</td>
								<td>${provider.credentials}</td>
								<td>${provider.gender}</td>
								<td>${provider.entityType}</td>
								<td>${provider.streetAddress1}</td>
								<td>${provider.streetAddress2}</td>
								<td>${provider.city}</td>
								<td>${provider.zipCode}</td>
								<td>${provider.stateCode}</td>
								<td>${provider.countryCode}</td>
								<td>${provider.providerType}</td>
								<td>${provider.medicareParticipationIndicator}</td>
								<td>${provider.placeOfService}</td>
								<td>${provider.hCPCSCode}</td>
								<td>${provider.hCPCSDescription}</td>
								<td>${provider.hCPCSDrugIndicator}</td>
								<td>${provider.numberOfServices}</td>
								<td>${provider.numberOfMedicareBeneficiaries}</td>
								<td>${provider.numberOfDistinctMedicareBeneficiariesPerDay}</td>
								<td>${provider.averageMedicareAllowedAmount}</td>
								<td>${provider.averageSubmittedChargeAmount}</td>
								<td>${provider.averageMedicarePaymentAmount}</td>
								<td>${provider.averageMedicareStandardizedAmount}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</c:if>
	</form>
</body>

</html>