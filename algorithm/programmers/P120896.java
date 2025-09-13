//package algorithm.programmers;
//
//import java.util.*;
//
//public class P120896 {
//
//
//    public String solution(String alpabet) {
//
//        if (Objects.equals(alpabet, "") || alpabet == null) {
//            return "";
//        }
//
//        HashMap<String, Integer> answerMap = new HashMap<>();
//
//        for (char ch : alpabet.toCharArray()) {
//            var key = String.valueOf(ch);
//            answerMap.putIfAbsent(key, 0);
//
//            Integer count = answerMap.get(key);
//            if (count != 0) {
//                answerMap.put(key, count + 1);
//            }
//
//            answerMap.put(key, count + 1);
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for (String key : answerMap.keySet()) {
//            int count = answerMap.get(key);
//            if (count == 1) {
//                sb.append(key);
//            }
//        }
//
//        char[] chars = sb.toString().toCharArray();
//        Arrays.sort(chars);
//
//        return new String(chars);
//    }
//
//    public static void main(String[] args) {
//
//
//        P120896 answer = new P120896();
//
//        System.out.println(answer.solution("hello"));
//        System.out.println(answer.solution("aabb"));
//
//    }
//
//
//}
