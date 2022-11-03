package com.ptit.htpt.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HoaDon {
    @Id
    @GeneratedValue
    private String id;

    private Date ngayTao;

    private long thanhTien;

    @ManyToOne
    @JoinColumn(name = "id_kh")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private KhachHang khachHang;

    @ManyToOne
    @JoinColumn(name = "id_nv")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private NhanVien nhanVien;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_ve", referencedColumnName = "id")
    private Ve ve;

}
