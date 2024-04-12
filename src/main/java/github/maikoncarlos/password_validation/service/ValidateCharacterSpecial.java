package github.maikoncarlos.password_validation.service;

import java.util.List;

import static io.micrometer.common.util.StringUtils.isBlank;

public class ValidateCharacterSpecial extends PasswordResponsability{

    protected ValidateCharacterSpecial(PasswordResponsability proximo) {
        super(proximo);
    }

    @Override
    public List<String> validade(String password, List<String> errors) {
        if (isBlank(password) || !password.matches(".*\\W.*")) {
            errors.add("A senha deve conter pelo menos um caracter especial!");
        }
        return proximo.validade(password, errors);
    }
}
