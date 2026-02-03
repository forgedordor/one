package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drnp extends evsf implements evui {
    public drnp() {
        super(drnr.a);
    }

    public final void a(Map map) {
        copyOnWrite();
        drnr drnrVar = (drnr) this.instance;
        drnr drnrVar2 = drnr.a;
        evub evubVar = drnrVar.d;
        if (!evubVar.b) {
            drnrVar.d = evubVar.a();
        }
        drnrVar.d.putAll(map);
    }
}
