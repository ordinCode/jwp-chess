package chess.controller;

import chess.view.InputView;
import chess.view.OutputView;

public class ChessController {
    public static void run() {
        String userInputToStart = InputView.inputGameState();
        if (InputView.START_COMMAND.equalsIgnoreCase(userInputToStart)) {
            //todo
        }
        OutputView.printGameEndMessage();
    }
}
