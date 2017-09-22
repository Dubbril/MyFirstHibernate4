package client;

import annotation.Address;
import annotation.Customer;
import annotation.CustomerVIP;
import dao.CustomerDAO;
import util.HibernateUtil;

public class ClientTest {

	public static void main(String args[]) {

		// Customer cust1 = new CustomerVIP("JACK", "Marlet", 15, "Always");
		// Customer cust2 = new Customer("YAN", "BILLANA", 20);
		Customer cust1 = new Customer("JACK", "Marlet", 15);
		Customer cust2 = new Customer("YAN", "BILLANA", 20);
		Address addr1 = new Address("40-50", "Pahonyothin", "BKK", "11111");
		Address addr2 = new Address("55-59", "Bangna", "BKK", "12345");
		cust1.setAddress(addr1);
		cust2.setAddress(addr2);

		try {
			// HibernateUtil.beginTransaction();
			// CustomerDAO custdao = new CustomerDAO();
			// custdao.insert(cust1);
			// custdao.insert(cust2);
			// System.out.println("DONE");
			// HibernateUtil.commitTransaction();

			HibernateUtil.beginTransaction();
			CustomerDAO custdao = new CustomerDAO();
			custdao.insert(cust1);
			custdao.insert(cust2);
			System.out.println("DONE");
			HibernateUtil.commitTransaction();

		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("ERROR");
			HibernateUtil.rollbackTransaction();
		} finally {
			HibernateUtil.closeSession();
		}

	}

}
