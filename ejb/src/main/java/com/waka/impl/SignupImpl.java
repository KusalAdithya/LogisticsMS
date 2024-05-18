package com.waka.impl;

import com.waka.entity.User;
import com.waka.entity.UserType;
import com.waka.remote.Signup;
import jakarta.ejb.Stateless;
import jakarta.ejb.TransactionAttribute;
import jakarta.ejb.TransactionAttributeType;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;

@Stateless
public class SignupImpl implements Signup {

    @PersistenceContext(unitName = "logisticsPU")
    private EntityManager em;


    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public boolean signup(String name, String mobile, String username, String password) {
        User user = new User();
        user.setName(name);
        user.setMobileNumber(mobile);
        user.setUsername(username);
        user.setPassword(password);

        UserType userType;

        try {
            userType = em.createQuery("SELECT ut FROM UserType ut WHERE ut.name =:userType", UserType.class)
                    .setParameter("userType", "Officer")
                    .getSingleResult();
        } catch (NoResultException e) {
            userType = new UserType();
            userType.setName("Officer");
            em.persist(userType);
        }

        user.setUserType(userType);

        em.persist(user);

        return true;
    }
}
