package com.ptit.htpt.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ve {
    @Id
    @GeneratedValue
    private String id;

    private float giaVe;

    @ManyToOne
    @JoinColumn(name = "id_cb")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private ChuyenBay chuyenBay;

    @ManyToOne
    @JoinColumn(name = "id_cn")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private ChiNhanh chiNhanh;

    @OneToOne(mappedBy = "ve")
    private HoaDon hoaDon;
}
