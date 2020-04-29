package chess.model.domain.board;

import chess.model.domain.piece.Bishop;
import chess.model.domain.piece.King;
import chess.model.domain.piece.Knight;
import chess.model.domain.piece.Pawn;
import chess.model.domain.piece.Piece;
import chess.model.domain.piece.Queen;
import chess.model.domain.piece.Rook;
import chess.model.domain.piece.Team;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BoardInitial {

    private static final int RANK_BLACK_PAWN_INIT = 7;
    private static final int RANK_WHITE_PAWN_INIT = 2;
    private static final Map<Square, Piece> INITIAL_BOARD;

    static {
        Map<Square, Piece> initialBoard = new HashMap<>();
        initialBoard.put(Square.of("a1"), Rook.getInstance(Team.WHITE));
        initialBoard.put(Square.of("h1"), Rook.getInstance(Team.WHITE));
        initialBoard.put(Square.of("a8"), Rook.getInstance(Team.BLACK));
        initialBoard.put(Square.of("h8"), Rook.getInstance(Team.BLACK));
        initialBoard.put(Square.of("b1"), Knight.getInstance(Team.WHITE));
        initialBoard.put(Square.of("g1"), Knight.getInstance(Team.WHITE));
        initialBoard.put(Square.of("b8"), Knight.getInstance(Team.BLACK));
        initialBoard.put(Square.of("g8"), Knight.getInstance(Team.BLACK));
        initialBoard.put(Square.of("c1"), Bishop.getInstance(Team.WHITE));
        initialBoard.put(Square.of("f1"), Bishop.getInstance(Team.WHITE));
        initialBoard.put(Square.of("c8"), Bishop.getInstance(Team.BLACK));
        initialBoard.put(Square.of("f8"), Bishop.getInstance(Team.BLACK));
        initialBoard.put(Square.of("d1"), Queen.getInstance(Team.WHITE));
        initialBoard.put(Square.of("d8"), Queen.getInstance(Team.BLACK));
        initialBoard.put(Square.of("e8"), King.getInstance(Team.BLACK));
        initialBoard.put(Square.of("e1"), King.getInstance(Team.WHITE));
        for (int i = 0; i < 8; i++) {
            char file = (char) ('a' + i);
            initialBoard.put(Square.of(String.valueOf(file) + RANK_BLACK_PAWN_INIT)
                , Pawn.getInstance(Team.BLACK));
            initialBoard.put(Square.of(String.valueOf(file) + RANK_WHITE_PAWN_INIT)
                , Pawn.getInstance(Team.WHITE));
        }
        INITIAL_BOARD = Collections.unmodifiableMap(initialBoard);
    }

    public Map<Square, Piece> getInitialize() {
        return new HashMap<>(INITIAL_BOARD);
    }
}
