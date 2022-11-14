package lotto;

public class LottoNumber {
    static final int MIN_RANGE = 1;
    static final int MAX_RANGE = 45;

    private final int number;


    public LottoNumber(int number) {
        validateNumber(number);
        this.number = number;
    }

    private void validateNumber(int num){
        if(num < MIN_RANGE || num > MAX_RANGE){
            throw new IllegalArgumentException("[ERROR] 숫자의 범위가 1 ~ 45 사이의 값을 입력하세요.");
        }
    }
}


