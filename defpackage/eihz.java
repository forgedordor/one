package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eihz implements eifp {
    final /* synthetic */ eifp a;

    public eihz(eifp eifpVar) {
        this.a = eifpVar;
    }

    @Override // defpackage.eifp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ecem.d(new Runnable() { // from class: eihy
            @Override // java.lang.Runnable
            public final void run() {
                Object obj = eiid.c;
                eifp eifpVar = this.a.a;
                synchronized (obj) {
                    if (fdbq.f(eiid.d, eifpVar)) {
                        eiid.d = null;
                    }
                }
            }
        }, 10000L);
    }
}
