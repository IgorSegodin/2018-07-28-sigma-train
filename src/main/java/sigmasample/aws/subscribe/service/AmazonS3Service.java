package sigmasample.aws.subscribe.service;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author isegodin
 */
@Component
public class AmazonS3Service {

    @Value("${s3.bucket}")
    private String bucket;
    @Autowired
    private AmazonS3 amazonS3;

    public Object getDocument(String key) {

        amazonS3.putObject("/test1", bucket, "hello");

//        amazonS3.getObject()
        return null;

    }
}
