package garden.vegetables;

import java.io.IOException;

public class Substringcounter {

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        // store count of special
        // Palindromic substring
        int result = 0;

        // it will store the count
        // of continues same char
        int[] sameChar = new int[n];
        for(int v = 0; v < n; v++)
            sameChar[v] = 0;

        int i = 0;

        // traverse string character
        // from left to right
        while (i < n)
        {

            // store same character count
            int sameCharCount = 1;

            int j = i + 1;

            // count smiler character
            while (j < n &&
                    s.charAt(i) == s.charAt(j))
            {
                sameCharCount++;
                j++;
            }

            // Case : 1
            // so total number of
            // substring that we can
            // generate are : K *( K + 1 ) / 2
            // here K is sameCharCount
            result += (sameCharCount *
                    (sameCharCount + 1) / 2);

            // store current same char
            // count in sameChar[] array
            sameChar[i] = sameCharCount;

            // increment i
            i = j;
        }

        // Case 2: Count all odd length
        //           Special Palindromic
        //           substring
        for (int j = 1; j < n; j++)
        {
            // if current character is
            // equal to previous one
            // then we assign Previous
            // same character count to
            // current one
            if (s.charAt(j) == s.charAt(j - 1))
                sameChar[j] = sameChar[j - 1];

            // case 2: odd length
            if (j > 0 && j < (n - 1) &&
                    (s.charAt(j - 1) == s.charAt(j + 1) &&
                            s.charAt(j) != s.charAt(j - 1)))
                result += Math.min(sameChar[j - 1],
                        sameChar[j + 1]);
        }

        // subtract all single
        // length substring
        return result - n;



    }

    /*private static final Scanner scanner = new Scanner(System.in);*/

    public static void main(String[] args) throws IOException {
        /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));*/

        //int n = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = "abcbaba";//scanner.nextLine();
        int n = s.length();

        long result = substrCount(n, s);
        System.out.println(result);

       /* bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();*/
    }
}
