package jpabasic.portandadapterpractice.camp.adapter.in.web.response;

import jpabasic.portandadapterpractice.camp.domain.CampSite;

public record CampSiteResponse(Long id, String name, String location) {
    public static CampSiteResponse of(CampSite campSite) {
        return new CampSiteResponse(campSite.getId(), campSite.getName(), campSite.getLocation());
    }
}
