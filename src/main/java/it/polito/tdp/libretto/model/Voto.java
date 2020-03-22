package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class Voto implements Comparable<Voto>{
	
	private String corso;
	private int voto;
	private LocalDate data;
	
	public Voto(String corso, int voto, LocalDate data) {
		this.corso = corso;
		this.voto = voto;
		this.data = data;
	}
	
	public Voto(Voto v) {
		this.corso = v.corso;
		this.voto = v.voto;
		this.data = v.data;
	}

	public String getCorso() {
		return corso;
	}

	public int getVoto() {
		return voto;
	}

	public LocalDate getData() {
		return data;
	}
	
	public void setCorso(String corso) {
		this.corso = corso;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return corso + ": " + voto + " (" + data + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((corso == null) ? 0 : corso.hashCode());
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
		Voto other = (Voto) obj;
		if (corso == null) {
			if (other.corso != null)
				return false;
		} else if (!corso.equals(other.corso))
			return false;
		return true;
	}

	public Voto clone() {
		Voto v = new Voto(this.corso, this.voto, this.data);
		return v;
	}

	@Override
	public int compareTo(Voto other) {
		return this.corso.compareTo(other.corso);
	}

}
