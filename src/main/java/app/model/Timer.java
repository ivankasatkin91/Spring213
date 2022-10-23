package app.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Timer {

    private Long nanoTime = System.nanoTime();

    @Bean
    @Scope("Singleton") // Bean scope is "Singleton" by default - explicitly annotated in terms of good practice
    public Long getTime() {
        return nanoTime;
    }
}
