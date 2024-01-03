public class Telefono {
  private String codigoPais;
  private String numero;
  private String tipo;

  public Telefono(String codigoPais, String numero, String tipo) {
    this.codigoPais = codigoPais;
    this.numero = numero;
    this.tipo = tipo;
  }

  public Telefono(String codigoPais, String numero) {
    this(codigoPais, numero, "Personal");
  }

  //GETTERS Y SETTERS
}
