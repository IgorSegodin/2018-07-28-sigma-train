package sigmasample.aws.subscribe.service;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

/**
 * @author isegodin
 */
public class AmazonS3Service {

    private AmazonS3 amazonS3 = AmazonS3ClientBuilder.defaultClient();

    Object getDocument(String key) {
//        amazonS3.getObject()
        return null;

    }
}
