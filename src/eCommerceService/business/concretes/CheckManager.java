package eCommerceService.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import eCommerceService.business.abstracts.CustomerCheckService;
import eCommerceService.entities.concretes.Customer;

public class CheckManager implements CustomerCheckService {
	List<String> AllEmails = new ArrayList<String>();
	public boolean isimKontrolEt(Customer customer) {
		if (customer.getIsim().isEmpty()) {
			System.out.println("İsim bilgisi bos birakilamaz tekrar dene.");
			return false;
		} else if (customer.getIsim().length() < 2) {
			System.out.println("İsim bilgisi minimum 2 karakter olmalidir. ");
			return false;
		}
		return true;

	}

	@Override
	public boolean soyisimKontrolEt(Customer customer) {
		if (customer.getSoyisim().isEmpty()) {
			System.out.println("Soyisim bos birakilamaz tekrar dene.");
			return false;
		} else if (customer.getSoyisim().length() < 2) {
			System.out.println("Soyisim bilgisi minimum 2 karakter olmalidir.");
			return false;
		}
		return true;

	}

	@Override
	public boolean epostaKontrolEt(Customer customer) {
		// regex , e-posta adreslerinin gecerli bir formata sahip olup olmadigini
		// kontrol etmek icin kullanilir
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		
		if (customer.getEposta().isEmpty()) {
			System.out.println("Email bilgisi bos birakilamaz! Yeniden dene.");
			return false;
		}else if (!pattern.matcher(customer.getEposta()).find()) {
			System.out.println("Email bilgisi,sistemdeki email formatina(regex) uymuyor.");
			return false;
		}
		return true;
	}

	@Override
	public boolean sifreKontrolEt(Customer customer) {
		if(customer.getSifre().isEmpty()) {
			System.out.println("Sifre bilgisi bos birakilamaz! Yeniden dene.");
			return false;
		}
		else if(customer.getSifre().length() <6) {
			System.out.println("Sifre bilgisi minimum 6 karakter olmalidir!");
			return false;
		}
		return true;
	}

	@Override
	public boolean gecerliEpostaKontrolEt(Customer customer) {
		if (AllEmails.contains(customer.getEposta())) {
			System.out.println("Bu eposta kullaniliyor! Farkli bir eposta giriniz.");
			return false;
		}else {
			AllEmails.add(customer.getEposta());
			return true;
		}
	}

	@Override
	public boolean gecerliMi(Customer customer) {
		if (isimKontrolEt(customer) && soyisimKontrolEt(customer) && epostaKontrolEt(customer)
				&& sifreKontrolEt(customer)
				&& gecerliEpostaKontrolEt(customer)) {
			return true;
			
		}
		return false;
		
	}

}
