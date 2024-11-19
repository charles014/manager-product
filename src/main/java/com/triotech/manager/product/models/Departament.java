package com.triotech.manager.product.models;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
@Entity
public class Departament {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Schema(example = "0361c0c4-8da6-11ef-88cd-cecb03cd8761")
    private UUID id;

    @NonNull
    @Column(nullable = false)
    @Schema(example = "Samsung Galaxy A23")
    private String name;

}
