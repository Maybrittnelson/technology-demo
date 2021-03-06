package com.geshaofeng.springbootmybatisdemo.mapper1;

import com.geshaofeng.springbootmybatisdemo.entity1.UserEntity;
import com.geshaofeng.springbootmybatisdemo.entity1.UserEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Mar 22 15:26:15 CST 2018
     */
    long countByExample(UserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Mar 22 15:26:15 CST 2018
     */
    int deleteByExample(UserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Mar 22 15:26:15 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Mar 22 15:26:15 CST 2018
     */
    int insert(UserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Mar 22 15:26:15 CST 2018
     */
    int insertSelective(UserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Mar 22 15:26:15 CST 2018
     */
    List<UserEntity> selectByExample(UserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Mar 22 15:26:15 CST 2018
     */
    UserEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Mar 22 15:26:15 CST 2018
     */
    int updateByExampleSelective(@Param("record") UserEntity record, @Param("example") UserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Mar 22 15:26:15 CST 2018
     */
    int updateByExample(@Param("record") UserEntity record, @Param("example") UserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Mar 22 15:26:15 CST 2018
     */
    int updateByPrimaryKeySelective(UserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Mar 22 15:26:15 CST 2018
     */
    int updateByPrimaryKey(UserEntity record);
}