package com.davidj.cookingblog;

import org.springframework.data.repository.CrudRepository;

public interface CookBookRepository extends CrudRepository<CookBook, Long> {
    
}