<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Web master layout</title>
	<link rel="stylesheet" type="text/css" href="<c:url value='/template/web/vendor/bootstrap/css/bootstrap.min.css'/>">
	<link rel="stylesheet" type="text/css" href="<c:url value='/template/web/css/small-business.css'/>">
</head>
<body>
	<!-- header -->
	<%@ include file="/common/web/header.jsp" %>
	<!-- header -->
	
	<!-- body -->
	<dec:body/>
	<!-- body -->
	
	<!-- footer -->
	<%@ include file="/common/web/footer.jsp" %>
	<!-- footer -->

	<script src="<c:url value='/template/web/vendor/jquery/jquery.min.js'/>"></script>
  	<script src="<c:url value='/template/web/vendor/bootstrap/js/bootstrap.bundle.min.js'/>"></script>
</body>
</html>