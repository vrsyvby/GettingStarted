package garden.vegetables;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

interface Changeable {
    int giveChange(Integer chg);

    default int giveChange(short chg) {  // Line 1
        return (int) (100 - chg);
    }

    static int giveChange(long chg) {   // Line 2
        return 99;
    }
}
public class Test {
    public static void main(String[] args) {

        Changeable ch= (chg)-> {
            return chg-6;
        };



        String pattern="[0-2]{0,}[0-5]{1}[0-5]{1}\\.[0-2]{0,}[0-5]{1}[0-5]{1}\\.[0-2]{0,}[0-5]{1}[0-5]{1}\\.[0-2]{0,}[0-5]{1}[0-5]{1}";
        String ip="23.45.12.56";
        System.out.println(ip.matches(pattern));
         pattern="[0]{0,}[0-9][0-9]{2}|[1]{0,}[0-9][0-9]|[2]{0,}[0-5][0-5]\\.[0]{0,}[0-9][0-9]|[1]{0,}[0-9][0-9]|[2]{0,}[0-5][0-5]\\.[0]{0,}[0-9][0-9]|[1]{0,}[0-9][0-9]|[2]{0,}[0-5][0-5]";
         ip="23.45.12";
        System.out.println(ip.matches(pattern));


        String pattern1="[0]{0,}[0-9]{0,}[0-9]{1}|[1]{0,}[0-9]{0,}[0-9]{1}|[2]{0,}[0-5]{0,}[0-5]{1}";
        String pattern2="\\.";
        pattern=pattern1+pattern2;
        ip="1.";
        System.out.println(ip.matches(pattern));
        ip="1.";
        System.out.println(ip.matches(pattern));
        ip="1.";
        System.out.println(ip.matches(pattern));
        ip="1";
        System.out.println(ip.matches(pattern));

        pattern=pattern1+pattern2+pattern1;

        ip="1.1";
        System.out.println(ip.matches(pattern));

        pattern1="\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5]";
        ip="255";
        System.out.println(ip.matches(pattern1));

//        String regularExpression = "^[a-zA-Z]{1,}[a-zA-z0-9\\_]{7,29}$";
//        "^[a-zA-Z]{1,}[a-zA-z0-9\\_]{7,29}$"
//        "^[a-zA-Z][a-zA-Z0-9_]{7,29}$"
//        "^[A-Za-z_][A-Za-z0-9_]{7,29}$"
//        ip="Samantha";
//        System.out.println(ip.matches(regularExpression));
//
//        regularExpression = "[a-zA-z]";
//        ip="_";
//        System.out.println(ip.matches(regularExpression));
//        int i=0,j=0;
//        List<List<Integer>> arr = new ArrayList<>();
//        arr.get(i).get(j);

        /*int ip="1";
        System.out.println(ip.matches(pattern)); i = 0;
        int j = 5;
        int k = 10;

        int loopIterations = 0;

        while ((i++ < j) || (j < --k)) {

            loopIterations++;
        }
        System.out.println(loopIterations);*/
        /*java.util.Calendar cal= Calendar.getInstance();
        cal.set(Calendar.MONTH,  10);
        cal.set(Calendar.DATE,  5);
        cal.set(Calendar.YEAR,  2015);
        System.out.println(cal.toString());
        int dayOftheWeek=cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(dayOftheWeek);*/
       /* if(dayOftheWeek==1)return "SUNDAY";
        if(dayOftheWeek==2)return "MONDAY";
        if(dayOftheWeek==3)return "TUESDAY";
        if(dayOftheWeek==4)return "WEDNESDAY";
        if(dayOftheWeek==5)return "THURSDAY";
        if(dayOftheWeek==6)return "FRIDAY";
        if(dayOftheWeek==7)return "SATURDAY";
        return "NSSA";*/
    }
}
