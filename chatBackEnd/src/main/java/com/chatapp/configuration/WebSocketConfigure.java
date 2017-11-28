package com.chatapp.configuration;



import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@EnableWebSocketMessageBroker
@Configuration
@ComponentScan(basePackages="com.chatapp")
public class WebSocketConfigure extends AbstractWebSocketMessageBrokerConfigurer{

	@Override
	  public void configureMessageBroker(MessageBrokerRegistry config)
	{
		System.out.println("Heloo");
	    config.enableSimpleBroker("/topic");
	    config.setApplicationDestinationPrefixes("/app");
	  }
	
	public void registerStompEndpoints(StompEndpointRegistry registry) 
	{
		System.out.println("Vasu");
		registry.addEndpoint("/chat").withSockJS();
		
	}

}

