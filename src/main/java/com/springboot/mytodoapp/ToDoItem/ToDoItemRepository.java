package com.springboot.mytodoapp.ToDoItem;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/*@EnableMongoRepositories(basePackageClasses = ToDoItemRepository.class)*/
public interface ToDoItemRepository extends MongoRepository<ToDoItem, String> {
}
