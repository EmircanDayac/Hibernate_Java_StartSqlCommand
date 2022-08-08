package com.hiberbate_src;


import java.util.List;



import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.cfg.*;


public class Main {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory _ses = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(City.class).buildSessionFactory();
		Session _ses_ =  _ses.getCurrentSession();
		
		try {
			 _ses_.beginTransaction();

//			 List<City> Cities =  extracted(_ses_);
//			 for(City city_x:Cities ) {
//
//				 System.out.println(city_x.getName());
			 
			 City city  = _ses_.get(City.class, 22333);
//			 city.setId(22333);
//			 city.setName("a");
//			 city.setInfo("a");
//			 city.setDistrict("a");
//			 city.setCountryCode("a");
			 
			 System.out.println(city.getName());
//			 _ses_.save(city);
			 _ses_.delete(args);
			 _ses_.getTransaction().commit();
			 System.out.println("sehir eklendi");
//			 }
		
			
		}finally {
			_ses.close();
		}
		

	}

//	private static List extracted(Session _ses_) {
//		return _ses_.createQuery("from City c where c.Name = 'Seattle'").getResultList();
//	}

}
