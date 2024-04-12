package github.maikoncarlos.password_validation.service.validators;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.regex.Pattern;

import static io.micrometer.common.util.StringUtils.isBlank;

@Component
public class ValidateCharacterUpperCase implements IValidatorsPassword {

    @Override
    public void validar(String password, List<String> errors) {
        if (isBlank(password) || !Pattern.matches(".*[A-Z].*", password)) {
            errors.add("A senha deve conter pelo menos uma letra maiúscula!");
        }
    }
}
