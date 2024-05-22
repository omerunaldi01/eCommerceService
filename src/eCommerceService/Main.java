package eCommerceService;

import eCommerceService.business.abstracts.CustomerService;
import eCommerceService.business.concretes.CheckManager;
import eCommerceService.business.concretes.CustomerManager;
import eCommerceService.business.concretes.MailVerificationManager;
import eCommerceService.core.concretes.GoogleManagerAdapter;
import eCommerceService.entities.concretes.Customer;

public class Main {
//Spring IoC ile iyileştirilecektir.
	public static void main(String[] args) {
		CustomerService customerService = new CustomerManager(new CheckManager(),
															new MailVerificationManager(),
															new GoogleManagerAdapter());
		
		Customer customer = new Customer(1,"Omer","Unaldi","omerunald@gmail.com","123456");
		customerService.uyeOl(customer);
	}

}
