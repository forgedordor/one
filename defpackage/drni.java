package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drni extends evsf implements evui {
    public drni() {
        super(drnj.a);
    }

    public final void a(Map map) {
        copyOnWrite();
        drnj drnjVar = (drnj) this.instance;
        drnj drnjVar2 = drnj.a;
        evub evubVar = drnjVar.b;
        if (!evubVar.b) {
            drnjVar.b = evubVar.a();
        }
        drnjVar.b.putAll(map);
    }
}
