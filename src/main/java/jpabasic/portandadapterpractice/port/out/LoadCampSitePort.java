package jpabasic.portandadapterpractice.port.out;

import java.util.Set;

public interface LoadCampSitePort {
    Set<CampSite> loadAllCampSites();
}
