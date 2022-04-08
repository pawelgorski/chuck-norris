package com.example.chucknorris.joke;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
@RequestMapping("/api")
public class JokeController {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @GetMapping("/joke")
    public Joke getJoke(RestTemplate restTemplate) {
        String url = "https://api.chucknorris.io/jokes/random";
        return restTemplate.getForObject(url, Joke.class);
    }

}
