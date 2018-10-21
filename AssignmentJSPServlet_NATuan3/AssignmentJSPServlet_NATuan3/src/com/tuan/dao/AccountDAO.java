/**
 * 
 */
package com.tuan.dao;

import com.tuan.model.Account;

/**
 * @author Tuan
 *
 */
public interface AccountDAO {
        boolean registerAccount(Account account);
        boolean loginAccount(Account account);
}
