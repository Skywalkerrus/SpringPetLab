package ru.ilia.springclones.service;

import org.springframework.stereotype.Service;
import ru.ilia.springclones.model.Clone;

import java.util.List;

public interface CloneService {

    List<Clone> findAllClones();

    Clone saveClone(Clone clone);
    Clone findByNumber(Integer number);

    Clone updateClone(Clone clone);
    void deleteClone(Integer number);
}
