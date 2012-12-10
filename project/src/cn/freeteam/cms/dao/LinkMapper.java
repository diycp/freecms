package cn.freeteam.cms.dao;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.freeteam.cms.model.Link;
import cn.freeteam.cms.model.LinkExample;

public interface LinkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    int countByExample(LinkExample example);
    List<Link> selectPageByExample(LinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    int deleteByExample(LinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    int insert(Link record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    int insertSelective(Link record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    List<Link> selectByExample(LinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    Link selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    int updateByExampleSelective(@Param("record") Link record, @Param("example") LinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    int updateByExample(@Param("record") Link record, @Param("example") LinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    int updateByPrimaryKeySelective(Link record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link
     *
     * @mbggenerated Tue May 15 15:02:16 CST 2012
     */
    int updateByPrimaryKey(Link record);
}