package itstep.learning.ioc;

import com.google.inject.Inject;
import itstep.learning.services.HashService;

public class IocDemo {

    private final HashService hashService;

    @Inject // інжекційний конструктор необхідно помітити анотацією
    public IocDemo(HashService hashService) {
        this.hashService = hashService;
    }

    public void run()
    {
        System.out.println("IocDemo");
        System.out.println(hashService.hash("123"));

    }
}