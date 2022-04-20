package lib;

public class Person {
    private String firstName;
	private String lastName;
	private String idNumber;

   public Person(String firstName, String lastName, String idNumber) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.idNumber = idNumber;
   }

   public getFirstName(){
       return this.firstName;
   }
   public setFirstName(String firstName){
       this.firstName = firstName;
   }

   public getLastName(){
       return this.lastName;
   }
    public setLastName(String lastName){
        this.lastName = lastName;
    }

    public getIdNumber(){
        return this.idNumber;
    }
    public setIdNumber(idNumber){
        this.idNumber = idNumber;
    }


}