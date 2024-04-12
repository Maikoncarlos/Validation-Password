package github.maikoncarlos.password_validation.controller.dto;

import jakarta.validation.constraints.*;

public record PasswordRequestDTO(

        @NotEmpty(message = "A Senha não pode ser vazia ou nula!")
        @Size(min = 8, max = 15, message = "A Senha deve conter no mínimo 8 e no máximo 15 caracteres!")
        @Pattern(regexp = ".*\\d.*", message = "A Senha deve conter pelo menos um número!")
        @Pattern(regexp = ".*[A-Z].*", message = "A Senha deve conter pelo menos uma letra maiúscula!")
        @Pattern(regexp = ".*[a-z].*", message = "A Senha deve conter pelo menos uma letra  minúscula!")
        @Pattern(regexp = ".*\\W.*", message = "A Senha deve conter pelo menos um caracter especial!")
        String password) {
}
