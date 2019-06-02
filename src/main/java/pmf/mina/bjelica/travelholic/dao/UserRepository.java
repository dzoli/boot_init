package pmf.mina.bjelica.travelholic.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pmf.mina.bjelica.travelholic.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
