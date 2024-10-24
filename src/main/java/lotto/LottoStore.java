package lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoStore {

    private static final Money BASE_AMOUNT = new Money(1000);

    public List<Lotto> buy(int fee) {
        Money money = new Money(fee);
        if (isInvalidBaseUnit(money)) {
            throw new IllegalArgumentException("로또는 1000원 단위이여야 합니다.");
        }

        List<Lotto> result = new ArrayList<>();
        for (int i = 0; i < money.divide(BASE_AMOUNT); i++) {
            result.add(new Lotto(generateRandomNumbers()));
        }
        return result;
    }

    private boolean isInvalidBaseUnit(Money fee) {
        return !fee.change(BASE_AMOUNT).equals(Money.zero());
    }

    private List<Integer> generateRandomNumbers() {
        int min = LottoSettings.MIN.value();
        int max = LottoSettings.MAX.value();
        int size = LottoSettings.SIZE.value();
        return UniqueRandomNumberProvider.provideInRange(min, max, size);
    }
}
