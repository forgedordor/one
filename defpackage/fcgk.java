package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcgk implements Runnable {
    final /* synthetic */ fcgr a;

    public fcgk(fcgr fcgrVar) {
        this.a = fcgrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fcgr fcgrVar = this.a;
        fcgx fcgxVar = fcgrVar.c;
        if (fcgxVar.x == null) {
            AtomicReference atomicReference = fcgrVar.a;
            if (atomicReference.get() == fcgx.e) {
                atomicReference.set(null);
            }
            fcgxVar.A.a(fcgx.b);
        }
    }
}
