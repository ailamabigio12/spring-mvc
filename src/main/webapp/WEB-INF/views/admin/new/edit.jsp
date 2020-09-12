<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<c:url var="NewURL" value="/admin/new/list"/>
<c:url var="editNew" value="/admin/new/edit"/>
<c:url var="NewAPI" value="/api/new"/>
<html>
	<head>
	    <title>Chỉnh sửa bài viết</title>
	</head>
	<body>
		<div class="main-content">
			<div class="main-content-inner">
				<div class="breadcrumbs ace-save-state" id="breadcrumbs">
					<ul class="breadcrumb">
						<li>
							<i class="ace-icon fa fa-home home-icon"></i>
							<a href="#">Home</a>
						</li>
	
						<li>
							<a href="#">News</a>
						</li>
						<li class="active">Edit News</li>
					</ul><!-- /.breadcrumb -->
				</div>
	
				<div class="page-content">
					<div class="page-header">
						<h1>
							Tin tức
							<small>
								<i class="ace-icon fa fa-angle-double-right"></i>
								Sửa bài viết
							</small>
						</h1>
					</div><!-- /.page-header -->
					<div class="row">
						<div class="col-xs-12">
							<c:if test="${not empty message}">
								<div class="alert alert-${alert}">
									${message}
								</div>
							</c:if>
							<!-- PAGE CONTENT BEGINS -->
							<form:form class="form-horizontal" role="form" id="formSubmit" modelAttribute="model">
								<div class="form-group">
									<label for="sel1" class="col-sm-2 control-label no-padding-right">Thể loại bài viết:</label>
									<div class="col-sm-10">									
										<form:select path="categoryCode" id="categoryCode">
											<form:option value="" label="-- Chọn thể loại bài viết --"/>
											<form:options items="${categories}"/>
										</form:select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label no-padding-right" for="form-field-1"> Tên bài viết </label>
	
									<div class="col-sm-10">
										<form:input path="title" cssClass="col-xs-10 col-sm-5"/>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label no-padding-right" for="form-field-1-1"> Ảnh đại diện </label>
	
									<div class="col-sm-10">
										<form:input path="thumbnail" cssClass="col-xs-10 col-sm-5" type="file" id="thumbnail"/>
									</div>
								</div>
								<div class="form-group">
									<label for="comment" class="col-sm-2 control-label no-padding-right">Mô tả ngắn</label>
									<div class="col-sm-10">										
										<form:textarea path="shortDescription" rows="5" cols="10" cssClass="form-control" id="shortDescription"/>
									</div>
								</div>
								<div class="form-group">
									<label for="comment" class="col-sm-2 control-label no-padding-right">Nội dung bài viết</label>
									<div class="col-sm-10">
										<form:textarea path="content" rows="10" cols="10" cssClass="form-control" id="content"/>
									</div>
								</div>
								<form:hidden path="id" id="newId"/>
								<div class="space-4 clearfix form-actions"></div>
									<div class="col-md-offset-3 col-md-9">
										<c:if test="${not empty model.id}">
											<button class="btn btn-info" type="button" id="btnAddOrUpdateNew">
												<i class="ace-icon fa fa-check bigger-110"></i>
												Cập nhật bài viết
											</button>
										</c:if>
										<c:if test="${empty model.id}">
											<button class="btn btn-info" type="button" id="btnAddOrUpdateNew">
												<i class="ace-icon fa fa-check bigger-110"></i>
												Thêm bài viết
											</button>
										</c:if>
										
										&nbsp; &nbsp; &nbsp;
										<button class="btn" type="reset" id="reset">
											<i class="ace-icon fa fa-undo bigger-110"></i>
											Thoát
										</button>
									</div>
								</div>
							</form:form>
						</div>
					</div>
				</div>
			</div>
		</div>
	
		<script>
			$('#btnAddOrUpdateNew').click(function (e) {
				e.preventDefault();
				var data = {}
				var formData = $('#formSubmit').serializeArray();
				$.each(formData, function (i, v) {
					data[""+v.name+""] = v.value;
				});
				var id = $('#newId').val();
				if (id == "") {
					addNew(data);
				}
				else {
					updateNew(data);
				}
			});
			
			function addNew(data) {
				$.ajax({
		            url: '${NewAPI}',
		            type: 'POST',
		            contentType: 'application/json',
		            data: JSON.stringify(data),
		            dataType: 'json',
		            success: function (result) {
		            	window.location.href = "${editNew}?id="+result.id+"&message=insert_success";
		            },
		            error: function (error) {
		            	window.location.href = "${NewURL}?page=1&limit=4&message=error_system";
		            }
		        });
			}
			
			function updateNew(data) {
				$.ajax({
		            url: '${NewAPI}',
		            type: 'PUT',
		            contentType: 'application/json',
		            data: JSON.stringify(data),
		            dataType: 'json',
		            success: function (result) {
		            	window.location.href = "${editNew}?id="+result.id+"&message=update_success";
		            },
		            error: function (error) {
		            	window.location.href = "${editNew}?id="+result.id+"&message=error_system";
		            }
		        });
			}
		</script>
	</body>
</html>