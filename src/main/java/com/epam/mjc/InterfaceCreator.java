package com.epam.mjc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class InterfaceCreator {

    List<Integer> evenNumbers = new ArrayList<>();
    List<String> result = new ArrayList<>();
    Map<String, Integer> map = new HashMap<>();

    public Predicate<List<String>> isValuesStartWithUpperCase() {
        try {
            throw new UnsupportedOperationException("You should implement this method.");
        } catch (Exception e) {
            System.out.println("null");
        }
        return x -> {
            boolean result = true;
            for (String s : x) {
                if (s.length() == 0 || !Character.isUpperCase(s.charAt(0))) {
                    result = false;
                    break;
                }
            }
            return result;
        };
    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        try {
            throw new UnsupportedOperationException("You should implement this method.");
        } catch (Exception e) {
            System.out.println("null");
        }

        return x -> {
            for (Integer n : x) {
                if (n % 2 == 0) {
                    evenNumbers.add(n);
                    x.remove(n);
                }
            }
            x.addAll(evenNumbers);
        };
    }

    public Supplier<List<String>> filterCollection(List<String> values) {
        try {
            throw new UnsupportedOperationException("You should implement this method.");
        } catch (Exception e) {
            System.out.println("null");
        }
        return () -> {
            for (String s : values) {
                if (s.startsWith(s.substring(0, 1).toUpperCase()) && s.endsWith(".") && s.split(" ").length > 3) {
                    result.add(s);
                }
            }
            return result;
        };
    }


    public Function<List<String>, Map<String, Integer>> stringSize() {
        try {
            throw new UnsupportedOperationException("You should implement this method.");
        } catch (Exception e) {
            System.out.println("null");
          }
        return x -> {
            for (String s : x) {
                map.put(s, s.length());
            }
            return map;
        };
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        try {
            throw new UnsupportedOperationException("You should implement this method.");
        } catch (Exception e) {
            System.out.println("null");
        }
        return (list1, list2) -> {
            ArrayList<Integer> newList = new ArrayList<>();
            newList.addAll(list1);
            newList.addAll(list2);
            return newList;
        };
    }
}
