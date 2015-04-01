package com.rstyle.maxmoto1702.iseries;

/**
 * Created by maksim.serebryanskiy on 01.04.2015.
 */
public class Factory {

    private static AccountDAO accountDAO = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public AccountDAO getAccountDAO() {
        if (accountDAO == null) {
            accountDAO = new AccountDAOImpl();
        }
        return accountDAO;
    }
}
