package edu.neu.mgen;
import java.util.ArrayList;

public class lab1part2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Aaa");
        names.add("Bbb");
        names.add("Ccc");
        names.add("Ddd");
        names.add("Eee");

        ArrayList<String> switchedNames = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);

            char firstChar = name.charAt(0);
            char lastChar = name.charAt(name.length() - 1);

            String middlePart = name.length() > 2 ? name.substring(1, name.length() - 1) : "";
            String newName = lastChar + middlePart + firstChar;
            String formattedName = Character.toUpperCase(newName.charAt(0)) + newName.substring(1).toLowerCase();
            switchedNames.add(formattedName);
        }

        System.out.println("Names = " + names);
        System.out.println("Names (switched) = " + switchedNames);
    }
}


