package fatec.pi.entities;

import java.math.BigDecimal;

public class LightAccount {
	
	private Integer id;
	private String identCod;
	private String meterNumber;
	private String invoice;
	private String currentDate;
	private String dueDate;
	private Integer consumptionDays;
	private String flagType;
	private BigDecimal consumptionValue;
	private BigDecimal pisPercentage;
	private BigDecimal cofinsPercentage;
	private BigDecimal icmsBasis;
	private BigDecimal icmsPercentage;
	private BigDecimal icmsValue;
	private BigDecimal pisCofinsBasis;
	private BigDecimal pisValue;
	private BigDecimal cofinsValue;
	private BigDecimal forfeitValue;
	private BigDecimal interestValue;
	private BigDecimal otherValues;
	private BigDecimal supplyValue;
	private BigDecimal financialItems;
	private BigDecimal amount;
	private String supplierCnpj;
	private String clientCpf;
	
	public LightAccount(String identCod, String meterNumber, String invoice, String currentDate, String dueDate,
			Integer consumptionDays, String flagType, BigDecimal consumptionValue, BigDecimal pisPercentage,
			BigDecimal cofinsPercentage, BigDecimal icmsBasis, BigDecimal icmsPercentage, BigDecimal icmsValue,
			BigDecimal pisCofinsBasis, BigDecimal pisValue, BigDecimal cofinsValue, BigDecimal forfeitValue,
			BigDecimal interestValue, BigDecimal otherValues, BigDecimal supplyValue, BigDecimal financialItems,
			BigDecimal amount, String supplierCnpj, String clientCpf) {
		
		this.setIdentCod(identCod);
		this.setMeterNumber(meterNumber);
		this.setInvoice(invoice);
		this.setCurrentDate(currentDate);
		this.setDueDate(dueDate);
		this.setConsumptionDays(consumptionDays);
		this.setFlagType(flagType);
		this.setConsumptionValue(consumptionValue);
		this.setPisPercentage(pisPercentage);
		this.setCofinsPercentage(cofinsPercentage);
		this.setIcmsBasis(icmsBasis);
		this.setIcmsPercentage(icmsPercentage);
		this.setIcmsValue(icmsValue);
		this.setPisCofinsBasis(pisCofinsBasis);
		this.setPisValue(pisValue);
		this.setCofinsValue(cofinsValue);
		this.setForfeitValue(forfeitValue);
		this.setInterestValue(interestValue);
		this.setOtherValues(otherValues);
		this.setSupplyValue(supplyValue);
		this.setFinancialItems(financialItems);
		this.setAmount(amount);
		this.setSupplierCnpj(supplierCnpj);
		this.setClientCpf(clientCpf);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id=id;
	}
	public String getIdentCod() {
		return identCod;
	}
	public void setIdentCod(String identCod) {
		this.identCod = identCod;
	}

	public String getMeterNumber() {
		return meterNumber;
	}
	public void setMeterNumber(String meterNumber) {
		this.meterNumber = meterNumber;
	}
	public String getInvoice() {
		return invoice;
	}
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}
	public String getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public Integer getConsumptionDays() {
		return consumptionDays;
	}
	public void setConsumptionDays(Integer consumptionDays) {
		this.consumptionDays = consumptionDays;
	}
	public String getFlagType() {
		return flagType;
	}
	public void setFlagType(String flagType) {
		this.flagType = flagType;
	}
	public BigDecimal getConsumptionValue() {
		return consumptionValue;
	}
	public void setConsumptionValue (BigDecimal consumptionValue) {
		this.consumptionValue = consumptionValue;
	}
	public BigDecimal getPisPercentage() {
		return pisPercentage;
	}
	public void setPisPercentage(BigDecimal pisPercentage) {
		this.pisPercentage = pisPercentage;
	}
	public BigDecimal getCofinsPercentage() {
		return cofinsPercentage;
	}
	public void setCofinsPercentage(BigDecimal cofinsPercentage) {
		this.cofinsPercentage = cofinsPercentage;
	}
	public BigDecimal getIcmsBasis() {
		return icmsBasis;
	}
	public void setIcmsBasis(BigDecimal icmsBasis) {
		this.icmsBasis = icmsBasis;
	}
	public BigDecimal getIcmsPercentage() {
		return icmsPercentage;
	}
	public void setIcmsPercentage(BigDecimal icmsPercentage) {
		this.icmsPercentage = icmsPercentage;
	}
	public BigDecimal getIcmsValue() {
		return icmsValue;
	}
	public void setIcmsValue(BigDecimal icmsValue) {
		this.icmsValue = icmsValue;
	}
	public BigDecimal getPisCofinsBasis() {
		return pisCofinsBasis;
	}
	public void setPisCofinsBasis(BigDecimal pisCofinsBasis) {
		this.pisCofinsBasis = pisCofinsBasis;
	}
	public BigDecimal getPisValue() {
		return pisValue;
	}
	public void setPisValue(BigDecimal pisValue) {
		this.pisValue = pisValue;
	}
	public BigDecimal getCofinsValue() {
		return cofinsValue;
	}
	public void setCofinsValue(BigDecimal cofinsValue) {
		this.cofinsValue = cofinsValue;
	}
	public BigDecimal getForfeitValue() {
		return forfeitValue;
	}
	public void setForfeitValue(BigDecimal forfeitValue) {
		this.forfeitValue = forfeitValue;
	}
	public BigDecimal getInterestValue() {
		return interestValue;
	}
	public void setInterestValue(BigDecimal interestValue) {
		this.interestValue = interestValue;
	}
	public BigDecimal getOtherValues() {
		return otherValues;
	}
	public void setOtherValues(BigDecimal otherValues) {
		this.otherValues = otherValues;
	}
	public BigDecimal getSupplyValue() {
		return supplyValue;
	}
	public void setSupplyValue(BigDecimal supplyValue) {
		this.supplyValue = supplyValue;
	}
	public BigDecimal getFinancialItems() {
		return financialItems;
	}
	public void setFinancialItems(BigDecimal financialItems) {
		this.financialItems = financialItems;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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
	
}