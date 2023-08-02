package th.mfu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloControllerTest {

    @Autowired
    private HelloController controller;

    @Test
    public void testHello() {
        // Act
        String response = controller.hello();
        // Assert
        assertEquals("Hello World!", response);
    }


    @Test
    public void testOhm(){
        // Act
        int res = controller.wow(8, 2);

        // Assert
        assertEquals(10,res);
        // Assert
        assertEquals(2+3,controller.wow(2,3));
    }
}
