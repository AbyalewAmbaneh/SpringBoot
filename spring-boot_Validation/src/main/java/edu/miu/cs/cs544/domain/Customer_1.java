package edu.miu.cs.cs544.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Table(name="Cust")
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Customer_1 {
	@Id
	@GeneratedValue
	private Integer id;
	@Size(max = 30)
	private String firstName;
	@Size(max = 30)
	private String lastName;
	@Email()
	private String email;
	@Past
	@Temporal(TemporalType.DATE)
	private Date bday;

	public Customer_1(String firstName, String lastName, String email, Date bday) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.bday = bday;
	}

}
