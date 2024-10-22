package calculator.tokenizer;

import calculator.tokenizer.ExpressionTokenizer;
import java.util.Arrays;
import java.util.List;

public class SpaceExpressionTokenizer implements ExpressionTokenizer {

    private static final String SPLIT_PATTERN = " ";

    @Override
    public List<String> tokenize(String input) {
        if (isUnValid(input)) {
            throw new IllegalArgumentException("입력은 null이거나 빈값 일 수 없습니다.");
        }
        return toList(split(input));
    }

    private boolean isUnValid(String input) {
        return input == null || input.isBlank();
    }

    private String[] split(String input) {
        return input.split(SPLIT_PATTERN);
    }

    private List<String> toList(String[] value) {
        return Arrays.asList(value);
    }
}