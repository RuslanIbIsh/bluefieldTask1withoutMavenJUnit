import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlterMultiplicaton implements Multipleable {

    private StringBuilder stringBuilder = new StringBuilder();


    @Override
    public String estimation(List<Integer> multiplicand, List<Integer> multiplier) {

        List<Integer> first = multiplicand;
        List<Integer> second = multiplier;


        StringBuilder stringBuilder = new StringBuilder();

        long firsRight = 0;

        long inMemory = 0;

        long fromMem = 0;

        ArrayList<Long> numbersInMemory = new ArrayList<>();

        ArrayList<Long> secondPrevious = new ArrayList<>();


        for (int i = 0; i < second.size(); i++) {


            int a = second.get(i);


            for (int j = 0; j < first.size(); j++) {

                int b = first.get(j);


                int m = b * a;


                try {


                    fromMem = secondPrevious.get(j);
                } catch (IndexOutOfBoundsException e) {

                }


                firsRight = firsRight + digits(m)[0] + inMemory + fromMem;

                inMemory -= inMemory;


                long mac = digits(firsRight)[1];


                firsRight = digits(firsRight)[0];


                inMemory = inMemory + digits(m)[1] + mac;


                if (i == (second.size() - 1)) {

                    stringBuilder.append(firsRight);

                    if (j == (first.size() - 1)) {
                        if (inMemory != 0) {
                            stringBuilder.append(inMemory);
                        }
                    }

                } else {


                    if (j == 0) {
                        stringBuilder.append(firsRight);
                    } else {
                        numbersInMemory.add(firsRight);
                    }

                }


                if (j == (first.size() - 1)) {

                    numbersInMemory.add(inMemory);
                    inMemory -= inMemory;
                }

                //  System.out.println("inMemory " + inMemory);


                firsRight = 0;


            }
            secondPrevious.clear();
            secondPrevious.addAll(numbersInMemory);


            numbersInMemory.clear();


        }


        return stringBuilder.toString();
    }


    private static long[] digits(long i) {

        long[] diarr = new long[2];

        diarr[0] = i % 10;

        diarr[1] = i / 10;


        return diarr;

    }


}

