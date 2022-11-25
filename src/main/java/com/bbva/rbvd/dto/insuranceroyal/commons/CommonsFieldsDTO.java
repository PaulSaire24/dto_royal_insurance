package com.bbva.rbvd.dto.insuranceroyal.commons;

import com.bbva.apx.dto.AbstractDTO;
import java.math.BigDecimal;
import org.joda.time.LocalDate;

public class CommonsFieldsDTO extends AbstractDTO {

    private String id;
    private String name;
    private BigDecimal amount;
    private String currency;
    private String description;
    private boolean isRecommended;
    private LocalDate maturityDate;
    private String traceId;
    private String saleChannelId;
    private String creationUser;
    private String userAudit;
    private String customerId;
    private TierDTO tier;
    private Double bankingFactor;

    private String isPrincipal;

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public BigDecimal getAmount() {return amount;}
    public void setAmount(BigDecimal amount) {this.amount = amount;}
    public String getCurrency() {return currency;}
    public void setCurrency(String currency) {this.currency = currency;}
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public boolean getIsRecommended() { return isRecommended; }
    public void setIsRecommended(boolean isRecommended) { this.isRecommended = isRecommended; }
    public LocalDate getMaturityDate() { return maturityDate; }
    public void setMaturityDate(LocalDate maturityDate) { this.maturityDate = maturityDate; }
    public String getTraceId() {return traceId;}
    public void setTraceId(String traceId) {this.traceId = traceId;}
    public String getSaleChannelId() {return saleChannelId;}
    public void setSaleChannelId(String saleChannelId) {this.saleChannelId = saleChannelId;}
    public String getCreationUser() {return creationUser;}
    public void setCreationUser(String creationUser) {this.creationUser = creationUser;}
    public String getUserAudit() {return userAudit;}
    public void setUserAudit(String userAudit) {this.userAudit = userAudit;}
    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }
    public TierDTO getTier() {
        return this.tier;
    }
    public void setTier(TierDTO tier) {
        this.tier = tier;
    }
    public Double getBankingFactor() {
        return this.bankingFactor;
    }
    public void setBankingFactor(Double bankingFactor) { this.bankingFactor = bankingFactor; }
    public String getIsPrincipal() { return isPrincipal; }
    public void setIsPrincipal(String isPrincipal) { this.isPrincipal = isPrincipal; }
    
}
