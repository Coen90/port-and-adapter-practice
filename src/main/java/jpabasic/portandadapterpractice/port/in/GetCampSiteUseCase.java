package jpabasic.portandadapterpractice.port.in;

import jpabasic.portandadapterpractice.domain.model.CampSite;

import java.util.Set;

public interface GetCampSiteUseCase {
    Set<CampSite> getAllCampSites();
}
