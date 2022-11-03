package com.ptit.htpt.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChuyenBay {

    @Id
    @GeneratedValue
    private String id;

    private Date ngayKhoiHanh;

    @ManyToOne
    @JoinColumn(name = "id_tb")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private TuyenBay tuyenBay;

    @ManyToOne
    @JoinColumn(name = "id_mb")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private MayBay mayBay;

    @OneToMany(mappedBy = "chuyenBay", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude // không sử dụng trường này trong equals và hashcode
    @ToString.Exclude // Khoonhg sử dụng trong toString()
    private Collection<Ve> Ves;
}
