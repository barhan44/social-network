<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="card">
	<div class="card-body">
		<div class="card-title">
			<h3>Hobby</h3>
		</div>
		<ul class="list-group list-group-flush">
			<c:forEach var="hobby" items="${profile.hobbies}">
				<li class="list-group-item">${hobby.name}</li>
			</c:forEach>
		</ul>
	</div>
</div>