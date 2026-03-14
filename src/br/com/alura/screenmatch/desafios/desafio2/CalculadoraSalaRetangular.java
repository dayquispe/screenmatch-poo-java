package br.com.alura.screenmatch.desafios.desafio2;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("A área da Sala é " + area + "m².");
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = (altura * 2) + (largura*2);
        System.out.println("O perímetro da Sala é " + perimetro + "m.");
    }
}
