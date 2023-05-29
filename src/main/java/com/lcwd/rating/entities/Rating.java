package com.lcwd.rating.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user_rating")
public class Rating {
    @Id
    private String ratingId;

    @Column(name="userId")
    private String userId;

    @Column(name="hotelId")
    private String hotelId;

    @Column(name="rating")
    private int rating;

    @Column(name="feedback")
    private String feedback;
}
