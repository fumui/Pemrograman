package modul10;

public class StringBufferMethod {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Mencoba metode StringBuffer");

        System.out.println("Nilai sb : \""+sb+"\"");
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.setLength(28);
        System.out.println("Nilai sb : \""+sb+"\"");
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        System.out.println("Karakter ke-6 : "+sb.charAt(6));
        sb.setCharAt(14,'-');
        System.out.println("Nilai sb : \""+sb+"\"");

        String st = new String("di java ");
        sb.append(st);
        sb.append(2f);
        System.out.println("Nilai sb : \""+sb+"\"");

        sb.insert(15,"metode ");
        System.out.println("Nilai sb : \""+sb+"\"");
        st=sb.toString();
        System.out.println("Nilai st : \""+st+"\"");
    }
}
