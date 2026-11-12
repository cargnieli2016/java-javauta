public class ConversaoTipos {
    public static void main(String[] args) {

        int numero = 10;
        double d = numero;

        double d2 = 10.5;
        int int2 = (int) d2;

        Integer numeroInteger = 10;
        String numeroString = numeroInteger.toString();

        Double numeroDouble = 10.0;
        String numeroDoubleString = Double.toString(numeroDouble);


        String numeroStringDois = "1234";
        Integer numeroConvertido = Integer.parseInt(numeroStringDois);

        Double numeroConvertidoDouble = Double.parseDouble(numeroStringDois);

        Long numeroConvertidoLong = Long.parseLong(numeroStringDois);


        Long numeroLong = 10L;
        String numeroLongString = Long.toString(numeroLong);


        System.out.println(d2);
        System.out.println(int2);
        System.out.println(numeroInteger + " | " + numeroString);
        System.out.println(numeroStringDois + " | " + numeroConvertido);


    }
}
