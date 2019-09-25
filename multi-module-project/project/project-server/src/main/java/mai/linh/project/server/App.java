package mai.linh.project.server;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * Hello world!
 *
 */
@Singleton
@Startup
public class App
{
    @PostConstruct
    public void init()
    {
        System.out.println( "Hello World!" );
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Goodbye!");
    }
}
