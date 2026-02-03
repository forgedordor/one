package defpackage;

import androidx.car.app.model.Alert;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jdm extends iyl implements ixk, jak, jdz {
    public final jcw f;
    public boolean g;
    public boolean j;
    public boolean k;
    public kil l;
    public fdap n;
    public ini o;
    public boolean s;
    public boolean v;
    private boolean y;
    public int h = Alert.DURATION_SHOW_INDEFINITELY;
    public int i = Alert.DURATION_SHOW_INDEFINITELY;
    public int w = 3;
    public long m = 0;
    public int x = 3;
    public final jaj p = new jcz(this);
    public final hum q = new hum(new jdm[16]);
    public boolean r = true;
    public boolean t = true;
    public Object u = p().r;

    public jdm(jcw jcwVar) {
        this.f = jcwVar;
    }

    private final void G() {
        int i = this.x;
        if (B()) {
            this.x = 2;
        } else {
            this.x = 1;
        }
        if (i != 1 && this.f.d) {
            jcr.aw(o(), true, 6);
        }
        hum humVarQ = o().q();
        Object[] objArr = humVarQ.a;
        int i2 = humVarQ.b;
        for (int i3 = 0; i3 < i2; i3++) {
            jcr jcrVar = (jcr) objArr[i3];
            jdm jdmVarU = jcrVar.u();
            if (jdmVarU == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (jdmVarU.i != Integer.MAX_VALUE) {
                jdmVarU.G();
                jcrVar.ad(jcrVar);
            }
        }
    }

    private final void H() {
        int i;
        jcr.aw(o(), false, 7);
        jcr jcrVarS = o().s();
        if (jcrVarS == null || o().C != 3) {
            return;
        }
        jcr jcrVarO = o();
        int iAC = jcrVarS.aC();
        int i2 = iAC - 1;
        if (iAC == 0) {
            throw null;
        }
        if (i2 != 0) {
            i = 2;
            if (i2 != 2) {
                i = jcrVarS.C;
            }
        } else {
            i = 1;
        }
        jcrVarO.C = i;
    }

    private final boolean I() {
        return this.f.e;
    }

    public final void A(boolean z) {
        this.f.f = z;
    }

    public final boolean B() {
        return this.f.c;
    }

    public final boolean C(long j) throws Throwable {
        kil kilVar;
        jcr jcrVarO = o();
        try {
            if (o().B) {
                itw.c("measure is called on a deactivated node");
            }
            jcr jcrVarS = o().s();
            o().u = o().u || (jcrVarS != null && jcrVarS.u);
            if (!o().am() && (kilVar = this.l) != null && kil.g(kilVar.a, j)) {
                jfh jfhVar = o().k;
                if (jfhVar != null) {
                    jfhVar.o(o(), true);
                }
                o().af();
                return false;
            }
            this.l = new kil(j);
            z(j);
            this.p.f = false;
            j(jdl.a);
            long j2 = this.y ? this.c : -9223372034707292160L;
            this.y = true;
            jdf jdfVarC = q().C();
            if (jdfVarC == null) {
                itw.d("Lookahead result from lookaheadRemeasure cannot be null");
            }
            jdm jdmVar = this.f.p;
            if (jdmVar != null) {
                jdmVar.F(2);
                jdmVar.f.d = false;
                ((AndroidComposeView) jcv.a(jdmVar.o())).A.c(jdmVar.o(), true, new jdj(jdmVar, j));
                jdmVar.u(true);
                jdmVar.A(true);
                if (jcx.a(jdmVar.o())) {
                    jdmVar.p().r();
                } else {
                    jdmVar.p().s();
                }
                jdmVar.F(5);
            }
            y((jdfVarC.b & 4294967295L) | (jdfVarC.a << 32));
            if (((int) (j2 >> 32)) == jdfVarC.a) {
                if (((int) (j2 & 4294967295L)) == jdfVarC.b) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            jcrVarO.az(th);
            throw new fcta();
        }
    }

    public final void D(long j, fdap fdapVar, ini iniVar) throws Throwable {
        jcr jcrVarO = o();
        try {
            jcr jcrVarS = o().s();
            if (jcrVarS != null && jcrVarS.aC() == 4) {
                this.f.c = false;
            }
            if (o().B) {
                itw.c("place is called on a deactivated node");
            }
            F(4);
            this.k = true;
            this.v = false;
            if (!kjb.f(j, this.m)) {
                jcw jcwVar = this.f;
                if (jcwVar.m || jcwVar.l) {
                    u(true);
                }
                s();
            }
            jfh jfhVarA = jcv.a(o());
            if (I() || !n()) {
                this.f.k(false);
                this.p.g = false;
                ((AndroidComposeView) jfhVarA).A.a(o(), true, new jdk(this, jfhVarA, j));
            } else {
                jdf jdfVarC = q().C();
                jdfVarC.getClass();
                jdfVarC.C(kjb.d(j, jdfVarC.e));
                t();
            }
            this.m = j;
            this.n = fdapVar;
            this.o = iniVar;
            F(5);
        } catch (Throwable th) {
            jcrVarO.az(th);
            throw new fcta();
        }
    }

    public final int E() {
        return this.f.q;
    }

    public final void F(int i) {
        this.f.q = i;
    }

    @Override // defpackage.jdz
    public final void U(boolean z) {
        jdf jdfVarC;
        jdf jdfVarC2 = q().C();
        if (fdbq.f(Boolean.valueOf(z), jdfVarC2 != null ? Boolean.valueOf(jdfVarC2.j) : null) || (jdfVarC = q().C()) == null) {
            return;
        }
        jdfVarC.j = z;
    }

    @Override // defpackage.ivt
    public final int a(int i) {
        H();
        jdf jdfVarC = q().C();
        jdfVarC.getClass();
        return jdfVarC.a(i);
    }

    @Override // defpackage.ivt
    public final int b(int i) {
        H();
        jdf jdfVarC = q().C();
        jdfVarC.getClass();
        return jdfVarC.b(i);
    }

    @Override // defpackage.ivt
    public final int c(int i) {
        H();
        jdf jdfVarC = q().C();
        jdfVarC.getClass();
        return jdfVarC.c(i);
    }

    @Override // defpackage.ivt
    public final int d(int i) {
        H();
        jdf jdfVarC = q().C();
        jdfVarC.getClass();
        return jdfVarC.d(i);
    }

    @Override // defpackage.ixk
    public final iyl e(long j) {
        jcr jcrVarS;
        jcr jcrVarS2 = o().s();
        int i = 2;
        if ((jcrVarS2 != null && jcrVarS2.aC() == 2) || ((jcrVarS = o().s()) != null && jcrVarS.aC() == 4)) {
            this.f.b = false;
        }
        jcr jcrVarO = o();
        jcr jcrVarS3 = jcrVarO.s();
        if (jcrVarS3 != null) {
            if (this.w != 3 && !jcrVarO.u) {
                itw.d("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iAC = jcrVarS3.aC();
            int i2 = iAC - 1;
            if (iAC == 0) {
                throw null;
            }
            if (i2 == 0 || i2 == 1) {
                i = 1;
            } else if (i2 != 2 && i2 != 3) {
                int iAC2 = jcrVarS3.aC();
                Objects.toString(jcn.a(iAC2));
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(jcn.a(iAC2)));
            }
            this.w = i;
        } else {
            this.w = 3;
        }
        if (o().C == 3) {
            o().I();
        }
        C(j);
        return this;
    }

    @Override // defpackage.iyl
    protected final void ef(long j, float f, fdap fdapVar) throws Throwable {
        D(j, fdapVar, null);
    }

    @Override // defpackage.ixq
    public final int ei(itz itzVar) {
        jcr jcrVarS = o().s();
        if (jcrVarS == null || jcrVarS.aC() != 2) {
            jcr jcrVarS2 = o().s();
            if (jcrVarS2 != null && jcrVarS2.aC() == 4) {
                this.p.d = true;
            }
        } else {
            this.p.c = true;
        }
        this.j = true;
        jdf jdfVarC = q().C();
        jdfVarC.getClass();
        int iEi = jdfVarC.ei(itzVar);
        this.j = false;
        return iEi;
    }

    @Override // defpackage.iyl, defpackage.ivt
    public final Object f() {
        return this.u;
    }

    @Override // defpackage.jak
    public final jaj g() {
        return this.p;
    }

    @Override // defpackage.jak
    public final jak h() {
        jcw jcwVar;
        jcr jcrVarS = o().s();
        if (jcrVarS == null || (jcwVar = jcrVarS.w) == null) {
            return null;
        }
        return jcwVar.p;
    }

    @Override // defpackage.jak
    public final jer i() {
        return o().w();
    }

    @Override // defpackage.jak
    public final void j(fdap fdapVar) {
        hum humVarQ = o().q();
        Object[] objArr = humVarQ.a;
        int i = humVarQ.b;
        for (int i2 = 0; i2 < i; i2++) {
            jdm jdmVar = ((jcr) objArr[i2]).w.p;
            jdmVar.getClass();
            fdapVar.invoke(jdmVar);
        }
    }

    @Override // defpackage.jak
    public final void k() {
        this.s = true;
        jaj jajVar = this.p;
        jajVar.g();
        if (I()) {
            hum humVarQ = o().q();
            Object[] objArr = humVarQ.a;
            int i = humVarQ.b;
            for (int i2 = 0; i2 < i; i2++) {
                jcr jcrVar = (jcr) objArr[i2];
                if (jcrVar.am() && jcrVar.aE() == 1) {
                    jcw jcwVar = jcrVar.w;
                    jdm jdmVar = jcwVar.p;
                    jdmVar.getClass();
                    kil kilVarC = jcwVar.c();
                    kilVarC.getClass();
                    if (jdmVar.C(kilVarC.a)) {
                        jcr.aw(o(), false, 7);
                    }
                }
            }
        }
        jdf jdfVar = ((jbx) i()).g;
        jdfVar.getClass();
        jcw jcwVar2 = this.f;
        if (jcwVar2.f || (!this.j && !jdfVar.l && I())) {
            u(false);
            int iE = E();
            F(4);
            jfh jfhVarA = jcv.a(o());
            jcwVar2.l(false);
            ((AndroidComposeView) jfhVarA).A.b(o(), true, new jdi(this, jdfVar));
            F(iE);
            if (jcwVar2.l && jdfVar.l) {
                l();
            }
            A(false);
        }
        if (jajVar.d) {
            jajVar.e = true;
        }
        if (jajVar.b && jajVar.j()) {
            jajVar.f();
        }
        this.s = false;
    }

    @Override // defpackage.jak
    public final void l() {
        o().ab(false);
    }

    @Override // defpackage.jak
    public final void m() {
        jcr.aw(o(), false, 7);
    }

    @Override // defpackage.jak
    public final boolean n() {
        return this.x != 3;
    }

    public final jcr o() {
        return this.f.a;
    }

    public final jdv p() {
        return this.f.o;
    }

    public final jer q() {
        return this.f.a();
    }

    public final void r(boolean z) {
        if (z) {
            if (B()) {
                return;
            }
        } else if (!B()) {
            return;
        }
        this.x = 3;
        hum humVarQ = o().q();
        Object[] objArr = humVarQ.a;
        int i = humVarQ.b;
        for (int i2 = 0; i2 < i; i2++) {
            jdm jdmVar = ((jcr) objArr[i2]).w.p;
            jdmVar.getClass();
            jdmVar.r(true);
        }
    }

    public final void s() {
        if (this.f.n > 0) {
            hum humVarQ = o().q();
            Object[] objArr = humVarQ.a;
            int i = humVarQ.b;
            for (int i2 = 0; i2 < i; i2++) {
                jcr jcrVar = (jcr) objArr[i2];
                jcw jcwVar = jcrVar.w;
                if ((jcwVar.l || jcwVar.m) && !jcwVar.e) {
                    jcrVar.ab(false);
                }
                jdm jdmVar = jcwVar.p;
                if (jdmVar != null) {
                    jdmVar.s();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            r4 = this;
            r0 = 1
            r4.v = r0
            jcr r1 = r4.o()
            jcr r1 = r1.s()
            int r2 = r4.x
            if (r2 == r0) goto L18
            boolean r3 = r4.B()
            if (r3 == 0) goto L1e
            r3 = 2
            if (r2 == r3) goto L2a
        L18:
            boolean r2 = r4.B()
            if (r2 == 0) goto L2a
        L1e:
            r4.G()
            boolean r2 = r4.g
            if (r2 == 0) goto L2a
            if (r1 == 0) goto L2a
            defpackage.jcr.av(r1)
        L2a:
            if (r1 == 0) goto L54
            boolean r2 = r4.g
            if (r2 != 0) goto L57
            int r2 = r1.aC()
            r3 = 3
            if (r2 == r3) goto L3e
            int r2 = r1.aC()
            r3 = 4
            if (r2 != r3) goto L57
        L3e:
            int r2 = r4.i
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r3) goto L4a
            java.lang.String r2 = "Place was called on a node which was placed already"
            defpackage.itw.d(r2)
        L4a:
            jcw r1 = r1.w
            int r2 = r1.g
            r4.i = r2
            int r2 = r2 + r0
            r1.g = r2
            goto L57
        L54:
            r0 = 0
            r4.i = r0
        L57:
            r4.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jdm.t():void");
    }

    public final void u(boolean z) {
        this.f.e = z;
    }

    @Override // defpackage.iyl
    public final int v() {
        jdf jdfVarC = q().C();
        jdfVarC.getClass();
        return jdfVarC.v();
    }

    @Override // defpackage.iyl
    public final int w() {
        jdf jdfVarC = q().C();
        jdfVarC.getClass();
        return jdfVarC.w();
    }

    @Override // defpackage.iyl
    public final void x(long j, float f, ini iniVar) throws Throwable {
        D(j, null, iniVar);
    }
}
