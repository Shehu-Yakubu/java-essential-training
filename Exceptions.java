public class Exceptions {
    public static void main(String[] args) {
        String s = null;
        try {
            var sub = s.substring(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("I still can out data.");
    }
}