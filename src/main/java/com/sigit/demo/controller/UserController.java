package com.sigit.demo.controller;

import com.sigit.demo.exception.UserNotFoundException;
import com.sigit.demo.entity.User;
import com.sigit.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Date 07/09/20
 *
 * @author sigit
 */

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findByUserId(@PathVariable long id) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("user id-" + id));
        return ResponseEntity.ok().body(user);

    }

    @PostMapping("")
    public User save(@RequestBody User user) {
        User saved = userRepository.saveAndFlush(user);
        return saved;
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> update(@PathVariable(value = "id") long id, @RequestBody User userDetails) {

        return userRepository.findById(id)
                .map(record -> {
                    record.setName(userDetails.getName());
                    record.setCountry(userDetails.getCountry());
                    User updated = userRepository.save(userDetails);
                    return ResponseEntity.ok().body(updated);
                }).orElseThrow(() -> new UserNotFoundException("user id-" + id));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        userRepository.deleteById(id);
    }

}
