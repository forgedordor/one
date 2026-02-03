package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfua {
    private final evrj a;
    private final eywx b;

    public cfua(evrj evrjVar, eywx eywxVar) {
        this.a = evrjVar;
        this.b = eywxVar;
    }

    public final eywx a(cfse cfseVar, fbrg fbrgVar) {
        return (eywx) ((eywx) ((eywx) ((eywx) this.b.n(esoc.a, cfseVar.a)).j("gzip")).m(new fcrz(fbrgVar))).k(fbtm.a(evxd.c(this.a)), TimeUnit.NANOSECONDS);
    }
}
