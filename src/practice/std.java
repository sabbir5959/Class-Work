package practice;

public class std {

    int sabbir, kawsar, diner, shoyeb;

    public std(int sabbir, int kawsar, int diner, int shoyeb) {
        this.sabbir = sabbir;
        this.kawsar = kawsar;
        this.diner = diner;
        this.shoyeb = shoyeb;
    }

    void print()
    {
        System.out.println("Sabbir: "+sabbir);
        System.out.println("Kawsar: "+kawsar);
        System.out.println("Diner: "+diner);
        System.out.println("Shoyeb: "+shoyeb);
    }

}

class main
{
    public static void main(String[] args) {
        std s = new std(1, 2, 3, 4);
        s.print();
    }
}
