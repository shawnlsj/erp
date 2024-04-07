package com.bluesky.erp.common.auditing;

import jakarta.persistence.Column;
import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import java.time.LocalDateTime;

@Getter
public abstract class BaseTimeAndModifierEntity extends BaseTimeEntity {

    @CreatedBy
    @Column(name="created_by", updatable = false)
    private LocalDateTime createdBy;

    @LastModifiedBy
    @Column(name="modified_by")
    private LocalDateTime modifiedBy;
}
