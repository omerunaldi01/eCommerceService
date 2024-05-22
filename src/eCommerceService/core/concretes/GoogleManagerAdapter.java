package eCommerceService.core.concretes;

import eCommerceService.core.abstracts.LoginService;
import eCommerceService.entities.concretes.Customer;
import eCommerceService.google.GoogleManager;

public class GoogleManagerAdapter implements LoginService {

	@Override
	public void girisYap(Customer customer) {
		GoogleManager googleManager = new GoogleManager();
		googleManager.googleİleGiris(customer.getEposta());
		
	}

}
