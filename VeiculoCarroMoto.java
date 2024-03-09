package atividadessenai;

public class Veiculo {
	
	private String marca;
	private String modelo;
	
	Veiculo	(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
    public String toString() {
        return "Veiculo -> " + "Marca: " + marca + " - Modelo: " + modelo;
    }
}

package atividadessenai;

public class Carro extends Veiculo{
	
	private Double cilindrada;
	
	Carro (String marca, String modelo, Double cilindrada){
		super(marca,modelo);
		this.cilindrada = cilindrada;
	}

	public Double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Double cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	@Override
    public String toString() {
        return super.toString() + " - Cilindrada Do Carro: " + cilindrada;
    }
}

package atividadessenai;

public class Moto extends Veiculo{
	
private Double cilindrada;
	
	Moto (String marca, String modelo, Double cilindrada){
		super(marca,modelo);
		this.cilindrada = cilindrada;
	}

	public Double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Double cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
    public String toString() {
        return super.toString() + " - Cilindrada Da Moto: " + cilindrada;
    }
}

package atividadessenai;

public class Geralzinha {
	public static void main(String[] args) {
		Carro carro = new Carro("Hyundai", "Creta", 2.0);
		System.out.println(carro.toString());
		
		Moto moto = new Moto ("Kawasaki Ninja","ZX-4R",3.0);
		System.out.println(moto.toString());
	}
}
