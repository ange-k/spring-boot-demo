package chalkboard.me.sample.demo.infrastructure.todo;

import chalkboard.me.sample.demo.domain.todo.Todo;
import chalkboard.me.sample.demo.domain.todo.TodoRepository;
import org.springframework.stereotype.Repository;

@Repository // DIコンテナへの登録
public class TodoRepositoryImpl implements TodoRepository {
    @Override
    public Todo findTodo(String id) {
        return new Todo("test", id);
    }
}
