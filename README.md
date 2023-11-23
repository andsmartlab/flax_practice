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
