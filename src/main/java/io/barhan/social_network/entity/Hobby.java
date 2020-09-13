package io.barhan.social_network.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "hobby")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Hobby extends AbstractEntity<Long> implements Serializable, Comparable<Hobby>, ProfileEntity {

	private static final long serialVersionUID = -4084713440416949068L;

	@Id
	@JsonIgnore
	@SequenceGenerator(name = "HOBBY_ID_GENERATOR", sequenceName = "HOBBY_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HOBBY_ID_GENERATOR")
	@Column(unique = true, nullable = false)
	private Long id;

	@Column(nullable = false, length = 30)
	private String name;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_profile", nullable = false)
	@EqualsAndHashCode.Exclude
	private Profile profile;

	public Hobby(String name) {
		this.name = name;
	}

	public Hobby(Long id, String name, Profile profile) {
		this.id = id;
		this.name = name;
		this.profile = profile;
	}

	@Override
	public int compareTo(Hobby o) {
		if (o == null || this.getName() == null) {
			return 1;
		} else {
			return this.getName().compareTo(o.getName());
		}
	}

}
