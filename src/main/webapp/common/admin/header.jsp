<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp" %>
<%@ page import="com.laptrinhjavaweb.util.SecurityUtils" %>
<!DOCTYPE html PUBLIC>

<div id="navbar" class="navbar navbar-default ace-save-state">
	<div class="navbar-container ace-save-state" id="navbar-container">
		<div class="navbar-header pull-left">
			<a href="#" class="navbar-brand">
				<small>
					<i class="fa fa-leaf"></i>
					Trang quản trị
				</small>
			</a>
		</div>
		<div class="navbar-buttons navbar-header pull-right collapse navbar-collapse" role="navigation">
			<ul class="nav ace-nav">
				<li class="light-blue dropdown-modal">
					<a data-toggle="dropdown" href="#" class="dropdown-toggle">
						Xin chào, <%=SecurityUtils.getPrincipal().getFullName()%>
					</a>
					<li class="Light-blue dropdown-modal">
						<a href="#">
							<i class="ace-icon fa fa-power-off"></i>
							Thoát
						</a>
					</li>
				</li>
			</ul>
		</div>
	</div>
</div>