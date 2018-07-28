package sigmasample.aws.subscribe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author isegodin
 */
@RestController
@RequestMapping("/subscriber")
public class DocumentSubscriberController {


    @GetMapping("/status")
    public String status() {
        return "OK";
    }
}
