// JPA 리포지토리

package inhatc.hja.unilife.repository;

import inhatc.hja.unilife.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
