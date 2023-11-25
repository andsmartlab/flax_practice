# アーキテクチャ：FLUX

1. Repository
   - API値の取得、保存のみで、加工NG
   - DB（アプリ保存値）

2. Action/ActionCreator
   -やることにたいして1ActionのClassとする
   - Repositoryからの値を加工してDispatcherに渡す

3. Dispatcher
   - ActionからStoreへ流す

4. Store
   - Dispatcherで受け取った値の保持、ViewModelへ流すのみ
   - 値の加工はNG
   
5. ViewModel
   - 1Activity1ViewModel
   - Actionへの値request、Store値の購読

# API処理

1. Kotlin コルーチン
   - 非同期実行するコードを簡略化
   - [公式ref](https://developer.android.com/kotlin/coroutines?hl=ja)

2. Retrofit2
   - API通信の実装
   - Retrofit2-moshi-converterでjson Parseする？

3. Kotlin serialization
   - APIレスポンスのjsonをparseする
   - [公式ref](https://kotlinlang.org/docs/serialization.html#example-json-serialization)



# DB/値保存

1. realm
   - 実装予定

2. SharedPreference
   - DB保存に向かない分

# その他バージョン管理
1. Kotlin release
   - https://kotlinlang.org/docs/releases.html#release-details
