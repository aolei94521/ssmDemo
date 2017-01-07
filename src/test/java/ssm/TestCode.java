package ssm;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.aolei.ssm.entity.Tag;
import com.aolei.ssm.service.TagDaoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class TestCode {
	private static Logger logger = LoggerFactory.getLogger(TestCode.class);
	//private ApplicationContext ac = null;
	@Resource
	private TagDaoService tagDaoService = null;
	
	/*@Before
	public void before(){
		ac = new ClassPathXmlApplicationContext("appp")
	}*/
	
	@Test
	public void test1(){
		Tag tag = tagDaoService.getTagById(1);
		logger.info(JSON.toJSONString(tag));
	}
}
