package jpabasic.portandadapterpractice.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

@Getter
public class CampSite {
    Long id;
    String name;
    String location;

    @Builder(access = AccessLevel.PACKAGE)
    private CampSite(Long id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public static CampSite of(Long id, String name, String location) {
        return CampSite.builder()
                .id(id)
                .name(name)
                .location(location)
                .build();
    }
}
