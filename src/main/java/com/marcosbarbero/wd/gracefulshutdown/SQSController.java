package com.marcosbarbero.wd.gracefulshutdown;

import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Controller;

@Controller
public class SQSController {

	@SqsListener("${aws.sqs.queue.name}")
	public void receiveNotification(String sqsMsg) throws InterruptedException {
		Thread.sleep(10000);
		System.out.println(sqsMsg);
	}
}
