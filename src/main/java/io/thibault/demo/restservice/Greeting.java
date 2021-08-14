package io.thibault.demo.restservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author thibault2705
 */
@Getter
@Setter
@AllArgsConstructor
public class Greeting {

    private final long id;

    private final String content;
    
}
