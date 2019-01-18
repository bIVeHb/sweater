package ru.biv.sweater.repository;

import org.springframework.data.repository.CrudRepository;
import ru.biv.sweater.domain.Message;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Integer> {
    public List<Message> findByTag(String tag);
}
