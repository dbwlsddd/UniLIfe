// 일정 관리 컨트롤러

package inhatc.hja.unilife.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController  // ✅ JSON 응답을 위한 API 컨트롤러
@RequestMapping("/api/calendar")
public class CalendarController {

    @GetMapping("/events")
    public Map<String, Object> getEvents() {
        return Map.of("message", "이벤트 데이터 반환");
    }
}

