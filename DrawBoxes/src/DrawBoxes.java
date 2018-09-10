public class DrawBoxes {
    public static void main(String[] args) {

        System.out.println("Draw Boxes");
        drawbox();
        drawbox();
        drawbox();
        System.out.println("complete");


    } public static void drawbox(){
        System.out.println();
        drawtopbottom();
        drawSides();
        drawSides();
        drawtopbottom();

    } public static void drawtopbottom(){
        System.out.println("+------+");
    }public static void drawSides(){
        System.out.println("|      |");
    }
}
