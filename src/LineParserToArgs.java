import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LineParserToArgs {


    private List<Integer> arrayListMultiplicand = new ArrayList<>();
    private List<Integer> arrayListMultiplier = new ArrayList<>();
    private List[] args = new List[2];
    private String sign = "";


    public List[] pars(String enteredLine) {
        char[] allChars = enteredLine.toCharArray();

        List<Integer> listFiller = arrayListMultiplicand;

        for (Character c : allChars) {

            if (c.equals('*')) {
                listFiller = arrayListMultiplier;
            } else {

                listFiller.add(charChecker(c));
            }


        }


        Collections.reverse(arrayListMultiplicand);
        Collections.reverse(arrayListMultiplier);


        args[0] = arrayListMultiplicand;
        args[1] = arrayListMultiplier;

        return args;

    }

    private int charChecker(Character character) {
        if (character.equals('-')) {
            sign = "-";
        }

        return Character.getNumericValue(character);


    }


}

