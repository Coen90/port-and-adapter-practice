package jpabasic.portandadapterpractice.application.port.out;

import jpabasic.portandadapterpractice.domain.CampSite;

import java.util.Set;

public interface LoadCampSitePort {
    Set<CampSite> loadAllCampSites();
}
