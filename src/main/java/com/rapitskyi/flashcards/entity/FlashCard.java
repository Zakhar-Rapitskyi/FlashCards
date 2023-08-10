package com.rapitskyi.flashcards.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "flash_cards")
@Entity(name = "FlashCard")
@Getter
@Setter
public class FlashCard{
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "flash_cards_sequence"
    )
    private Long id;
    @Column(
            name = "word",
            nullable = false,
            unique = true,
            length = 50
    )
    private String word;

    @Column(
            name = "translate",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String translate;

    @Override
    public String toString() {
        return "\nFlashCard{" +
                "id=" + id +
                ", word='" + word + '\'' +
                ", translate='" + translate + '\'' +
                '}';
    }

    public FlashCard() {
    }

    public FlashCard(String word, String translate) {
        this.word = word;
        this.translate = translate;
    }
}
