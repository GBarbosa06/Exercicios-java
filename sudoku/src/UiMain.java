import java.util.stream.Stream;

import java.util.stream.Collectors;

import ui.custom.screen.MainScreen;

public class UiMain {

    public static void main(String[] args) {
        final var gameConfig = Stream.of(args)
                .collect(Collectors.toMap(k -> k.split(";")[0], v -> v.split(";")[1]));
        var mainsScreen = new MainScreen(gameConfig);
        mainsScreen.buildMainScreen();
    }
}
