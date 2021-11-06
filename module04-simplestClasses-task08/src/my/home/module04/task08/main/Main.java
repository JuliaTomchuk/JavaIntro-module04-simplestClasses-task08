package my.home.module04.task08.main;

import java.util.List;

import my.home.module04.task08.entity.Company;
import my.home.module04.task08.entity.Customer;
import my.home.module04.task08.logic.CompanyLogic;
import my.home.module04.task08.view.View;


public class Main {

	public static void main(String[] args) {
		
		
		Company company =new Company();
		
		company.getCustomers().add(new Customer("Петров Иван Иванович", "Гаврилова 11", 123,345678));
		company.getCustomers().add(new Customer("Петкевич Константин Николаевич", "Орловская 17", 99,345698));
		company.getCustomers().add(new Customer("Мороз Юлия Владимировна", "Колесника 19", 202,349078));
		company.getCustomers().add(new Customer("Коршун Мария Александровна", "Комсомольская 27", 130,347678));
		company.getCustomers().add(new Customer("Александров Александр Александрович", "Крупской 8", 550,345878));
		company.getCustomers().add(new Customer("Васильев Васлий Васильевич", "Брестская 21", 200,34567898));
		company.getCustomers().add(new Customer("Янчук Ян Львович", "Грибоедова 77", 770,34569978));
		
		View view = new View();
		
		view.print(company.getCustomers());
		
		CompanyLogic logic = new CompanyLogic();
		
		logic.sortAlphabetically(company);
		
		view.print(company.getCustomers(),"Упорядочить клиентов в алфивитном порядке");
				
		List <Customer> customers= logic.findByCardNumberRange(100, 201, company);
		
		view.print(customers, " Номера карт от 100 до 201");
		
	


	}

}
