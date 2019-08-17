import java.math.BigInteger;
import java.util.List;

public class Calculator {

    private String enteredLine = "";
    private int approach = 1;

    public Calculator(String enteredLine, int approach) {
        this.enteredLine = enteredLine;
        this.approach = approach;
    }


    public String multiplication() {
        List[] enteredArgs = new LineParserToArgs().pars(enteredLine);
        Multipleable attempt;
        StringBuilder result = new StringBuilder("");


        attempt = new AlterMultiplicaton();
        String alterMult = attempt.estimation(enteredArgs[0], enteredArgs[1]);
        result.append(" AlterMultiplicaton   result = ");
        StringBuilder val = new StringBuilder(alterMult).reverse();
        result.append(val);


        attempt = new BigIntMultiplication();
        String bigIntMult = attempt.estimation(enteredArgs[0], enteredArgs[1]);
        result.append(" \n BigIntMultiplication result = ");
        result.append(bigIntMult);


        BigInteger bon = new BigInteger(bigIntMult);
        BigInteger btw = new BigInteger(val.toString());

        BigInteger diff = bon.subtract(btw);

        result.append(" \n Checking difference between nums, should be equals ZERO  = " + diff.toString());

        return result.toString();


    }

}

