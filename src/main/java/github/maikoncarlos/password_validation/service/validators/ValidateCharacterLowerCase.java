package github.maikoncarlos.password_validation.service.validators;

import org.springframework.stereotype.Component;

import java.util.List;

import static io.micrometer.common.util.StringUtils.isBlank;

@Component
public class ValidateCharacterLowerCase implements IValidatorsPassword {

    @Override
    public void validar(String password, List<String> errors) {
        if (isBlank(password) || !password.matches(".*[a-z].*")) {
            errors.add("A senha deve conter pelo menos uma letra minúscula!");
        }
    }
}
