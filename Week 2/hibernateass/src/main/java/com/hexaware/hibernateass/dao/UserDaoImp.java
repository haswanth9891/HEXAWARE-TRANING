package com.hexaware.hibernateass.dao;


import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hexaware.hibernateass.HibernateUtil;
import com.hexaware.hibernateass.entity.User;


public class UserDaoImp implements IUserDao {

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();

    @Override
    public boolean createUser(User user) {
        try (Session session = sessionFactory.openSession()) {
            Transaction txn = session.beginTransaction();
            session.save(user);
            txn.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateUser(User user) {
        try (Session session = sessionFactory.openSession()) {
            Transaction txn = session.beginTransaction();
            session.update(user);
            txn.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteUserById(int userId) {
        try (Session session = sessionFactory.openSession()) {
            Transaction txn = session.beginTransaction();
            User user = session.get(User.class, userId);
            if (user != null) {
                session.delete(user);
                txn.commit();
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    
    @Override
    public User selectUserByName(String userName) {
        try (Session session = sessionFactory.openSession()) {
            Query query = session.createNamedQuery("selectUserByName");
            query.setParameter("name", userName);
            User user = (User) query.getSingleResult();
            return user;
        } catch (NoResultException e) {
            // Handle the case where no user is found with the given name
            return null;
        }
    }


    @Override
    public List<User> selectAllUsers() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM User", User.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

