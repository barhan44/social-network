package io.barhan.social_network.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "skill_category")
public class SkillCategory extends AbstractEntity<Long> {

	private static final long serialVersionUID = -4706538709419251742L;

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "category", nullable = false, length = 50)
	private String category;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
