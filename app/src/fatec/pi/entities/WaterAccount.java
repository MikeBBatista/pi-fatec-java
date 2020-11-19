package fatec.pi.entities;

import java.math.BigDecimal;

public class WaterAccount {
	private Integer id;
	private String number;
	private String dueDate;
	private BigDecimal penalty;
	private BigDecimal consumptionValue;
	private BigDecimal pollutionValue;
	private BigDecimal sewerValue;
	private BigDecimal waterValue;
	private Integer pisPercentage;
	private BigDecimal otherValues;
	private String supplierCnpj;
	private String clientCpf;
	
	public WaterAccount(String number, String dueDate, BigDecimal penalty, BigDecimal consumptionValue,
			BigDecimal pollutionValue, BigDecimal sewerValue, BigDecimal waterValue, Integer pisPercentage,
			BigDecimal otherValues, String supplierCnpj) {
		super();
		this.setNumber(number);
		this.setDueDate(dueDate);
		this.setPenalty(penalty);
		this.setConsumptionValue(consumptionValue);
		this.setPollutionValue(pollutionValue);
		this.setSewerValue(sewerValue);
		this.setWaterValue(waterValue);
		this.setPisPercentage(pisPercentage);
		this.setOtherValues(otherValues);
		this.setSupplierCnpj(supplierCnpj);
	}
	
	public WaterAccount(Integer id,String number, String dueDate, BigDecimal penalty, BigDecimal consumptionValue,
			BigDecimal pollutionValue, BigDecimal sewerValue, BigDecimal waterValue, Integer pisPercentage,
			BigDecimal otherValues, String supplierCnpj) {
		this.setId(id);
		this.setNumber(number);
		this.setDueDate(dueDate);
		this.setPenalty(penalty);
		this.setConsumptionValue(consumptionValue);
		this.setPollutionValue(pollutionValue);
		this.setSewerValue(sewerValue);
		this.setWaterValue(waterValue);
		this.setPisPercentage(pisPercentage);
		this.setOtherValues(otherValues);
		this.setSupplierCnpj(supplierCnpj);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public BigDecimal getPenalty() {
		return penalty;
	}
	public void setPenalty(BigDecimal penalty) {
		this.penalty = penalty;
	}
	public BigDecimal getConsumptionValue() {
		return consumptionValue;
	}
	public void setConsumptionValue(BigDecimal consumptionValue) {
		this.consumptionValue = consumptionValue;
	}
	public BigDecimal getPollutionValue() {
		return pollutionValue;
	}
	public void setPollutionValue(BigDecimal pollutionValue) {
		this.pollutionValue = pollutionValue;
	}
	public BigDecimal getSewerValue() {
		return sewerValue;
	}
	public void setSewerValue(BigDecimal sewerValue) {
		this.sewerValue = sewerValue;
	}
	public BigDecimal getWaterValue() {
		return waterValue;
	}
	public void setWaterValue(BigDecimal waterValue) {
		this.waterValue = waterValue;
	}
	public Integer getPisPercentage() {
		return pisPercentage;
	}
	public void setPisPercentage(Integer pisPercentage) {
		this.pisPercentage = pisPercentage;
	}
	public BigDecimal getOtherValues() {
		return otherValues;
	}
	public void setOtherValues(BigDecimal otherValues) {
		this.otherValues = otherValues;
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

	@Override
	public String toString() {
		return "WaterAccount [id=" + id + ", number=" + number + ", dueDate=" + dueDate + ", penalty=" + penalty
				+ ", consumptionValue=" + consumptionValue + ", pollutionValue=" + pollutionValue + ", sewerValue="
				+ sewerValue + ", waterValue=" + waterValue + ", pisPercentage=" + pisPercentage + ", otherValues="
				+ otherValues + ", supplierCnpj=" + supplierCnpj + ", clientCpf=" + clientCpf + "]";
	}
	
}
