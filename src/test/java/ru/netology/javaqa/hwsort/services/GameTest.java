package ru.netology.javaqa.hwsort.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    public void shouldWhenFirstPlayerWin() {
        Player p1 = new Player(1, "Миша", 25);
        Player p2 = new Player(2, "Катя", 118);
        Game game = new Game();

        game.register(p1);
        game.register(p2);

        int actual = game.round("Катя", "Миша");
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldWhenSecondPlayerWin() {
        Player p1 = new Player(1, "Миша", 125);
        Player p2 = new Player(2, "Катя", 118);
        Game game = new Game();

        game.register(p1);
        game.register(p2);

        int actual = game.round("Катя", "Миша");
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldWhenDraw() {
        Player p1 = new Player(1, "Миша", 118);
        Player p2 = new Player(2, "Катя", 118);
        Game game = new Game();

        game.register(p1);
        game.register(p2);

        int actual = game.round("Катя", "Миша");
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFirstPlayerNotExist() {
        Player p1 = new Player(1, "Миша", 118);
        Player p2 = new Player(2, "Катя", 118);
        Game game = new Game();

        game.register(p1);
        game.register(p2);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Иван", "Катя");
        });
    }

    @Test
    public void shouldSecondPlayerNotExist() {
        Player p1 = new Player(1, "Миша", 118);
        Player p2 = new Player(2, "Катя", 118);
        Game game = new Game();

        game.register(p1);
        game.register(p2);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Миша", "Егор");
        });
    }

    @Test
    public void shouldNobodyPlayerNotExist() {
        Player p1 = new Player(1, "Миша", 118);
        Player p2 = new Player(2, "Катя", 118);
        Game game = new Game();

        game.register(p1);
        game.register(p2);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Иван", "Егор");
        });
    }
}
