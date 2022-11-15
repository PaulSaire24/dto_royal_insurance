package com.bbva.rbvd.dto.insuranceroyal.rimac.commons;

import java.math.BigDecimal;
import java.util.List;

public class CommonsFieldsBO {

    private String producto;
    private String moneda;
	private List<ParticularDataBO> datosParticulares;
    private String idCotizacion;
    private BigDecimal primaNeta;
    private BigDecimal primaBruta;
    private String periodicidad;
	private List<CoverageBO> coberturas;
    private BigDecimal sumaAsegurada;
    private String status;
    private String mensaje;
    private String codigoAgrupador;
    private String codigoExterno;
    private String fecCreacion;
    private String fecExpiracion;
    private String fecIniVig;
    private String fecFinVig;
    private String nroDocumento;
    private String idFinanciamiento;
    private String tipoDocumento;
    private String numeroDocumento;
    private String fechaInicio;

    private String indSeleccionado;
    private String estado;

    public String getIdFinanciamiento() {return idFinanciamiento;}
	public void setIdFinanciamiento(String idFinanciamiento) {this.idFinanciamiento = idFinanciamiento;}
	public String getCodigoExterno() {return codigoExterno;}
	public void setCodigoExterno(String codigoExterno) {this.codigoExterno = codigoExterno;}
	public String getFecCreacion() {return fecCreacion;}
	public void setFecCreacion(String fecCreacion) {this.fecCreacion = fecCreacion;}
	public String getFecExpiracion() {return fecExpiracion;}
	public void setFecExpiracion(String fecExpiracion) {this.fecExpiracion = fecExpiracion;}
	public String getFecIniVig() {return fecIniVig;}
	public void setFecIniVig(String fecIniVig) {this.fecIniVig = fecIniVig;}
	public String getFecFinVig() {return fecFinVig;}
	public void setFecFinVig(String fecFinVig) {this.fecFinVig = fecFinVig;}
	public String getNroDocumento() {return nroDocumento;}
	public void setNroDocumento(String nroDocumento) {this.nroDocumento = nroDocumento;}
	public BigDecimal getPrimaNeta() {return primaNeta;}
    public void setPrimaNeta(BigDecimal primaNeta) {this.primaNeta = primaNeta;}
    public BigDecimal getPrimaBruta() {return primaBruta;}
    public void setPrimaBruta(BigDecimal primaBruta) {this.primaBruta = primaBruta;}
    public BigDecimal getSumaAsegurada() {return sumaAsegurada;}
    public void setSumaAsegurada(BigDecimal sumaAsegurada) {this.sumaAsegurada = sumaAsegurada;}
    public String getMoneda() {return moneda;}
    public void setMoneda(String moneda) {this.moneda = moneda;}
    public String getIdCotizacion() {return idCotizacion;}
    public void setIdCotizacion(String idCotizacion) {this.idCotizacion = idCotizacion;}
    public String getProducto() {return producto;}
    public void setProducto(String producto) {this.producto = producto;}
	public List<CoverageBO> getCoberturas() {return coberturas;}
    public void setCoberturas(List<CoverageBO> coberturas) {this.coberturas = coberturas;}
    public String getPeriodicidad() {return periodicidad;}
    public void setPeriodicidad(String periodicidad) {this.periodicidad = periodicidad;}
    public String getStatus() { return status; }
    public void setStatus(String status) {this.status = status;}
    public String getMensaje() {return mensaje;}
    public void setMensaje(String mensaje) {this.mensaje = mensaje;}
	public List<ParticularDataBO> getDatosParticulares() {return datosParticulares;}
    public void setDatosParticulares(List<ParticularDataBO> datosParticulares) { this.datosParticulares = datosParticulares; }
    public String getCodigoAgrupador() {return codigoAgrupador;}
    public void setCodigoAgrupador(String codigoAgrupador) {this.codigoAgrupador = codigoAgrupador;}
    public String getTipoDocumento() {return tipoDocumento;}
    public void setTipoDocumento(String tipoDocumento) {this.tipoDocumento = tipoDocumento;}
    public String getNumeroDocumento() {return numeroDocumento;}
    public void setNumeroDocumento(String numeroDocumento) {this.numeroDocumento = numeroDocumento;}
    public String getFechaInicio() {return fechaInicio;}
    public void setFechaInicio(String fechaInicio) {this.fechaInicio = fechaInicio;}

    public String getIndSeleccionado() {
        return indSeleccionado;
    }
    public void setIndSeleccionado(String indSeleccionado) {
        this.indSeleccionado = indSeleccionado;
    }

    public String getEstado() {return estado;}
    public void setEstado(String estado) {this.estado = estado;}
    
}
