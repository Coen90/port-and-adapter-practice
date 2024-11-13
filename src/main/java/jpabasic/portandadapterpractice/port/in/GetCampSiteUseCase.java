package jpabasic.portandadapterpractice.port.in;

import java.util.Set;

public interface GetCampSiteUseCase {
    Set<CampSite> getAllCampSites();
}
