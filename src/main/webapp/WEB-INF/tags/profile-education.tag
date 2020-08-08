<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="card">
	<div class="card-body">
		<div class="card-title">
			<h3>Education</h3>
		</div>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Institution</th>
					<th scope="col">Specialization</th>
					<th scope="col">Begin Year</th>
					<th scope="col">Finish Year</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="education" items="${profile.education}">
					<tr>
						<td>${education.institution}</td>
						<td>${education.specialization}</td>
						<td>${education.beginYear}</td>
						<td>${education.finishYear}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>