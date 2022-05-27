package modul10;

public class ConstructorString{
    public static void main(String args[]){
        String st1 = new String();
        st1 = "Constructor";
        String st2 = new String("Constructor");
        char[] ch = {'C','o','n','s','t','r','u','c','t','o','r'};
        String st3 = new String(ch);
        String st4 = new String(ch,0,ch.length);
        byte[] bytes = {'C','o','n','s','t','r','u','c','t','o','r'};
        String st5 = new String(bytes,0,0,bytes.length);
        String st6 = new String(bytes,0);
        String st7 = new String(new StringBuffer("Constructor StringBuffer"));

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(st4);
        System.out.println(st5);
        System.out.println(st6);
        System.out.println(st7);
    }
}