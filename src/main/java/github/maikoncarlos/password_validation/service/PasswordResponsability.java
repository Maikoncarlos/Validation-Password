package github.maikoncarlos.password_validation.service;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public abstract class PasswordResponsability {

    protected PasswordResponsability proximo;

    protected PasswordResponsability(PasswordResponsability proximo){
        this.proximo = proximo;
    }

    public abstract List<String> validade(String password, List<String> errors);
}
