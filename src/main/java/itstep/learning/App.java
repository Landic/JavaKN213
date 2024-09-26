package itstep.learning;

import com.google.inject.Injector;
import itstep.learning.async.AsyncDemo;
import itstep.learning.oop.OopDemo;
import itstep.learning.ioc.IocDemo;
import itstep.learning.ioc.Resolver;

import java.util.Objects;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
//        new Basics().run();
//        new OopDemo().run();
        new AsyncDemo().run();
//        Resolver resolver = new Resolver();
//        Injector injector = resolver.getInjector();
//        IocDemo iocDemo = injector.getInstance(IocDemo.class);
//        iocDemo.run();
    }
 }