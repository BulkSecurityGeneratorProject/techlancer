package project.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.domain.User;
import project.service.impl.UserService;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("users")
public class UsersProviderResource {

    private UserService userService;

    public UsersProviderResource(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers()
            .stream().filter(f -> Objects.nonNull(f.getProvider()) && f.getProvider()).collect(Collectors.toList()));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Optional<User>>> getUserById(@PathVariable Long id) {
       return ResponseEntity.ok(Optional.ofNullable(userService.findOne(id)));
    }

    @GetMapping(value = "/login")
    public ResponseEntity<User> login(@RequestParam String email, @RequestParam String password) {
        User user = userService.findOneByEmailAndPassword(email, password);
        if (Objects.nonNull(user)) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
