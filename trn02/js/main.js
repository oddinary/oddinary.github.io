$(function () {
    //////////////////////////////////////////////////////////////////////////

    $('.top_banner i').on('click', function () {
        $('.top_banner').slideUp();
    })

    $('.main_slider').on('init reInit afterChange', function () {
        let current = $('.slick-current');
        current.addClass('on').siblings().removeClass('on');
    })

    $('.main_slider').slick({
        arrows: false,
        dots: true,
        autoplay: true,
        pauseOnHover: false,
        pauseOnFocus: false,

    })

    $('.movie .dec i:nth-of-type(1)').on('click', function () {
        $('.movie video').trigger('pause')
    })
    $('.movie .dec i:nth-of-type(2)').on('click', function () {
        $('.movie video').trigger('play')
    })

    $("#myMovie").YTPlayer({
        videoURL: 'https://youtu.be/s36WRbd3A_Y', containment: '.youtube', autoPlay: true, mute: true, startAt: 0, opacity: 1, showControls: false, playOnlyIfVisible: true
    });

    $('.youtube i:nth-of-type(1)').on('click', function () {
        $('#myMovie').YTPPause();
    })
    $('.youtube i:nth-of-type(2)').on('click', function () {
        $('#myMovie').YTPPlay();
    })

    $('.sub_slider').slick({
        arrows: false,
        infinite: true,
        slidesToShow: 5,
        slidesToScroll: 1,
        dots: true,
        pauseOnFocus: false,
    });


    $('.product i.xi-arrow-left').on('click', function () {
        $('.sub_slider').slick('slickPrev');
    })
    $('.product i.xi-arrow-right').on('click', function () {
        $('.sub_slider').slick('slickNext');
    })



    // $(".product i.xi-arrow-left").on("click", function () {
    //     $(".sub_slider").slick("slickPrev");
    // });
    // $(".product i.xi-arrow-right").on("click", function () {
    //     $(".sub_slider").slick("slickNext");
    // });

    //////////////////////////////////////////////////////////////////////////
})