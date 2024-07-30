package com.softeer.podoarrival.user.model.entity;

import com.softeer.podoarrival.common.entity.DateEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "event_arrival_users")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User extends DateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String name;

    @Column(name = "phone_number", unique = true)
    private String phoneNum;
    @Enumerated(EnumType.STRING)
    private Role role;
}
