package baeldung;

import java.util.Arrays;

public class ToStringMain extends Customer {
	private long balance;
	private Orders[] order;
	
	public ToStringMain() {
		this.x =2;
	}

	public Orders[] getOrder() {
		return order;
	}

	public void setOrder(Orders[] order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Customer [Orders = " + Arrays.toString(order) + "Balance = " + balance + "getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + ", x = " +getX()+ "]";
	}

	public static void main(String[] args) {
		ToStringMain cus = new ToStringMain();

		Orders or = new Orders();
		or.setDesc("Test");
		or.setOrderId("First");
		or.setStatus("open");
		or.setValue(23);

		cus.setFirstName("hello");
		cus.setLastName("there");
		cus.balance = 4;
		cus.setOrder(new Orders[] { or });

		System.out.println(cus);
		System.out.println(or);

	}
}
