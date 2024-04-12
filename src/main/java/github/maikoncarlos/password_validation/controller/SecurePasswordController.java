package github.maikoncarlos.password_validation.controller;

import github.maikoncarlos.password_validation.controller.dto.PasswordRequestDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SecurePasswordController {

    @PostMapping(value = "/validate-password")
    public ResponseEntity<Void> validatePassword(@RequestBody @Valid PasswordRequestDTO requestDTO) {
        return ResponseEntity.noContent().build();
    }
}
