package com.ssm.test;

import com.ssm.dao.AccountDao;
import com.ssm.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * @author 13967
 * @date 2019/8/17 20:38
 */
public class TestMybatis {

    /**
     * 查询所有
     * @throws IOException
     */
    @Test
    public void run1() throws IOException {

        // 加载mybatis的配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        // 查询所有数据
        List<Account> accounts = dao.findAllAccount();
        for(Account account: accounts){
            System.out.println(account);
        }
        // 释放资源
        session.close();
        in.close();
    }

    /**
     * 保存账户
     * @throws IOException
     */
    @Test
    public void run2() throws IOException {

        Account account = new Account();
        account.setName("Fico");
        account.setMoney(300.0);

        // 加载mybatis的配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        // 保存用户
        dao.saveAccount(account);
        // 提交事务
        session.commit();
        // 释放资源
        session.close();
        in.close();
    }
}
