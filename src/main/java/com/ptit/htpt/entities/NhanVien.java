package com.ptit.htpt.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NhanVien {
    @Id
    @GeneratedValue
    private String id;

    private String diaChi;

    private  String ten;

    private int tuoi;

    private Date ngaySinh;

    private String chucVu;

    @OneToMany(mappedBy = "khachHang", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude // không sử dụng trường này trong equals và hashcode
    @ToString.Exclude // Khoonhg sử dụng trong toString()
    private Collection<HoaDon> HoaDons;

    @ManyToOne
    @JoinColumn(name = "id_cn")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private ChiNhanh chiNhanh;
}
