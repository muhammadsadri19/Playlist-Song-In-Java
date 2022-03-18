package SampleDua_DlinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Lagu> listLagu = new LinkedList<>();

        listLagu.add(new Lagu("Yank", "WaliBand"));
        listLagu.add(new Lagu("Harok Denai Dirantau", "Ipank"));
        listLagu.add(new Lagu("Burung Kutilang", "Tidak Dikenal"));
        listLagu.addFirst(new Lagu("Shalawat", "Sadri"));
        listLagu.addLast(new Lagu("Indonesia Raya", "WR Soepratman"));

        ListIterator<Lagu> iterator = listLagu.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



        System.out.println("============ Program Cetak Mundur List Lagu ============");

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }


        System.out.println("============Ini Program remove data ke - 2==============");

        listLagu.remove(1);
        for (Lagu item:listLagu) {
            System.out.println(item);
        }



        listLagu.removeIf(ob -> ob.getNamalagu().equals("Burung Kutilang"));
        System.out.println("============ Ini Program yang menghapus sesuai keinginan User ===============");
        for (Lagu item:listLagu) {
            System.out.println(item);
        }
    }
}
