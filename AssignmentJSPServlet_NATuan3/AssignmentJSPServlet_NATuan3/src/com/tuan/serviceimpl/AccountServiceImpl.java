/**
 * 
 */
package com.tuan.serviceimpl;

import com.tuan.dao.AccountDAO;
import com.tuan.daoimpl.AccountDAOImpl;
import com.tuan.model.Account;
import com.tuan.service.AccountService;

/**
 * @author Tuan
 *
 */
public class AccountServiceImpl implements AccountService {
        private AccountDAO accountDAO;
        @Override
        public boolean registerAccount(Account account) {
                accountDAO = new AccountDAOImpl();
                return accountDAO.registerAccount(account);
        }
        @Override
        public boolean loginAccount(Account account) {
                accountDAO = new AccountDAOImpl();
                return accountDAO.loginAccount(account);
        }
}
