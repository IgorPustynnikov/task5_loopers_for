public class Main {
    public static void main(String[] args) {

        // 1 zadanie
//        for (int j = 0; j < 8; j++) {
//            for (int i = 0; i < j; i++) {
//                System.out.print(" ");
//            }
//            System.out.println("*");
//        }
        // 2 zadanie
//        for (int i = 0; i < 8; i++) {
//            for (int j = 8; j>i; j--) {
//                System.out.print(" ");
//            }
//            System.out.println("*");


        //      3 zadanie
//        for (int i = 0; i<8; i++){
//        for (int j = 8; j > i; j--) {
//            System.out.print("*");}
//        System.out.println();}


        //4 zasanie
//        for (int i = 0; i<8; i++){
//        for (int j = 0; j < i; j++) {
//            System.out.print("*");}
//        System.out.println("*");}

// 0 2 4 6 8 10 12 14
        //5 zadanie
//        for (int i = 1; i < 10; i+=2) {
//            for (int j = 10; j >i ; j--) {
//                System.out.print(" ");
//                            }
//            for (int k = 0; k < i*2; k++) {
//                System.out.print("*");
//                            }
//            System.out.println();
//        }
        //6 zadanie
        for (int i = 1; i < 10; i+=2) {
            for (int j = 10; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < 10; i+=2) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 20; k>i * 2; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}