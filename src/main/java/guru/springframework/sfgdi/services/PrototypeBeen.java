package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBeen {

    public PrototypeBeen(){
        System.out.println("Creating a Prototype been !!!!!!!!!");
    }
    public String getMyScope(){
        return "I'm a Prototype";
    }
}
