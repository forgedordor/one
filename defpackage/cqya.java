package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqya implements Runnable {
    final /* synthetic */ cqyk a;

    public cqya(cqyk cqykVar) {
        this.a = cqykVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        oeg oegVar = this.a.a;
        oegVar.d();
        oer oerVar = oegVar.g;
        if (oerVar == null) {
            oegVar.b();
            return;
        }
        try {
            synchronized (oerVar.p) {
                if (!oerVar.x) {
                    oerVar.c();
                    oerVar.f.g(4, 1, null).b();
                    mem memVar = oerVar.l;
                    memVar.b();
                    memVar.f();
                    RuntimeException runtimeException = oerVar.u;
                    if (runtimeException != null) {
                        throw runtimeException;
                    }
                }
            }
            oegVar.b();
        } finally {
            odj odjVar = new odj();
            int iA = oegVar.a(odjVar);
            oegVar.g = null;
            if (oegVar.e()) {
                i = iA == 2 ? odjVar.a : -1;
                obz obzVar = oegVar.k;
                mee.f(obzVar);
                obzVar.d(i);
            }
        }
    }
}
