package sigmasample.aws.subscribe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author isegodin
 */
@RestController
@RequestMapping("/subscribe")
public class DocumentSubscribeController {


    @GetMapping("/status")
    public String status() {
        return "OK";
    }
}
