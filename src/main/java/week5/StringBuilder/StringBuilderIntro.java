package week5.StringBuilder;

import week5.time_counter.Action;
import week5.time_counter.TimeCounter;

/**
 * Created by DeBasser on 25.06.2016.
 */
public class StringBuilderIntro {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.length();
        StringBuffer sbf = new StringBuffer();


        TimeCounter sbCount = new TimeCounter();
        TimeCounter sbfCount = new TimeCounter();
        long sbTime = sbCount.counter(new Action() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {
                    sb.append(i);
                }
            }
        });
        long sbfTime = sbCount.counter(new Action() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {
                    sbf.append(i);
                }
            }
        });

        System.out.printf("SB time - %d\n SBF time - %d\n", sbTime, sbfTime);
    }
}
