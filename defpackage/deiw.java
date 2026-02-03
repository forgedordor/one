package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deiw implements degs {
    public final dehc a;
    public final Object b = new Object();
    public boolean c;
    private final deic d;
    private final deig e;

    public deiw(deic deicVar, dehc dehcVar) {
        this.d = deicVar;
        this.a = dehcVar;
        deig deigVar = new deig() { // from class: deiv
            @Override // defpackage.deig
            public final void a(deib deibVar) {
                deiw deiwVar = this.a;
                synchronized (deiwVar.b) {
                    if (deiwVar.c) {
                        return;
                    }
                    deir deirVar = new deir(deibVar);
                    dehc dehcVar2 = deiwVar.a;
                    dehcVar2.getClass();
                    dehcVar2.f(deirVar);
                }
            }
        };
        this.e = deigVar;
        deicVar.d(deigVar);
    }

    @Override // defpackage.degs
    public final Instant a() {
        degx degxVar;
        synchronized (this.b) {
            if (this.c) {
                throw new IllegalStateException("dispose() has been called");
            }
            degxVar = (degx) this.a.c();
        }
        if (degxVar == null) {
            return null;
        }
        return Instant.ofEpochMilli(degxVar.a().a);
    }

    protected final void finalize() throws Throwable {
        Object obj = this.b;
        synchronized (obj) {
            if (!this.c) {
                deht.a.n().q("TrustedTimeClientAdapter.finalize() causing dispose()");
                synchronized (obj) {
                    if (this.c) {
                        degc.c(null);
                    } else {
                        this.a.e();
                        this.c = true;
                        this.d.a();
                    }
                }
            }
        }
        super.finalize();
    }

    public final String toString() {
        String str;
        synchronized (this.b) {
            str = "TrustedTimeClientAdapter{internalTimeSignalSupplier=" + String.valueOf(this.d) + ", apiListenersManager=" + String.valueOf(this.a) + ", disposed=" + this.c + "}";
        }
        return str;
    }
}
