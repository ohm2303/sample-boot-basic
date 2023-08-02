package th.mfu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/ohm")
    String hello() {
        return "Hello World! My name is Ohm";
    }

    @GetMapping("/ohm/{num1}/{num2}")
    int wow(@PathVariable int num1 , @PathVariable int num2) {
        return num1 + num2;
    }
}
