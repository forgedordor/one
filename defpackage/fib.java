package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fib implements koa {
    private final iby a;
    private final fih b;
    private long c = 0;

    public fib(iby ibyVar, fih fihVar) {
        this.a = ibyVar;
        this.b = fihVar;
    }

    @Override // defpackage.koa
    public final long a(kjd kjdVar, long j, kji kjiVar, long j2) {
        long jA = this.b.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.c;
        }
        this.c = jA;
        return kjb.d(kjb.d(kjdVar.d(), kjc.c(jA)), this.a.a(j2, 0L, kjiVar));
    }
}
