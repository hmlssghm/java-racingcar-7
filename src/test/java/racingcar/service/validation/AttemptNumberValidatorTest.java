package racingcar.service.validation;

import org.junit.jupiter.api.Test;
import racingcar.service.validation.AttemptNumberValidator;
import racingcar.view.messages.ErrorMessageEnum;

import static org.junit.jupiter.api.Assertions.*;

class AttemptNumberValidatorTest {

    private final AttemptNumberValidator validator = new AttemptNumberValidator();

    @Test
    void 유효값_통과_테스트() {
        assertDoesNotThrow(() -> validator.validate("3"));
    }

    @Test
    void 공백_테스트() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            validator.validate("");
        });
        assertEquals(ErrorMessageEnum.EMPTY_ERROR.getErrorMessage(), exception.getMessage());
    }

    @Test
    void 시도값_0_테스트() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            validator.validate("0");
        });
        assertEquals(ErrorMessageEnum.NOT_NATURAL_NUMBER_ERROR.getErrorMessage(), exception.getMessage());
    }

    @Test
    void 시도값_음수_테스트() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            validator.validate("-1");
        });
        assertEquals(ErrorMessageEnum.NOT_NATURAL_NUMBER_ERROR.getErrorMessage(), exception.getMessage());
    }
}