package github.maikoncarlos.password_validation.service;

import java.util.List;

public class ValidateFinal extends PasswordResponsability {

    protected ValidateFinal() {
        super(null);
    }

    @Override
    public List<String> validade(String password, List<String> errors) {
        return errors;
    }
}
