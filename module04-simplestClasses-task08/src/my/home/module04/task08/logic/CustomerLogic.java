package my.home.module04.task08.logic;

import java.util.List;

import my.home.module04.task08.entity.Customer;

public class CustomerLogic {

	public void swap(int i, int j, List<Customer> customers) {

		Customer temp = customers.get(i);
		customers.set(i, customers.get(j));
		customers.set(j, temp);

	}

}
