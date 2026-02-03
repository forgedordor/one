package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcgp implements Runnable {
    final /* synthetic */ fcgq a;

    public fcgp(fcgq fcgqVar) {
        this.a = fcgqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fcgq fcgqVar = this.a;
        fcgx fcgxVar = fcgqVar.f.c;
        Collection collection = fcgxVar.x;
        if (collection != null) {
            collection.remove(fcgqVar);
            if (fcgxVar.x.isEmpty()) {
                fcgxVar.S.c(fcgxVar.y, false);
                fcgxVar.x = null;
                if (fcgxVar.B.get()) {
                    fcgxVar.A.a(fcgx.b);
                }
            }
        }
    }
}
