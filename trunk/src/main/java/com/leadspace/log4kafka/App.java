package com.leadspace.log4kafka;

import org.apache.log4j.Logger;

/**
 *  http://kafka.apache.org/documentation.html#gettingStarted
 *	http://stackoverflow.com/questions/22034895/how-to-use-kafka-0-8-log4j-appender/22270881#22270881
 */
public class App 
{
    public static void main( String[] args )
    {
    	Logger logger = Logger.getLogger(App.class);    
    	logger.info("message from log4j appender");
    	//System.out.println( "Hello World!" );
    }
}
