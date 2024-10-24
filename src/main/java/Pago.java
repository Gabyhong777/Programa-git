/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Raul-PC
 */
public class Pago {
    
    private int id;
    private double monto;
    private String fecha;

    // Constructor, getters y setters
    public Pago(int id, double monto, String fecha) {
        this.id = id;
        this.monto = monto;
        this.fecha = fecha;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
}