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
        
    }
    
    public void depositar (){
        
    }
    
//    public boolean retirar(double saldo){
//        double saldo;
//        if (
//        return true;
//        
//        return false;
//    }
//    
//    public double verSaldo(){
//        
//    }
    
}


//mostrarInformacion() : void
//depositar(monto : double) : void
//retirar(monto : double) : boolean
//verSaldo() : double
