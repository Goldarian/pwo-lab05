package pwo.seq;

import java.math.BigDecimal;

public class LucasGenerator extends FibonacciGenerator {

    public LucasGenerator() {
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    @Override
    public BigDecimal nextTerm() {
        if (lastIndex == 0) {
            lastIndex++;
            return new BigDecimal(2);
        }
        return super.nextTerm();
    }

    @Override
    public BigDecimal previousTerm() {
        if (lastIndex == 1) {
            current = new BigDecimal(2);
        } else {
            BigDecimal temp = f_1.subtract(f_2);
            f_2 = f_1;
            f_1 = temp;
            current = temp;
        }

        lastIndex--;
        return current;
    }
}
