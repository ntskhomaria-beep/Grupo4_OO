package grupo4;

public class CuentaBancaria {
    
    private String numeroCuenta;
    private String titular;
    private double saldo;
    private String tipoCuenta;
    private String entidadBancaria;
    
    public CuentaBancaria (String numeroCuenta, String titular, double saldo,
            String tipoCuenta, String entidadBancaria){
            this.numeroCuenta=numeroCuenta;
            this.titular=titular;
            this.saldo=saldo;
            this.tipoCuenta=tipoCuenta;
            this.entidadBancaria=entidadBancaria;
    }

    public String getNumeroCuenta(){
        return numeroCuenta;
    }
    
    public String getTitular(){
        return titular;
    }
    
    public void setTitular(String titular){
        this.titular=titular;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    
    public String getTipoCuenta(){
        return tipoCuenta;
    }
    
    public String getEntidadBancaria(){
        return entidadBancaria;
    }
    
    public void setEntidadBancaria(String entidadBancaria){
        this.entidadBancaria=entidadBancaria;
    }
    
    public void mostrarInformacion(){
        System.out.print("La tarjeta de " + entidadBancaria + " esta al nombre del titular " + titular +
                " y su tipo de cuenta es " + tipoCuenta); 
    }
    
    public void depositar(double dinero) {
        if (dinero > 0) {
            saldo += dinero;
            System.out.println("Saldo añadido: " + saldo);
        } else {
            System.out.println("No puedes depositar menos de 0");
        }
    }

    public void retirar(double dinero) {
        if (dinero > 0 && dinero <= saldo) {
            saldo -= dinero;
            System.out.println("Has retirado " + saldo + " euros/dolares");
        } else {
            System.out.println("No puedes retirar nada, tienes guardado 0.");
        }
    }

}
