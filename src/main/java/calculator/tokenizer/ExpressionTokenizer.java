package calculator.tokenizer;

import java.util.List;

public interface ExpressionTokenizer {

    List<String> tokenize(String input);
}