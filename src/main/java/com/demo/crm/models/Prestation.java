package com.demo.crm.models;

import jakarta.persistence.*;

@Entity
@Table(name = "prestations")
public class Prestation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="type_presta")
    private String typePrestation;

    private String description;

    // A changer
    @Column(name="client_id")
    private int clientId;

    @Column(name="nbr_days")
    private int nbrDays;

    @Column(name = "unit_price", columnDefinition = "NUMERIC(10,2)")
    private float unitPrice;

    @Column(name = "total_exclude_taxe", columnDefinition = "NUMERIC(10,2)")
    private float totalExcludeTaxe;

    @Column(name = "total_with_taxe", columnDefinition = "NUMERIC(10,2)")
    private float totalWithTaxe;

    private int state;

    public Prestation() {
    }

    public Prestation(String typePrestation, String description, int clientId, int nbrDays, float unitPrice, float totalExcludeTaxe, float totalWithTaxe, int state) {
        this.typePrestation = typePrestation;
        this.description = description;
        this.clientId = clientId;
        this.nbrDays = nbrDays;
        this.unitPrice = unitPrice;
        this.totalExcludeTaxe = totalExcludeTaxe;
        this.totalWithTaxe = totalWithTaxe;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypePrestation() {
        return typePrestation;
    }

    public void setTypePrestation(String typePrestation) {
        this.typePrestation = typePrestation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getNbrDays() {
        return nbrDays;
    }

    public void setNbrDays(int nbrDays) {
        this.nbrDays = nbrDays;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float getTotalExcludeTaxe() {
        return totalExcludeTaxe;
    }

    public void setTotalExcludeTaxe(float totalExcludeTaxe) {
        this.totalExcludeTaxe = totalExcludeTaxe;
    }

    public float getTotalWithTaxe() {
        return totalWithTaxe;
    }

    public void setTotalWithTaxe(float totalWithTaxe) {
        this.totalWithTaxe = totalWithTaxe;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Prestation{" +
                "id=" + id +
                ", typePrestation='" + typePrestation + '\'' +
                ", description='" + description + '\'' +
                ", clientId=" + clientId +
                ", nbrDays=" + nbrDays +
                ", unitPrice=" + unitPrice +
                ", totalExcludeTaxe=" + totalExcludeTaxe +
                ", totalWithTaxe=" + totalWithTaxe +
                ", state=" + state +
                '}';
    }
}
