<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"
	trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="social-network" tagdir="/WEB-INF/tags"%>

<div class="container">
	<div class="row">
		<div class="col-md-4 col-sm-6">
			<social-network:profile-main></social-network:profile-main>
			<social-network:profile-hobbies></social-network:profile-hobbies>
		</div>
		<div class="col-md-8 col-sm-6">
			<social-network:profile-skills></social-network:profile-skills>
			<social-network:profile-education></social-network:profile-education>
		</div>
	</div>
</div>