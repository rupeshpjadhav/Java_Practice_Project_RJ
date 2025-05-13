package javaPracticePrograms;

public class StarDesignPattern {

    public static void main(String[] args) {

        int x =4;

        for (int i=1; i<=x;i++) { //Ascending

            String star = new String(new char[i]).replace('\0','*');
            System.out.println(star);
        }

        for (int i=x; i>0;i--) { //descending

            String star = new String(new char[i]).replace('\0','*');
            System.out.println(star);
        }


    }
}
