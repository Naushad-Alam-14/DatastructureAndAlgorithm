import java.util.Arrays;
import java.util.Scanner;

public class MinimumPlatform {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] a = takeInput(n, scanner);
        String[] d = takeInput(n, scanner);
        int[] arrival = removeColon(a);
        int[] departure = removeColon(d);
        System.out.println(minimumPlatform(arrival,departure));
    }

    public static String[] takeInput(int n, Scanner scanner){
        String[] input =  new String[n];
        for(int i =0; i< n; i++){
            input[i] = scanner.nextLine();
        }
        return input;
    }

    public static int minimumPlatform(int[] a, int[] d){
        Arrays.sort(a);
        Arrays.sort(d);
        int i = 0;
        int j = 0;
        int count = 0;
        int max = 0;
        while(i < a.length){
            if( a[i] < d[j]){
                count++;
                max = Math.max(count, max);
                i++;
            }else {
                count --;
                j++;
            }
        }
        return max;
    }

    public static int[] removeColon(String[] arr){
        int[] result = new int[arr.length];
        for(int i=0; i< arr.length; i++){
            result[i] = Integer.parseInt(replaceColon(arr[i]).trim());
        }
        return result;
    }

    public static String replaceColon(String s){
        StringBuilder output = new StringBuilder();
        for(int i =0; i< s.length(); i++){
            if(s.charAt(i) == ':')
                continue;
            output.append(s.charAt(i));
        }
        return output.toString();
    }

}
