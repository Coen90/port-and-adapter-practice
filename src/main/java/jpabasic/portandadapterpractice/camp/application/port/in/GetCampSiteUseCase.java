package jpabasic.portandadapterpractice.camp.application.port.in;

import jpabasic.portandadapterpractice.camp.domain.CampSite;

import java.util.Set;

public interface GetCampSiteUseCase {
    Set<CampSite> getAllCampSites();
}
