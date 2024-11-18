package jpabasic.portandadapterpractice.camp.adapter.in.web;

import jpabasic.portandadapterpractice.camp.adapter.in.web.response.CampSiteResponses;
import jpabasic.portandadapterpractice.camp.application.port.in.GetCampSiteUseCase;
import jpabasic.portandadapterpractice.camp.domain.CampSite;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/camp-site")
@RequiredArgsConstructor
public class CampSiteRentalController {
    private final GetCampSiteUseCase getCampSiteUseCase;

    @GetMapping
    public ResponseEntity<CampSiteResponses> getAllCampSites() {
        Set<CampSite> campSites = getCampSiteUseCase.getAllCampSites();
        return ResponseEntity.ok()
                .body(CampSiteResponses.from(campSites));
    }
}
