function jiSuan() {
    var qszj = getNumber("qszj");
    var mnsy = getNumber("mnsy") / 100;
    var flns = getNumber("flns");
    var mnzjzj = getNumber("mnzjzj")

    var bjh = qszj + (flns - 1) * mnzjzj;
    var bxh = fuLi(qszj, mnsy, flns);
    for (var i = 1; i < flns; ++i) {
        bxh = bxh + fuLi(mnzjzj, mnsy, flns - i);
    }
    var lxh = bxh - bjh;

    setValue("bjh", bjh);
    setValue("lxh", lxh);
    setValue("bxh", bxh);

}

function fuLi(p, r, n) {
    var F = Math.pow(1 + r, n) * p;
    return F;
}

function getNumber(id) {
    return parseFloat(document.getElementById(id).value);
}

function setValue(id, value) {
    document.getElementById(id).value = value;
}