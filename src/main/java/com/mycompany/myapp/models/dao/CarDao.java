package com.mycompany.myapp.models.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;

import com.mycompany.myapp.models.Car;

public class CarDao {

	 private SessionFactory sessionFactory;

	public CarDao(SessionFactory sessionFactory) {
	        this.sessionFactory = sessionFactory;
	    }
	
	public List<Car> list() {
        @SuppressWarnings("unchecked")
        List<Car> listCar = (List<Car>) sessionFactory.getCurrentSession()
                .createCriteria(Car.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
 
        return listCar;
    }
}
