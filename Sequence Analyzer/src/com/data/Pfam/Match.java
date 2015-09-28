package com.data.Pfam;

public class Match {
	
	private String matchName;
	private String eValue;
	private String envelopeStart;
	private String envelopeEnd;
	private String Hmm;
	private String matchString;
	private String PP;
	private String rawData;
	
	public String getMatchName() {
		return matchName;
	}

	public void setMatchName(String matchName) {
		this.matchName = matchName;
	}

	public String geteValue() {
		return eValue;
	}

	public void seteValue(String eValue) {
		this.eValue = eValue;
	}

	public String getEnvelopeStart() {
		return envelopeStart;
	}

	public void setEnvelopeStart(String envelopeStart) {
		this.envelopeStart = envelopeStart;
	}

	public String getEnvelopeEnd() {
		return envelopeEnd;
	}

	public void setEnvelopeEnd(String envelopeEnd) {
		this.envelopeEnd = envelopeEnd;
	}

	public String getHmm() {
		return Hmm;
	}

	public void setHmm(String hmm) {
		Hmm = hmm;
	}

	public String getMatchString() {
		return matchString;
	}

	public void setMatchString(String matchString) {
		this.matchString = matchString;
	}

	public String getPP() {
		return PP;
	}

	public void setPP(String pP) {
		PP = pP;
	}

	public String getRawData() {
		return rawData;
	}

	public void setRawData(String rawData) {
		this.rawData = rawData;
	}

	public Match()
	{
		
	}
}
