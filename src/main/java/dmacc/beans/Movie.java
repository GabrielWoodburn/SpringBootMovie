package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String rating;
	private String yearReleased;
	@Autowired
	private Producer producer;
	
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
		this.yearReleased = "2000";
	}
	
	public Movie(String name) {
		super();
		this.name = name;
	}

	public Movie(String name, String rating, String yearReleased) {
		super();
		this.name = name;
		this.rating = rating;
		this.yearReleased = yearReleased;
	}
	public Movie(long id, String name, String rating, String yearReleased) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.yearReleased = yearReleased;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getYearReleased() {
		return yearReleased;
	}
	public void setYearReleased(String yearReleased) {
		this.yearReleased = yearReleased;
	}
	public Producer getProducer() {
		return producer;
	}

	public void setAddress(Producer producer) {
		this.producer = producer;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", rating=" + rating + ", yearReleased=" + yearReleased
				+ ", producer=" + producer + "]";
	}
	
}
