package io.barhan.social_network.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "profile")
@Getter
@Setter
@NoArgsConstructor
public class Profile extends AbstractEntity<Long> implements Serializable {

	private static final long serialVersionUID = 6817930615460771589L;

	@Id
	@JsonIgnore
	@SequenceGenerator(name = "PROFILE_ID_GENERATOR", sequenceName = "PROFILE_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROFILE_ID_GENERATOR")
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@Column(name = "uid", nullable = false, length = 100)
	private String uid;

	@JsonIgnore
	@Column(name = "first_name", nullable = false, length = 100)
	private String firstName;

	@JsonIgnore
	@Column(name = "last_name", nullable = false, length = 100)
	private String lastName;

	@Column(name = "large_photo", length = 255)
	private String largePhoto;

	@Column(name = "small_photo", length = 255)
	private String smallPhoto;

	@Column(name = "phone", length = 20)
	private String phone;

	@Column(name = "email", length = 100)
	private String email;

	@Column(name = "city", length = 100)
	private String city;

	@Column(name = "country", length = 60)
	private String country;

	@Column(name = "birth_day")
	private Date birthDay;

	@JsonIgnore
	@Column(name = "password", length = 100, nullable = false)
	private String password;

	@JsonIgnore
	@Column(name = "completed", nullable = false)
	private boolean completed;

	@JsonIgnore
	@Column(name = "created", insertable = false)
	private Timestamp created;

	@OneToMany(mappedBy = "profile", cascade = { CascadeType.MERGE, CascadeType.PERSIST })
	@OrderBy("name ASC")
	private List<Hobby> hobbies;

	@OneToMany(mappedBy = "profile", cascade = { CascadeType.MERGE, CascadeType.PERSIST })
	@OrderBy("id ASC")
	private List<Skill> skills;

	@OneToMany(mappedBy = "profile", cascade = { CascadeType.MERGE, CascadeType.PERSIST })
	private List<Education> education;

	@Transient
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}

}
