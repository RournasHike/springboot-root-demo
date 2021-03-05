import com.mytest.DataSourceSpringbootApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/22
 */
@SpringBootTest(classes = DataSourceSpringbootApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class DruidTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void contextLoads(){
        System.out.println(dataSource);
    }
}
