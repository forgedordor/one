package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class deb implements hsf {
    public deh a;
    public long b;
    public long c;
    public boolean d;
    public final dib e;
    private final hox f;

    public deb(dib dibVar, Object obj, deh dehVar, long j, long j2, boolean z) {
        this.e = dibVar;
        this.f = new hpl(obj, hsi.a);
        this.a = dehVar != null ? dei.a(dehVar) : dec.a(dibVar, obj);
        this.b = j;
        this.c = j2;
        this.d = z;
    }

    @Override // defpackage.hsf
    public final Object a() {
        return this.f.a();
    }

    public final Object b() {
        return this.e.b.invoke(this.a);
    }

    public final void c(Object obj) {
        this.f.b(obj);
    }

    public final String toString() {
        return "AnimationState(value=" + a() + ", velocity=" + b() + ", isRunning=" + this.d + ", lastFrameTimeNanos=" + this.b + ", finishedTimeNanos=" + this.c + ')';
    }

    public /* synthetic */ deb(dib dibVar, Object obj, deh dehVar, int i) {
        this(dibVar, obj, (i & 4) != 0 ? null : dehVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
