# Hora_v1.1
<a id="index"></a>
## <a href="#index">目次</a>
- [環境構築方法](#environment)
  - [Eclipseにプロジェクトを作成する手順](#inport)
  - [DB作成方法手順](#db)
  - [サーバ作成方法手順](#server)
- [EclipseでのGit操作](#eclipse_git)
- [manage.batの操作](#manage_bat)
<a id="environment"></a>
## <a href="#environment">環境構築方法</a>  
<a id="inport"></a>
### <a href="#inport">Eclipseにプロジェクトを作成する手順</a>  
[手順]  
1.Eclipse のメニューの 「ファイル」 > 「インポート」 あるいは、パッケージ・エクスプローラ で右クリックメニューから インポート を選択。  
2.次に表示されるメニューから、Git の中にある Gitからプロジェクト を選択し、次へ。  
![インポート方法2](https://github.com/145uoka/Hora_v1.1/blob/Readme/README/inport/inport_1.png "インポート方法2")  
3. URIの複製 を選択し、次へ。  
![インポート方法3](https://github.com/145uoka/Hora_v1.1/blob/Readme/README/inport/inport_2.png "インポート方法3")  
4.URIを入力して、次へ。  
![インポート方法4](https://github.com/145uoka/Hora_v1.1/blob/Readme/README/inport/inport_3.png "インポート方法4")  
5.チェックアウトするブランチを選択し、次へ。  
![インポート方法4](https://github.com/145uoka/Hora_v1.1/blob/Readme/README/inport/inport_4.png "インポート方法4")  
6.任意のディレクトリを選択し、次へ。  
![インポート方法5](https://github.com/145uoka/Hora_v1.1/blob/Readme/README/inport/inport_5.png "インポート方法5")  
7. Import existing Eclipse projects(E)を選択し、次へ。  
![インポート方法6](https://github.com/145uoka/Hora_v1.1/blob/Readme/README/inport/inport_7.png "インポート方法6")  
8.「完了」。  
![インポート方法7](https://github.com/145uoka/Hora_v1.1/blob/Readme/README/inport/inport_8.png "インポート方法7")  
[目次に戻る](#index)  
<a id="db"></a>
### <a href="#db">DB作成方法手順</a>  
[手順]  
1.「スタート」>「プログラム」>「PostgreSQL9.3」>「pgADMINⅢ」を選択して、pgAdminⅢを起動。  
![DB作成方法1](https://github.com/145uoka/Hora_v1.1/blob/Readme/README/DB/DB_1.png "DB作成方法1")  
2.左の欄の「PostgreSQL 9.3(localhost 9.3)」上でダブルクリック あるいは 右クリックし、「接続」を選択。  
![DB作成方法2](https://github.com/145uoka/Hora_v1.1/blob/Readme/README/DB/DB_2.png "DB作成方法2")  
3.パスワードの入力を求められるのでパスワード入力。(パスワード保存がされていればパスワードは求められません。)  
![DB作成方法3](https://github.com/145uoka/Hora_v1.1/blob/Readme/README/DB/DB_3.png "DB作成方法3")  
4.左の欄のデータベースに「postgres」がなければ、左の欄のデータベース上で 右クリックし、「新しいデータベース...」を選択。  
![DB作成方法4](https://github.com/145uoka/Hora_v1.1/blob/Readme/README/DB/DB_4.png "DB作成方法4")  
5.名前に「postgres」を入力し、「OK」を選択。  
![DB作成方法5](https://github.com/145uoka/Hora_v1.1/blob/Readme/README/DB/DB_5.png "DB作成方法5")   
6.左の欄の「postgres」のスキーマに「hora」がなければ「postgres」 > 「スキーマ」上で右クリックし、「新しいデータベース...」を選択。  
![DB作成方法6](https://github.com/145uoka/Hora_v1.1/blob/Readme/README/DB/DB_6.png "DB作成方法6")   
7.名前に「hora」を入力し、「OK」を選択。  
![DB作成方法7](https://github.com/145uoka/Hora_v1.1/blob/Readme/README/DB/DB_7.png "DB作成方法7")  
8.eclipse上の「hora」プロジェクトから「hora」 > 「dbflute_hora」 > 「manage.bat」を選択。
![DB作成方法8](https://github.com/145uoka/Hora_v1.1/blob/Readme/README/DB/DB_8.png "DB作成方法8")  
9.「0」を入力し、「enter」を押下。  
![DB作成方法9](https://github.com/145uoka/Hora_v1.1/blob/Readme/README/DB/DB_9.png "DB作成方法9")  
10.「y」を入力し、「enter」を押下。
![DB作成方法10](https://github.com/145uoka/Hora_v1.1/blob/Readme/README/DB/DB_10.png "DB作成方法10")  
[目次に戻る](#index)  
<a id="server"></a>
### <a href="#server">サーバ作成方法手順</a>  
[手順]  
1.Eclipse上の「hora」プロジェクトの上で右クリックし、「実行」 > 「1サーバで実行(1)」を選択。  
![サーバ作成方法手順1](https://github.com/145uoka/Hora_v1.1/blob/Readme/README/server/server_1.png "サーバ作成方法手順1")    
2.  
3.  
4.  
[目次に戻る](#index)  
<a id="eclipse_git"></a>
## <a href="#eclipse_git">EclipseでのGit操作</a>  
<新規ブランチの作成>  
[手順]  
1.プロジェクトを右クリック  
2.チーム - 切り替え - 新規ブランチ  
3.ブランチ名を入力後、「完了」  
  
<ブランチのチェックアウト（切り替え）>  
[手順]  
1.プロジェクトを右クリック  
2.チーム - 切り替え - 新規ブランチ  
3.ブランチ名を入力後、「完了」  

＜ブランチのマージ＞  
[手順]  
1.プロジェクトを右クリック  
2.チーム - マージ  
3.マージしたいブランチを選択後、「マージ」  
[目次に戻る](#index)
<a id="manage_bat"></a>
## <a href="#manage_bat">manage.batの操作</a>  
[目次に戻る](#index)  
