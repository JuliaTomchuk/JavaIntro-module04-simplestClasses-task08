package my.home.module04.task08.entity;

/*Создать класс Customer, спецификация которого приведена ниже.Определить конструкторы,set- и get- методы и метод toString.
* Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. Задать критерии выбора данных
* и вывести эти данные на консоль.
* Класс Customer: id, фамилия, имя, отчество,адрес, номер кредитной карточки, номер банкавского счёта.
* Найти и вывести:
* список покупателей в алфавитном порядке
* список покупателей, у которых номер кредитной карточки находится в заданном диапазоне*/

public class Customer {

	private static long counter;
	private final long ID = counter++;
	private String fullName;
	private String adress;
	private long creditCardNumber;
	private long bankAccountNumber;

	public Customer() {

		fullName = null;
		adress = null;
		creditCardNumber = 0;
		bankAccountNumber = 0;
	}

	public Customer(String fullName, String adress, long creditCardNumber, long bankAccountNumber) {

		this.fullName = fullName;
		this.adress = adress;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;

	}

	public long getID() {
		return ID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public long getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public long getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(long bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[ ID= " + ID + ", fullName=" + fullName + ", adress=" + adress
				+ ", creditCardNumber=" + creditCardNumber + ", bankAccountNumber=" + bankAccountNumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + (int) (bankAccountNumber ^ (bankAccountNumber >>> 32));
		result = prime * result + (int) (creditCardNumber ^ (creditCardNumber >>> 32));
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + (int) (ID ^ (ID >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (bankAccountNumber != other.bankAccountNumber)
			return false;
		if (creditCardNumber != other.creditCardNumber)
			return false;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (ID != other.ID)
			return false;
		return true;
	}

}