package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hib {
    public float d;
    public float e;
    public ind g;
    public ind h;
    public float i;
    public float j;
    public boolean k;
    public final float[] l;
    public final float[] m;
    public final ikd n;
    public final ikd o;
    public final ikd p;
    public final ikd q;
    public float r;
    public final iim s;
    public final iim t;
    public float a = -1.0f;
    public float b = -1.0f;
    public long c = 9205357640488583168L;
    public float f = -1.0f;

    public hib() {
        ind indVar = new ind(0.0f, 0.0f, 0, 0, 31);
        this.g = indVar;
        this.h = indVar;
        this.l = iju.f();
        this.m = iju.f();
        this.n = new iik((byte[]) null);
        this.o = new iik((byte[]) null);
        this.p = new iik((byte[]) null);
        this.q = new iik((byte[]) null);
        this.s = iin.a();
        this.t = iin.a();
    }

    public static final void a(ikd ikdVar, long j, float[] fArr) {
        ikdVar.n(fArr);
        ikdVar.o(ihs.d(iia.b(j), ikdVar.b().a()));
    }
}
