package annotation;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
//@DiscriminatorValue("VIP")
public class CustomerVIP extends Customer {
	@Column(name = "chvFreq")
	private String frequency;

	public CustomerVIP() {

	}

	public CustomerVIP(String firstname, String surname, int age, String frequency) {
		super(firstname, surname, age);
		this.frequency = frequency;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	

}
