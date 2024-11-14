package jpabasic.portandadapterpractice.adapter.out.persistance;

import jpabasic.portandadapterpractice.domain.model.CampSite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampSiteRepository extends JpaRepository<CampSite, Long> {
}
