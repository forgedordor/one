package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
enum rzc {
    svg,
    a,
    circle,
    clipPath,
    defs,
    desc,
    ellipse,
    g,
    image,
    line,
    linearGradient,
    marker,
    mask,
    path,
    pattern,
    polygon,
    polyline,
    radialGradient,
    rect,
    solidColor,
    stop,
    style,
    SWITCH,
    symbol,
    text,
    textPath,
    title,
    tref,
    tspan,
    use,
    view,
    UNSUPPORTED;

    private static final Map G = new HashMap();

    public static rzc a(String str) {
        Map map = G;
        rzc rzcVar = (rzc) map.get(str);
        if (rzcVar != null) {
            return rzcVar;
        }
        if (str.equals("switch")) {
            rzc rzcVar2 = SWITCH;
            map.put(str, rzcVar2);
            return rzcVar2;
        }
        try {
            rzc rzcVar3 = (rzc) Enum.valueOf(rzc.class, str);
            if (rzcVar3 != SWITCH) {
                map.put(str, rzcVar3);
                return rzcVar3;
            }
        } catch (IllegalArgumentException unused) {
        }
        Map map2 = G;
        rzc rzcVar4 = UNSUPPORTED;
        map2.put(str, rzcVar4);
        return rzcVar4;
    }
}
