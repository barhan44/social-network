package io.barhan.social_network.entity;

import java.io.Serializable;

public abstract class AbstractEntity<T> implements Serializable {

	private static final long serialVersionUID = -6971420548866010855L;

	public abstract T getId();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.getId() == null) ? 0 : this.getId().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		@SuppressWarnings("unchecked")
		AbstractEntity<T> other = (AbstractEntity<T>) obj;
		if (this.getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return String.format("%s[id=%s]", getClass().getSimpleName(), this.getId());
	}

}
