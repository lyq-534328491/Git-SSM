package com.itcast.dao;

import com.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {

    /**
     * 查询所有
     * @return
     */
    @Select("select * from account")
    public List<Account> findAll();


    @Insert("insert into account values(null,#{name},#{money})")
    public void saveAccount(Account account);

}
