package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddy {
    public final long a;
    public final hox b;
    public deh c;
    public long d;
    public long e;
    private final fdae f;
    private final hox g;
    private final dib h;

    public ddy(Object obj, dib dibVar, deh dehVar, long j, long j2, fdae fdaeVar) {
        this.h = dibVar;
        this.a = j2;
        this.f = fdaeVar;
        hsi hsiVar = hsi.a;
        this.b = new hpl(obj, hsiVar);
        this.c = dei.a(dehVar);
        this.d = j;
        this.e = Long.MIN_VALUE;
        this.g = new hpl(true, hsiVar);
    }

    public final Object a() {
        return this.b.a();
    }

    public final Object b() {
        return this.h.b.invoke(this.c);
    }

    public final void c() {
        e();
        this.f.invoke();
    }

    public final boolean d() {
        return ((Boolean) this.g.a()).booleanValue();
    }

    public final void e() {
        this.g.b(false);
    }
}
