import com.mytest.JdbcSpringbootApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/22
 */
@SpringBootTest(classes = JdbcSpringbootApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class JdbcTemplatesTest {

    //DI注入数据源
    @Autowired
    DataSource dataSource;

    @Test
    public void test1() throws SQLException {
        System.out.println(dataSource);
        //看一下默认数据源
        System.out.println(dataSource.getClass());
        //获得连接
        Connection connection =   dataSource.getConnection();
        System.out.println(connection);
        //关闭连接
        connection.close();
    }
}
