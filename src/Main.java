public class Main {
    public static void main(String[] args) {
        System.out.println("---Conversion of Celsius for Fahrenheit!---");

        double temperaturaEmCelsius = 37.8;

        //Fórmula de Conversão
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        String mensagem = """
                
                Good morning!
                
                We're the International Wheather Institution!
                
                Now in Brazil, exclusive in the RJ, the weather is %f °C.
                While in the USA is %f °F.
                """.formatted(temperaturaEmCelsius, temperaturaEmFahrenheit);

        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("The temperature in Fahrenheit entire is: " + temperaturaEmFahrenheitInteira);
    }
}