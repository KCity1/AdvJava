package com.Listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class UserCountListner implements HttpSessionListener{

	public static int counter=0;
	public void sessionCreated(HttpSessionEvent s) {
		counter++;
		System.out.println("Counter ++ :"+counter);
	}
	public void sessionDestroyed(HttpSessionEvent s) {
		counter--;
		System.out.println("Counter -- :"+counter);
	}
	public static int getUserCounter()
	{
		return counter;
	}
}
