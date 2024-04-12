package github.maikoncarlos.password_validation.controller.dto;

import java.util.List;

public record PasswordResponseDTO(List<String> errors) {
}
