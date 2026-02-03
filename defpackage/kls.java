package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kls implements koa {
    private final iby a;
    private final long b;

    public kls(iby ibyVar, long j) {
        this.a = ibyVar;
        this.b = j;
    }

    @Override // defpackage.koa
    public final long a(kjd kjdVar, long j, kji kjiVar, long j2) {
        long jB = kjdVar.b();
        long jA = kjdVar.a();
        iby ibyVar = this.a;
        long jA2 = ibyVar.a(0L, (jB << 32) | (jA & 4294967295L), kjiVar);
        long jA3 = ibyVar.a(0L, j2, kjiVar);
        long j3 = jA3 >> 32;
        long j4 = jA3 & 4294967295L;
        kji kjiVar2 = kji.a;
        long jD = kjb.d(kjdVar.d(), jA2);
        int i = kjiVar == kjiVar2 ? 1 : -1;
        long j5 = this.b;
        return kjb.d(kjb.d(jD, ((-((int) j4)) & 4294967295L) | ((-((int) j3)) << 32)), ((kjb.a(j5) * i) << 32) | (kjb.b(j5) & 4294967295L));
    }
}
