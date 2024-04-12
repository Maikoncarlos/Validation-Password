package github.maikoncarlos.password_validation.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SecurePasswordService {
    public List<String> validadePassword(String password) {
        List<String> errors = new ArrayList<>();

        var validates = new ValidateMinimumCharacters(new ValidateCharacterUpperCase(new ValidateCharacterLowerCase(
                new ValidateCharactersExistNumber(new ValidateCharacterSpecial(new ValidateFinal())))));

        return validates.validade(password, errors);
    }
}