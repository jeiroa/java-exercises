package es.jeiroa.exercises.loadbalancer;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LoadBalancer {
	private final Map<String, Server> servers = new ConcurrentHashMap();

	public void addServer(Server server) {
		
	}
}
