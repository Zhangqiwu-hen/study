function sc() {
    var x1 = document.getElementById("dm").value;
    var x2 = document.getElementById("gslx").value;
    var x3 = document.getElementById("gsmc").value;
    var x4 = document.getElementById("lbxm").value;
    var x5 = document.getElementById("money").value;
    var x6 = document.getElementById("cp").value;
    var x7 = document.getElementById("jgjldw").value;
    var result = x1 + "最大" + x2 + x3 + "倒闭了，王八蛋老板" + x4 + "吃喝嫖赌，欠下了" + x5 + "个亿，带着他的小姨子跑了!我们没有办法，拿着"
        + x6 + "抵工资!原价都是一" + x7 + "多、两" + x7 + "多、三" + x7 + "多的" + x6 + "，现在全部只卖二十块，统统只要二十块!" + x4 +
        "王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱!";
    document.getElementById("result").value = result;
}
