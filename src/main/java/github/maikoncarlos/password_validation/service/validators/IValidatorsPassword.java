package github.maikoncarlos.password_validation.service.validators;

import java.util.List;

public interface IValidatorsPassword {

    void validar(String password, List<String> errors);
}
