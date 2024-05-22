package eCommerceService.business.abstracts;

import eCommerceService.entities.concretes.Customer;

public interface CustomerVerificationService {
	void mailDogrulamaGonder(Customer customer);
    void mailDogrula(Customer customer);
    boolean dogrulamaHesabiKontrolEt(Customer customer);
}
