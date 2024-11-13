package jpabasic.portandadapterpractice.domain.service;

import jpabasic.portandadapterpractice.port.in.GetCampSiteUseCase;
import jpabasic.portandadapterpractice.port.out.LoadCampSitePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class CampSiteRentalService implements GetCampSiteUseCase {
    private final LoadCampSitePort loadCampSitePort;

    @Override
    public Set<CampSite> getAllCampSites() {
        return loadCampSitePort.loadAllCampSites();
    }
}
