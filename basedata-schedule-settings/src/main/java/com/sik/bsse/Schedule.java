package com.sik.bsse;

public class Schedule {

	private String ref;
	private String longName;
	private String collectorName;
	private String collectorCronDesc;
	private String collectorCronValueProd;
	private String collectorCronValueSit;
	private String publisherCronDesc;
	private String publisherCronValueProd;
	private String publisherCronValueSit;

	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	public String getCollectorName() {
		return collectorName;
	}
	public void setCollectorName(String collectorName) {
		this.collectorName = collectorName;
	}
	public String getCollectorCronDesc() {
		return collectorCronDesc;
	}
	public void setCollectorCronDesc(String collectorCronDesc) {
		this.collectorCronDesc = collectorCronDesc;
	}
	public String getCollectorCronValueProd() {
		return collectorCronValueProd;
	}
	public void setCollectorCronValueProd(String collectorCronValueProd) {
		this.collectorCronValueProd = collectorCronValueProd;
	}
	public String getCollectorCronValueSit() {
		return collectorCronValueSit;
	}
	public void setCollectorCronValueSit(String collectorCronValueSit) {
		this.collectorCronValueSit = collectorCronValueSit;
	}
	public String getPublisherCronDesc() {
		return publisherCronDesc;
	}
	public void setPublisherCronDesc(String publisherCronDesc) {
		this.publisherCronDesc = publisherCronDesc;
	}
	public String getPublisherCronValueProd() {
		return publisherCronValueProd;
	}
	public void setPublisherCronValueProd(String publisherCronValueProd) {
		this.publisherCronValueProd = publisherCronValueProd;
	}
	public String getPublisherCronValueSit() {
		return publisherCronValueSit;
	}
	public void setPublisherCronValueSit(String publisherCronValueSit) {
		this.publisherCronValueSit = publisherCronValueSit;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((collectorCronDesc == null) ? 0 : collectorCronDesc.hashCode());
		result = prime * result + ((collectorCronValueProd == null) ? 0 : collectorCronValueProd.hashCode());
		result = prime * result + ((collectorCronValueSit == null) ? 0 : collectorCronValueSit.hashCode());
		result = prime * result + ((collectorName == null) ? 0 : collectorName.hashCode());
		result = prime * result + ((longName == null) ? 0 : longName.hashCode());
		result = prime * result + ((publisherCronDesc == null) ? 0 : publisherCronDesc.hashCode());
		result = prime * result + ((publisherCronValueProd == null) ? 0 : publisherCronValueProd.hashCode());
		result = prime * result + ((publisherCronValueSit == null) ? 0 : publisherCronValueSit.hashCode());
		result = prime * result + ((ref == null) ? 0 : ref.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Schedule other = (Schedule) obj;
		if (collectorCronDesc == null) {
			if (other.collectorCronDesc != null)
				return false;
		} else if (!collectorCronDesc.equals(other.collectorCronDesc))
			return false;
		if (collectorCronValueProd == null) {
			if (other.collectorCronValueProd != null)
				return false;
		} else if (!collectorCronValueProd.equals(other.collectorCronValueProd))
			return false;
		if (collectorCronValueSit == null) {
			if (other.collectorCronValueSit != null)
				return false;
		} else if (!collectorCronValueSit.equals(other.collectorCronValueSit))
			return false;
		if (collectorName == null) {
			if (other.collectorName != null)
				return false;
		} else if (!collectorName.equals(other.collectorName))
			return false;
		if (longName == null) {
			if (other.longName != null)
				return false;
		} else if (!longName.equals(other.longName))
			return false;
		if (publisherCronDesc == null) {
			if (other.publisherCronDesc != null)
				return false;
		} else if (!publisherCronDesc.equals(other.publisherCronDesc))
			return false;
		if (publisherCronValueProd == null) {
			if (other.publisherCronValueProd != null)
				return false;
		} else if (!publisherCronValueProd.equals(other.publisherCronValueProd))
			return false;
		if (publisherCronValueSit == null) {
			if (other.publisherCronValueSit != null)
				return false;
		} else if (!publisherCronValueSit.equals(other.publisherCronValueSit))
			return false;
		if (ref == null) {
			if (other.ref != null)
				return false;
		} else if (!ref.equals(other.ref))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Schedule [ref=");
		builder.append(ref);
		builder.append(", longName=");
		builder.append(longName);
		builder.append(", collectorName=");
		builder.append(collectorName);
		builder.append(", collectorCronDesc=");
		builder.append(collectorCronDesc);
		builder.append(", collectorCronValueProd=");
		builder.append(collectorCronValueProd);
		builder.append(", collectorCronValueSit=");
		builder.append(collectorCronValueSit);
		builder.append(", publisherCronDesc=");
		builder.append(publisherCronDesc);
		builder.append(", publisherCronValueProd=");
		builder.append(publisherCronValueProd);
		builder.append(", publisherCronValueSit=");
		builder.append(publisherCronValueSit);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
