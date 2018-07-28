package sigmasample.aws.subscribe.service;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;

/**
 * @author isegodin
 */
public class AmazonSqsListener {

    private AmazonSQS amazonSQS = AmazonSQSClientBuilder.defaultClient();
}
