package admin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.admin.AdminServiceApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AdminServiceApplication.class)
@WebAppConfiguration
@ActiveProfiles("scratch")
public class AdminServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
