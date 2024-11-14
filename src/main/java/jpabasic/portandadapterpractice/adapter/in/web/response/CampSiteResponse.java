package jpabasic.portandadapterpractice.adapter.in.web.response;

import jpabasic.portandadapterpractice.domain.model.CampSite;

import java.util.Set;

public record CampSiteResponse(Set<CampSite> campSites) {
    public static CampSiteResponse from(Set<CampSite> campSites) {
        return new CampSiteResponse(campSites);
    }
}
