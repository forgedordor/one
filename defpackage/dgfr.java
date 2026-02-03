package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgfr implements Runnable {
    final /* synthetic */ dgfs a;

    public dgfr(dgfs dgfsVar) {
        this.a = dgfsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dgfs dgfsVar = this.a;
        dhja.r(dgfsVar.b, "Server didn't respond to keep-alive, restarting IMS connection", new Object[0]);
        Iterator it = dgfsVar.g.iterator();
        while (it.hasNext()) {
            ((dgft) it.next()).b();
        }
    }
}
