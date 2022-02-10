package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


import metier.Compte;



	@WebService
	public class BanqueService {
		@WebMethod
		public double conversion(@WebParam(name="montant") double montant)  {
			// TODO Auto-generated method stub
			return montant*2;
		}

		@WebMethod
		public Compte consulterCompte(@WebParam(name="code") int code) {
			Compte cp= new Compte(1,Math.random()*9000,new Date());
			return cp;
		}

		@WebMethod
		public List<Compte> listComptes() {
			List<Compte> cptes=new ArrayList<Compte>();
			cptes.add(new Compte(1,Math.random()*9000,new Date()));
			cptes.add(new Compte(2,Math.random()*9000,new Date()));
			cptes.add(new Compte(3,Math.random()*9000,new Date()));
			return cptes;
		}

}
