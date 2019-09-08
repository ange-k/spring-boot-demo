package chalkboard.me.sample.demo.domain.todo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter // Getterの作成
@NoArgsConstructor // 引数なしコンストラクタ
@AllArgsConstructor // すべての引数ありコンストラクタ
public class Todo {
    private String task;
    private String user;
}
