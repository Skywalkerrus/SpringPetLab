package ru.ilia.springclones.repository;

import org.springframework.stereotype.Repository;
import ru.ilia.springclones.model.Clone;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryCloneDAO {
    private final List<Clone> CLONES = new ArrayList<>();

    public List<Clone> findAllClones() {
        return CLONES;
    }

    public Clone saveClone(Clone clone) {
        CLONES.add(clone);
        return clone;
    }

    public Clone findByNumber(Integer number) {
        return CLONES.stream()
                .filter(element -> element.getNumber().equals(number))
                .findFirst()
                .orElse(null);
    }

    public Clone updateClone(Clone clone) {
        var cloneIndex = IntStream.range(0, CLONES.size())
                .filter(index -> CLONES.get(index).getNumber().equals(clone.getNumber()))
                .findFirst()
                .orElse(-1);
        if (cloneIndex > -1)
        {
            CLONES.set(cloneIndex, clone);
            return clone;
        }
        return null;
    }

    public void deleteClone(Integer number) {
        var clone = findByNumber(number);
        if (clone != null)
        {
            CLONES.remove(clone);
        }
    }
}
