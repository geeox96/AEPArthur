public class App {

  public static void main(String[] args) {
    Pessoa wilson = new Física("Wilson da Silva Matos", "4.444.444-44", "444.555.445-44");
    Pessoa claudio = new Física("Cláudio Ferdinandi", "2.222.222-55", "123.984.445-12");
    Pessoa arthur = new Física("Arthur Cattaneo Zavadski9", "3.333.333-74", "888.333.445-24");
    Jurídica uniCesumar = new Jurídica("UniCesumar Centro Universitário Cesumar Ltda.", "01.004.137/0001-55", 500_000d);

    uniCesumar.adicionarSocio(wilson, 70.00d);
    uniCesumar.adicionarSocio(claudio, 29.50d);
    uniCesumar.adicionarSocio(arthur, 0.25d);
    uniCesumar.adicionarSocio(arthur, 0.25d);


    System.out.println("Foi.");

  }

}