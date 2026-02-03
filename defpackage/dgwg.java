package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.List;
import java.util.Timer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgwg {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final dhik b = new dhik();
    public final Timer c = new Timer(true);
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    final dgwe a(String str, dgwe dgweVar) {
        for (dgwe dgweVar2 : this.a.values()) {
            if (dgweVar2 != dgweVar && dhjv.A(str, dgweVar2.y())) {
                return dgweVar2;
            }
        }
        return null;
    }

    final List b(dgvq dgvqVar) {
        List list = (List) this.b.get(dgvqVar);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final void c(dgwe dgweVar) {
        boolean zRemove;
        dgvq dgvqVar = dgweVar.i;
        dgvqVar.getClass();
        dhik dhikVar = this.b;
        List list = (List) dhikVar.get(dgvqVar);
        if (list != null) {
            boolean z = false;
            do {
                zRemove = list.remove(dgweVar);
                z |= zRemove;
            } while (zRemove);
            if (list.size() == 0) {
                dhikVar.remove(dgvqVar);
            }
            if (z) {
                return;
            }
        }
        dhja.q("Unable to remove session: %s", dgweVar);
    }
}
