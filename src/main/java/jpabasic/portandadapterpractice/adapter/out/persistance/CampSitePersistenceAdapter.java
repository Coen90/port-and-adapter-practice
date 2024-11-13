package jpabasic.portandadapterpractice.adapter.out.persistance;

import jpabasic.portandadapterpractice.port.out.LoadCampSitePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class CampSitePersistenceAdapter implements LoadCampSitePort {
    private final CampSiteRepository campSiteRepository;

    @Override
    public Set<CampSite> loadAllCampSites() {
        return Set.of();
    }
}
