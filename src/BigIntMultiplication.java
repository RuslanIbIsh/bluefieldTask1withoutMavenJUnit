import java.math.BigInteger;
import java.util.Collections;
import java.util.List;

public class BigIntMultiplication implements Multipleable {
    @Override
    public String estimation(List<Integer> multiplicand, List<Integer> multiplier) {

        Collections.reverse(multiplicand);
        Collections.reverse(multiplier);


        String cand = listToString(multiplicand);


        String lier = listToString(multiplier);


        BigInteger mulCand = new BigInteger(cand);

        BigInteger mulLier = new BigInteger(lier);

        BigInteger result = mulCand.multiply(mulLier);


        return result.toString();
    }


    private String listToString(List<Integer> list) {
        StringBuilder sb = new StringBuilder();

        for (Integer i : list) {
            sb.append(i);


        }

        return sb.toString();


    }
}

