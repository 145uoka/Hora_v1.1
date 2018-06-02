// 修正処理
$('#correct').click(function(){
    if(confirm('修正します。よろしいですか？')) {
        document.form.action = "../reservation/add.html";
        document.form.submit();
    } else {
        return false;
    }
});

$('.syncer-acdn').click(function() {
    var bef = "OFF";
    var aft = "ON";
    // [target]と同じ名前のIDを持つ要素に[slideToggle()]を実行する
    $('#' + $(this).data('target')).slideToggle();

    // bef：閉じている、aft：開いている
    var nextChar = $(this).text() == aft ? bef : aft;
    $(this).text(nextChar);
});