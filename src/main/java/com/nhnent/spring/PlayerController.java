package com.nhnent.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PlayerController {
    // TODO: 8. DAO 빈 주입
    @Autowired
    PlayerDao playerDao;

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

    // TODO: 9. `GET /players/{id}`
    @RequestMapping(value = "/players/{id}", method = RequestMethod.GET)
    public Player getPlayer(@PathVariable Long id) {
        return playerDao.selectPlayer(id);
    }

    @RequestMapping(value = "/players", method = RequestMethod.POST)
    public Long createPlayer(@RequestBody Player player) {
        return playerDao.insertPlayer(player);
    }

}
