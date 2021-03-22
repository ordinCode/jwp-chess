package chess.controller;

import chess.view.InputView;
import chess.view.OutputView;

public class ChessController {
    public static final String END_COMMAND = "end";
    public static final String START_COMMAND = "start";

    public static void run() {
        String userInputToStart = InputView.inputGameState();
        if (START_COMMAND.equalsIgnoreCase(userInputToStart)) {
            //todo
        }
        OutputView.printGameEndMessage();
    }
}
