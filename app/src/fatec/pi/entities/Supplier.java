package fatec.pi.entities;

public class Supplier {
	private Integer id;
	private Integer cnpj;
	private String name;
	private String site;
	private Integer type;
	
	public Supplier(Integer cnpj, String name, String site, Integer type) {
		
		this.setCnpj(cnpj);
		this.setName(name);
		this.setSite(site);
		this.setType(type);
	}
	
	public Supplier( Integer id, Integer cnpj, String name, String site, Integer type) {
		this.setId(id);
		this.setCnpj(cnpj);
		this.setName(name);
		this.setSite(site);
		this.setType(type);
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
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

	@Override
	public String toString() {
		return "Supplier [id=" + id + ", cnpj=" + cnpj + ", name=" + name + ", site=" + site + ", type=" + type + "]";
	}
	
	public String toType() {
		String result = "";
		if(this.getType().equals(0)) {
			result = "Energia";
		}
		else {
			result = "Água";
		}
		return result;
	}
}
