package ru.schepin.examples.findStringInanothrString;

public class Main {
    public static void main(String[] args) {
        String s = "������ ����!";
        String findingString = "��";
        int counter = 0;
        int start = 0;

        outer:
        for (int i = 0; i < findingString.length(); i++) {

            for (int j = start; j < s.length(); j++) {
                if (findingString.charAt(i) == s.charAt(j)) {
                    counter++;
                    start = j + 1;
                    break;
                }
             
            }
            if (counter - 1 != i) {
                break ;
            }

        }
        if (counter == findingString.length()) {
            System.out.println("������: " + findingString + " �������");
        }
    }
}
