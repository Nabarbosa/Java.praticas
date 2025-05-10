package heranca_02;

public class MainPessoaJuridica {

    public static void main(String[] args) {
        Juridica juridica = new Juridica("Empresa XYZ", "1234-5678", "12.345.678/0001-90", "1234567890");
        System.out.println(juridica.toString());

        Fisica fisica = new Fisica("João Silva", "9876-5432", "123.456.789-00", "MG-12.345.678", "01/01/1990");
        System.out.println(fisica.toString());
    }
    
}
