package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcjx extends fbnm {
    long a;
    final /* synthetic */ fckp b;
    private final fckn c;

    public fcjx(fckp fckpVar, fckn fcknVar) {
        this.b = fckpVar;
        this.c = fcknVar;
    }

    @Override // defpackage.fbtg
    public final void c(long j) {
        fckp fckpVar = this.b;
        if (fckpVar.w.f != null) {
            return;
        }
        synchronized (fckpVar.q) {
            if (fckpVar.w.f == null) {
                fckn fcknVar = this.c;
                if (!fcknVar.b) {
                    long j2 = this.a + j;
                    this.a = j2;
                    long j3 = fckpVar.B;
                    if (j2 <= j3) {
                        return;
                    }
                    if (j2 > fckpVar.s) {
                        fcknVar.c = true;
                    } else {
                        long jA = fckpVar.r.a(j2 - j3);
                        fckpVar.B = this.a;
                        if (jA > fckpVar.t) {
                            fcknVar.c = true;
                        }
                    }
                    Runnable runnableT = fcknVar.c ? fckpVar.t(fcknVar) : null;
                    if (runnableT != null) {
                        runnableT.run();
                    }
                }
            }
        }
    }
}
