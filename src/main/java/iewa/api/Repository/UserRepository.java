package iewa.api.Repository;

import iewa.api.Model.BusinessOwner;
import iewa.api.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

   User findByEmail(String email);

}

