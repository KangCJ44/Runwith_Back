package com.lkkp.runwith.IntervalRank;

import com.lkkp.runwith.member.Member;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Km5 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private Integer rating;

    @Column(nullable = true)
    private Integer win;

    @Column(nullable = true)
    private Integer lose;

    @Column(nullable = true)
    private double best_record;

    @OneToOne
    @JoinColumn(name = "member_ID", nullable = true)
    private Member member;


}

