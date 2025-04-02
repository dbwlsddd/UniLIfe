package inhatc.hja.unilife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // ✅ 화면 반환용이므로 @Controller 사용
public class CalendarViewController {

    @GetMapping("/calendar")  // ✅ URL 매핑
    public String showCalendar(Model model) {
        return "calendar";  // templates/calendar.html 반환
    }
}
