package github.maikoncarlos.password_validation.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import static io.micrometer.common.util.StringUtils.isBlank;

@Service
public class SecurePasswordService {
    public List<String> validadePassword(String password) {
        List<String> errors = new ArrayList<>();

        validateMinimumCharacters(password, errors);
        validateCharacterUpperCase(password, errors);
        validateCharacterLowerCase(password, errors);
        validateCharactersExistNumber(password, errors);
        validateCharacterSpecial(password, errors);
        return errors;
    }

    private void validateMinimumCharacters(String password, List<String> errors) {
        if (isBlank(password) || password.length() < 8)
            errors.add("A senha deve conter no minimo 8 caracteres!");
    }

    private void validateCharacterUpperCase(String password, List<String> errors) {
        if (isBlank(password) || !Pattern.matches(".*[A-Z].*", password)) {
            errors.add("A senha deve conter pelo menos uma letra maiúscula!");
        }
    }

    private void validateCharacterLowerCase(String password, List<String> errors) {
        if (isBlank(password) || !password.matches(".*[a-z].*")) {
            errors.add("A senha dece conter pelo menos uma letra minúscula!");
        }
    }

    private void validateCharactersExistNumber(String password, List<String> errors) {
        if (isBlank(password) || !password.matches(".*\\d.*")) {
            errors.add("A senha deve conter pelo menos um número!");
        }
    }

    private void validateCharacterSpecial(String password, List<String> errors) {
        if (isBlank(password) || !password.matches(".*\\W.*")) {
            errors.add("A senha deve conter pelo menos um caracter especial!");
        }
    }
}

