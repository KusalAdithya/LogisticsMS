package com.waka.impl;

import com.waka.entity.User;
import com.waka.remote.Login;
import jakarta.ejb.Stateless;
import jakarta.ejb.TransactionAttribute;
import jakarta.ejb.TransactionAttributeType;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;

@Stateless
public class LoginImpl  implements Login {

    @PersistenceContext(unitName = "logisticsPU")
    private EntityManager em;

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public User login(String username, String password) {

        try {
            User user = em.createQuery("SELECT u FROM User u WHERE u.username =:username AND u.password =:password", User.class)
                    .setParameter("username", username)
                    .setParameter("password", password)
                    .getSingleResult();

            return user;

        } catch (NoResultException e) {
            return null;
        }

    }
}
