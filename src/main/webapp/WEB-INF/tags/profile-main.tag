<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<div class="card">
	<img class="card-img-top"
		src="https://image.flaticon.com/icons/svg/3189/3189506.svg"
		alt="profile-photo" />
	<div class="card-body">
		<h1 class="text-center card-title">${profile.fullName}</h1>
		<h6 class="text-center card-subtitle">${profile.city},${profile.country}</h6>
		<p class="text-center card-text">${profile.birthDay}</p>
	</div>
	<ul class="list-group list-group-flush">
		<li class="list-group-item"><i class="fa fa-phone"></i> ${profile.phone}</li>
		<li class="list-group-item"><i class="fa fa-envelope"></i> ${profile.email}</li>
	</ul>
</div>