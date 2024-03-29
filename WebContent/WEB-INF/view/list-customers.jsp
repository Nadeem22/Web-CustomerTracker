<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>List Customer</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>

<div id="wrapper">

	<div id="header">
	<h2>CRM- Customer Relationship Manager</h2>
	</div>
	
</div>
<div id="container">

<div id="content">

<input type="button" value="Add Customer" onclick="window.location.href='showFormForAdd'; return false;"
class="add-button">

</div>

<!-- add out html table here -->

<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Action</th>

</tr>

<!-- loop over and print customer list -->

<c:forEach var="tempCustomer" items="${customers}">

<!-- construct an "update" link with customer id -->

<c:url var="updatelink" value="/customer/showFormForUpdate">
<c:param name="customerId" value="${tempCustomer.id }"/>
</c:url>

<!-- construct an "delete" link with customer id -->

<c:url var="deletelink" value="/customer/delete">
<c:param name="customerId" value="${tempCustomer.id }"/>
</c:url>


<tr>
	<td>${tempCustomer.firstName}</td>
	<td>${tempCustomer.lastName}</td>
	<td>${tempCustomer.email}</td>
	<td><a href="${updatelink}">Update</a>
	|
	<a href="${deletelink}" onclick="if(!(confirm('Are you sure want to delete this customer?'))) return false">Delete</a>
	</td>
</tr>

</c:forEach>



</table>

</div>

</body>




</html>