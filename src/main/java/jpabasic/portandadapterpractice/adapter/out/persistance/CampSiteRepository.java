package jpabasic.portandadapterpractice.adapter.out.persistance;

import jpabasic.portandadapterpractice.adapter.out.persistance.entity.CampSiteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampSiteRepository extends JpaRepository<CampSiteEntity, Long> {
}
