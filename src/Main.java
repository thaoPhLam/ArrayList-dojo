public class Main {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        System.out.println(myList);

        myList.addItem("Thao");
        myList.addItem("Mentor1");
        myList.addItem("Mentor2");
        myList.addItem("Mentor3");
        myList.addItem("Mentor4");
        myList.addItem("Mentor5");
        myList.addItem("Mentor6");
        myList.addItem("Mentor7");
        myList.addItem("Mentor8");
        myList.addItem("Mentor9");
        System.out.println(myList);

        System.out.println("Get the 4th item: " + myList.getItem(3));

        myList.removeItem(4);
        System.out.println(myList);

        myList.removeItem(3);
        System.out.println(myList);

        System.out.println("Get the 5th item: " + myList.getItem(4));


        myList.addItem("Mentor10");
        System.out.println(myList);
        /* */

    }
}
