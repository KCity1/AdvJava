package com.Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServerListener implements ServletContextListener{
	public void contextDestroyed(ServletContextEvent s) {
		System.out.println("NSE Connection CLOSED!");
	}

	public void contextInitialized(ServletContextEvent s) {
		System.out.println("NSE Connection OPEN!");
	}
}
