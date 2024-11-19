package jpabasic.portandadapterpractice.camp.application.service;

import jpabasic.portandadapterpractice.camp.application.port.in.GetCampSiteUseCase;
import jpabasic.portandadapterpractice.camp.application.port.out.LoadCampSitePort;
import jpabasic.portandadapterpractice.camp.domain.CampSite;
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
