<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="card">
	<div class="card-body">
		<div class="card-title">
			<h3>Skills</h3>
		</div>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Category</th>
					<th scope="col">Skill</th>
					<th scope="col">Level</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="skill" items="${profile.skills}">
					<tr>
						<td>${skill.category}</td>
						<td>${skill.value}</td>
						<td>${skill.level}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>