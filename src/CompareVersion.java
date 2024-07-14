//import java.util.* ;
//import java.io.*;
//import java.math.BigInteger;
//
//public class CompareVersion
//{
//    public static void main(String[] args) {
//        System.out.println(compareVersions("1045716.72393303808358477234.48708099501538130.729",
//                "1045716.72392323808338477234.48508099501537130.724"));
//    }
//    public static int compareVersions(String a, String b)
//    {
//        // Write your code here
//        String[] ar = a.split("\\.");
//        String[] br = b.split("\\.");
//        int i = 0;
//        while(i< ar.length && i < br.length){
//            if(ar[i].equals(br[i])){
//                i++;
//                continue;
//            }
//            BigInteger an = new BigInteger(ar[i]);
//            BigInteger bn = new BigInteger(br[i]);
//
//            if(an.compareTo(bn) )
//                return 1;
//            else if (an < bn)
//                return -1;
//            i++;
//        }
//
//        if(i != ar.length && checkNonZero(ar, i)){
//            return 1;
//        } else if( i != br.length && checkNonZero(br, i)){
//            return -1;
//        }
//        return 0;
//    }
//
//    public static boolean checkNonZero(String[] a, int i){
//        while(i < a.length){
//            if(!a[i].equals("0"))
//                return true;
//            i++;
//        }
//        return false;
//    }
//
//    public static int compareVersionsByCharacter(String a, String b)
//    {
//        // Write your code here
//        String[] ar = a.split("\\.");
//        String[] br = b.split("\\.");
//        int i = 0;
//        while(i< ar.length && i < br.length){
//            if(ar[i].equals(br[i])){
//                i++;
//                continue;
//            }
//            int j=0, k=0;
//            for(; j< ar[i].length() && k < br[i].length(); j++,k++){
//                if(ar[i].charAt(j) < br[i].charAt(k)){
//                    return -1;
//                }else if(ar[i].charAt(j) > br[i].charAt(k)){
//                    return 1;
//                }
//            }
//            if(j != ar[i].length()){
//                return 1;
//            }else if(k != br[i].length()){
//                return -1;
//            }
//            i++;
//        }
//
//        if(i != ar.length && checkNonZero(ar, i)){
//            return 1;
//        } else if( i != br.length && checkNonZero(br, i)){
//            return -1;
//        }
//        return 0;
//    }
//}