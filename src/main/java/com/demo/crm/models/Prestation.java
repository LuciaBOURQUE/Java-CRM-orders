package com.demo.crm.models;

import jakarta.persistence.*;

@Entity
@Table(name = "prestations")
public class Prestation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "type_presta")
    private String typePrestation;

    private String description;

    @Column(name = "nbr_days")
    private int nbrDays;

    @Column(name = "unit_price", columnDefinition = "NUMERIC(10,2)")
    private float unitPrice;

    @Transient
    @Column(name = "total_exclude_taxe", columnDefinition = "NUMERIC(10,2)")
    private float totalExcludeTaxe;

    @Transient
    @Column(name = "total_with_taxe", columnDefinition = "NUMERIC(10,2)")
    private float totalWithTaxe;

    @Column(name = "state", columnDefinition = "int4")
    private PrestationState state;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    public Prestation() {
    }

    public Prestation(String typePrestation, String description, int nbrDays, float unitPrice, float totalExcludeTaxe, float totalWithTaxe, PrestationState state, Client client) {
        this.typePrestation = typePrestation;
        this.description = description;
        this.nbrDays = nbrDays;
        this.unitPrice = unitPrice;
        this.totalExcludeTaxe = unitPrice * nbrDays;
        this.totalWithTaxe = unitPrice * nbrDays * 1.2F;
        this.state = state;
        this.client = client;
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
        return unitPrice * nbrDays;
    }

    public void setTotalExcludeTaxe(float totalExcludeTaxe) {
        this.totalExcludeTaxe = totalExcludeTaxe;
    }

    public float getTotalWithTaxe() {
        return unitPrice * nbrDays * 1.2F;
    }

    public void setTotalWithTaxe(float totalWithTaxe) {
        this.totalWithTaxe = totalWithTaxe;
    }

    public PrestationState getState() {
        return state;
    }

    public void setState(PrestationState state) {
        this.state = state;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Prestation{" +
                "id=" + id +
                ", typePrestation='" + typePrestation + '\'' +
                ", description='" + description + '\'' +
                ", client=" + client +
                ", nbrDays=" + nbrDays +
                ", unitPrice=" + unitPrice +
                ", totalExcludeTaxe=" + totalExcludeTaxe +
                ", totalWithTaxe=" + totalWithTaxe +
                ", state=" + state +
                '}';
    }
}
