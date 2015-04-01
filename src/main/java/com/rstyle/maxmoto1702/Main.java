package com.rstyle.maxmoto1702;

import com.rstyle.maxmoto1702.iseries.Account;
import com.rstyle.maxmoto1702.iseries.Factory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;
import java.util.Date;

public class Main {
    private static Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String... args) throws SQLException {
        Account account = Factory.getInstance().getAccountDAO().getAccount(172102560L);
        LOG.info(account.toString());
        Account newAccount = new Account();
        newAccount.setInsnmb(172102561L);
        newAccount.setInscnd("АКТЛ");
        newAccount.setInsnmbOwn(0L);
        newAccount.setInsdth(new Date(2099, 12, 31));
        newAccount.setInsloc(81000);
        /*
        INSNMB	    3	DECIMAL
        INSCND	    1	CHAR
        INSNMB_OWN	3	DECIMAL
        INSDTH	    91	DATE
        INSLOC	    4	INTEGER
        */
        Factory.getInstance().getAccountDAO().addAccount(newAccount);
        LOG.info(newAccount.toString());
        account = Factory.getInstance().getAccountDAO().getAccount(172102561L);
        LOG.info(account.toString());
    }
    
    public int method() {
        int var = 0;
        LOG.debug("" + var);
        return var;
    }
}