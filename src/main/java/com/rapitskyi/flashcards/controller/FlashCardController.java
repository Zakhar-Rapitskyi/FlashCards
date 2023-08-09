package com.rapitskyi.flashcards.controller;

import com.rapitskyi.flashcards.entity.FlashCard;
import com.rapitskyi.flashcards.repository.FlashCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class FlashCardController {
    @Autowired
    private FlashCardRepository flashCardRepository;

    @GetMapping("/")
    public String hello(Model model) {
        List<FlashCard> flashCardList = flashCardRepository.findAll(Sort.by(Sort.Direction.ASC, "word"));
        model.addAttribute("flashCardsList", flashCardList);
        return "welcome";
    }

    @DeleteMapping("/deleteWord/{id}")
    public ResponseEntity<?> deleteWord(@PathVariable("id") Long id) {
        flashCardRepository.deleteById(id);
        return ResponseEntity.ok("");
    }
}
