package com.demo.dao;

import com.demo.model.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
@SuppressWarnings("unchecked")
public class UserDaoImpl implements UserDao {

    @PersistenceContext(unitName = "MySQLDataSource")
    private EntityManager em;

    public List<User> findAll() {
        return em.createQuery("select distinct u from User u left join fetch u.addresses")
                .getResultList();
    }
}
