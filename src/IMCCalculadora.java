public class IMCCalculadora {
  private double peso;
  private double altura;

  public IMCCalculadora(double peso, double altura) {
    this.peso = peso;
    this.altura = altura;

  }

  public double getPeso() {
    return peso;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double getAltura() {
    return altura;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public double imc() {
    return peso / Math.pow((altura / 100), 2);

  }
}
