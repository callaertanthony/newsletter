package com.rizomm.newsletter.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by anthonycallaert on 05/03/15.
 */
@Transactional
public interface UserRepository extends CrudRepository<User, Integer> {

}
