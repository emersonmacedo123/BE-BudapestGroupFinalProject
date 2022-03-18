package com.example.SittersProject.user.services;

import com.example.SittersProject.user.model.User;
import com.example.SittersProject.user.repository.PetHelpUserDetails;
import com.example.SittersProject.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    @Autowired
    private final UserRepository userRepository;

    //autowiring this creates a cyclic dependency on Web Config 
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User Not Found");
        }

        return new PetHelpUserDetails(user);
    }

    public boolean emailExists(String emailAddress) {
        return userRepository.findByEmailAddress(emailAddress) != null;
    }

    public User registerNewUser(User user) throws EmailExistsException {
        if (emailExists(user.getEmailAddress())) {
            throw new EmailExistsException("This email already exists.");
        }


        return userRepository.save(user);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }



}
