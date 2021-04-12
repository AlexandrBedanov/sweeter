package repos;

import domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRep {
    public interface UserRepository extends CrudRepository<Message, Integer> {

    }
}
