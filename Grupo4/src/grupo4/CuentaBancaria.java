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
    
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("El monto debe ser mayor que 0.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }

}
