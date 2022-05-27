package modul10;

public class StringMethod {
    public static void main(String args[]){
        int indeks;
        String st = new String("ini untuk mencoba Metode string!");
        int pj = st.length();
        char c = st.charAt(5);
        boolean b1 = st.startsWith("ini");
        boolean b2 = st.startsWith("st",4);
        boolean b3 = st.endsWith("string.");
        boolean b4 = st.endsWith("g!");
        System.out.println(st);
        System.out.println(pj);
        System.out.println(c);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        System.out.print("Karakter 'n' berada pada indeks : ");
        indeks = st.indexOf('n');
        while (indeks>=0){
            System.out.print(indeks + " ");
            indeks = st.indexOf('n',indeks+1);
        }
        System.out.println();

        System.out.print("Teks \"in\" berada pada indeks : ");
        indeks = st.indexOf("in");
        while (indeks>=0){
            System.out.print(indeks + " ");
            indeks = st.indexOf("in",indeks+1);
        }
        System.out.println();

        System.out.print("Karakter 'n' berada pada indeks : ");
        indeks = st.lastIndexOf('n');
        while (indeks>=0){
            System.out.print(indeks + " ");
            indeks = st.lastIndexOf('n',indeks-1);
        }
        System.out.println();

        System.out.print("Teks \"in\" berada pada indeks : ");
        indeks = st.lastIndexOf("in");
        while (indeks>=0){
            System.out.print(indeks + " ");
            indeks = st.lastIndexOf("in",indeks-1);
        }
        System.out.println();

        System.out.println(st.substring(6));
        System.out.println(st.substring(6,17));

        String st2 = new String("ini untuk mencoba Metode string!");
        System.out.println("st == st2 : " + st==st2);
        System.out.println("st.equals(st2) : " + st.equals(st2));
        System.out.println("st.equalsIgnoreCase(st2.toUpperCase()) : " + st.equalsIgnoreCase(st2.toUpperCase()));

        System.out.println("st.compareTo(st2) : " + st.compareTo(st2));
        System.out.println("st.compareTo(st2.toLowerCase()) : " + st.compareTo(st2.toLowerCase()));
        System.out.println("st.compareTo(st2.toUpperCase()) : " + st.compareTo(st2.toUpperCase()));
    }
}
