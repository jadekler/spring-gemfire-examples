package org.springframework.data.gemfire.examples;

import org.apache.commons.logging.*;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.IOException;

public class GenericServer {

    private static Log log = LogFactory.getLog(GenericServer.class);

    public static void main(String args[]) throws IOException {
        if (args.length >= 1) {
            log.debug("initializing application context from Spring bean definition file " + args[0]);
        } else {
            System.out.println("usage: GenericServer <spring-bean-definition file>");
            System.exit(1);
        }

        new FileSystemXmlApplicationContext(args[0]);

        System.out.println("Press <Enter> to terminate");
        System.in.read();
        System.exit(0);
    }
}
