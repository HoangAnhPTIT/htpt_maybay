package com.ptit.htpt.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MayBay {
    @Id
    @GeneratedValue
    private String id;

    private String ten;

    @OneToMany(mappedBy = "mayBay", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude // không sử dụng trường này trong equals và hashcode
    @ToString.Exclude // Khoonhg sử dụng trong toString()
    private Collection<ChuyenBay> chuyenBays;

    @ManyToOne
    @JoinColumn(name = "id_gb")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private  GioBay gioBay;
}
