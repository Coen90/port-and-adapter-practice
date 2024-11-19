package jpabasic.portandadapterpractice.camp.application.port.out;

import jpabasic.portandadapterpractice.camp.domain.CampSite;

import java.util.Set;

public interface LoadCampSitePort {
    Set<CampSite> loadAllCampSites();
}
