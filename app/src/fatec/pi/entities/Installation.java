package fatec.pi.entities;

import java.math.BigDecimal;

public class Installation {
	
	private Integer id;
	private Integer installationNumber;
	private String subClass;
	private String mainClass;
	private BigDecimal freeTaxFare;
	private String readSchedule;
	private String installationType;
	
	public Installation(Integer id, Integer installationNumber, String subClass, String mainClass,
			BigDecimal freeTaxFare, String readSchedule) {
		
		this.setId(id);
		this.setInstallationNumber(installationNumber);
		this.setSubClass(subClass);
		this.setMainClass(mainClass);
		this.setFreeTaxFare(freeTaxFare);
		this.setReadSchedule(readSchedule);
		
	}
	
	public Installation(Integer installationNumber, String subClass, String mainClass,
			BigDecimal freeTaxFare, String readSchedule) {
		
		this.setInstallationNumber(installationNumber);
		this.setSubClass(subClass);
		this.setMainClass(mainClass);
		this.setFreeTaxFare(freeTaxFare);
		this.setReadSchedule(readSchedule);
		
	}
	
	public Installation(Integer id, Integer installationNumber, String installationType) {
		
		this.setId(id);
		this.setInstallationNumber(installationNumber);
		this.setInstallationType(installationType);
		
	}
	
	public Installation(Integer installationNumber, String installationType) {
		
		this.setInstallationNumber(installationNumber);
		this.setInstallationType(installationType);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSubClass() {
		return subClass;
	}

	public void setSubClass(String subClass) {
		this.subClass = subClass;
	}

	public String getMainClass() {
		return mainClass;
	}

	public void setMainClass(String mainClass) {
		this.mainClass = mainClass;
	}

	public BigDecimal getFreeTaxFare() {
		return freeTaxFare;
	}

	public void setFreeTaxFare(BigDecimal freeTaxFare) {
		this.freeTaxFare = freeTaxFare;
	}

	public String getReadSchedule() {
		return readSchedule;
	}

	public void setReadSchedule(String readSchedule) {
		this.readSchedule = readSchedule;
	}

	public String getInstallationType() {
		return installationType;
	}

	public void setInstallationType(String installationType) {
		this.installationType = installationType;
	}

	public Integer getInstallationNumber() {
		return installationNumber;
	}

	public void setInstallationNumber(Integer installationNumber) {
		this.installationNumber = installationNumber;
	}
	
}
