package org.leanpoker.player;

import com.fasterxml.jackson.databind.JsonNode;
import org.slf4j.Logger;
import org.slf4j.MDC;

import static org.slf4j.LoggerFactory.getLogger;

public class Player {

    private static final Logger log = getLogger(Player.class);

    static final String VERSION = "extract game id";

    public static int betRequest(JsonNode request) {
        log.info("hello world");
        log.info("Request: {}", request);
        // get game_id
        String gameId = request.get("game_id").asText();
        MDC.put("game_id", gameId);
        return 0;
    }

    public static void showdown(JsonNode game) {
    }
}
