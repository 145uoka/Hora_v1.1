// 登録処理
$('#register').click(function(){
    if(confirm('登録します。よろしいですか？')) {
        document.form.action += "/user/add/register";
        document.form.submit();
    } else {
        return false;
    }
});

$('.syncer-acdn').click(function() {
    var bef = "詳細内容を開く";
    var aft = "詳細内容を閉じる";
    // [target]と同じ名前のIDを持つ要素に[slideToggle()]を実行する
    $('#' + $(this).data('target')).slideToggle();

    // bef：閉じている、aft：開いている
    var nextChar = $(this).text() == aft ? bef : aft;
    $(this).text(nextChar);
});