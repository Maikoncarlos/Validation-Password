package github.maikoncarlos.password_validation.service;

import java.util.List;
import java.util.regex.Pattern;

import static io.micrometer.common.util.StringUtils.isBlank;

public class ValidateCharacterUpperCase extends PasswordResponsability {

    protected ValidateCharacterUpperCase(PasswordResponsability proximo) {
        super(proximo);
    }

    @Override
    public List<String> validade(String password, List<String> errors) {
        if (isBlank(password) || !Pattern.matches(".*[A-Z].*", password)) {
            errors.add("A senha deve conter pelo menos uma letra maiúscula!");
        }
        return proximo.validade(password, errors);
    }
}
