package harhogefoo.service;

import harhogefoo.entitiy.TODO;
import harhogefoo.repository.TODORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author shinocchi.
 * Created on 2017/10/04.
 */
@Service
public class TODOService {
  @Autowired
  TODORepository todoRepository;

  public List<TODO> findAll() {
    return todoRepository.findAll();
  }
}
