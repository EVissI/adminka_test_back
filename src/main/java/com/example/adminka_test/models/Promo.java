package com.example.adminka_test.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "promo")
public class Promo {
    @Id
    private String id;

    private String promoName;
    private Integer value;
    private Boolean status;

    public Boolean getStatus() {
        return status;
    }

    public Integer getValue() {
        return value;
    }

    public String getId() {
        return id;
    }

    public String getPromoName() {
        return promoName;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void setPromoName(String promoName) {
        this.promoName = promoName;
    }
}
