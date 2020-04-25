/*
 * Copyright (c) by censhare AG
 */
package guru.springframework.sfgjms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

/**
 * Simple message POJO
 *
 * @author Martin Wunderlich
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HelloWorldMessage implements Serializable {

    static final long serialVersionUID = 5475138755738996128L;

    private UUID id;
    private String message;
}
