package defpackage;

import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhuc implements dhub {
    private final Map a;
    private final Optional b;

    public dhuc(Map map, Optional optional) {
        this.a = map;
        this.b = optional;
    }

    @Override // defpackage.dhub
    public final dhuh a(String str) {
        dhuy dhuyVar = (dhuy) this.a.get(str);
        if (dhuyVar == null) {
            dhuyVar = dhuy.a;
        }
        Object objB = fdct.b(this.b);
        if (true != dhuyVar.d) {
            objB = null;
        }
        return (dhuh) objB;
    }
}
