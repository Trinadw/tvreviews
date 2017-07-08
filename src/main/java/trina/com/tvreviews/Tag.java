package trina.com.tvreviews;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToMany(mappedBy="tags")
	private Set<Review> reviews;
	
	private String name;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Tag(String name) {
		this.name = name;
	}
	
public Tag(){
	
}

public Set<Review> getReviews() {
	return reviews;
}

@Override
public String toString() {
	return name;
}



}
