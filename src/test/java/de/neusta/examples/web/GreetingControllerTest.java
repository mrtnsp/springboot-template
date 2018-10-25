package de.neusta.examples.web;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GreetingControllerTest {

    @Test
    @DisplayName("content of the Greeting object ")
    void content() {

        GreetingController greetingController = new GreetingController();
        Greeting fritz = greetingController.greeting("Fritz");
        assertThat(fritz.getContent()).isEqualTo("Hello, Fritz!");

        Greeting franz = greetingController.greeting("Franz");
        assertThat(franz.getContent()).isEqualTo("Hello, Franz!");

    }

    @Test
    @DisplayName("id of the Greeting object should increase per instance")
    void id() {

        GreetingController greetingController = new GreetingController();

        Greeting fritz = greetingController.greeting("Fritz");
        assertThat(fritz.getId()).isEqualTo(1);

        Greeting franz = greetingController.greeting("Franz");
        assertThat(franz.getId()).isEqualTo(2);

        Greeting hans = new GreetingController().greeting("Hans");
        assertThat(hans.getId()).isEqualTo(1);
    }


}