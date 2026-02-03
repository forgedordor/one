package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcfh implements Runnable {
    final /* synthetic */ fcfk a;

    public fcfh(fcfk fcfkVar) {
        this.a = fcfkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        long jNextLong;
        fcfk fcfkVar = this.a;
        synchronized (fcfkVar) {
            fcfkVar.f = null;
            int i = fcfkVar.k;
            z = true;
            if (i == 2) {
                fcfkVar.k = 4;
                fcfkVar.e = fcfkVar.c.schedule(fcfkVar.g, fcfkVar.j, TimeUnit.NANOSECONDS);
                z2 = true;
            } else {
                if (i == 3) {
                    fcfkVar.f = fcfkVar.c.schedule(fcfkVar.h, fcfkVar.i - fcfkVar.d.a(TimeUnit.NANOSECONDS), TimeUnit.NANOSECONDS);
                    fcfkVar.k = 2;
                }
                z2 = false;
            }
        }
        if (z2) {
            fcfj fcfjVar = this.a.l;
            fcbc fcbcVar = fcfjVar.a;
            fcfi fcfiVar = new fcfi(fcfjVar);
            Object obj = ((fcpj) fcbcVar).m;
            eoqg eoqgVar = eoqg.a;
            synchronized (obj) {
                ejwl.l(((fcpj) fcbcVar).k != null);
                if (((fcpj) fcbcVar).u) {
                    ((fcpj) fcbcVar).b();
                    fcee.b(fcfiVar, eoqgVar);
                    return;
                }
                fcee fceeVar = ((fcpj) fcbcVar).t;
                if (fceeVar != null) {
                    jNextLong = 0;
                    z = false;
                } else {
                    jNextLong = ((fcpj) fcbcVar).h.nextLong();
                    ejxm ejxmVar = new ejxm();
                    ejxmVar.f();
                    fcee fceeVar2 = new fcee(jNextLong, ejxmVar);
                    ((fcpj) fcbcVar).t = fceeVar2;
                    ((fcpj) fcbcVar).I.f++;
                    fceeVar = fceeVar2;
                }
                if (z) {
                    ((fcpj) fcbcVar).k.e(false, (int) (jNextLong >>> 32), (int) jNextLong);
                }
                synchronized (fceeVar) {
                    if (fceeVar.d) {
                        fcee.a(eoqgVar, fceeVar.e != null ? new fced(fcfiVar) : new fcec());
                    } else {
                        fceeVar.c.put(fcfiVar, eoqgVar);
                    }
                }
            }
        }
    }
}
