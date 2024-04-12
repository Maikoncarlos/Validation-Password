package github.maikoncarlos.password_validation.controller;

import github.maikoncarlos.password_validation.controller.dto.PasswordRequestDTO;
import github.maikoncarlos.password_validation.controller.dto.PasswordResponseDTO;
import github.maikoncarlos.password_validation.service.SecurePasswordService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SecurePasswordController {

    private final SecurePasswordService passwordService;

    @PostMapping(value = "/validate-password")
    public ResponseEntity<PasswordResponseDTO> validatePassword(@RequestBody PasswordRequestDTO requestDTO) {
        var errorList = passwordService.validadePassword(requestDTO.password());
        if (errorList.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.badRequest().body(new PasswordResponseDTO(errorList));
    }
}
