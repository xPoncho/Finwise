package org.my.authservice.models.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


import java.util.Date;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "sessions")
@Entity
public class SessionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    String id;

    @Column(unique = true)
    String userId;

    String token;

    Date expiresAt;
}
