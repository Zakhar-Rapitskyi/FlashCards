package com.rapitskyi.flashcards.repository;

import com.rapitskyi.flashcards.entity.FlashCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlashCardRepository extends JpaRepository<FlashCard,Long> {
}
