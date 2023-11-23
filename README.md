# flax_practice
アーキテクチャ：FLUX
Repository：
 ・API値の取得、保存のみで加工NG
 ・DB（アプリ保存値）
Action/ActionCreator
 ・1ActionのClass
 ・Repositoryからの値を加工してDispatcherに渡す
Dispatcher
 ・ActionからStoreへ流す
Store
 ・Dispatcherで受け取った値の保持、ViewModelへ流すのみで加工NG
ViewModel
 ・1Activity1ViewModel
 ・Actionへの値request、Store値の購読
