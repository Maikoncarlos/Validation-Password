package github.maikoncarlos.password_validation.controller;

import java.util.List;

public record PasswordResponseDTO(List<String> errors) {
}
