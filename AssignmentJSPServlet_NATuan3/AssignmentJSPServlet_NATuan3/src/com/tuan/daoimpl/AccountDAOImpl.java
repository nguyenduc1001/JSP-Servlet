/**
 * 
 */
package com.tuan.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tuan.dao.AccountDAO;
import com.tuan.model.Account;
import com.tuan.sqlserver.ConnectDB;
import com.tuan.utility.DBUtils;

/**
 * @author Tuan
 *
 */
public class AccountDAOImpl implements AccountDAO{
        private ConnectDB connectDB;
        private DBUtils dbUtils;
        // static Logger log = Logger.getLogger(AccountDAO.class);

        @Override
        public boolean registerAccount(Account account) {
                connectDB = new ConnectDB();
                dbUtils = new DBUtils();
                Connection conn = connectDB.getConnection();
                PreparedStatement preparedStatement = null;

                try {
                        String sql = "insert into Account(FullName,TelephoneNumber,Email,Pwd) values(?,?,?,?)";
                        preparedStatement = conn.prepareStatement(sql);
                        preparedStatement.setString(1, account.getFullName());
                        preparedStatement.setString(2, account.getTelephoneNumber());
                        preparedStatement.setString(3, account.getEmail());
                        preparedStatement.setString(4, account.getPwd());

                        preparedStatement.executeUpdate();
                        // log.info("Dang ky account thanh cong");
                } catch (SQLException e) {
                        // log.error("Dang ky account that bai");
                        return false;
                } finally {
                         dbUtils.closePreparedStatement(preparedStatement);
                         dbUtils.closeConnection(conn);
                }
                return true;
        }

        @Override
        public boolean loginAccount(Account account) {
                connectDB = new ConnectDB();
                dbUtils = new DBUtils();
                boolean isSuccess = false;
                Connection conn = connectDB.getConnection();
                PreparedStatement preparedStatement = null;
                ResultSet resultSet = null;
                String sql = "select * from Account where Email = ? and Pwd = ?";
                try {
                        preparedStatement = conn.prepareStatement(sql);
                        preparedStatement.setString(1, account.getEmail());
                        preparedStatement.setString(2, account.getPwd());

                        resultSet = preparedStatement.executeQuery();
                        if (resultSet.next()) {
                                isSuccess = true;
                        } else {
                                isSuccess = false;
                        }
                        // log.info("Dang nhap account thanh cong");
                } catch (SQLException e) {
                        // log.error("Dang nhap account that bai");
                        isSuccess = false;
                } finally {
                        dbUtils.closeResultSet(resultSet);
                        dbUtils.closePreparedStatement(preparedStatement);
                        dbUtils.closeConnection(conn);
                }
                return isSuccess;
        }

}
