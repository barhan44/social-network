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

@Entity
@Table(name = "hobby")
public class Hobby extends AbstractEntity<Long> implements Serializable, Comparable<Hobby>, ProfileEntity {

	private static final long serialVersionUID = -9017348349000848033L;

	@Id
	@SequenceGenerator(name = "HOBBY_ID_GENERATOR", sequenceName = "HOBBY_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HOBBY_ID_GENERATOR")
	@Column(unique = true, nullable = false)
	private Long id;

	@Column(nullable = false, length = 30)
	private String name;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_profile", nullable = false)
	private Profile profile;

	public Hobby() {
	}

	public Hobby(String name) {
		super();
		this.name = name;
	}

	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Hobby o) {
		return o == null || this.getName() == null ? 1 : this.getName().compareTo(o.getName());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Hobby))
			return false;
		Hobby other = (Hobby) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Hobby [name=%s]", this.name);
	}

}
