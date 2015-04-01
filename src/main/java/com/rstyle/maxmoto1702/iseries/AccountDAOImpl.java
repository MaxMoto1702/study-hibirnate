package com.rstyle.maxmoto1702.iseries;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by maksim.serebryanskiy on 01.04.2015.
 */
public class AccountDAOImpl implements AccountDAO {

    private Logger LOG = LoggerFactory.getLogger(AccountDAOImpl.class);

    @Override
    public List getAllAccounts() throws SQLException {
        Session session = null;
        List busses = new ArrayList<Account>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            busses = session.createCriteria(Account.class).list();
        } catch (Exception e) {
            LOG.error("Ошибка при загрузке всех аккаунтов", e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return busses;
    }

    @Override
    public void addAccount(Account account) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(account);
            session.getTransaction().commit();
        } catch (Exception e) {
            LOG.error("Ошибка при вставке", e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public void updateAccount(Account account) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(account);
            session.getTransaction().commit();
        } catch (Exception e) {
            LOG.error("Ошибка при вставке", e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public void removeAccount(Account account) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(account);
            session.getTransaction().commit();
        } catch (Exception e) {
            LOG.error("Ошибка при вставке", e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public Account getAccount(Long insnmb) throws SQLException {
        Session session = null;
        Account account = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            account = (Account) session.load(Account.class, insnmb);
        } catch (Exception e) {
            LOG.error("Ошибка поиска по СНИЛС", e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return account;
    }
}
