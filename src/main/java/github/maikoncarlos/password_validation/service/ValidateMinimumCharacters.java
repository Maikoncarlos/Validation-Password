package github.maikoncarlos.password_validation.service;

import java.util.List;

import static io.micrometer.common.util.StringUtils.isBlank;

public class ValidateMinimumCharacters extends PasswordResponsability {

    protected ValidateMinimumCharacters(PasswordResponsability proximo) {
        super(proximo);
    }

    @Override
    public List<String> validade(String password, List<String> errors) {
        if (isBlank(password) || password.length() < 8) {
            errors.add("A senha deve conter no minimo 8 caracteres!");
        }
        return proximo.validade(password, errors);
    }
}
