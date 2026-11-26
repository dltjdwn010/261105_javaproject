package day16;

public class Generics02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsPrint<Powder> powderPrint =new GenericsPrint<>();
		powderPrint.setMaterial(new Powder());
		System.out.println(powderPrint);
		
		GenericsPrint<Plastic> pp = new GenericsPrint<>();
		
		pp.setMaterial(new Plastic());
		System.out.println(pp);
		
		GenericsPrint p = new GenericsPrint();
		p.setMaterial("암거나");
		System.out.println(p);
	}

}

class GenericsPrint<T>{
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "GenericsPrint [material=" + material + "]";
	}
	

}

class Powder{
	public String toString() {
		return "재료는 파우더";
	}
	
}

class Plastic{
	public String toString() {
		return "재료는 플라스틱";
	}
}