package org.example.socket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Component
@ServerEndpoint(value="/websocketServer/{userId}")
@Slf4j
public class MyWebSocket {

    private Session session;

    private static Map<String,MyWebSocket> userMap = new ConcurrentHashMap<>();

    @OnOpen
    public void onOpen(Session session,@PathParam("userId") String userId) {
        this.session = session;
        userMap.put(userId,this);
        log.info("【websocket消息】有新的连接, 总数:{}", userMap.size());
    }

    @OnClose
    public void onClose(@PathParam("userId") String userId) {
        userMap.remove(userId);
        log.info("【websocket消息】连接断开, 总数:{}", userMap.size());
    }

    @OnMessage
    public void onMessage(String message, @PathParam("userId") String userId) {
        sendMessageTo(message,userId);
        log.info("【websocket消息】收到客户端发来的消息:{}", message);
    }

    /**
     * 发送给所有已连接
     * @param message
     */
    public static void sendMessage(String message) {
        Set<String> keys = userMap.keySet();
        for (String key : keys) {
            try {
                userMap.get(key).session.getBasicRemote().sendText(message);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 指定userId发送
     * @param message
     * @param userId
     */
    public void sendMessageTo(String message,String userId){
        if (userMap.containsKey(userId)) {
            userMap.get(userId).session.getAsyncRemote().sendText(message);
        }
    }
}
