package com.bbva.rbvd.dto.insuranceroyal.rimac.pt.simulation;

import com.bbva.rbvd.dto.insuranceroyal.rimac.commons.AseguradoBO;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.bbva.rbvd.dto.insuranceroyal.rimac.commons.CommonsFieldsBO;
import com.bbva.rbvd.dto.insuranceroyal.rimac.commons.FinancingBO;
import com.bbva.rbvd.dto.insuranceroyal.rimac.commons.QuotationBO;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PayloadInsrSimulationBO  extends CommonsFieldsBO {

    private List<Integer> planes;
    private List<FinancingBO> financiamiento;
    private List<QuotationBO> cotizaciones;
    private List<Integer> periodosConDescuentoPrima;
    private String operacion;
    private AseguradoBO asegurado;

    public List<Integer> getPeriodosConDescuentoPrima() {return periodosConDescuentoPrima;}
    public void setPeriodosConDescuentoPrima(List<Integer> periodosConDescuentoPrima) {this.periodosConDescuentoPrima = periodosConDescuentoPrima;}
    public String getOperacion() {return operacion;}
    public void setOperacion(String operacion) {this.operacion = operacion;}
    public List<Integer> getPlanes() { return planes; }
    public void setPlanes(List<Integer> planes) { this.planes = planes; }
    public List<FinancingBO> getFinanciamiento() { return financiamiento; }
    public void setFinanciamiento(List<FinancingBO> financiamiento) { this.financiamiento = financiamiento; }
    public List<QuotationBO> getCotizaciones() { return cotizaciones; }
    public void setCotizaciones(List<QuotationBO> cotizaciones) { this.cotizaciones = cotizaciones; }
    public AseguradoBO getAsegurado() { return asegurado; }
    public void setAsegurado(AseguradoBO asegurado) { this.asegurado = asegurado; }
}
