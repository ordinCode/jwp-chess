package chess.view;

import java.util.Scanner;

import static chess.controller.ChessController.END_COMMAND;
import static chess.controller.ChessController.START_COMMAND;

public class InputView {
    private static final String INPUT_MESSAGE_GAME_START = "> 체스 게임을 시작합니다.\n> 게임 시작은 start, 종료 end 명령을 입력하세요";
    private static final String ERROR_MESSAGE_INPUT_GAME_START = " start 혹은 end 를 입력하세요";

    private static final Scanner scanner = new Scanner(System.in);

    public static String inputGameState() {
        System.out.println(INPUT_MESSAGE_GAME_START);
        return validateInputGameState(scanner.nextLine());
    }

    private static String validateInputGameState(String gameState) {
        if (START_COMMAND.equalsIgnoreCase(gameState) || END_COMMAND.equalsIgnoreCase(gameState)) {
            return gameState;
        }
        throw new IllegalArgumentException(ERROR_MESSAGE_INPUT_GAME_START);
    }
}
