package com.swille.domain.models.projections;

import com.swille.domain.repository.RecalledVehicles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "RecalledVehiclesPageView", types = RecalledVehicles.class)
public interface RecalledVehiclesPageView {

    @Value("#{target.count}")
    String getCount();
}
