package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxzf {
    public dxzc a;
    private final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public dxzf() {
    }

    public final void a(dxze dxzeVar) {
        this.b.add(dxzeVar);
    }

    public final void b(dxze dxzeVar) {
        this.b.remove(dxzeVar);
    }

    public final void c(dxzc dxzcVar) {
        if (ecei.a(dxzcVar, this.a)) {
            return;
        }
        this.a = dxzcVar;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((dxze) it.next()).a();
        }
    }

    public dxzf(dxzc dxzcVar) {
        this.a = dxzcVar;
    }
}
