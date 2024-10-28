package lotto.domain;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import lotto.settings.LottoSettings;

public class Lotto {

    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        if (hasInvalidNumber(numbers) || hasIncorrectSize(numbers) || hasDuplicates(numbers)) {
            throw new IllegalArgumentException("올바르지 않은 입력 입니다.");
        }
        this.numbers = numbers;
    }

    private boolean hasDuplicates(List<Integer> numbers) {
        return numbers.stream().distinct().count() != numbers.size();
    }

    private boolean hasIncorrectSize(List<Integer> numbers) {
        return !LottoSettings.isValidSize(numbers.size());
    }

    private boolean hasInvalidNumber(List<Integer> numbers) {
        return numbers.stream().anyMatch(i -> outOfRange(i));
    }

    protected static boolean outOfRange(Integer i) {
        return !LottoSettings.isNumberInValidRange(i);
    }

    public static Lotto from(String value) {
        return new Lotto(toNumbers(split(value)));
    }

    public static WinningLotto createWinningLotto(String value, int bonusNumber) {
        return new WinningLotto(toNumbers(split(value)), bonusNumber);
    }

    private static String[] split(String value) {
        return value.split(",");
    }

    private static List<Integer> toNumbers(String[] value) {
        return Arrays.stream(value).map(String::trim).map(Integer::parseInt).collect(Collectors.toList());
    }

    public int matchCount(Lotto winning) {
        return (int) winning.numbers.stream().filter(this::containNumber).count();
    }

    protected boolean containNumber(int number) {
        return this.numbers.contains(number);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Lotto lotto = (Lotto) o;
        return Objects.equals(numbers, lotto.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbers);
    }

    @Override
    public String toString() {
        List<Integer> sortNumbers = numbers.stream().sorted().collect(Collectors.toList());
        return sortNumbers.toString();
    }
}
