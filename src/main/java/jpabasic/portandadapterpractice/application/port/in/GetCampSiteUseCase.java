package jpabasic.portandadapterpractice.application.port.in;

import jpabasic.portandadapterpractice.domain.CampSite;

import java.util.Set;

public interface GetCampSiteUseCase {
    Set<CampSite> getAllCampSites();
}
