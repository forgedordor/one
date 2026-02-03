package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgw implements ddw {
    public Object a;
    public Object b;
    private final diw c;
    private deh d;
    private deh e;
    private final deh f;
    private long g;
    private deh h;
    private final dib i;

    public dgw(ddz ddzVar, dib dibVar, Object obj, Object obj2, deh dehVar) {
        this.c = ddzVar.a(dibVar);
        this.i = dibVar;
        this.a = obj2;
        this.b = obj;
        this.d = (deh) dibVar.a.invoke(obj);
        this.e = (deh) dibVar.a.invoke(obj2);
        this.f = dehVar != null ? dei.a(dehVar) : ((deh) dibVar.a.invoke(obj)).c();
        this.g = -1L;
    }

    @Override // defpackage.ddw
    public final long a() {
        long j = this.g;
        if (j >= 0) {
            return j;
        }
        long jA = this.c.a(this.d, this.e, this.f);
        this.g = jA;
        return jA;
    }

    @Override // defpackage.ddw
    public final deh b(long j) {
        if (!ddv.a(this, j)) {
            return this.c.d(j, this.d, this.e, this.f);
        }
        deh dehVar = this.h;
        if (dehVar != null) {
            return dehVar;
        }
        deh dehVarB = this.c.b(this.d, this.e, this.f);
        this.h = dehVarB;
        return dehVarB;
    }

    @Override // defpackage.ddw
    public final Object c(long j) {
        if (ddv.a(this, j)) {
            return this.a;
        }
        deh dehVarC = this.c.c(j, this.d, this.e, this.f);
        int iB = dehVarC.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(dehVarC.a(i))) {
                dgd.b("AnimationVector cannot contain a NaN. " + dehVarC + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.i.b.invoke(dehVarC);
    }

    @Override // defpackage.ddw
    public final /* synthetic */ boolean d(long j) {
        return ddv.a(this, j);
    }

    @Override // defpackage.ddw
    public final boolean e() {
        return this.c.e();
    }

    @Override // defpackage.ddw
    public final dib f() {
        return this.i;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.b + " -> " + this.a + ",initial velocity: " + this.f + ", duration: " + (a() / 1000000) + " ms,animationSpec: " + this.c;
    }

    public /* synthetic */ dgw(ddz ddzVar, dib dibVar, Object obj, Object obj2) {
        this(ddzVar, dibVar, obj, obj2, null);
    }

    @Override // defpackage.ddw
    public final void g() {
    }
}
