# WebApplicationTest2



-------------------------------------------------------------------  
WebApplicationTest1で作成したファイルをspringで作成する  
使用するフレームワーク  
★Webアプリフレームワーク  
SpringBoot, SpringSecurity, SprintMVC,Thymeleaf  
★ORM  
Hibernate  
★ビルドツール
Gradle 
★DB
PostgreSQL

2016/01/18  
securing webテンプレートを編集して  
今回実装する画面のみ作成(SQL等は省略)  

2016/01/19  
入力フォームの値を表示する処理を作成  
  
2016/01/21  
DBに接続する処理を追加。  
表示(findAll)、追加(saveAndFlush)、検索(findBy)に対応  
  
2016/01/22  
ログイン機能(仮)を追加  
  
2016/01/25  
ログイン機能を追加  
DBの設定をymlファイルに移行  


2016/01/27  
指摘箇所の修正  
1:DDLの作成、コミット  
2:Controllerの統合(Login関連とそれ以外)  
3:登録と検索処理用のmodelクラスを作成。Controllerから呼び出して実施する  
4:ymlにcreate dropを追加。Postgresのポート番号を5432に修正  
