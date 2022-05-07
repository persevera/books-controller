package com.Model.config;

import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Configuration
public class HttpSessionConfig {
    private static final Map<Long, HttpSession> sessions = new ConcurrentHashMap<>();

    public static List<HttpSession> getActiveSessions() {
        return new ArrayList<>(sessions.values());
    }

    public static void add(Long userId, HttpSession session){
        sessions.put(userId, session);
    }

    public static void delete(Long userId){
        HttpSession httpSession = sessions.get(userId);
        if(httpSession != null){
            sessions.remove(userId);
            httpSession.invalidate();
        }
    }
}
