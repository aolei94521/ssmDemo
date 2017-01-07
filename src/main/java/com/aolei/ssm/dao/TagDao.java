package com.aolei.ssm.dao;

import org.apache.ibatis.annotations.Select;

import com.aolei.ssm.entity.Tag;

public interface TagDao {
	//int countByExample(TagDaoExample example);

    //int deleteByExample(TagDaoExample example);

    int deleteByPrimaryKey(Integer tagid);

    int insert(Tag record);

    int insertSelective(Tag record);

    //List<TagDao> selectByExample(TagDaoExample example);

    Tag selectByPrimaryKey(Integer tagid);

    //int updateByExampleSelective(@Param("record") TagDao record, @Param("example") TagDaoExample example);

    //int updateByExample(@Param("record") TagDao record, @Param("example") TagDaoExample example);

    int updateByPrimaryKeySelective(Tag record);

    int updateByPrimaryKey(Tag record);
    
    @Select("select * from tb_tag where tagId = #{tagId}")
    Tag selectById(Integer tagId);
}
