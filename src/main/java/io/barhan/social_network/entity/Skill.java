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
import lombok.Setter;

@Entity
@Table(name = "skill")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Skill extends AbstractEntity<Long> implements Serializable, ProfileEntity {

	private static final long serialVersionUID = -4181971747755718633L;

	@Id
	@JsonIgnore
	@SequenceGenerator(name = "SKILL_ID_GENERATOR", sequenceName = "SKILL_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SKILL_ID_GENERATOR")
	@Column(unique = true, nullable = false)
	private Long id;

	@Column(nullable = false, length = 50)
	private String category;

	@Column(nullable = false)
	private String value;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_profile", nullable = false)
	@EqualsAndHashCode.Exclude
	private Profile profile;

}
