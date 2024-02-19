//클릭시 alert + 그대로
document.addEventListener('DOMContentLoaded', function() {
    var backLink = document.getElementById('backLink');
    var backLinkFooter = document.getElementById('backLinkFooter');
    var backLinkService = document.getElementById('backLinkService');


    backLink.addEventListener('click', function(event) {
        event.preventDefault();
        alert('현재 이용할 수 없는 서비스입니다.');
    });
    backLinkFooter.addEventListener('click', function(event) {
        event.preventDefault();
        alert('현재 이용할 수 없는 서비스입니다.');
    });
    backLinkService.addEventListener('click', function(event) {
        event.preventDefault();
        alert('현재 이용할 수 없는 서비스입니다.');
    });
})

