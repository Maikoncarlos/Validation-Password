package github.maikoncarlos.password_validation.service;

import java.util.List;

import static io.micrometer.common.util.StringUtils.isBlank;

public class ValidateCharactersExistNumber extends PasswordResponsability{

    protected ValidateCharactersExistNumber(PasswordResponsability proximo) {
        super(proximo);
    }

    @Override
    public List<String> validade(String password, List<String> errors) {
        if (isBlank(password) || !password.matches(".*[a-z].*")) {
            errors.add("A senha deve conter pelo menos um número!");
        }
        return proximo.validade(password, errors);
    }
}
