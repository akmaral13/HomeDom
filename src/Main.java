import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            arrayList.add(50);
            System.out.println(arrayList.get(i));

        }

        ArrayList<Integer>arr1=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arr1.add(i);
            if (i%2==0){
                System.out.println(arr1.get(i));
            }

        }
        ArrayList<Integer>arr2=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arr2.add(i);
            if (i%2==1){
                System.out.println(arr2.get(i));
            }

        }


    }
}