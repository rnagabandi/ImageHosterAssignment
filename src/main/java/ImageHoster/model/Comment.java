package ImageHoster.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//@Entity annotation specifies that the corresponding class is a JPA entity
@Entity
//@Table annotation provides more options to customize the mapping.
//Here the name of the table to be created in the database is explicitly mentioned as 'images'. Hence the table named 'images' will be created in the database with all the columns mapped to all the attributes in 'Image' class
@Table(name = "comment")
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "text")
	private String text;

	@Column(name = "createdDate")
	private Date createdDate;

	@ManyToOne(fetch = FetchType.LAZY)
	private User user;

	@ManyToOne(fetch = FetchType.LAZY)
	private Image image;
	
	public Comment() {
		
	}

	public Comment(String text, Date createdDate, User user, Image image) {
		super();
		this.text = text;
		this.createdDate = createdDate;
		this.user = user;
		this.image = image;
	}
	
	public Comment(Integer id, String text, Date createdDate, User user, Image image) {
		super();
		this.id = id;
		this.text = text;
		this.createdDate = createdDate;
		this.user = user;
		this.image = image;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

}
