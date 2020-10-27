package fatec.pi.entities;

import java.math.BigDecimal;

public class Client {
	
	private Integer id;
	private String supplierCnpj;
	private String clientCpf;
	private String clientName;
	private String zipCode;
	private String streetName;
	private Integer streetNumber;
	private String streetComplement;
	private String city;
	private String state;
	private String meterNumber;
	private String measurementOrder; //Roteiro de Leitura
	private String lightClass;
	private String lightSubclass;
	private BigDecimal normalTax; //Tarifa sem imposto
	private BigDecimal tributeTax; //Tarifa com imposto
	
	public Client(String supplierCnpj, String clientCpf, String clientName, String zipCode, String streetName, Integer streetNumber,
			String streetComplement, String city, String state, String meterNumber, String measurementOrder, String lightClass, String lightSubclass,
			BigDecimal normalTax, BigDecimal tributeTax) {
		super();
		this.setSupplierCnpj(supplierCnpj);
		this.setClientCpf(clientCpf);
		this.setClientName(clientName);
		this.setZipCode(zipCode);
		this.setStreetName(streetName);
		this.setStreetNumber(streetNumber);
		this.setStreetComplement(streetComplement);
		this.setCity(city);
		this.setState(state);
		this.setMeterNumber(meterNumber);
		this.setMeasurementOrder(measurementOrder);
		this.setLightClass(lightClass);
		this.setLightSubclass(lightSubclass);
		this.setNormalTax(normalTax);
		this.setTributeTax(tributeTax);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id=id;
	}
	public String getSupplierCnpj() {
		return supplierCnpj;
	}
	public void setSupplierCnpj(String supplierCnpj) {
		this.supplierCnpj = supplierCnpj;
	}
	public String getClientCpf() {
		return clientCpf;
	}
	public void setClientCpf(String clientCpf) {
		this.clientCpf = clientCpf;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode=zipCode;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName=streetName;
	}
	public Integer getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(Integer streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getStreetComplement() {
		return streetComplement;
	}
	public void setStreetComplement(String streetComplement) {
		this.streetComplement=streetComplement;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state=state;
	}
	public String getMeterNumber() {
		return meterNumber;
	}
	public void setMeterNumber(String meterNumber) {
		this.meterNumber=meterNumber;
	}
	public String getMeasurementOrder() {
		return measurementOrder;
	}
	public void setMeasurementOrder(String measurementOrder) {
		this.measurementOrder=measurementOrder;
	}
	public String getLightClass() {
		return lightClass;
	}
	public void setLightClass(String lightClass) {
		this.lightClass=lightClass;
	}
	public String getLightSubclass() {
		return lightSubclass;
	}
	public void setLightSubclass(String lightSubclass) {
		this.lightSubclass=lightSubclass;
	}
	public BigDecimal getNormalTax() {
		return normalTax;
	}
	public void setNormalTax( BigDecimal normalTax) {
		this.normalTax=normalTax;
	}
	public BigDecimal getTributeTax() {
		return tributeTax;
	}
	public void setTributeTax(BigDecimal tributeTax) {
		this.tributeTax=tributeTax;
	}
	

}
