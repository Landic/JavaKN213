package itstep.learning.ioc;

import com.google.inject.AbstractModule;
import itstep.learning.services.HashService;
import itstep.learning.services.MdSHashService;

public class ServiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(HashService.class).to(MdSHashService.class);
    }
}
