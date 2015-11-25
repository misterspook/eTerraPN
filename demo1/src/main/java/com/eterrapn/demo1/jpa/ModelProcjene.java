package com.eterrapn.demo1.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the model_procjene database table.
 * 
 */
@Entity
@Table(name="model_procjene")
@NamedQuery(name="ModelProcjene.findAll", query="SELECT m FROM ModelProcjene m")
public class ModelProcjene implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer godina;

	private String opis;

	public ModelProcjene() {
	}

	public Integer getGodina() {
		return this.godina;
	}

	public void setGodina(Integer godina) {
		this.godina = godina;
	}

	public String getOpis() {
		return this.opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

}