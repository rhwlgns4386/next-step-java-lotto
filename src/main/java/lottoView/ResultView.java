package lottoView;

import lottoModel.Lotto;
import lottoController.LottoDomain;
import lottoModel.LottoResult;

import java.util.List;

public class ResultView {

    public static void resultCount(int manualCount, int autoCount) {
        System.out.print("수동으로 " + manualCount + "장, ");
        System.out.println("자동으로 " + autoCount + "개를 구매했습니다.");
    }

    public static void printLottoNumber(List<Lotto> lottos) {
        for (Lotto lotto : lottos) {
            System.out.println(LottoDomain.sortLottoNumber(lotto.getNumbers()).toString());
        }
    }

    public static void printLottoResult(LottoResult lottoResult) {

        String rateOfReturnMessage = "입니다.(기준이 0이기 때문에 결과적으로 손해라는 의미임)";
        if (lottoResult.getRateOfReturn() == 0) {
            rateOfReturnMessage = "입니다.(기준이 0이기 때문에 결과적으로 본전임)";
        }
        if (lottoResult.getRateOfReturn() > 0) {
            rateOfReturnMessage = "입니다.(기준이 0이기 때문에 결과적으로 수익이라는 의미임)";
        }
        String result = "당첨 통계" + "\n" +
                "---------" + "\n" +
                "3개 일치 (5_000원)- " + lottoResult.getFifthCount() + "\n" +
                "4개 일치 (50_000원)- " + lottoResult.getFourthCount() + "\n" +
                "5개 일치 (1_500_000원)- " + lottoResult.getThirdCount() + "\n" +
                "5개 일치, 보너스 볼 일치(30_000_000원)- " + lottoResult.getSecondCount() + "\n" +
                "6개 일치 (2_000_000_000)- " + lottoResult.getFirstCount() + "\n" +
                "총 수익률은 " + lottoResult.getRateOfReturn() +
                rateOfReturnMessage;

        System.out.println(result);

    }

}
