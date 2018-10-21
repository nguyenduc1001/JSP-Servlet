/**
 * 
 */
package com.tuan.service;

import com.tuan.model.Account;

/**
 * @author Tuan
 *
 */
public interface AccountService {

        boolean registerAccount(Account account);
        boolean loginAccount(Account account);
}
