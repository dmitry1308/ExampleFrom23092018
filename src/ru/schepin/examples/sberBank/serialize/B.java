package ru.schepin.examples.sberBank.serialize;

import java.io.*;
import java.util.LinkedList;
import java.util.TreeSet;

public class B implements Serializable {
    public static void main(String[] args) throws IOException {
        A a = new A();
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.ser"));

            os.writeObject(a);
            os.close();
            System.out.print(a.b + " ");


            ObjectInputStream in = new ObjectInputStream(new FileInputStream("test.ser"));
            A a1 = (A) in.readObject();
            System.out.println(a1.a + " " + a1.b);

        } catch (Exception e) {
            e.printStackTrace();
        }

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.add(list.size(), 5000);

        TreeSet<Object> objects = new TreeSet<>();

        try {
            throw new IOException();
        } catch (IOException e) {
            throw new IOException();
        } catch (Exception e1) {
            System.out.println(" catch ");
        } finally {
            System.out.println(" finally ");
        }


    }
}
