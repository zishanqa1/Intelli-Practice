public class School {
    String schoolName;
    String schoolAddress;
    String schoolPrincipal;
    int schoolPhone;
    int schoolRank;

    public void schoolDetails(){

        System.out.println("The "+schoolName+" located at :"+schoolAddress);
        System.out.println("Ranked :"+schoolRank);
        System.out.println("Managed by :"+schoolPrincipal);
        System.out.println("You can contact on - "+schoolPhone+" For More Info");

    }
}
