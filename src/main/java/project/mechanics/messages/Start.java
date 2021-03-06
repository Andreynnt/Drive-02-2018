package project.mechanics.messages;

import project.mechanics.GameSession;
import project.websockets.Message;

public class Start extends Message {
    private final Payload payload;

    public Start(GameSession session, Long id) {
        this.payload = new Payload(session, id);
    }

    public static class Payload {
        private final Long userId1;
        private final Long userId2;
        private final Long userId;
        private final String opponentLogin;

        public Payload(GameSession newGame, Long userId) {
            this.userId1 = newGame.getUserId1();
            this.userId2 = newGame.getUserId2();
            this.userId = userId;
            final Long opponentId = userId.equals(userId1) ? userId2 : userId1;
            this.opponentLogin = newGame.getLoginById(opponentId);
        }

        public Long getUserId1() {
            return userId1;
        }

        public Long getUserId2() {
            return userId2;
        }

        public Long getUserId() {
            return userId;
        }

        public String getOpponentLogin() {
            return opponentLogin;
        }
    }

    public Payload getPayload() {
        return payload;
    }
}
