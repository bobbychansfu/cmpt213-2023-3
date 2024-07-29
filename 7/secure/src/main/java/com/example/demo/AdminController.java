package com.example.demo;
import org.springframework.http.HttpHeaders;
// import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
// import org.springframework.security.access.annotation.Secured;
// import org.springframework.security.core.Authentication;
// import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    
    @GetMapping("/admin/secureAPI")
    public ResponseEntity securedApi(@RequestHeader HttpHeaders headers) {
        return new ResponseEntity<>("Authentication passed - secure data", HttpStatus.OK);
    }

    @GetMapping("/public/openAPI")
    public ResponseEntity publicApi(@RequestHeader HttpHeaders headers) {
        return new ResponseEntity("public data", HttpStatus.OK);
    }
}
