
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chatapp.dao.UsersDao;
import com.chatapp.model.Users;

public class UserTest {

	private static AnnotationConfigApplicationContext annotationConfigApplicationContext;
	private static UsersDao usersDao;
	private Users users;
	
	@BeforeClass
	public static void init()
	{
		annotationConfigApplicationContext=new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.scan("com.Chatbucket");
		annotationConfigApplicationContext.refresh();
	 usersDao =(UsersDao)	annotationConfigApplicationContext.getBean("usersDao");
	}
	@Test
	public void newUserTest()
	{
		users=new Users();
		users.setName("harsha");
		users.setRole("ROLE_ADMIN");
		assertEquals("success",true,usersDao.registerUser(users));
	}
	
}

