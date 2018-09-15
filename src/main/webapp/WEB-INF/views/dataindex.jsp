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
		/* $('#myTable').DataTable( {
		    "scrollY": 200,
		    "scrollX": true
		} ); */
	});
</script>
</head>
<body>
	<div style="height: 400px">
		<h1> Data Indexing status:
		<c:if test="${indexStatus == 'Success'}">
			Successful
		</c:if>
		<c:if test="${indexStatus == 'Failure'}">
			Failure
		</c:if>	
		</h1>
	</div>
	<div align="left">
		<a href="${pageContext.request.contextPath}/providerDataList">Go to Providers List Page</a> 
	</div>
	<br />
	<br />
	</body>

</html>