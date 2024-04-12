package github.maikoncarlos.password_validation.exception;

import org.jetbrains.annotations.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

@ControllerAdvice
public class ExceptionHandlerPassword {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Errors> errorsValidates(@NotNull MethodArgumentNotValidException exception) {
        List<String> listError = exception.getFieldErrors().
                stream()
                .map(erro -> erro.getDefaultMessage())
                .toList();

        return ResponseEntity.badRequest().body(new Errors(listError));
    }

    private record Errors(List<String> errors) {
    }

}
