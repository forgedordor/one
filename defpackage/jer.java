package defpackage;

import androidx.car.app.model.Alert;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jer extends jde implements ixk, ivy, jfi {
    public float A;
    public ini B;
    public ijb C;
    public boolean D;
    public jfe E;
    private boolean F;
    private boolean G;
    private kio H;
    private kji I;
    private ixn K;
    private cuq L;
    private ihp M;
    private jca N;
    private fdat O;
    private ini Q;
    public final jcr t;
    public boolean u;
    public boolean v;
    public jer w;
    public jer x;
    public fdap y;
    private static final fdap f = jek.a;
    public static final fdap p = jej.a;
    public static final ikl q = new ikl();
    private static final jca g = new jca();
    private static final float[] h = iju.f();
    public static final jel r = new jeh();
    public static final jel s = new jei();
    private float J = 0.8f;
    public long z = 0;
    private final fdae P = new jeo(this);

    public jer(jcr jcrVar) {
        this.t = jcrVar;
        this.H = jcrVar.r;
        this.I = jcrVar.s;
    }

    private final long G(jer jerVar, long j, boolean z) {
        if (jerVar == this) {
            return j;
        }
        jer jerVar2 = this.x;
        return (jerVar2 == null || fdbq.f(jerVar, jerVar2)) ? Z(j, z) : Z(jerVar2.G(jerVar, j, z), z);
    }

    private final fdat H() {
        fdat fdatVar = this.O;
        if (fdatVar != null) {
            return fdatVar;
        }
        jem jemVar = new jem(this, new jen(this));
        this.O = jemVar;
        return jemVar;
    }

    public static /* synthetic */ long aD(jer jerVar, long j) {
        return jerVar.Z(j, true);
    }

    public static /* synthetic */ long aE(jer jerVar, long j) {
        return jerVar.ab(j, true);
    }

    static /* synthetic */ boolean aG(jer jerVar) {
        return jerVar.aM(true);
    }

    private final void aH(jer jerVar, ihp ihpVar, boolean z) {
        if (jerVar == this) {
            return;
        }
        jer jerVar2 = this.x;
        if (jerVar2 != null) {
            jerVar2.aH(jerVar, ihpVar, z);
        }
        long j = this.z;
        float fA = kjb.a(j);
        ihpVar.a -= fA;
        ihpVar.c -= fA;
        float fB = kjb.b(j);
        ihpVar.b -= fB;
        ihpVar.d -= fB;
        jfe jfeVar = this.E;
        if (jfeVar != null) {
            jfeVar.e(ihpVar, true);
            if (this.G && z) {
                long j2 = this.c;
                ihpVar.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    private final void aI(icr icrVar, jel jelVar, long j, jbu jbuVar, int i, boolean z) {
        if (icrVar == null) {
            E(jelVar, j, jbuVar, i, z);
            return;
        }
        int i2 = jbuVar.c;
        jbuVar.d(i2 + 1, jbuVar.a());
        jbuVar.c++;
        jbuVar.a.h(icrVar);
        jbuVar.b.b(jbv.a(-1.0f, z, false));
        aI(jes.a(icrVar, jelVar.a()), jelVar, j, jbuVar, i, z);
        jbuVar.c = i2;
    }

    private final void aJ(icr icrVar, jel jelVar, long j, jbu jbuVar, int i, boolean z, float f2) {
        if (icrVar == null) {
            E(jelVar, j, jbuVar, i, z);
            return;
        }
        int i2 = jbuVar.c;
        jbuVar.d(i2 + 1, jbuVar.a());
        jbuVar.c++;
        jbuVar.a.h(icrVar);
        jbuVar.b.b(jbv.a(f2, z, false));
        au(jes.a(icrVar, jelVar.a()), jelVar, j, jbuVar, i, z, f2, true);
        jbuVar.c = i2;
    }

    private final void aK(jer jerVar, float[] fArr) {
        if (fdbq.f(jerVar, this)) {
            return;
        }
        jer jerVar2 = this.x;
        jerVar2.getClass();
        jerVar2.aK(jerVar, fArr);
        if (!kjb.f(this.z, 0L)) {
            float[] fArr2 = h;
            iju.c(fArr2);
            long j = this.z;
            iju.h(fArr2, -kjb.a(j), -kjb.b(j));
            iju.e(fArr, fArr2);
        }
        jfe jfeVar = this.E;
        if (jfeVar != null) {
            jfeVar.d(fArr);
        }
    }

    private final void aL(jer jerVar, float[] fArr) {
        jer jerVar2 = this;
        while (!fdbq.f(jerVar2, jerVar)) {
            jfe jfeVar = jerVar2.E;
            if (jfeVar != null) {
                jfeVar.i(fArr);
            }
            if (!kjb.f(jerVar2.z, 0L)) {
                float[] fArr2 = h;
                iju.c(fArr2);
                iju.h(fArr2, kjb.a(r1), kjb.b(r1));
                iju.e(fArr, fArr2);
            }
            jerVar2 = jerVar2.x;
            jerVar2.getClass();
        }
    }

    private final boolean aM(boolean z) {
        jfh jfhVar;
        boolean z2 = false;
        if (this.Q != null) {
            return false;
        }
        jfe jfeVar = this.E;
        if (jfeVar == null) {
            if (this.y != null) {
                itw.d("null layer with a non-null layerBlock");
            }
            return false;
        }
        fdap fdapVar = this.y;
        if (fdapVar == null) {
            itw.b("updateLayerParameters requires a non-null layerBlock");
            throw new fcta();
        }
        ikl iklVar = q;
        iklVar.x(1.0f);
        iklVar.y(1.0f);
        iklVar.a(1.0f);
        iklVar.D(0.0f);
        iklVar.E(0.0f);
        iklVar.z(0.0f);
        long j = ijo.a;
        iklVar.b(j);
        iklVar.B(j);
        iklVar.u(0.0f);
        iklVar.v(0.0f);
        iklVar.w(0.0f);
        iklVar.q(8.0f);
        iklVar.C(ikz.a);
        iklVar.A(ikj.a);
        iklVar.r(false);
        iklVar.t(null);
        iklVar.F();
        iklVar.p(3);
        iklVar.s(0);
        iklVar.r = 9205357640488583168L;
        iklVar.x = null;
        iklVar.a = 0;
        jcr jcrVar = this.t;
        iklVar.s = jcrVar.r;
        iklVar.t = jcrVar.s;
        iklVar.r = kjh.d(this.c);
        ah().d(this, f, new jeq(fdapVar));
        jca jcaVar = this.N;
        if (jcaVar == null) {
            jcaVar = new jca();
            this.N = jcaVar;
        }
        jca jcaVar2 = g;
        jcaVar2.a = jcaVar.a;
        jcaVar2.b = jcaVar.b;
        jcaVar2.c = jcaVar.c;
        jcaVar2.d = jcaVar.d;
        jcaVar2.e = jcaVar.e;
        jcaVar2.f = jcaVar.f;
        jcaVar2.g = jcaVar.g;
        jcaVar2.h = jcaVar.h;
        jcaVar2.i = jcaVar.i;
        jcaVar.a = iklVar.b;
        jcaVar.b = iklVar.c;
        jcaVar.c = iklVar.e;
        jcaVar.d = iklVar.f;
        jcaVar.e = iklVar.j;
        jcaVar.f = iklVar.k;
        jcaVar.g = iklVar.l;
        jcaVar.h = iklVar.m;
        jcaVar.i = iklVar.n;
        jfeVar.k(iklVar);
        boolean z3 = this.G;
        boolean z4 = iklVar.p;
        this.G = z4;
        this.J = iklVar.d;
        if (jcaVar2.a == jcaVar.a && jcaVar2.b == jcaVar.b && jcaVar2.c == jcaVar.c && jcaVar2.d == jcaVar.d && jcaVar2.e == jcaVar.e && jcaVar2.f == jcaVar.f && jcaVar2.g == jcaVar.g && jcaVar2.h == jcaVar.h && ikz.d(jcaVar2.i, jcaVar.i)) {
            z2 = true;
        }
        boolean z5 = !z2;
        if (z && ((!z2 || z3 != z4) && (jfhVar = jcrVar.k) != null)) {
            jfhVar.t(jcrVar);
        }
        return z5;
    }

    private static final jer aN(ivy ivyVar) {
        jer jerVarA;
        ixa ixaVar = ivyVar instanceof ixa ? (ixa) ivyVar : null;
        if (ixaVar != null && (jerVarA = ixaVar.a()) != null) {
            return jerVarA;
        }
        ivyVar.getClass();
        return (jer) ivyVar;
    }

    public abstract icr A();

    @Override // defpackage.jfi
    public final boolean B() {
        return (this.E == null || this.F || !this.t.d()) ? false : true;
    }

    public abstract jdf C();

    public abstract void D();

    public void E(jel jelVar, long j, jbu jbuVar, int i, boolean z) {
        jer jerVar = this.w;
        if (jerVar != null) {
            jerVar.al(jelVar, aD(jerVar, j), jbuVar, i, z);
        }
    }

    public void F(ijb ijbVar, ini iniVar) {
        throw null;
    }

    @Override // defpackage.jde
    public final long I() {
        return this.z;
    }

    @Override // defpackage.jde
    public final ixn K() {
        ixn ixnVar = this.K;
        if (ixnVar != null) {
            return ixnVar;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // defpackage.jde, defpackage.jdw
    public final jcr L() {
        return this.t;
    }

    @Override // defpackage.jde
    public final jde N() {
        return this.w;
    }

    @Override // defpackage.jde
    public final jde O() {
        return this.x;
    }

    @Override // defpackage.jde
    public final void T() {
        ini iniVar = this.Q;
        if (iniVar != null) {
            x(this.z, this.A, iniVar);
        } else {
            ef(this.z, this.A, this.y);
        }
    }

    @Override // defpackage.jde
    public final boolean V() {
        return this.K != null;
    }

    protected final float X(long j, long j2) {
        if (w() >= Float.intBitsToFloat((int) (j2 >> 32)) && v() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jY = Y(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jY >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jY & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - w());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fMax2 = Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - v());
        long jFloatToRawIntBits = Float.floatToRawIntBits(fMax) << 32;
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fMax2) & 4294967295L;
        if (fIntBitsToFloat <= 0.0f && fIntBitsToFloat2 <= 0.0f) {
            return Float.POSITIVE_INFINITY;
        }
        long j3 = jFloatToRawIntBits2 | jFloatToRawIntBits;
        int i = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i) > fIntBitsToFloat) {
            return Float.POSITIVE_INFINITY;
        }
        int i2 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i2) > fIntBitsToFloat2) {
            return Float.POSITIVE_INFINITY;
        }
        float fIntBitsToFloat5 = Float.intBitsToFloat(i);
        float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
        return (fIntBitsToFloat5 * fIntBitsToFloat5) + (fIntBitsToFloat6 * fIntBitsToFloat6);
    }

    public final long Y(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - w();
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (j & 4294967295L)) - v()) / 2.0f;
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        float fMax2 = Math.max(0.0f, fIntBitsToFloat2);
        return (Float.floatToRawIntBits(fMax2) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final long Z(long j, boolean z) {
        if (z || !this.j) {
            long j2 = this.z;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - kjb.a(j2);
            j = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - kjb.b(j2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        }
        jfe jfeVar = this.E;
        return jfeVar != null ? jfeVar.a(j, true) : j;
    }

    public final boolean aA(int i) {
        icr icrVarAd = ad(jet.h(i));
        return (icrVarAd == null || (i & icrVarAd.D().u) == 0) ? false : true;
    }

    public final boolean aB() {
        if (this.E != null && this.J <= 0.0f) {
            return true;
        }
        jer jerVar = this.x;
        if (jerVar != null) {
            return jerVar.aB();
        }
        return false;
    }

    protected final boolean aC(long j) {
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        jfe jfeVar = this.E;
        return jfeVar == null || !this.G || jfeVar.l(j);
    }

    public final long aa() {
        return this.H.er(this.t.t.g());
    }

    public final long ab(long j, boolean z) {
        jfe jfeVar = this.E;
        if (jfeVar != null) {
            j = jfeVar.a(j, false);
        }
        return (z || !this.j) ? kjc.b(j, this.z) : j;
    }

    public final icr ac(int i) {
        icr icrVarA;
        boolean zH = jet.h(i);
        if (zH) {
            icrVarA = A();
        } else {
            icrVarA = A().v;
            if (icrVarA == null) {
                return null;
            }
        }
        for (icr icrVarAd = ad(zH); icrVarAd != null && (icrVarAd.u & i) != 0; icrVarAd = icrVarAd.w) {
            if ((icrVarAd.t & i) != 0) {
                return icrVarAd;
            }
            if (icrVarAd == icrVarA) {
                return null;
            }
        }
        return null;
    }

    public final icr ad(boolean z) {
        icr icrVarA;
        jcr jcrVar = this.t;
        if (jcrVar.x() == this) {
            return jcrVar.v.f;
        }
        if (!z) {
            jer jerVar = this.x;
            if (jerVar == null) {
                return null;
            }
            return jerVar.A();
        }
        jer jerVar2 = this.x;
        if (jerVar2 == null || (icrVarA = jerVar2.A()) == null) {
            return null;
        }
        return icrVarA.w;
    }

    public final ihp ae() {
        ihp ihpVar = this.M;
        if (ihpVar != null) {
            return ihpVar;
        }
        ihp ihpVar2 = new ihp();
        this.M = ihpVar2;
        return ihpVar2;
    }

    public final jak af() {
        return this.t.w.o;
    }

    public final jer ag(jer jerVar) {
        jcr jcrVar = jerVar.t;
        jcr jcrVar2 = this.t;
        if (jcrVar == jcrVar2) {
            icr icrVarA = jerVar.A();
            icr icrVarA2 = A();
            if (!icrVarA2.D().C) {
                itw.d("visitLocalAncestors called on an unattached node");
            }
            icr icrVarD = icrVarA2.D();
            while (true) {
                icrVarD = icrVarD.v;
                if (icrVarD == null) {
                    break;
                }
                if ((icrVarD.t & 2) != 0 && icrVarD == icrVarA) {
                    break;
                }
            }
            return jerVar;
        }
        jcr jcrVarS = jcrVar;
        while (jcrVarS.m > jcrVar2.m) {
            jcrVarS = jcrVarS.s();
            jcrVarS.getClass();
        }
        jcr jcrVarS2 = jcrVar2;
        while (jcrVarS2.m > jcrVarS.m) {
            jcrVarS2 = jcrVarS2.s();
            jcrVarS2.getClass();
        }
        while (jcrVarS != jcrVarS2) {
            jcrVarS = jcrVarS.s();
            jcrVarS2 = jcrVarS2.s();
            if (jcrVarS == null || jcrVarS2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (jcrVarS2 != jcrVar2) {
            if (jcrVarS != jcrVar) {
                return jcrVarS.w();
            }
            return jerVar;
        }
        return this;
    }

    public final jfr ah() {
        return ((AndroidComposeView) jcv.a(this.t)).A;
    }

    public final void ai(ijb ijbVar, ini iniVar) {
        jfe jfeVar = this.E;
        if (jfeVar != null) {
            jfeVar.c(ijbVar, iniVar);
            return;
        }
        long j = this.z;
        float fA = kjb.a(j);
        float fB = kjb.b(j);
        ijbVar.o(fA, fB);
        ak(ijbVar, iniVar);
        ijbVar.o(-fA, -fB);
    }

    protected final void aj(ijb ijbVar, ikb ikbVar) {
        long j = this.c;
        ijbVar.g(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, ikbVar);
    }

    public final void ak(ijb ijbVar, ini iniVar) {
        ijb ijbVar2;
        ini iniVar2;
        icr icrVarAc = ac(4);
        if (icrVarAc == null) {
            F(ijbVar, iniVar);
            return;
        }
        jcu jcuVarT = this.t.t();
        long jD = kjh.d(this.c);
        hum humVar = null;
        while (icrVarAc != null) {
            if (icrVarAc instanceof jbp) {
                ijbVar2 = ijbVar;
                iniVar2 = iniVar;
                jcuVarT.u(ijbVar2, jD, this, (jbp) icrVarAc, iniVar2);
            } else {
                ijbVar2 = ijbVar;
                iniVar2 = iniVar;
                if ((icrVarAc.t & 4) != 0 && (icrVarAc instanceof jbi)) {
                    int i = 0;
                    for (icr icrVar = ((jbi) icrVarAc).E; icrVar != null; icrVar = icrVar.w) {
                        if ((icrVar.t & 4) != 0) {
                            i++;
                            if (i == 1) {
                                icrVarAc = icrVar;
                            } else {
                                if (humVar == null) {
                                    humVar = new hum(new icr[16]);
                                }
                                if (icrVarAc != null) {
                                    humVar.n(icrVarAc);
                                }
                                humVar.n(icrVar);
                                icrVarAc = null;
                            }
                        }
                    }
                    if (i != 1) {
                    }
                }
                ijbVar = ijbVar2;
                iniVar = iniVar2;
            }
            icrVarAc = jbg.a(humVar);
            ijbVar = ijbVar2;
            iniVar = iniVar2;
        }
    }

    public final void al(jel jelVar, long j, jbu jbuVar, int i, boolean z) {
        jer jerVar;
        boolean z2;
        float f2;
        boolean z3;
        icr icrVarAc = ac(jelVar.a());
        if (!aC(j)) {
            if (ita.b(i, 1)) {
                float fX = X(j, aa());
                if ((Float.floatToRawIntBits(fX) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || !jbuVar.e(fX, false)) {
                    return;
                }
                aJ(icrVarAc, jelVar, j, jbuVar, i, false, fX);
                return;
            }
            return;
        }
        if (icrVarAc == null) {
            E(jelVar, j, jbuVar, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < w() && fIntBitsToFloat2 < v()) {
            aI(icrVarAc, jelVar, j, jbuVar, i, z);
            return;
        }
        float fX2 = !ita.b(i, 1) ? Float.POSITIVE_INFINITY : X(j, aa());
        if ((Float.floatToRawIntBits(fX2) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040) {
            z2 = z;
            if (jbuVar.e(fX2, z2)) {
                jerVar = this;
                f2 = fX2;
                z3 = true;
                jerVar.au(icrVarAc, jelVar, j, jbuVar, i, z2, f2, z3);
            }
            jerVar = this;
        } else {
            jerVar = this;
            z2 = z;
        }
        f2 = fX2;
        z3 = false;
        jerVar.au(icrVarAc, jelVar, j, jbuVar, i, z2, f2, z3);
    }

    public final void am() {
        jfe jfeVar = this.E;
        if (jfeVar != null) {
            jfeVar.invalidate();
            return;
        }
        jer jerVar = this.x;
        if (jerVar != null) {
            jerVar.am();
        }
    }

    public final void an() {
        if (this.E != null || this.y == null) {
            return;
        }
        jfe jfeVarA = jff.a(jcv.a(this.t), H(), this.P, this.Q, false, 8);
        jfeVarA.g(this.c);
        jfeVarA.f(this.z);
        jfeVarA.invalidate();
        this.E = jfeVarA;
    }

    public final void ao() {
        this.t.w.f();
    }

    public final void ap() {
        jfe jfeVar = this.E;
        if (jfeVar != null) {
            jfeVar.b();
            this.P.invoke();
            this.E = null;
        }
    }

    public final void aq() {
        jfe jfeVar = this.E;
        if (jfeVar != null) {
            jfeVar.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [icr] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [icr] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
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
    public final void ar() {
        icr icrVarA;
        if (aA(128)) {
            hzg hzgVarA = hzf.a();
            fdap fdapVarK = hzgVarA != null ? hzgVarA.k() : null;
            hzg hzgVarB = hzf.b(hzgVarA);
            try {
                boolean zH = jet.h(128);
                if (!zH) {
                    icrVarA = A().v;
                    if (icrVarA == null) {
                    }
                }
                icrVarA = A();
                for (icr icrVarAd = ad(zH); icrVarAd != null; icrVarAd = icrVarAd.w) {
                    if ((icrVarAd.u & 128) == 0) {
                        break;
                    }
                    if ((icrVarAd.t & 128) != 0) {
                        ?? humVar = 0;
                        jbi jbiVarA = icrVarAd;
                        while (jbiVarA != 0) {
                            if (jbiVarA instanceof jcb) {
                                ((jcb) jbiVarA).i(this.c);
                            } else if ((jbiVarA.t & 128) != 0 && (jbiVarA instanceof jbi)) {
                                icr icrVar = jbiVarA.E;
                                int i = 0;
                                jbiVarA = jbiVarA;
                                humVar = humVar;
                                while (icrVar != null) {
                                    if ((icrVar.t & 128) != 0) {
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
                    if (icrVarAd == icrVarA) {
                        break;
                    }
                }
            } finally {
                hzf.e(hzgVarA, hzgVarB, fdapVarK);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [icr] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [icr] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [hum] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [hum] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void as() {
        icr icrVarA;
        boolean zH = jet.h(128);
        if (zH) {
            icrVarA = A();
        } else {
            icrVarA = A().v;
            if (icrVarA == null) {
                return;
            }
        }
        for (icr icrVarAd = ad(zH); icrVarAd != null && (icrVarAd.u & 128) != 0; icrVarAd = icrVarAd.w) {
            if ((icrVarAd.t & 128) != 0) {
                jbi jbiVarA = icrVarAd;
                ?? humVar = 0;
                while (jbiVarA != 0) {
                    if (jbiVarA instanceof jcb) {
                        ((jcb) jbiVarA).ea(this);
                    } else if ((jbiVarA.t & 128) != 0 && (jbiVarA instanceof jbi)) {
                        icr icrVar = jbiVarA.E;
                        int i = 0;
                        jbiVarA = jbiVarA;
                        humVar = humVar;
                        while (icrVar != null) {
                            if ((icrVar.t & 128) != 0) {
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
            if (icrVarAd == icrVarA) {
                return;
            }
        }
    }

    public final void at() {
        this.F = true;
        this.P.invoke();
        ax();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0188 A[PHI: r3
      0x0188: PHI (r3v15 hum) = (r3v1 hum), (r3v1 hum), (r3v17 hum) binds: [B:46:0x0158, B:48:0x015c, B:62:0x0186] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [icr] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void au(defpackage.icr r13, defpackage.jel r14, long r15, defpackage.jbu r17, int r18, boolean r19, float r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jer.au(icr, jel, long, jbu, int, boolean, float, boolean):void");
    }

    public final void av(long j, float f2, fdap fdapVar, ini iniVar) {
        if (iniVar != null) {
            if (fdapVar != null) {
                itw.c("both ways to create layers shouldn't be used together");
            }
            if (this.Q != iniVar) {
                this.Q = null;
                az(null, false);
                this.Q = iniVar;
            }
            if (this.E == null) {
                jcr jcrVar = this.t;
                jfh jfhVarA = jcv.a(jcrVar);
                fdat fdatVarH = H();
                fdae fdaeVar = this.P;
                jfe jfeVarA = jff.a(jfhVarA, fdatVarH, fdaeVar, iniVar, false, 8);
                jfeVarA.g(this.c);
                jfeVarA.f(j);
                this.E = jfeVarA;
                jcrVar.aA();
                fdaeVar.invoke();
            }
        } else {
            if (this.Q != null) {
                this.Q = null;
                az(null, false);
            }
            az(fdapVar, false);
        }
        if (!kjb.f(this.z, j)) {
            jcr jcrVar2 = this.t;
            jcv.a(jcrVar2).z(-4.0f);
            this.z = j;
            jcrVar2.w.o.u();
            jfe jfeVar = this.E;
            if (jfeVar != null) {
                jfeVar.f(j);
            } else {
                jer jerVar = this.x;
                if (jerVar != null) {
                    jerVar.am();
                }
            }
            W(this);
            jfh jfhVar = jcrVar2.k;
            if (jfhVar != null) {
                jfhVar.t(jcrVar2);
            }
        }
        this.A = f2;
        if (this.l) {
            return;
        }
        R(K());
    }

    public final void aw(ihp ihpVar, boolean z, boolean z2) {
        jfe jfeVar = this.E;
        if (jfeVar != null) {
            if (this.G) {
                if (z2) {
                    long jAa = aa();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jAa >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jAa & 4294967295L)) / 2.0f;
                    long j = this.c;
                    ihpVar.a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j >> 32)) + fIntBitsToFloat, ((int) (4294967295L & j)) + fIntBitsToFloat2);
                } else if (z) {
                    long j2 = this.c;
                    ihpVar.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
                if (ihpVar.c()) {
                    return;
                }
            }
            jfeVar.e(ihpVar, false);
        }
        long j3 = this.z;
        float fA = kjb.a(j3);
        ihpVar.a += fA;
        ihpVar.c += fA;
        float fB = kjb.b(j3);
        ihpVar.b += fB;
        ihpVar.d += fB;
    }

    public final void ax() {
        if (this.E != null) {
            if (this.Q != null) {
                this.Q = null;
            }
            az(null, false);
            this.t.ac(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d1  */
    /* JADX WARN: Type inference failed for: r7v10, types: [icr] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [icr] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [hum] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [hum] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ay(defpackage.ixn r21) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jer.ay(ixn):void");
    }

    public final void az(fdap fdapVar, boolean z) {
        jfh jfhVar;
        if (fdapVar != null && this.Q != null) {
            itw.c("layerBlock can't be provided when explicitLayer is provided");
        }
        jcr jcrVar = this.t;
        boolean z2 = true;
        if (!z && this.y == fdapVar && fdbq.f(this.H, jcrVar.r) && this.I == jcrVar.s) {
            z2 = false;
        }
        this.H = jcrVar.r;
        this.I = jcrVar.s;
        if (!jcrVar.d() || fdapVar == null) {
            this.y = null;
            jfe jfeVar = this.E;
            if (jfeVar != null) {
                jfeVar.b();
                jcrVar.aA();
                this.P.invoke();
                if (u() && jcrVar.f() && (jfhVar = jcrVar.k) != null) {
                    jfhVar.t(jcrVar);
                }
            }
            this.E = null;
            this.D = false;
            return;
        }
        this.y = fdapVar;
        if (this.E != null) {
            if (z2 && aG(this)) {
                ((AndroidComposeView) jcv.a(jcrVar)).p.d(jcrVar);
                return;
            }
            return;
        }
        jfh jfhVarA = jcv.a(jcrVar);
        fdat fdatVarH = H();
        fdae fdaeVar = this.P;
        jfe jfeVarA = jff.a(jfhVarA, fdatVarH, fdaeVar, null, jcrVar.h, 4);
        jfeVarA.g(this.c);
        jfeVarA.f(this.z);
        this.E = jfeVarA;
        aG(this);
        jcrVar.aA();
        fdaeVar.invoke();
    }

    @Override // defpackage.kio
    public final float ed() {
        return this.t.r.ed();
    }

    @Override // defpackage.kiy
    public final float ee() {
        return this.t.r.ee();
    }

    @Override // defpackage.iyl
    protected void ef(long j, float f2, fdap fdapVar) {
        if (!this.u) {
            av(j, f2, fdapVar, null);
            return;
        }
        jdf jdfVarC = C();
        jdfVarC.getClass();
        av(jdfVarC.h, f2, fdapVar, null);
    }

    @Override // defpackage.ivy
    public final void ek(ivy ivyVar, float[] fArr) {
        jer jerVarAN = aN(ivyVar);
        jerVarAN.ao();
        jer jerVarAg = ag(jerVarAN);
        iju.c(fArr);
        jerVarAN.aL(jerVarAg, fArr);
        aK(jerVarAg, fArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [icr] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [icr] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [hum] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [hum] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.iyl, defpackage.ivt
    public final Object f() {
        jcr jcrVar = this.t;
        jee jeeVar = jcrVar.v;
        if (!jeeVar.j(64)) {
            return null;
        }
        A();
        fdci fdciVar = new fdci();
        for (icr icrVar = jeeVar.e; icrVar != null; icrVar = icrVar.v) {
            if ((icrVar.t & 64) != 0) {
                jbi jbiVarA = icrVar;
                ?? humVar = 0;
                while (jbiVarA != 0) {
                    if (jbiVarA instanceof jfs) {
                        kio kioVar = jcrVar.r;
                        fdciVar.a = ((jfs) jbiVarA).ec(fdciVar.a);
                    } else if ((jbiVarA.t & 64) != 0 && (jbiVarA instanceof jbi)) {
                        icr icrVar2 = jbiVarA.E;
                        int i = 0;
                        jbiVarA = jbiVarA;
                        humVar = humVar;
                        while (icrVar2 != null) {
                            if ((icrVar2.t & 64) != 0) {
                                i++;
                                humVar = humVar;
                                if (i == 1) {
                                    jbiVarA = icrVar2;
                                } else {
                                    if (humVar == 0) {
                                        humVar = new hum(new icr[16]);
                                    }
                                    if (jbiVarA != 0) {
                                        humVar.n(jbiVarA);
                                    }
                                    humVar.n(icrVar2);
                                    jbiVarA = 0;
                                }
                            }
                            icrVar2 = icrVar2.w;
                            jbiVarA = jbiVarA;
                            humVar = humVar;
                        }
                        if (i != 1) {
                        }
                    }
                    jbiVarA = jbg.a(humVar);
                }
            }
        }
        return fdciVar.a;
    }

    @Override // defpackage.ivy
    public final long g() {
        return this.c;
    }

    @Override // defpackage.ivy
    public final long h(ivy ivyVar, long j) {
        return i(ivyVar, j, true);
    }

    @Override // defpackage.ivy
    public final long i(ivy ivyVar, long j, boolean z) {
        if (ivyVar instanceof ixa) {
            ixa ixaVar = (ixa) ivyVar;
            ixaVar.a().ao();
            return ixaVar.i(this, j ^ (-9223372034707292160L), z) ^ (-9223372034707292160L);
        }
        jer jerVarAN = aN(ivyVar);
        jerVarAN.ao();
        jer jerVarAg = ag(jerVarAN);
        while (jerVarAN != jerVarAg) {
            j = jerVarAN.ab(j, z);
            jerVarAN = jerVarAN.x;
            jerVarAN.getClass();
        }
        return G(jerVarAg, j, z);
    }

    @Override // defpackage.ivy
    public final long j(long j) {
        if (!u()) {
            itw.d("LayoutCoordinate operations are only valid when isAttached is true");
        }
        ao();
        for (jer jerVar = this; jerVar != null; jerVar = jerVar.x) {
            j = aE(jerVar, j);
        }
        return j;
    }

    @Override // defpackage.ivy
    public final long k(long j) {
        if (!u()) {
            itw.d("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return jcv.a(this.t).h(j(j));
    }

    @Override // defpackage.ivy
    public final long l(long j) {
        jcr jcrVar = this.t;
        long j2 = j(j);
        AndroidComposeView androidComposeView = (AndroidComposeView) jcv.a(jcrVar);
        androidComposeView.K();
        return iju.a(androidComposeView.E, j2);
    }

    @Override // defpackage.ivy
    public final long m(long j) {
        if (!u()) {
            itw.d("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return h(ivz.g(this), jcv.a(this.t).i(j));
    }

    @Override // defpackage.ivy
    public final long n(long j) {
        if (!u()) {
            itw.d("LayoutCoordinate operations are only valid when isAttached is true");
        }
        ivy ivyVarG = ivz.g(this);
        AndroidComposeView androidComposeView = (AndroidComposeView) jcv.a(this.t);
        androidComposeView.K();
        return h(ivyVarG, ihs.d(iju.a(androidComposeView.F, j), ivz.a(ivyVarG)));
    }

    @Override // defpackage.ivy
    public final ihu o(ivy ivyVar, boolean z) {
        if (!u()) {
            itw.d("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!ivyVar.u()) {
            itw.d(a.h(ivyVar, "LayoutCoordinates ", " is not attached!"));
        }
        jer jerVarAN = aN(ivyVar);
        jerVarAN.ao();
        jer jerVarAg = ag(jerVarAN);
        ihp ihpVarAe = ae();
        ihpVarAe.a = 0.0f;
        ihpVarAe.b = 0.0f;
        ihpVarAe.c = (int) (ivyVar.g() >> 32);
        ihpVarAe.d = (int) (ivyVar.g() & 4294967295L);
        while (jerVarAN != jerVarAg) {
            jerVarAN.aw(ihpVarAe, z, false);
            if (ihpVarAe.c()) {
                return ihu.a;
            }
            jerVarAN = jerVarAN.x;
            jerVarAN.getClass();
        }
        aH(jerVarAg, ihpVarAe, z);
        return ihq.a(ihpVarAe);
    }

    @Override // defpackage.ivy
    public final ivy p() {
        if (!u()) {
            itw.d("LayoutCoordinate operations are only valid when isAttached is true");
        }
        ao();
        return this.x;
    }

    @Override // defpackage.ivu
    public final kji q() {
        return this.t.s;
    }

    @Override // defpackage.ivy
    public final ivy r() {
        if (!u()) {
            itw.d("LayoutCoordinate operations are only valid when isAttached is true");
        }
        ao();
        return this.t.x().x;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [iro, jfh] */
    @Override // defpackage.ivy
    public final void t(float[] fArr) {
        ?? A = jcv.a(this.t);
        aL(aN(ivz.g(this)), fArr);
        A.g(fArr);
    }

    @Override // defpackage.ivy
    public final boolean u() {
        return A().C;
    }

    @Override // defpackage.iyl
    public void x(long j, float f2, ini iniVar) {
        if (!this.u) {
            av(j, f2, null, iniVar);
            return;
        }
        jdf jdfVarC = C();
        jdfVarC.getClass();
        av(jdfVarC.h, f2, null, iniVar);
    }

    @Override // defpackage.jde
    public final ivy J() {
        return this;
    }
}
