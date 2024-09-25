package ru.ilia.springclones.impl;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ilia.springclones.model.Clone;
import ru.ilia.springclones.repository.CloneRepository;
import ru.ilia.springclones.service.CloneService;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class CloneServiceImpl implements CloneService {
    private final CloneRepository repository;
    @Override
    public List<Clone> findAllClones() {
        return repository.findAll();
    }

    @Override
    public Clone saveClone(Clone clone) {
        return repository.save(clone);
    }

    @Override
    public Clone findByNumber(Integer number) {
        return repository.findByNumber(number);
    }

    @Override
    public Clone updateClone(Clone clone) {

        return repository.save(clone);
    }

    @Override
    @Transactional
    public void deleteClone(Integer number) {
        repository.deleteCloneByNumber(number);
    }
}
