
package models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.enums.Status;
import java.enums.Type;
import java.util.Date;

/**
 * The class {@code Incident} represents an occurrence, condition, 
 * or situation arising in the course of work that resulted in or could 
 * have resulted in injuries, illnesses, damage, or fatalities.
 * 
 * {@code Incident} should have an id, title, type[Redflag, Intervention], 
 * status[Draft, Under investigation, Resolved, Rejected], createdOn and comment
 *
 */

@Entity
@Table(name="Records")
public class Incident {
    private int id;
    private String title;
    private Type  type;
    private Status status;
    private Date  createdOn;
    private String comment;
	private int counter;



	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	@Id
	@Column(name="Record_Id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Column(name="Title")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name="Type")
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}

	@Column(name="Status")
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Column(name="Date Created")
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name="Comment")
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return title;
	}
}
