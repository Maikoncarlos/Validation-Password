package github.maikoncarlos.password_validation.service;

import java.util.List;

import static io.micrometer.common.util.StringUtils.isBlank;

public class ValidateCharacterLowerCase extends PasswordResponsability {

    public ValidateCharacterLowerCase(PasswordResponsability proximo) {
        super(proximo);
    }

    @Override
    public List<String> validade(String password, List<String> errors) {
        if (isBlank(password) || !password.matches(".*[a-z].*")) {
            errors.add("A senha dece conter pelo menos uma letra minúscula!");
        }
        return proximo.validade(password, errors);
    }
}
