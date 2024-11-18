package jpabasic.portandadapterpractice.application.service;

import jpabasic.portandadapterpractice.application.port.in.GetCampSiteUseCase;
import jpabasic.portandadapterpractice.application.port.out.LoadCampSitePort;
import jpabasic.portandadapterpractice.domain.CampSite;
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
