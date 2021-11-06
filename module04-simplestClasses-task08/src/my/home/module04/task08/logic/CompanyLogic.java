package my.home.module04.task08.logic;

import java.util.ArrayList;
import java.util.List;

import my.home.module04.task08.entity.Company;
import my.home.module04.task08.entity.Customer;

public class CompanyLogic {

	public void sortAlphabetically(Company company) {

		boolean isSorted = false;

		while (!isSorted) {
			isSorted = true;

			for (int i = 0; i < company.getCustomers().size(); i++) {

				for (int j = i + 1; j < company.getCustomers().size() - 1; j++) {
					if ((company.getCustomers().get(i).getFullName()
							.compareTo(company.getCustomer(j).getFullName()) > 0)) {
						isSorted = false;

						CustomerLogic logic = new CustomerLogic();
						logic.swap(i, j, company.getCustomers());

					}
				}

			}
		}
	}

	public List<Customer> findByCardNumberRange(int from, int to, Company company) {

		List<Customer> result = new ArrayList<>();

		for (int i = 0; i < company.getCustomers().size(); i++) {

			if (company.getCustomer(i).getCreditCardNumber() > from
					&& company.getCustomer(i).getCreditCardNumber() < to) {
				result.add(company.getCustomer(i));

			}
		}

		return result;

	}

}
