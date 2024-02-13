package cuenta;

/**
 * La clase CCuenta representa una cuenta bancaria con funcionalidades básicas.
 * Permite realizar operaciones como ingresar, retirar y consultar el saldo.
 * También proporciona métodos para acceder y modificar la información de la cuenta.
 *
 * @author hugo
 * @version 1.0
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor predeterminado de la clase CCuenta.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros para inicializar la cuenta con valores específicos.
     *
     * @param nom   El nombre del titular de la cuenta.
     * @param cue   El número de cuenta.
     * @param sal   El saldo inicial.
     * @param tipo  El tipo de interés.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Método para obtener el estado actual del saldo.
     *
     * @return El saldo actual de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Permite ingresar una cantidad en la cuenta.
     *
     * @param cantidad La cantidad a ingresar.
     * @throws Exception Si se intenta ingresar una cantidad negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Permite retirar una cantidad de la cuenta.
     *
     * @param cantidad La cantidad a retirar.
     * @throws Exception Si se intenta retirar una cantidad negativa o si no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * Método para obtener el nombre del titular de la cuenta.
     *
     * @return El nombre del titular de la cuenta.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Método para establecer el nombre del titular de la cuenta.
     *
     * @param Nombre El nuevo nombre del titular de la cuenta.
     */
    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    /**
     * Método para obtener el número de cuenta.
     *
     * @return El número de cuenta.
     */
    public String getCuenta() {
        return this.cuenta;
    }

    /**
     * Método para establecer el número de cuenta.
     *
     * @param Cuenta El nuevo número de cuenta.
     */
    public void setCuenta(String Cuenta) {
        this.cuenta = Cuenta;
    }

    /**
     * Método para obtener el saldo actual de la cuenta.
     *
     * @return El saldo actual de la cuenta.
     */
    public double getSaldo() {
        return this.saldo;
    }

    /**
     * Método para establecer el saldo de la cuenta.
     *
     * @param saldo El nuevo saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método para obtener el tipo de interés de la cuenta.
     *
     * @return El tipo de interés de la cuenta.
     */
    public double getTipoInteres() {
        return this.tipoInterés;
    }

    /**
     * Método para establecer el tipo de interés de la cuenta.
     *
     * @param TipoInterés El nuevo tipo de interés de la cuenta.
     */
    public void setTipoInteres(double TipoInterés) {
        this.tipoInterés = TipoInterés;
    }
}
