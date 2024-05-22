package eCommerceService.entities.concretes;

import eCommerceService.entities.abstracts.Entity;

public class Customer implements Entity {
	
	private int id;
	private String isim;
	private String soyisim;
	private String eposta;
	private String sifre;
	
	public Customer() {
		
	}

	public Customer(int id, String isim, String soyisim, String eposta, String sifre) {
		
		this.id = id;
		this.isim = isim;
		this.soyisim = soyisim;
		this.eposta = eposta;
		this.sifre = sifre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	
	

	
}
