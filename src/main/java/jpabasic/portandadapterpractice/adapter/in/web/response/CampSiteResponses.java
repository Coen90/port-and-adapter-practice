package jpabasic.portandadapterpractice.adapter.in.web.response;

import jpabasic.portandadapterpractice.domain.CampSite;

import java.util.List;
import java.util.Set;

public record CampSiteResponses(List<CampSiteResponse> campSiteResponses) {
    public static CampSiteResponses from(Set<CampSite> campSites) {
        List<CampSiteResponse> responses = campSites.stream()
                .map(CampSiteResponse::of)
                .toList();
        return new CampSiteResponses(responses);
    }
}
