package com.example.demo.receiver;

import java.util.Map;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.support.JmsHeaders;
import org.springframework.jms.support.JmsMessageHeaderAccessor;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
	@JmsListener(destination = "${jms.activemq.queue}", containerFactory = "jmsFactory")
	public void receive(@Payload String msg, @Header(JmsHeaders.CORRELATION_ID) String correlationId,
			@Header(name = "jms-header-not-exists", defaultValue = "default") String nonExistingHeader,
			@Headers Map<String, Object> headers, MessageHeaders messageHeaders,
			JmsMessageHeaderAccessor jmsMessageHeaderAccessor) {
		System.out.println("Recieved Message: \n" + msg + "\n" + jmsMessageHeaderAccessor.getDestination() + "\n"
				+ jmsMessageHeaderAccessor.getPriority() + "\n" + jmsMessageHeaderAccessor.getMessageId() + "\n"
				+ jmsMessageHeaderAccessor.getDeliveryMode().toString());
	}
}
