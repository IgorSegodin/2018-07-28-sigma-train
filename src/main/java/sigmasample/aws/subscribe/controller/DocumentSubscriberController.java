package sigmasample.aws.subscribe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sigmasample.aws.subscribe.service.AmazonS3Service;

/**
 * @author isegodin
 */
@RestController
@RequestMapping("/subscriber")
public class DocumentSubscriberController {

    @Autowired
    private AmazonS3Service amazonS3Service;

    @GetMapping("/status")
    public String status() {
        return "OK";
    }

    @GetMapping("/test")
    public String test() {
        amazonS3Service.getDocument(null);
        return "OK";
    }
}
