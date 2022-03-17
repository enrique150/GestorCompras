package modelo;

import javax.swing.Icon;


public class Imagenes {
	private Icon img;
	private String name;
	
	public Imagenes(Icon aicon, String aname) {
		this.img = aicon;
		this.name = aname;
	}
	
	public Icon getImg() {
		return img;
	}

	public void setImg(Icon img) {
		this.img = img;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
}

