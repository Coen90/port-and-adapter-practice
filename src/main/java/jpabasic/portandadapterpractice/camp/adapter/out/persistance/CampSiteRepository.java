package jpabasic.portandadapterpractice.camp.adapter.out.persistance;

import jpabasic.portandadapterpractice.camp.adapter.out.persistance.entity.CampSiteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampSiteRepository extends JpaRepository<CampSiteEntity, Long> {
}
