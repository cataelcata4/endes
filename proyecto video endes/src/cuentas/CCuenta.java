package cuentas;

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    
    public void operativa_cuenta() {
    	CCuenta cuenta1;
    	double saldoActual;
    	double cantidad;
    	
    		cuenta1 = new CCuenta("Antonio Lopez","1000-2365-85-1230456789",2500,0);
    		
    	try {
    		cuenta1.retirar(2300);
    	} catch(Exception e) {System.out.print("Fallo al retirar");}
    	
    	try {
    		cuenta1.ingresar(695);
    	} catch(Exception e) {System.out.print("Fallo al ingresar");}
    	
    	saldoActual = cuenta1.estado();
    	System.out.println("El saldo actual es" + (saldoActual - 2300 + 695));
    	
    	cantidad = cuenta1.estado();
    	System.out.print("" +(cantidad - (saldoActual - 2300 + 695)));
    
    
    }
    
    public String getnombre() {return nombre;}
    public String getcuenta() {return cuenta;}
    public double getsaldo() {return saldo;}
    public double gettipoInteres() {return tipoInteres;}
    
    public String setnombre(String newNombre) {return nombre = newNombre;}
    public String setcuenta(String newCuenta) {return cuenta = newCuenta;}
    public double setsaldo(double newSaldo) {return saldo = newSaldo;}
	public double settipoInteres(double newTipoInteres) {return tipoInteres = newTipoInteres;}
    
}

