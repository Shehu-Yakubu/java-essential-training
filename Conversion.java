import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Locale;

public class Conversion {
    public static void main(String[] args) {
        int result = 10 + 12;
        String answer = "The answer is " + result;
        System.out.println(answer);

        String howMany = 20 + " things";
        System.out.println(howMany);

        var result2 = 10 + 20;

        int intValue = 20;
        var fromInt = Integer.toString(intValue);
        System.out.println(fromInt);

        boolean boolValue = true;
        var fromBool = Boolean.toString(boolValue);

        long longValue = 10_000_000;
        var fromLong = Long.toString(longValue);
        System.out.println(fromLong);

        var doubleValue = 10_000_000.53;
        var numF = NumberFormat.getNumberInstance();
        System.out.println("Number: " + numF.format(doubleValue));

        var intF = NumberFormat.getIntegerInstance();
        System.out.println("Number: " + intF.format(doubleValue));

        intF.setGroupingUsed(false);
        System.out.println("Number: " + intF.format(doubleValue));

        // var locale = Locale.getDefault();
        var locale = new Locale("de", "DE");
        var localFormatter = NumberFormat.getNumberInstance(locale);
        System.out.println("Number: " + localFormatter.format(doubleValue));

        var currencyFormetter = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currencyFormetter.format(doubleValue));

        var df = new DecimalFormat("$00.00");
        System.out.println("Number: " + df.format(1));

        var item = "Shirt";
        var sie = "M";
        var price = 14.99;
        var color = "Red";

        var template = "Clothing item: %s, size %%s, color %s, $%.2f";
        var itemString = String.format(template, item, sie, color, price);
        System.out.println(itemString);
    }
}