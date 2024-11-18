package jpabasic.portandadapterpractice.adapter.out.persistance;

import jpabasic.portandadapterpractice.adapter.out.persistance.entity.CampSiteEntity;
import jpabasic.portandadapterpractice.application.port.out.LoadCampSitePort;
import jpabasic.portandadapterpractice.domain.CampSite;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CampSitePersistenceAdapter implements LoadCampSitePort {
    private final CampSiteRepository campSiteRepository;

    @Override
    public Set<CampSite> loadAllCampSites() {
        List<CampSiteEntity> campSites = campSiteRepository.findAll();
        return campSites.stream()
                .map(CampSiteEntity::toDomain)
                .collect(Collectors.toSet());
    }
}
