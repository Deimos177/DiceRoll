package com.deimos.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestDto {

	@JsonProperty("diceFaces")
	private Integer diceFaces;
	@JsonProperty("percent")
	private Boolean percent;

	public Integer getDiceFaces() {
		return diceFaces;
	}

	public void setDiceFaces(Integer diceFaces) {
		this.diceFaces = diceFaces;
	}

	public Boolean getPercent() {
		return percent;
	}

	public void setPercent(Boolean percent) {
		this.percent = percent;
	}

	public RequestDto() {
	}

	public RequestDto(Integer diceFaces, Boolean percent) {
		this.diceFaces = diceFaces;
		this.percent = percent;
	}
}