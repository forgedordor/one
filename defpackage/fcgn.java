package defpackage;

import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcgn implements Runnable {
    final /* synthetic */ fcgq a;
    final /* synthetic */ fcgr b;

    public fcgn(fcgr fcgrVar, fcgq fcgqVar) {
        this.a = fcgqVar;
        this.b = fcgrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fcgr fcgrVar = this.b;
        if (fcgrVar.a.get() != fcgx.e) {
            this.a.j();
            return;
        }
        fcgx fcgxVar = fcgrVar.c;
        if (fcgxVar.x == null) {
            fcgxVar.x = new LinkedHashSet();
            fcgxVar.S.c(fcgxVar.y, true);
        }
        fcgxVar.x.add(this.a);
    }
}
