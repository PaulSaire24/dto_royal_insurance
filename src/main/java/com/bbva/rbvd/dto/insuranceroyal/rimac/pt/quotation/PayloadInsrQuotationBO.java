package com.bbva.rbvd.dto.insuranceroyal.rimac.pt.quotation;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.bbva.rbvd.dto.insuranceroyal.rimac.commons.CommonsFieldsBO;
import com.bbva.rbvd.dto.insuranceroyal.rimac.commons.PlanBO;
import com.bbva.rbvd.dto.insuranceroyal.rimac.commons.QuotationDetailBO;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PayloadInsrQuotationBO extends CommonsFieldsBO {
	
	private List<PlanBO> planes; 
	private List<QuotationDetailBO> detalleCotizacion;
	
	public List<PlanBO> getPlanes() {return planes;}
	public void setPlanes(List<PlanBO> planes) {this.planes = planes;}
	public List<QuotationDetailBO> getDetalleCotizacion() {return detalleCotizacion;}
	public void setDetalleCotizacion(List<QuotationDetailBO> detalleCotizacion) {this.detalleCotizacion = detalleCotizacion;}

}
