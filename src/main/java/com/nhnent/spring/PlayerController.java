package com.nhnent.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PlayerController {
    @RequestMapping(value = "/players", method = RequestMethod.GET)
    public List<Player> getPlayers() {
        Player player1 = new Player();
        player1.setId(1L);
        player1.setNick("player1");
        player1.setIp("127.0.0.1");

        Player player2 = new Player();
        player2.setId(2L);
        player2.setNick("player2");
        player2.setIp("192.168.0.1");

        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        return players;
    }

}
