package ru.ilia.springclones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ilia.springclones.model.Clone;

public interface CloneRepository extends JpaRepository<Clone, Long> {
    void deleteCloneByNumber(Integer number);

    Clone findByNumber(Integer number);
}
