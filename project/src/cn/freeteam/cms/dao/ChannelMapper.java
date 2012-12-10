package cn.freeteam.cms.dao;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.freeteam.cms.model.Channel;
import cn.freeteam.cms.model.ChannelExample;

public interface ChannelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel
     *
     * @mbggenerated Mon Jan 23 20:25:00 CST 2012
     */
    int countByExample(ChannelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel
     *
     * @mbggenerated Mon Jan 23 20:25:00 CST 2012
     */
    int deleteByExample(ChannelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel
     *
     * @mbggenerated Mon Jan 23 20:25:00 CST 2012
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel
     *
     * @mbggenerated Mon Jan 23 20:25:00 CST 2012
     */
    int insert(Channel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel
     *
     * @mbggenerated Mon Jan 23 20:25:00 CST 2012
     */
    int insertSelective(Channel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel
     *
     * @mbggenerated Mon Jan 23 20:25:00 CST 2012
     */
    List<Channel> selectByExampleWithBLOBs(ChannelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel
     *
     * @mbggenerated Mon Jan 23 20:25:00 CST 2012
     */
    List<Channel> selectByExample(ChannelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel
     *
     * @mbggenerated Mon Jan 23 20:25:00 CST 2012
     */
    Channel selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel
     *
     * @mbggenerated Mon Jan 23 20:25:00 CST 2012
     */
    int updateByExampleSelective(@Param("record") Channel record, @Param("example") ChannelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel
     *
     * @mbggenerated Mon Jan 23 20:25:00 CST 2012
     */
    int updateByExampleWithBLOBs(@Param("record") Channel record, @Param("example") ChannelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel
     *
     * @mbggenerated Mon Jan 23 20:25:00 CST 2012
     */
    int updateByExample(@Param("record") Channel record, @Param("example") ChannelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel
     *
     * @mbggenerated Mon Jan 23 20:25:00 CST 2012
     */
    int updateByPrimaryKeySelective(Channel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel
     *
     * @mbggenerated Mon Jan 23 20:25:00 CST 2012
     */
    int updateByPrimaryKeyWithBLOBs(Channel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel
     *
     * @mbggenerated Mon Jan 23 20:25:00 CST 2012
     */
    int updateByPrimaryKey(Channel record);
}