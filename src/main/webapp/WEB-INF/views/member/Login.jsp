<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- 실제 내용 시작 -->
<div class="container">
	<!-- 점보트론(Jumbotron) -->
	<div class="jumbotron">
		<h1>
			MY<small>로그인 페이지</small>
		</h1>
	</div>
	<!-- 스프링 씨큐러티 사용하지 않을때 -->
	
	<c:if test="${! empty NotMember or !empty param.NotLogin}">
		<div class="row">
			<div class="alert alert-warning fade in  col-sm-5">
				<button type="button" class="close" data-dismiss="alert">
					<span>&times;</span>
				</button>
				${NotMember}
			</div>
		</div>
	</c:if>
	<div class="row">
		<c:if test="${not empty sessionScope.id}" var="isLogin">
			<div class="alert alert-success col-md-5">${sessionScope.id}님
				즐감하세요</div>
		</c:if>
		<c:if test="${! isLogin}">
			<div class="col-md-12">
				<form class="form-horizontal" method="post"
					action="<c:url value='/MyPet/Auth/LoginProcess.bbs'/>">
					<div class="form-group">
						<label for="id" class="col-sm-2  control-label">아이디</label>
						<div class="col-sm-3">
							<input type="text" class="form-control" name="id" id="id"
								placeholder="아이디를 입력하세요">
						</div>
					</div>
					<div class="form-group">
						<label for="pwd" class="col-sm-2  control-label">비밀번호</label>
						<div class="col-sm-3">
							<input type="password" class="form-control" id="pwd" name="pwd"
								placeholder="비밀번호를 입력하세요">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-danger">로그인</button>
						</div>
					</div>
				</form>
			</div>
		</c:if>
	</div>
</div>
<!-- container -->
<!-- 실제 내용 끝 -->
