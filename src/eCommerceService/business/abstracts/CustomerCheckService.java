package eCommerceService.business.abstracts;

import eCommerceService.entities.concretes.Customer;

public interface CustomerCheckService {
	boolean isimKontrolEt(Customer customer);
	boolean soyisimKontrolEt(Customer customer);
	boolean epostaKontrolEt(Customer customer);
	boolean sifreKontrolEt(Customer customer);
	boolean gecerliEpostaKontrolEt(Customer customer);
	boolean gecerliMi(Customer customer);
}
