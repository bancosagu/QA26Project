package calculator;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {


        // Scrieti o metoda Java, care sa primeasca parametru o Lista,
        // si sa afiseze, pe rand, toate valorile din lista,
        // fiecare pe rand nou.
    }

    public List<Integer> listOne(int number) {

        List<Integer> listOne = new ArrayList<>();
        for (int i = 0; i <= number; i++) {
            listOne.add(i);

        }
            return listOne;
    }

    public void printListOne(List<Integer> list, int number){
        for(int i = number; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    }
