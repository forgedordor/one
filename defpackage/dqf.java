package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqf implements koa {
    private final fdae a;

    public dqf(final long j) {
        this.a = new fdae() { // from class: dqe
            @Override // defpackage.fdae
            public final Object invoke() {
                return new kjb(j);
            }
        };
    }

    @Override // defpackage.koa
    public final long a(kjd kjdVar, long j, kji kjiVar, long j2) {
        long j3 = ((kjb) this.a.invoke()).a;
        return (dqg.a(kjdVar.c + kjb.b(j3), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true) & 4294967295L) | (dqg.a(kjdVar.b + kjb.a(j3), (int) (j2 >> 32), (int) (j >> 32), kjiVar == kji.a) << 32);
    }
}
