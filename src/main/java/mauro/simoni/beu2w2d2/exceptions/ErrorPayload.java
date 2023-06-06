package mauro.simoni.beu2w2d2.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class ErrorPayload {
    private String message;
    private Date timestamp;
    private int internalCode;
}
