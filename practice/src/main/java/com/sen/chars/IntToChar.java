package com.sen.chars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntToChar {

    private static Map<Integer, String[]> intToLetters = new HashMap<Integer, String[]>();

    static {
        intToLetters.put(2, new String[]{"a", "b", "c"});
        intToLetters.put(3, new String[]{"d", "e", "f"});
        intToLetters.put(4, new String[]{"g", "h", "i"});
        intToLetters.put(5, new String[]{"j", "k", "l"});
        intToLetters.put(6, new String[]{"m", "n", "o"});
        intToLetters.put(7, new String[]{"p", "q", "r", "s"});
        intToLetters.put(8, new String[]{"t", "u", "v"});
        intToLetters.put(9, new String[]{"w", "x", "y", "z"});
    }

    private static List<StringBuilder> getAllCombinations(String[][] arrs) {
        return getAllCombinations(arrs, 0);
    }

    private static List<StringBuilder> getAllCombinations(String[][] arrs, int level) {
        List<StringBuilder> result = new ArrayList<StringBuilder>();
        String[] arr = arrs[level];
        if(level == arrs.length - 1) {
            for (int i = 0; i < arr.length; i++) {
                result.add(new StringBuilder(arr[i]));
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                List<StringBuilder> tail = getAllCombinations(arrs, level + 1);
                for (int j = 0; j < tail.size(); j++) {
                    result.add(new StringBuilder(arr[i]).append(tail.get(j)));
                }
            }
        }
        return result;
    }

    private static String[][] generateArrays(int[] input) {
        List<String[]> tmpResult = new ArrayList<String[]>();
        for (int i = 0; i < input.length; i++) {
            int tenNum = input[i] / 10;
            int singleNum = input[i] % 10;
            List<String[]> oneParam = new ArrayList<String[]>();
            if(null != intToLetters.get(tenNum)) {
                oneParam.add(intToLetters.get(tenNum));
            }
            if(null != intToLetters.get(singleNum)) {
                oneParam.add(intToLetters.get(singleNum));
            }
            if(oneParam.isEmpty()) {
                continue;
            }
            String[][] one = oneParam.toArray(new String[oneParam.size()][]);
            List<StringBuilder> oneParamStrb = getAllCombinations(one);
            String[] param = new String[oneParamStrb.size()];
            for (int j = 0; j < oneParamStrb.size(); j++) {
                param[j] = oneParamStrb.get(j).toString();
            }
            tmpResult.add(param);
        }
        String[][] result = tmpResult.toArray(new String[tmpResult.size()][]);
        return result;
    }

    private static String print(List<StringBuilder> list) {
        return list.toString().substring(1, list.toString().length() - 1).replaceAll(",", "");
    }

    public static String stage1method(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if(input[i] < 0 || input[i] > 9) {
                return null;
            }
        }
        String[][] args = generateArrays(input);
        if(args.length == 0) {
            return null;
        }
        return print(getAllCombinations(args));
    }

    public static String stage2method(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if(input[i] < 0 || input[i] > 99) {
                return null;
            }
        }
        String[][] args = generateArrays(input);
        if(args.length == 0) {
            return null;
        }
        return print(getAllCombinations(args));
    }
}
