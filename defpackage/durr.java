package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class durr {
    private final dtpi a;
    private final Random b;

    public durr(dtpi dtpiVar, Random random) {
        this.a = dtpiVar;
        this.b = random;
    }

    public static final boolean b(long j, long j2) {
        return j % j2 == 0;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [duru, java.lang.Object] */
    public final ListenableFuture a(final long j, ejwi ejwiVar) {
        if (j == 0) {
            return eork.i(ejud.a);
        }
        if (j < 0) {
            durt.g("Bad sample interval (negative number): %d", Long.valueOf(j));
            return eork.i(ejud.a);
        }
        if (this.a.K() && ejwiVar.g()) {
            return dvaq.e(ejwiVar.c().f()).f(new ejvr() { // from class: durq
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    long j2 = j;
                    dtsf dtsfVar = (dtsf) obj;
                    boolean z = 100 % j2 != 0;
                    if (z) {
                        durt.g("Bad sample interval (1 percent cohort will not log): %d", Long.valueOf(j2));
                    }
                    if (!durr.b(dtsfVar.c, j2)) {
                        return ejud.a;
                    }
                    eoki eokiVar = (eoki) eokj.a.createBuilder();
                    eokiVar.copyOnWrite();
                    eokj eokjVar = (eokj) eokiVar.instance;
                    eokjVar.b |= 1;
                    eokjVar.c = true;
                    evvp evvpVar = dtsfVar.d;
                    if (evvpVar == null) {
                        evvpVar = evvp.a;
                    }
                    long jA = evxc.a(evvpVar);
                    eokiVar.copyOnWrite();
                    eokj eokjVar2 = (eokj) eokiVar.instance;
                    eokjVar2.b |= 2;
                    eokjVar2.d = jA;
                    boolean zB = durr.b(dtsfVar.c, 100L);
                    eokiVar.copyOnWrite();
                    eokj eokjVar3 = (eokj) eokiVar.instance;
                    eokjVar3.b |= 4;
                    eokjVar3.e = zB;
                    eokiVar.copyOnWrite();
                    eokj eokjVar4 = (eokj) eokiVar.instance;
                    eokjVar4.b |= 8;
                    eokjVar4.f = z;
                    return ejwi.j((eokj) eokiVar.build());
                }
            }, eoqg.a);
        }
        if (j == 0 || !b(this.b.nextLong(), j)) {
            return eork.i(ejud.a);
        }
        eoki eokiVar = (eoki) eokj.a.createBuilder();
        eokiVar.copyOnWrite();
        eokj eokjVar = (eokj) eokiVar.instance;
        eokjVar.b |= 1;
        eokjVar.c = false;
        return eork.i(ejwi.j((eokj) eokiVar.build()));
    }
}
