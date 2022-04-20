package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee extends Biodata{

	private enum Sex{
		Perempuan,
		Laki-laki
	}
	private String employeeId;	
	private Date datejoin;
	private int monthWorkingInYear;
	
	private Person spouse;
	private List<Person> childs;
	
	
	public Employee(String employeeId, Person person, String address, Date datejoin, boolean isForeigner, Sex gender) {
		this.employeeId = employeeId;
		this.firstName = person.getFirstName;
		this.lastName = person.getLastName;
		this.idNumber = person.getIdNumber;
		this.address = address;
		this.datejoin = datejoin;
		this.isForeigner = isForeigner;
		this.gender = gender;
		
		childs = new LinkedList<Person>();
		
	}
	
	public void setSpouse(String firstName, String lastName, String idNumber) {
		this.spouse = new Person(firstName, lastName, idNumber);
	}
	
	public void addChild(String firstName, String lastName, String idNumber) {
		Person child = new Person(firstName, lastName, idNumber);
		childs.add(child);
	}
	
}
