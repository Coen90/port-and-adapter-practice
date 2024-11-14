package jpabasic.portandadapterpractice.port.out;

import jpabasic.portandadapterpractice.domain.model.CampSite;

import java.util.Set;

public interface LoadCampSitePort {
    Set<CampSite> loadAllCampSites();
}
