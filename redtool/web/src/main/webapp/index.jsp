<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RedTool POC</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
 rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/resources/js/jquery.bootpag.min.js" />"></script>
</head>
<body>
<div id="content">Dynamic Content goes here</div>
<div id="page-selection">Pagination goes here</div>
<script>
$('#page-selection').bootpag({
    total: 50,
    page: 2,
    maxVisible: 5,
    leaps: true,
    firstLastUse: true,
    first: '←',
    last: '→',
    wrapClass: 'pagination',
    activeClass: 'active',
    disabledClass: 'disabled',
    nextClass: 'next',
    prevClass: 'prev',
    lastClass: 'last',
    firstClass: 'first'
}).on("page", function(event, num){
    $(".content4").html("Page " + num); // or some ajax content loading...
}); 
</script>
 <div class="container">
  <div class="col-md-offset-1 col-md-10">
   <h2>RedTool2 - Red Tool WebApp Poc</h2>
   <hr />
   
   <input type="button" value="Add User"
    onclick="window.location.href='user/showUserForm'; return false;"
    class="btn btn-primary" />
    <br/><br/>
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">User List</div>
    </div>
    <div class="panel-body">
     <table class="table table-striped table-bordered">
      <tr>
       <th>First Name</th>
       <th>Last Name</th>
       <th>Id</th>
       <th>Action</th>
      </tr>

      <!-- loop over and print our customers -->
      <c:forEach var="tempUser" items="${listUsers}">

       <!-- construct an "update" link with customer id -->
       <c:url var="updateLink" value="user/updateUser">
         <c:param name="userId" value="${tempUser.id}" />
       </c:url>

       <!-- construct an "delete" link with customer id -->
       <c:url var="deleteLink" value="user/deleteUser">
        <c:param name="userId" value="${tempUser.id}" />
       </c:url>

       <tr>
        <td>${tempUser.nom}</td>
        <td>${tempUser.prenom}</td>
        <td>${tempUser.email}</td>

        <td>
         <!-- display the update link --> <a href="${updateLink}">Update</a>
         | <a href="${deleteLink}"
         onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
        </td>

       </tr>

      </c:forEach>

     </table>

    </div>
   </div>
  </div>

 </div>
</body>
</html>