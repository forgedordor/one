package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abib implements abpm {
    public final AtomicReference a = new AtomicReference(new Runnable() { // from class: abia
        @Override // java.lang.Runnable
        public final void run() {
            throw new IllegalStateException("Cannot switch accounts; no runnable registered");
        }
    });

    @Override // defpackage.abpm
    public final eiju a(eppi eppiVar, eppj eppjVar) {
        ((Runnable) this.a.get()).run();
        eppr epprVar = eppr.a;
        eppjVar.copyOnWrite();
        eppl epplVar = (eppl) eppjVar.instance;
        eppl epplVar2 = eppl.a;
        epprVar.getClass();
        epplVar.c = epprVar;
        epplVar.b = 109;
        return eijx.e(eppjVar.build());
    }
}
