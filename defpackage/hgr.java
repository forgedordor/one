package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hgr extends jbi {
    public long a;
    public long b;
    public ind c;
    public ind d;
    public float e;
    public float f;
    public float g;
    public ddp j;
    public fdlr k;
    public final hic h = new hic();
    public final hib i = new hib();
    public final hrg m = new hpf(0.0f);
    public int l = -1;

    public hgr(long j, long j2, ind indVar, ind indVar2, float f, float f2, float f3) {
        this.a = j;
        this.b = j2;
        this.c = indVar;
        this.d = indVar2;
        this.e = f;
        this.f = f2;
        this.g = f3;
    }

    public abstract void a();

    public abstract void e();

    public final void f() {
        int i;
        g();
        if (this.C && fdjy.g(E()) && h()) {
            if (Float.compare(this.g, 0.0f) <= 0 || Float.compare(this.f, 0.0f) <= 0 || (i = this.l) <= 0) {
                this.m.h(0.0f);
                return;
            }
            int iF = fddu.f(Math.round((this.f / this.g) * 1000.0f * i), 50);
            float fC = this.m.c();
            this.j = ddq.a(fC);
            this.k = fdil.d(E(), null, null, new hgq(this, fC, iF, null), 3);
        }
    }

    public final void g() {
        fdlr fdlrVar = this.k;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        this.k = null;
        this.j = null;
    }

    protected abstract boolean h();
}
