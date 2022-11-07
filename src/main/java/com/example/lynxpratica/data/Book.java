package com.example.lynxpratica.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "native")
    @Column
    private Integer id;

    @Column
    private String title;

    @Column
    private String author;

    @Column
    private BigDecimal price;

    @Column
    private Integer stock;


}
