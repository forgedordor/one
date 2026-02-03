package defpackage;

import io.grpc.Status;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcka implements Runnable {
    final /* synthetic */ fckn a;
    final /* synthetic */ fckb b;

    public fcka(fckb fckbVar, fckn fcknVar) {
        this.a = fcknVar;
        this.b = fckbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fcjz fcjzVar;
        boolean z;
        fcko fckoVar;
        fckb fckbVar = this.b;
        fckp fckpVar = fckbVar.b;
        Object obj = fckpVar.q;
        synchronized (obj) {
            fcjzVar = null;
            if (fckbVar.a.c) {
                z = true;
            } else {
                fckpVar.w = fckpVar.w.a(this.a);
                if (fckpVar.z(fckpVar.w) && ((fckoVar = fckpVar.u) == null || fckoVar.a())) {
                    fcjzVar = new fcjz(obj);
                    fckpVar.E = fcjzVar;
                } else {
                    fckpVar.w = fckpVar.w.b();
                    fckpVar.E = null;
                }
                z = false;
            }
        }
        if (z) {
            fckn fcknVar = this.a;
            fcknVar.a.m(new fckm(this.b.b, fcknVar));
            fcknVar.a.c(Status.c.withDescription("Unneeded hedging"));
        } else {
            if (fcjzVar != null) {
                fckp fckpVar2 = this.b.b;
                fcjzVar.b(fckpVar2.m.schedule(new fckb(fckpVar2, fcjzVar), fckpVar2.o.b, TimeUnit.NANOSECONDS));
            }
            this.b.b.w(this.a);
        }
    }
}
