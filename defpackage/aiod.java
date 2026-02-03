package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
class aiod implements ainv {
    private final String a;
    protected final String b;
    final /* synthetic */ aioe c;
    private final long d;
    private long e = -1;

    public aiod(aioe aioeVar, String str, String str2, long j) {
        this.c = aioeVar;
        this.b = str;
        this.a = str2;
        this.d = j;
    }

    @Override // defpackage.ainv
    public final long a() {
        return this.d;
    }

    @Override // defpackage.ainv
    public final String b() {
        return this.a;
    }

    @Override // defpackage.ainv
    public final boolean c() {
        aioe aioeVar = this.c;
        ConcurrentHashMap concurrentHashMap = aioeVar.c;
        long jA = aioeVar.e.a();
        String str = this.a;
        if (!concurrentHashMap.remove(str, this)) {
            cqbd cqbdVarD = aioe.a.d();
            cqbdVarD.I("already reported timer");
            cqbdVarD.A("histogramName", this.b);
            cqbdVarD.M("lookupKey", str);
            cqbdVarD.r();
            return false;
        }
        long j = jA - this.d;
        e(j);
        long j2 = this.e;
        cqbd cqbdVarD2 = (j2 == -1 || j < j2) ? aioe.a.d() : aioe.a.e();
        cqbdVarD2.M("key", str);
        cqbdVarD2.z("timer took", j);
        cqbdVarD2.r();
        return true;
    }

    @Override // defpackage.ainv
    public final /* synthetic */ void d(long j) {
        this.e = j;
    }

    protected void e(long j) {
        ((ains) this.c.d.b()).g(this.b, j);
    }
}
