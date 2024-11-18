package jpabasic.portandadapterpractice.camp.adapter.out.persistance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jpabasic.portandadapterpractice.camp.domain.CampSite;

@Entity
@Table(name = "campsite")
public class CampSiteEntity {
    @Id
    private Long id;
    private String name;
    private String location;

    protected CampSiteEntity() {
    }

    public CampSite toDomain() {
        return CampSite.of(id, name, location);
    }
}
