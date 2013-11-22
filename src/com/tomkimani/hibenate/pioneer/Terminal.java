package com.tomkimani.hibenate.pioneer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Terminal {
	
	@Id @GeneratedValue
	private int terminalId;
	private String ImeiCode;
	private String terminalName;
	
	public int getTerminal_id() {
		return terminalId;
	}
	public void setTerminal_id(int terminalId) {
		this.terminalId = terminalId;
	}
	public String getImeiCode() {
		return ImeiCode;
	}
	public void setImeiCode(String imeiCode) {
		ImeiCode = imeiCode;
	}
	public String getTerminalName() {
		return terminalName;
	}
	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}
	
	
}
