package eCommerceService.business.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceService.business.abstracts.CustomerVerificationService;
import eCommerceService.entities.concretes.Customer;

public class MailVerificationManager implements CustomerVerificationService {
	
	List<Customer> verifiedMails = new ArrayList<Customer>();
	
	@Override
	public void mailDogrulamaGonder(Customer customer) {
		verifiedMails.add(customer);
		System.out.println("Dogrulama maili gonderildi : "+customer.getEposta());
		
	}

	@Override
	public void mailDogrula(Customer customer) {
		System.out.println(customer.getEposta() + ": Mail adresi basari ile dogrulandi." );
		
	}

	@Override
	public boolean dogrulamaHesabiKontrolEt(Customer customer) {
		if (verifiedMails.contains(customer)) {
			return true;
		}
	return false;
	}

}
