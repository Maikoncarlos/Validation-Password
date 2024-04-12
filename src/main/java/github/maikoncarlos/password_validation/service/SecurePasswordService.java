package github.maikoncarlos.password_validation.service;

import github.maikoncarlos.password_validation.service.validators.IValidatorsPassword;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SecurePasswordService {

    private final List<IValidatorsPassword> iValidatorsPasswords;

    public List<String> validadePassword(String password) {
        List<String> errors = new ArrayList<>();

        iValidatorsPasswords.forEach(valid -> valid.validar(password, errors));

        return errors;
    }
}