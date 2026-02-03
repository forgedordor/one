package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ola {
    public static final Map a = new LinkedHashMap();
    private final Map b = new LinkedHashMap();

    public final oky a(String str) {
        str.getClass();
        if (!okz.a(str)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        oky okyVar = (oky) this.b.get(str);
        if (okyVar != null) {
            return okyVar;
        }
        throw new IllegalStateException(a.a(str, "Could not find Navigator with name \"", "\". You must call NavController.addNavigator() for each navigation type."));
    }

    public final Map b() {
        return fcwa.l(this.b);
    }

    public final void c(oky okyVar) {
        String strB = okz.b(okyVar.getClass());
        if (!okz.a(strB)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        Map map = this.b;
        oky okyVar2 = (oky) map.get(strB);
        if (fdbq.f(okyVar2, okyVar)) {
            return;
        }
        if (okyVar2 != null && okyVar2.a) {
            throw new IllegalStateException(a.i(okyVar2, okyVar, "Navigator ", " is replacing an already attached "));
        }
        if (okyVar.a) {
            throw new IllegalStateException(a.h(okyVar, "Navigator ", " is already attached to another NavController"));
        }
    }
}
