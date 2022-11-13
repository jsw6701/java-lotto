package lotto;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto {

    static final int LOTTO_LENGTH = 6;
    static final int MIN_RANGE = 1;
    static final int MAX_RANGE = 45;
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != LOTTO_LENGTH) {
            throw new IllegalArgumentException("[ERROR] 로또 숫자의 개수는 " +  LOTTO_LENGTH + "개 입니다.");
        }
    }

    // TODO: 추가 기능 구현
    private static Lotto createLottoNumbers(){
        return new Lotto(Randoms.pickUniqueNumbersInRange(MIN_RANGE, MAX_RANGE, LOTTO_LENGTH));
    }

    private void validateNoDuplicate(List<Integer> numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        if (uniqueNumbers.size() != numbers.size()) {
            throw new IllegalArgumentException("[ERROR] 로또 번호에 중복이 있습니다");
        }
    }

}
