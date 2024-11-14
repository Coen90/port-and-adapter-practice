package jpabasic.portandadapterpractice.adapter.in.web;

import jpabasic.portandadapterpractice.adapter.in.web.response.CampSiteResponse;
import jpabasic.portandadapterpractice.domain.model.CampSite;
import jpabasic.portandadapterpractice.port.in.GetCampSiteUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/camp-site")
@RequiredArgsConstructor
public class CampSiteRentalController {
    private final GetCampSiteUseCase getCampSiteUseCase;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<CampSiteResponse> getAllCampSites() {
        Set<CampSite> campSites = getCampSiteUseCase.getAllCampSites();
        return ResponseEntity.ok(CampSiteResponse.from(campSites));
    }
}
