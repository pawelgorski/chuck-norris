package com.example.chucknorris.joke;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Joke {

    private String icon_url;
    private String id;
    private String url;
    private String value;

    @Override
    public String toString() {
        return "Joke{" +
                "icon_url='" + icon_url + '\'' +
                ", id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
