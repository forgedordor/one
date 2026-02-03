package defpackage;

import androidx.car.app.model.Alert;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jdv extends iyl implements ixk, jak, jdz {
    public float A;
    public boolean B;
    public fdap C;
    public ini D;
    public float F;
    private boolean H;
    private boolean M;
    public final jcw f;
    public boolean g;
    public boolean j;
    public boolean k;
    public boolean l;
    public fdap n;
    public ini o;
    public float p;
    public Object r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean y;
    public int h = Alert.DURATION_SHOW_INDEFINITELY;
    public int i = Alert.DURATION_SHOW_INDEFINITELY;
    public int G = 3;
    public long m = 0;
    public boolean q = true;
    public final jaj w = new jcs(this);
    private final hum I = new hum(new jdv[16]);
    public boolean x = true;
    public long z = kim.k(0, 0, 0, 15);
    private final fdae J = new jds(this);
    private final fdae K = new jdr(this);
    public long E = 0;
    private final fdae L = new jdt(this);

    public jdv(jcw jcwVar) {
        this.f = jcwVar;
    }

    private final jdm F() {
        return this.f.p;
    }

    private final void G() {
        boolean z = this.s;
        this.s = true;
        jcr jcrVarO = o();
        if (!z) {
            jcrVarO.w().as();
            if (jcrVarO.an()) {
                jcr.ay(jcrVarO, true, 6);
            } else if (jcrVarO.am()) {
                jcr.aw(jcrVarO, true, 6);
            }
        }
        jer jerVar = jcrVarO.w().w;
        for (jer jerVarX = jcrVarO.x(); !fdbq.f(jerVarX, jerVar) && jerVarX != null; jerVarX = jerVarX.w) {
            if (jerVarX.D) {
                jerVarX.am();
            }
        }
        hum humVarQ = jcrVarO.q();
        Object[] objArr = humVarQ.a;
        int i = humVarQ.b;
        for (int i2 = 0; i2 < i; i2++) {
            jcr jcrVar = (jcr) objArr[i2];
            if (jcrVar.n() != Integer.MAX_VALUE) {
                jcrVar.v().G();
                jcrVarO.ad(jcrVar);
            }
        }
    }

    private final void H() {
        int i;
        jcr.ay(o(), false, 7);
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

    private final void I(long j, float f, fdap fdapVar, ini iniVar) throws Throwable {
        iyk iygVar;
        jcr jcrVarO = o();
        try {
            this.t = true;
            if (!kjb.f(j, this.m) || this.M) {
                jcw jcwVar = this.f;
                if (jcwVar.j || jcwVar.i || this.M) {
                    this.v = true;
                    this.M = false;
                }
                u();
            }
            jdm jdmVarF = F();
            if (jdmVarF != null) {
                if (!jcx.a(jdmVarF.o())) {
                    if (jdmVarF.x == 3) {
                        jcw jcwVar2 = jdmVarF.f;
                        if (!jcwVar2.b) {
                            jcwVar2.c = true;
                        }
                    }
                    if (jdmVarF.B()) {
                    }
                }
                jer jerVar = p().x;
                if (jerVar == null || (iygVar = jerVar.m) == null) {
                    jfh jfhVarA = jcv.a(o());
                    fdap fdapVar2 = iyn.a;
                    iygVar = new iyg(jfhVarA);
                }
                jdm jdmVarF2 = F();
                jdmVarF2.getClass();
                jcr jcrVarS = o().s();
                if (jcrVarS != null) {
                    jcrVarS.w.g = 0;
                }
                jdmVarF2.i = Alert.DURATION_SHOW_INDEFINITELY;
                iygVar.s(jdmVarF2, kjb.a(j), kjb.b(j), 0.0f);
            }
            jdm jdmVarF3 = F();
            if (jdmVarF3 != null && !jdmVarF3.k) {
                itw.d("Error: Placement happened before lookahead.");
            }
            B(j, f, fdapVar, iniVar);
        } catch (Throwable th) {
            jcrVarO.az(th);
            throw new fcta();
        }
    }

    public final void A() {
        this.B = true;
        jcr jcrVarS = o().s();
        float f = i().A;
        jcr jcrVarO = o();
        jer jerVarX = jcrVarO.x();
        jer jerVarW = jcrVarO.w();
        while (jerVarX != jerVarW) {
            jerVarX.getClass();
            jcg jcgVar = (jcg) jerVarX;
            f += jcgVar.A;
            jerVarX = jcgVar.w;
        }
        if (f != this.A) {
            this.A = f;
            if (jcrVarS != null) {
                jcrVarS.X();
            }
            if (jcrVarS != null) {
                jcrVarS.O();
            }
        }
        if (this.s) {
            o().w().as();
        } else {
            if (jcrVarS != null) {
                jcrVarS.O();
            }
            G();
            if (this.g && jcrVarS != null) {
                jcrVarS.ac(false);
            }
        }
        if (jcrVarS == null) {
            this.i = 0;
        } else if (!this.g && jcrVarS.aC() == 3) {
            if (this.i != Integer.MAX_VALUE) {
                itw.d("Place was called on a node which was placed already");
            }
            jcw jcwVar = jcrVarS.w;
            int i = jcwVar.h;
            this.i = i;
            jcwVar.h = i + 1;
        }
        k();
    }

    public final void B(long j, float f, fdap fdapVar, ini iniVar) {
        if (o().B) {
            itw.c("place is called on a deactivated node");
        }
        E(3);
        boolean z = !this.k;
        this.m = j;
        this.p = f;
        this.n = fdapVar;
        this.o = iniVar;
        this.k = true;
        this.B = false;
        AndroidComposeView androidComposeView = (AndroidComposeView) jcv.a(o());
        androidComposeView.p.e(o(), j, z);
        if (this.v || !this.s) {
            this.w.g = false;
            this.f.i(false);
            this.C = fdapVar;
            this.E = j;
            this.F = f;
            this.D = iniVar;
            androidComposeView.A.a(o(), false, this.L);
        } else {
            jer jerVarP = p();
            jerVarP.av(kjb.d(j, jerVarP.e), f, fdapVar, iniVar);
            A();
        }
        E(5);
    }

    public final boolean C(long j) throws Throwable {
        jcr jcrVarO = o();
        try {
            if (o().B) {
                itw.c("measure is called on a deactivated node");
            }
            jfh jfhVarA = jcv.a(o());
            jcr jcrVarS = o().s();
            o().u = o().u || (jcrVarS != null && jcrVarS.u);
            if (!o().an() && kil.g(this.d, j)) {
                jfhVarA.o(o(), false);
                o().af();
                return false;
            }
            this.w.f = false;
            j(jdu.a);
            this.j = true;
            long j2 = p().c;
            z(j);
            if (D() != 5) {
                itw.d("layout state is not idle before measure starts");
            }
            this.z = j;
            E(1);
            this.u = false;
            ((AndroidComposeView) jcv.a(o())).A.c(o(), false, this.J);
            if (D() == 1) {
                r();
                E(5);
            }
            boolean z = (kjg.e(p().c, j2) && p().a == this.a && p().b == this.b) ? false : true;
            y((p().b & 4294967295L) | (p().a << 32));
            return z;
        } catch (Throwable th) {
            jcrVarO.az(th);
            throw new fcta();
        }
    }

    public final int D() {
        return this.f.q;
    }

    public final void E(int i) {
        this.f.q = i;
    }

    @Override // defpackage.jdz
    public final void U(boolean z) {
        if (z != p().j) {
            p().j = z;
            this.M = true;
        }
    }

    @Override // defpackage.ivt
    public final int a(int i) {
        if (!jcx.a(o())) {
            H();
            return p().a(i);
        }
        jdm jdmVarF = F();
        jdmVarF.getClass();
        return jdmVarF.a(i);
    }

    @Override // defpackage.ivt
    public final int b(int i) {
        if (!jcx.a(o())) {
            H();
            return p().b(i);
        }
        jdm jdmVarF = F();
        jdmVarF.getClass();
        return jdmVarF.b(i);
    }

    @Override // defpackage.ivt
    public final int c(int i) {
        if (!jcx.a(o())) {
            H();
            return p().c(i);
        }
        jdm jdmVarF = F();
        jdmVarF.getClass();
        return jdmVarF.c(i);
    }

    @Override // defpackage.ivt
    public final int d(int i) {
        if (!jcx.a(o())) {
            H();
            return p().d(i);
        }
        jdm jdmVarF = F();
        jdmVarF.getClass();
        return jdmVarF.d(i);
    }

    @Override // defpackage.ixk
    public final iyl e(long j) throws Throwable {
        int i = 3;
        if (o().C == 3) {
            o().I();
        }
        if (jcx.a(o())) {
            jdm jdmVarF = F();
            jdmVarF.getClass();
            jdmVarF.w = 3;
            jdmVarF.e(j);
        }
        jcr jcrVarO = o();
        jcr jcrVarS = jcrVarO.s();
        if (jcrVarS != null) {
            if (this.G != 3 && !jcrVarO.u) {
                itw.d("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iAC = jcrVarS.aC();
            int i2 = iAC - 1;
            if (iAC == 0) {
                throw null;
            }
            if (i2 == 0) {
                i = 1;
            } else {
                if (i2 != 2) {
                    int iAC2 = jcrVarS.aC();
                    Objects.toString(jcn.a(iAC2));
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(jcn.a(iAC2)));
                }
                i = 2;
            }
        }
        this.G = i;
        C(j);
        return this;
    }

    @Override // defpackage.iyl
    protected final void ef(long j, float f, fdap fdapVar) throws Throwable {
        I(j, f, fdapVar, null);
    }

    @Override // defpackage.ixq
    public final int ei(itz itzVar) {
        jcr jcrVarS = o().s();
        if (jcrVarS == null || jcrVarS.aC() != 1) {
            jcr jcrVarS2 = o().s();
            if (jcrVarS2 != null && jcrVarS2.aC() == 3) {
                this.w.d = true;
            }
        } else {
            this.w.c = true;
        }
        this.l = true;
        int iEi = p().ei(itzVar);
        this.l = false;
        return iEi;
    }

    @Override // defpackage.iyl, defpackage.ivt
    public final Object f() {
        return this.r;
    }

    @Override // defpackage.jak
    public final jaj g() {
        return this.w;
    }

    @Override // defpackage.jak
    public final jak h() {
        jcw jcwVar;
        jcr jcrVarS = o().s();
        if (jcrVarS == null || (jcwVar = jcrVarS.w) == null) {
            return null;
        }
        return jcwVar.o;
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
            fdapVar.invoke(((jcr) objArr[i2]).w.o);
        }
    }

    @Override // defpackage.jak
    public final void k() {
        this.y = true;
        jaj jajVar = this.w;
        jajVar.g();
        if (this.v) {
            hum humVarQ = o().q();
            Object[] objArr = humVarQ.a;
            int i = humVarQ.b;
            for (int i2 = 0; i2 < i; i2++) {
                jcr jcrVar = (jcr) objArr[i2];
                if (jcrVar.an() && jcrVar.aD() == 1 && jcrVar.ar(jcrVar.w.b())) {
                    jcr.ay(o(), false, 7);
                }
            }
        }
        if (this.H || (!this.l && !i().l && this.v)) {
            this.v = false;
            int iD = D();
            E(3);
            jcw jcwVar = this.f;
            jcwVar.j(false);
            jcr jcrVarO = o();
            ((AndroidComposeView) jcv.a(jcrVarO)).A.b(jcrVarO, false, this.K);
            E(iD);
            if (i().l && jcwVar.i) {
                l();
            }
            this.H = false;
        }
        if (jajVar.d) {
            jajVar.e = true;
        }
        if (jajVar.b && jajVar.j()) {
            jajVar.f();
        }
        this.y = false;
    }

    @Override // defpackage.jak
    public final void l() {
        o().ac(false);
    }

    @Override // defpackage.jak
    public final void m() {
        jcr.ay(o(), false, 7);
    }

    @Override // defpackage.jak
    public final boolean n() {
        return this.s;
    }

    public final jcr o() {
        return this.f.a;
    }

    public final jer p() {
        return this.f.a();
    }

    public final List q() {
        o().ai();
        if (!this.x) {
            return this.I.e();
        }
        jcr jcrVarO = o();
        hum humVar = this.I;
        hum humVarQ = jcrVarO.q();
        Object[] objArr = humVarQ.a;
        int i = humVarQ.b;
        for (int i2 = 0; i2 < i; i2++) {
            jcr jcrVar = (jcr) objArr[i2];
            if (humVar.b <= i2) {
                humVar.n(jcrVar.w.o);
            } else {
                humVar.d(i2, jcrVar.w.o);
            }
        }
        humVar.h(jcrVarO.E().size(), humVar.b);
        this.x = false;
        return humVar.e();
    }

    public final void r() {
        this.v = true;
        this.H = true;
    }

    public final void s() {
        this.u = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [icr] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [icr] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [hum] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [hum] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void t() {
        icr icrVarA;
        if (this.s) {
            this.s = false;
            jcr jcrVarO = o();
            jer jerVar = jcrVarO.w().w;
            for (jer jerVarX = jcrVarO.x(); !fdbq.f(jerVarX, jerVar) && jerVarX != null; jerVarX = jerVarX.w) {
                if (jerVarX.aA(1048576)) {
                    boolean zH = jet.h(1048576);
                    if (zH) {
                        icrVarA = jerVarX.A();
                    } else {
                        icrVarA = jerVarX.A().v;
                        if (icrVarA == null) {
                        }
                    }
                    for (icr icrVarAd = jerVarX.ad(zH); icrVarAd != null && (icrVarAd.u & 1048576) != 0; icrVarAd = icrVarAd.w) {
                        if ((icrVarAd.t & 1048576) != 0) {
                            jbi jbiVarA = icrVarAd;
                            ?? humVar = 0;
                            while (jbiVarA != 0) {
                                if (jbiVarA instanceof jfc) {
                                    ((jfc) jbiVarA).a();
                                } else if ((jbiVarA.t & 1048576) != 0 && (jbiVarA instanceof jbi)) {
                                    icr icrVar = jbiVarA.E;
                                    int i = 0;
                                    jbiVarA = jbiVarA;
                                    humVar = humVar;
                                    while (icrVar != null) {
                                        if ((icrVar.t & 1048576) != 0) {
                                            i++;
                                            humVar = humVar;
                                            if (i == 1) {
                                                jbiVarA = icrVar;
                                            } else {
                                                if (humVar == 0) {
                                                    humVar = new hum(new icr[16]);
                                                }
                                                if (jbiVarA != 0) {
                                                    humVar.n(jbiVarA);
                                                }
                                                humVar.n(icrVar);
                                                jbiVarA = 0;
                                            }
                                        }
                                        icrVar = icrVar.w;
                                        jbiVarA = jbiVarA;
                                        humVar = humVar;
                                    }
                                    if (i != 1) {
                                    }
                                }
                                jbiVarA = jbg.a(humVar);
                            }
                        }
                        if (icrVarAd != icrVarA) {
                        }
                    }
                }
                jerVarX.ax();
            }
            hum humVarQ = o().q();
            Object[] objArr = humVarQ.a;
            int i2 = humVarQ.b;
            for (int i3 = 0; i3 < i2; i3++) {
                ((jcr) objArr[i3]).v().t();
            }
        }
    }

    public final void u() {
        if (this.f.k > 0) {
            hum humVarQ = o().q();
            Object[] objArr = humVarQ.a;
            int i = humVarQ.b;
            for (int i2 = 0; i2 < i; i2++) {
                jcr jcrVar = (jcr) objArr[i2];
                jcw jcwVar = jcrVar.w;
                if ((jcwVar.i || jcwVar.j) && !jcwVar.n()) {
                    jcrVar.ac(false);
                }
                jcwVar.o.u();
            }
        }
    }

    @Override // defpackage.iyl
    public final int v() {
        return p().v();
    }

    @Override // defpackage.iyl
    public final int w() {
        return p().w();
    }

    @Override // defpackage.iyl
    public final void x(long j, float f, ini iniVar) throws Throwable {
        I(j, f, null, iniVar);
    }
}
