package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpme implements dplt, dpor, dplz {
    public final dfw a;
    public final fdae b;
    public final dap c;
    public final dar d;
    private final long f;

    public dpme(long j, dfw dfwVar, fdae fdaeVar) {
        this.f = j;
        this.a = dfwVar;
        this.b = fdaeVar;
        icc iccVar = ibw.m;
        this.c = dpop.a(iccVar);
        this.d = dpop.b(iccVar);
    }

    @Override // defpackage.dplt
    public final long a() {
        return this.f;
    }

    @Override // defpackage.dplz
    public final boolean b() {
        throw null;
    }
}
