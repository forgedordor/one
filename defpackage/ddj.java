package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddj {
    public final hox a;
    public final hox b;
    public final hox c;
    public final hox d;

    public ddj(long j, long j2, long j3) {
        ihz ihzVar = new ihz(j);
        hsi hsiVar = hsi.a;
        this.a = new hpl(ihzVar, hsiVar);
        this.b = new hpl(new ihs(j2), hsiVar);
        this.c = new hpl(new ihs(j3), hsiVar);
        this.d = new hpl(new ihs(j2), hsiVar);
    }

    public final long a() {
        return ((ihs) this.d.a()).a;
    }

    public final long b() {
        return ((ihs) this.b.a()).a;
    }

    public final long c() {
        return ((ihz) this.a.a()).a;
    }

    public final long d() {
        return ((ihs) this.c.a()).a;
    }
}
