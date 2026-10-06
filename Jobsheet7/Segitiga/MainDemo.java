package Jobsheet7.Segitiga;

public class MainDemo {
    public static void main(String[] args) {
        Triagle sg = new Triagle();

        System.out.println("Total Sudut (1 Sudut Diketahui) : " + sg.totalSudut(60));
        System.out.println("Total Sudut (2 Sudut Diketahui) : " + sg.totalSudut(60, 40));
        System.out.println("Keliling (3 Sisi)               : " + sg.keliling(3, 4, 5));
        System.out.println("Keliling (2 Sisi - Pythagoras)  : " + sg.keliling(3, 4));
    }
}
