<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title><dec:title default="admin-home" /></title>
	
	<!-- css -->
	<link href="<c:url value='/template/admin/css/bootstrap.min.css'/>" rel="stylesheet" type="text/css" media="all">
	<link href="<c:url value='/template/admin/font-awesome/4.5.0/css/font-awesome.min.css'/>" rel="stylesheet" type="text/css" media="all">
	<link href="<c:url value='/template/admin/css/fonts.googleapis.com.css'/>" rel="stylesheet" type="text/css" media="all">
	<link href="<c:url value='/template/admin/css/ace.min.css'/>" rel="stylesheet" type="text/css" media="all" class="ace-main-stylesheet" id="main-ace-style">
	<link href="<c:url value='/template/admin/css/ace-skins.min.css'/>" rel="stylesheet" type="text/css" media="all">
	<link href="<c:url value='/template/admin/css/ace-rtl.min.css'/>" rel="stylesheet" type="text/css" media="all">
	<link href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css" rel="stylesheet" type="text/css" media="all">
	<link href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css" rel="stylesheet" type="text/css" media="all">
	<!-- css -->
	
	<!-- script -->
	<script src="<c:url value='/template/admin/js/ace-extra.min.js'/>"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script type="text/javascript" src="<c:url value='/template/admin/js/jquery-2.2.3.min.js'/>"></script>
	<script src="<c:url value='/template/admin/js/jquery-2.1.4.min.js'/>"></script>
	<script src="<c:url value='/template/admin/js/jquery.twbsPagination.js'/>"></script>
	<script src="<c:url value='/template/admin/js/jquery.twbsPagination.min.js'/>"></script>
	<!-- script -->
</head>
<body>
	<!-- header -->
	<%@ include file="/common/admin/header.jsp"%>
	<!-- header -->
	
	<!-- menu + body + footer -->
	<div class="main-container" id="main-container">
	
		<script type="text/javascript">
			try{ace.settings.check('main-container' , 'fixed')}catch(e){}
		</script>
		
		<!-- header -->
		<%@ include file="/common/admin/menu.jsp" %>
		<!-- header -->
		
		<!-- body -->
			<dec:body/>		
		<!-- body -->
		
		<!-- footer -->
		<%@ include file="/common/admin/footer.jsp" %>
		<!-- footer -->
		
		<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
			<i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
		</a>
		
	</div>
	<!-- menu + body + footer -->

	<!-- jquery -->
	<script src="<c:url value='/template/admin/js/bootstrap.min.js'/>"></script>
	<script src="<c:url value='/template/admin/js/jquery-ui.custom.min.js'/>"></script>
	<script src="<c:url value='/template/admin/js/jquery.ui.touch-punch.min.js'/>"></script>
	<script src="<c:url value='/template/admin/js/jquery.easypiechart.min.js'/>"></script>
	<script src="<c:url value='/template/admin/js/jquery.sparkline.index.min.js'/>"></script>
	<script src="<c:url value='/template/admin/js/jquery.flot.min.js'/>"></script>
	<script src="<c:url value='/template/admin/js/jquery.flot.pie.min.js'/>"></script>
	<script src="<c:url value='/template/admin/js/jquery.flot.resize.min.js'/>"></script>
	<script src="<c:url value='/template/admin/js/ace-elements.min.js'/>"></script>
	<script src="<c:url value='/template/admin/js/ace.min.js'/>"></script>
	<script src="<c:url value='/template/admin/js/ace-inline.js'/>"></script>
	<!-- jquery -->
</body>
</html>