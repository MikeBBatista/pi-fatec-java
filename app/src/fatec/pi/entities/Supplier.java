package fatec.pi.entities;

public class Supplier {
	private Integer id;
	private String cnpj;
	private String name;
	private String site;
	private Integer type;
	
	public Supplier(String cnpj, String name, String site, Integer type) {
		
		this.setCnpj(cnpj);
		this.setName(name);
		this.setSite(site);
		this.setType(type);
	}
	
	public Supplier(String cnpj, String name, String site, Integer id, Integer type) {
		
		this.setCnpj(cnpj);
		this.setName(name);
		this.setSite(site);
		this.setType(type);	
		this.setId(id);
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = validateCnpj(cnpj);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	
	public String validateCnpj(String cnpj) {
		if (cnpj.length() == 14) {
			return cnpj;
		}
		return null;
	}
	
	public String toString() {
		String tipo = this.getType() == 0 ? "Luz" : "�gua";
		String res = "Nome: "+this.getName() + "\nCNPJ: " + this.getCnpj() + "\nTipo: " + tipo;
		return res;
	}
}
