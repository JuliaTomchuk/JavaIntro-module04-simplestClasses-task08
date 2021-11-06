package my.home.module04.task08.view;

import java.util.List;

import my.home.module04.task08.entity.Customer;

public class View {

	public void print(List<Customer> customers) {

		for (Customer c : customers) {

			System.out.println(c);
		}
	}

	public void print(List<Customer> customers, String message) {

		System.out.println(message);

		for (Customer c : customers) {

			System.out.println(c);
		}
	}

}
