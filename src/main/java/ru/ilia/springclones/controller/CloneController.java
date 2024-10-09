package ru.ilia.springclones.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.ilia.springclones.kafka.KafkaProducer;
import ru.ilia.springclones.model.Clone;
import ru.ilia.springclones.service.CloneService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clones")
@AllArgsConstructor
public class CloneController {
    private final CloneService service;
    @GetMapping
    public List<Clone> findAllClones() {
        return service.findAllClones();
    }

    @PostMapping("save_clone")
    public Clone saveClone(@RequestBody Clone clone)
    {
        return service.saveClone(clone);
        //return ("CT-" + clone.getNumber() + " successfully saved!");
    }

    @GetMapping("/{number}")
    public Clone findByNumber(@PathVariable Integer number){
        return service.findByNumber(number);
    }

    @PutMapping("update_clone")
    public Clone updateClone(@RequestBody Clone clone){
        return service.updateClone(clone);
    }

    @DeleteMapping("delete_clone/{number}")
    public void deleteClone(@PathVariable Integer number){
        service.deleteClone(number);
    }
}
