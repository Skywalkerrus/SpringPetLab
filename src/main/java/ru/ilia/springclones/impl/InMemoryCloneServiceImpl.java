package ru.ilia.springclones.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ilia.springclones.model.Clone;
import ru.ilia.springclones.repository.InMemoryCloneDAO;
import ru.ilia.springclones.service.CloneService;

import java.util.List;
import java.util.stream.IntStream;

@Service
@AllArgsConstructor
public class InMemoryCloneServiceImpl implements CloneService {
    private final InMemoryCloneDAO repository;
    @Override
    public List<Clone> findAllClones() {
        return repository.findAllClones();
    }

    @Override
    public Clone saveClone(Clone clone) {
        return repository.saveClone(clone);
    }

    @Override
    public Clone findByNumber(Integer number) {
        return repository.findByNumber(number);
    }

    @Override
    public Clone updateClone(Clone clone) {
        return repository.updateClone(clone);
    }

    @Override
    public void deleteClone(Integer number) {
        repository.deleteClone(number);
    }
}
