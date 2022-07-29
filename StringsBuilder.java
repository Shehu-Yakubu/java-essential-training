public class StringsBuilder {
    public static void main(String[] args) {
        var sb = new StringBuilder("Welcome");
        sb.append(" to Abuja");

        StringBuilder b = new StringBuilder();
        b.append("Shirt size: ").append("M").append(", Qty: ").append(4);
        var s2 = b.toString();
        System.out.println(s2);
    }
}