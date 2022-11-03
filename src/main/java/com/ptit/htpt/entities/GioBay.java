package com.ptit.htpt.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GioBay{
    @Id
    @GeneratedValue
    private String id;

    @OneToMany(mappedBy = "gioBay", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude // không sử dụng trường này trong equals và hashcode
    @ToString.Exclude // Khoonhg sử dụng trong toString()
    private Collection<MayBay> mayBays;

    @OneToMany(mappedBy = "gioBay", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude // không sử dụng trường này trong equals và hashcode
    @ToString.Exclude // Khoonhg sử dụng trong toString()
    private Collection<TuyenBay> tuyenBays;
}
