package eCommerceService.business.concretes;

import eCommerceService.business.abstracts.CustomerService;
import eCommerceService.core.concretes.GoogleManagerAdapter;
import eCommerceService.entities.concretes.Customer;

public class CustomerManager implements CustomerService {
	
	private CheckManager checkManager;
	private MailVerificationManager verificationManager;
	private GoogleManagerAdapter googleManagerAdapter;
	
	
	

	

	public CustomerManager(CheckManager checkManager, MailVerificationManager verificationManager,
			GoogleManagerAdapter googleManagerAdapter) {
		super();
		this.checkManager = checkManager;
		this.verificationManager = verificationManager;
		this.googleManagerAdapter = googleManagerAdapter;
	}

	@Override
	public void uyeOl(Customer customer) {
		if (checkManager.gecerliMi(customer)) {
			verificationManager.mailDogrulamaGonder(customer);
			verificationManager.mailDogrula(customer);
			googleManagerAdapter.girisYap(customer);
		}else {
			System.out.println("Hatali giris lutfen tekrar deneyiniz.");
		}
	
		
	}

	@Override
	public void giris(Customer customer) {
		if (verificationManager.dogrulamaHesabiKontrolEt(customer)) {
			System.out.println("Sisteme giris yapildi");
		}else {
			System.out.println("Sisteme giris yapilamadi");
		}
		
	}

}
