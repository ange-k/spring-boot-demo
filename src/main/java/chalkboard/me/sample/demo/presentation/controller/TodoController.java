package chalkboard.me.sample.demo.presentation.controller;

import chalkboard.me.sample.demo.domain.todo.Todo;
import chalkboard.me.sample.demo.domain.todo.TodoRepository;
import lombok.RequiredArgsConstructor;  // lombokプラグイン。Eclipse, IntelijIDEA側のプラグインも必要
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *  アクセスの例
 *  curl "http://localhost:8080/v1/task?id=3"
 */
@RequestMapping("/v1")
@RestController // HTMLを返さないコントローラ。RESTはAPIの設計に関する固有名詞
@RequiredArgsConstructor    // コンストラクタインジェクションに必要.
public class TodoController {
    private final TodoRepository todoRepository; //DI
    @GetMapping("/task")
    public Todo findTodo(@RequestParam(name = "id") String id) {
        Todo todo = todoRepository.findTodo(id);
        return todo;
    }
}
