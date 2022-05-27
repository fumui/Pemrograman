package modul11;

class MultipleCatch {
    public static void main(String args[]) {
        try {
            int den = Integer.parseInt(args[0]); // baris ke-4
            System.out.println(3/den); // baris ke-5
        } catch (ArithmeticException exc) {
            System.out.println("Nilai pembagi 0.");
        } catch (ArrayIndexOutOfBoundsException exc2) {
            System.out.println("Parameter/argument tidak ada.");
        }
        System.out.println("Setelah exception.");
    }
}