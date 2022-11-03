package com.ptit.htpt.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChiNhanh {
    @Id
    @GeneratedValue
    private String id;

    private String ten;

    private String diaChi;

    @OneToMany(mappedBy = "chiNhanh", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude // không sử dụng trường này trong equals và hashcode
    @ToString.Exclude // Khoonhg sử dụng trong toString()
    private Collection<NhanVien> nhanViens;

}
