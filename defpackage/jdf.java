package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jdf extends jde implements ixk {
    private Map f;
    public final jer g;
    public long h = 0;
    public final ixa p = new ixa(this);
    public final cuq q;
    private ixn r;

    public jdf(jer jerVar) {
        this.g = jerVar;
        int i = cvf.a;
        this.q = new cuq((byte[]) null);
    }

    public final long A(jdf jdfVar, boolean z) {
        long jD = 0;
        jdf jdfVarC = this;
        while (!fdbq.f(jdfVarC, jdfVar)) {
            if (!jdfVarC.j || !z) {
                jD = kjb.d(jD, jdfVarC.h);
            }
            jer jerVar = jdfVarC.g.x;
            jerVar.getClass();
            jdfVarC = jerVar.C();
            jdfVarC.getClass();
        }
        return jD;
    }

    public final jak B() {
        jdm jdmVar = this.g.t.w.p;
        jdmVar.getClass();
        return jdmVar;
    }

    public final void C(long j) {
        if (!kjb.f(this.h, j)) {
            this.h = j;
            jdm jdmVar = L().w.p;
            if (jdmVar != null) {
                jdmVar.s();
            }
            W(this.g);
        }
        if (this.l) {
            return;
        }
        R(K());
    }

    public final void D(ixn ixnVar) {
        Map map;
        if (ixnVar != null) {
            y((ixnVar.k() << 32) | (ixnVar.j() & 4294967295L));
        } else {
            y(0L);
        }
        if (!fdbq.f(this.r, ixnVar) && ixnVar != null && ((((map = this.f) != null && !map.isEmpty()) || !ixnVar.m().isEmpty()) && !fdbq.f(ixnVar.m(), this.f))) {
            ((jdm) B()).p.e();
            Map linkedHashMap = this.f;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.f = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(ixnVar.m());
        }
        this.r = ixnVar;
    }

    @Override // defpackage.jde
    public final long I() {
        return this.h;
    }

    @Override // defpackage.jde
    public final ivy J() {
        return this.p;
    }

    @Override // defpackage.jde
    public final ixn K() {
        ixn ixnVar = this.r;
        if (ixnVar != null) {
            return ixnVar;
        }
        itw.b("LookaheadDelegate has not been measured yet when measureResult is requested.");
        throw new fcta();
    }

    @Override // defpackage.jde, defpackage.jdw
    public final jcr L() {
        return this.g.t;
    }

    @Override // defpackage.jde
    public final jde N() {
        jer jerVar = this.g.w;
        if (jerVar != null) {
            return jerVar.C();
        }
        return null;
    }

    @Override // defpackage.jde
    public final jde O() {
        jer jerVar = this.g.x;
        if (jerVar != null) {
            return jerVar.C();
        }
        return null;
    }

    @Override // defpackage.jde
    public final void T() {
        ef(this.h, 0.0f, null);
    }

    @Override // defpackage.jde
    public final boolean V() {
        return this.r != null;
    }

    public int a(int i) {
        throw null;
    }

    public int b(int i) {
        throw null;
    }

    public int c(int i) {
        throw null;
    }

    public int d(int i) {
        throw null;
    }

    @Override // defpackage.kio
    public final float ed() {
        return this.g.ed();
    }

    @Override // defpackage.kiy
    public final float ee() {
        return this.g.ee();
    }

    @Override // defpackage.iyl
    protected final void ef(long j, float f, fdap fdapVar) {
        C(j);
        if (this.k) {
            return;
        }
        t();
    }

    @Override // defpackage.jde, defpackage.ivu
    public final boolean ev() {
        return true;
    }

    @Override // defpackage.iyl, defpackage.ivt
    public final Object f() {
        return this.g.f();
    }

    @Override // defpackage.ivu
    public final kji q() {
        return this.g.q();
    }

    protected void t() {
        K().o();
    }

    public final long u() {
        return (this.a << 32) | (this.b & 4294967295L);
    }
}
