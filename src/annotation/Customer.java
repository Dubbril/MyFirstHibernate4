package annotation;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "chvType", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("NON-VIP")
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name = "chvFirNam")
	private String firstname;

	@Column(name = "chvSurNam")
	private String surname;

	@Column(name = "intAge")
	private int age;

	public Customer(String firstname, String surname, int age) {
		this.firstname = firstname;
		this.surname = surname;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
