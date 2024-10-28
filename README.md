# 로또

## 진행 방법

* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정

* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 1단계 - 문자열 계산기

-[x] 계산이 완료 되었을 시 계산된 숫자를 반환한다.
-[x] 숫자가 아닌 값 예외를 발생한다.(사칙연산 제외)
-[x] 사칙연산중 더하기를 만날경우 앞뒤 숫자를 더한다.
-[x] 사칙연산중 빼기를 만날경우 앞뒤 숫자를 뺍니다.
-[x] 사칙연산중 곱하기를 만날경우 앞뒤 숫자를 곱합니다.
-[x] 사칙연산중 나누기를 만날경우 앞뒤 숫자를 나눕니다.(소숫점은 무시합니다.)
-[x] 빈값 입력시 예외를 발생한다.
-[x] 입력 값이 null인경우 예외를 발생한다.
-[x] 빈 공백으로 문자를 분리한다.
-[x] 사칙연산은 순서대로 진행 한다.
-[x] 사칙연산에 포함되지 않는 문자가 입력시 예외를 발생한다.(숫자 제외)
-[x] 사칙연산 패턴에 맞지 않는 경우 예외를 발생한다.(ex : 4 4 + , 4 + +)

## 2단계 - 로또(자동)

### 일반적 기능

-[x] 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
-[x] 로또 1장의 가격은 1000원이다.
-[x] 입력한 당첨 번호를 ,을 기준으로 분리한다.
-[x] 입력한 당첨번호를 숫자로 변경한다.
-[x] 로또 번호를 생성한다.
-[x] 로또의 당첨결과를 반환한다.
- [x] 보너스볼 결과를 반환한다.

### ui 기능

-[x] 금액을 입력 받는다.
-[x] 당첨 번호를 입력 받는다.
-[x] 수익률은 소숫점 2자리만 출력한다.
-[x] 당첨 룰에 따라 몇개가 당첨됐는지 출력 및 수익률을 출력한다.
-[x] 개수 및 구매한 로또 번호들을 출력한다.
-[x] 로또 번호는 숫자 오름차순으로 출력한다.
- [ ] 보너스볼을 입력 받는다.

### 예외 케이스

-[x] 1000원 단위로 입력하지 않으면 IllegalArgumentException가 발생한다.
-[x] 로또 숫자가 중복인 경우 IllegalArgumentException를 발생한다.
-[x] 당첨번호에 숫자가 아닌 값을 입력하는 경우
-[x] 당첨번호가 6자리가 아닌경우 IllegalArgumentException를 발생한다.
-[x] 금액에 음수로 입력하는 경우 IllegalArgumentException를 발생한다.
-[x] 당첨번호에 1~45사이의 숫자가 아닌 숫자를 넣는 경우 IllegalArgumentException를 발생한다.
- [ ] 보너스볼 번호는 당첨번호에 포함되면 IllegalArgumentException를 발생한다.
- [ ] 보너스볼 번호는 1~45사이 외의 숫자를 포함되면 IllegalArgumentException를 발생한다.
