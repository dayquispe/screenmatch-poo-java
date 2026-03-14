package br.com.alura.screenmatch.desafios.desafio4;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public void celsiusParaFahrenheit(double celsius) {
        System.out.println(celsius + "°C para Fahrenheit é: " + celsius * 1.8 + 32 + "°F" );
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        System.out.println(fahrenheit + "°F para Celsius é: " + (fahrenheit - 32)/1.8 + "°C" );
    }

}
