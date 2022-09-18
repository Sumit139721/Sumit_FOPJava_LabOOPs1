import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Sumit", "Kewalramani");
		String emailID="";
		char[] password = {};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		int option = scanner.nextInt();
		scanner.close();
		CredentialService cs = new CredentialService();
		

			
		
			switch(option){
			case 1:
				//Technical
				emailID = cs.generateEmailAddress(employee.getFirstName(), 
						employee.getLastName(), "tech");
				password = cs.generatePassword();
				
				break;
			case 2:
				//Admin
				emailID = cs.generateEmailAddress(employee.getFirstName(), 
						employee.getLastName(), "adm");
				password = cs.generatePassword();
				
				break;
			case 3:
				//Human Resource
				emailID = cs.generateEmailAddress(employee.getFirstName(), 
						employee.getLastName(), "hr");
				password = cs.generatePassword();
				
				break;
			case 4:
				//Legal
				emailID = cs.generateEmailAddress(employee.getFirstName(), 
						employee.getLastName(), "lg");
				password = cs.generatePassword();
				
				break;
			
			default:
				System.out.println("Invalid Choice");
			}
		cs.showCredentials(employee, emailID, password);
	}

}
