package au.com.totemsoft.springboot.openshift;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String index() {
        return "Spring-Boot app successfully deployed and running on Openshift";
    }

}