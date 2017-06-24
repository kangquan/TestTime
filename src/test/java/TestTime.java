import Inte.TestTimeDao;
import Inte.impl.TestTimeDaoImpl;
import dao.mapper.TimeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Clown on 2017/06/23.
 */
public class TestTime {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    private TimeMapper timeMapper;
    private TestTimeDao dao;
    @Before
    public void init(){
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatisConfig.xml"));
            sqlSession = sqlSessionFactory.openSession();
            this.timeMapper = sqlSession.getMapper(TimeMapper.class);
            dao = new TestTimeDaoImpl();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @After
    public void distroy(){
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testAdd(){
//      输入的字符串日期类型，必须为yyyy-MM-dd形式
//      Date支持日期类型，TimeStamp支持日期加时间，如果接口传值是null，则返回系统当前时间。
//      代码详细实现在TestTimeDaoImpl中
        Date d = dao.returnDate("2012-02-05");
        Timestamp t = dao.returnTime("1995-03-19 00:02:05");
        System.out.println(this.timeMapper.addTestTime(new entity.TestTime(0, d, t)));
    }
    @Test
    public void testQueryById(){
        System.out.println(this.timeMapper.queryById(1));
    }

}
