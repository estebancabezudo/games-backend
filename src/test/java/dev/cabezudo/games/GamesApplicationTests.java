package dev.cabezudo.games;

import org.junit.jupiter.api.Test;

class GamesApplicationTests {

    @Test
    void applicationStarts() {
        GamesApplication.main(new String[] { "--spring.main.web-application-type=none" });
    }
}
