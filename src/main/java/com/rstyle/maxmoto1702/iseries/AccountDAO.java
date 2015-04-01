package com.rstyle.maxmoto1702.iseries;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by maksim.serebryanskiy on 01.04.2015.
 */
public interface AccountDAO {

    public List getAllAccounts() throws SQLException;

    public void addAccount(Account account) throws SQLException;

    public void updateAccount(Account account) throws SQLException;

    public void removeAccount(Account account) throws SQLException;

    public Account getAccount(Long insnmb) throws SQLException;
}
