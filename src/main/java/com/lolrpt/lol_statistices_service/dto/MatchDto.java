package com.lolrpt.lol_statistices_service.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Getter
@ToString
@NoArgsConstructor
public class MatchDto {
    private MetadataDto metadata;
    private InfoDto info;
}
