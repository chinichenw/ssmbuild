import com.chini.pojo.Books;
import com.chini.service.BookService;
import com.chini.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.context.support.XmlWebApplicationContext;

import java.util.List;

public class Mytest {

//    @Autowired
//    @Qualifier("BookServiceImpl")
//    private BookService bookService;
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("BookServiceImpl", BookService.class);
        System.out.println(bookService);
        List<Books> books = bookService.queryAllBook();
        System.out.println(books);

    }
}
