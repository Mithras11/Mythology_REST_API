package com.kaliv.myths.entity.artefacts;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.Set;

import com.kaliv.myths.entity.artefacts.images.StatueImage;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "statues")
public class Statue extends VisualArtwork {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "statue")
    private Set<StatueImage> statueImages;
}
