// Cotxe.java
package domenech.jordi.dam.mp05.uf01.serialitzacio.json.model.domain;

public class Cotxe {

    private String matricula;
    private String marca;
    private String model;
    private String numeroBastidor;

    public Cotxe() {
    }

    public Cotxe(String matricula, String marca, String model, String numeroBastidor) {
        this.matricula = matricula;
        this.marca = marca;
        this.model = model;
        this.numeroBastidor = numeroBastidor;
    }

    // Getters and setters...

    @Override
    public String toString() {
        return "Cotxe [matricula=" + matricula + ", marca=" + marca + ", model=" + model + ", numeroBastidor="
                + numeroBastidor + "]";
    }
}
