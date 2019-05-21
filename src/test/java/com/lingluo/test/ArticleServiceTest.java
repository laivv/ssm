package com.lingluo.test;

import java.util.List;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.lingluo.dao.ArticleDao;
import com.lingluo.model.Article;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring-mybatis.xml"})
public class ArticleServiceTest{
	
   private static final Logger log = Logger.getLogger(ArticleServiceTest.class);
   
   @Resource
   ArticleDao articleDao;
	
   @Test
   public void findByIdTest(){
	 List<Article> articles = articleDao.findByPage(1, 10);
	 log.info(articles);
   }
	
}