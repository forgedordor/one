package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class deo implements ddw {
    private final Object a;
    private final deh b;
    private final deh c;
    private final deh d;
    private final Object e;
    private final long f;
    private final dje g;
    private final dib h;

    public deo(dep depVar, dib dibVar, Object obj, deh dehVar) {
        dje djeVarA = depVar.a();
        this.g = djeVarA;
        this.h = dibVar;
        this.a = obj;
        deh dehVar2 = (deh) dibVar.a.invoke(obj);
        this.b = dehVar2;
        this.c = dei.a(dehVar);
        this.e = dibVar.b.invoke(djeVarA.a(dehVar2, dehVar));
        if (djeVarA.c == null) {
            djeVarA.c = dehVar2.c();
        }
        deh dehVar3 = djeVarA.c;
        if (dehVar3 == null) {
            fdbq.c("velocityVector");
            dehVar3 = null;
        }
        int iB = dehVar3.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            dez dezVar = djeVarA.a;
            dehVar2.a(i);
            jMax = Math.max(jMax, dezVar.d(dehVar.a(i)));
        }
        this.f = jMax;
        deh dehVarA = dei.a(this.g.b(jMax, this.b, dehVar));
        this.d = dehVarA;
        int iB2 = dehVarA.b();
        for (int i2 = 0; i2 < iB2; i2++) {
            deh dehVar4 = this.d;
            float fA = dehVar4.a(i2);
            float f = this.g.d;
            dehVar4.e(i2, fddu.e(fA, -f, f));
        }
    }

    @Override // defpackage.ddw
    public final long a() {
        return this.f;
    }

    @Override // defpackage.ddw
    public final deh b(long j) {
        return !ddv.a(this, j) ? this.g.b(j, this.b, this.c) : this.d;
    }

    @Override // defpackage.ddw
    public final Object c(long j) {
        if (ddv.a(this, j)) {
            return this.e;
        }
        dib dibVar = this.h;
        dje djeVar = this.g;
        deh dehVar = this.b;
        deh dehVar2 = this.c;
        if (djeVar.b == null) {
            djeVar.b = dehVar.c();
        }
        deh dehVar3 = djeVar.b;
        deh dehVar4 = null;
        if (dehVar3 == null) {
            fdbq.c("valueVector");
            dehVar3 = null;
        }
        int iB = dehVar3.b();
        for (int i = 0; i < iB; i++) {
            deh dehVar5 = djeVar.b;
            if (dehVar5 == null) {
                fdbq.c("valueVector");
                dehVar5 = null;
            }
            dehVar5.e(i, djeVar.a.c(j, dehVar.a(i), dehVar2.a(i)));
        }
        deh dehVar6 = djeVar.b;
        if (dehVar6 == null) {
            fdbq.c("valueVector");
        } else {
            dehVar4 = dehVar6;
        }
        return dibVar.b.invoke(dehVar4);
    }

    @Override // defpackage.ddw
    public final /* synthetic */ boolean d(long j) {
        return ddv.a(this, j);
    }

    @Override // defpackage.ddw
    public final boolean e() {
        return false;
    }

    @Override // defpackage.ddw
    public final dib f() {
        return this.h;
    }

    @Override // defpackage.ddw
    public final void g() {
    }
}
