package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpmc implements dplt, dpor, dplz {
    public final dfw a;
    public final dap b;
    public final dar c;
    private final long d;

    public dpmc(long j, dfw dfwVar) {
        this.d = j;
        this.a = dfwVar;
        icc iccVar = ibw.o;
        this.b = dpop.a(iccVar);
        this.c = dpop.b(iccVar);
    }

    @Override // defpackage.dplt
    public final long a() {
        return this.d;
    }

    @Override // defpackage.dplz
    public final boolean b() {
        throw null;
    }
}
