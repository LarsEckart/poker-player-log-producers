package org.leanpoker.player;

import com.fasterxml.jackson.databind.JsonNode;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class Player {

    private static final Logger log = getLogger(Player.class);

    static final String VERSION = "diff log config";

    public static int betRequest(JsonNode request) {
        log.info("hello world");
        log.info("Request: {}", request);
        return 0;
    }

    public static void showdown(JsonNode game) {
    }
}
