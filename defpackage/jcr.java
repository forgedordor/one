package defpackage;

import androidx.car.app.model.Alert;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jcr implements hmh, iyq, jfi, iwd, jse, jbc, jfg {
    public boolean A;
    public boolean B;
    public int C;
    public hxi D;
    private final boolean G;
    private int H;
    private final jea I;
    private hum J;
    private boolean K;
    private jcr L;
    private jsc M;
    private final hum N;
    private boolean O;
    private jbz P;
    private jer Q;
    private boolean R;
    private ics S;
    private ics T;
    private int U;
    public int c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public boolean i;
    public jcr j;
    public jfh k;
    public kkt l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public ixm q;
    public kio r;
    public kji s;
    public jou t;
    public boolean u;
    public final jee v;
    public final jcw w;
    public iwy x;
    public fdap y;
    public fdap z;
    private static final jco E = new jcm();
    public static final fdae a = jck.a;
    private static final jou F = new jcl();
    public static final Comparator b = new Comparator() { // from class: jcj
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            jcr jcrVar = (jcr) obj;
            jcr jcrVar2 = (jcr) obj2;
            return jcrVar.l() == jcrVar2.l() ? fdbq.a(jcrVar.n(), jcrVar2.n()) : Float.compare(jcrVar.l(), jcrVar2.l());
        }
    };

    public jcr() {
        this(false, 3, null);
    }

    private final String aF(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        hum humVarQ = q();
        Object[] objArr = humVarQ.a;
        int i3 = humVarQ.b;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((jcr) objArr[i4]).aF(i + 1));
        }
        String string = sb.toString();
        if (i != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        strSubstring.getClass();
        return strSubstring;
    }

    private final String aG(jcr jcrVar) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(jcrVar);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(as(this));
        sb.append(" Other tree: ");
        jcr jcrVar2 = jcrVar.L;
        sb.append(jcrVar2 != null ? as(jcrVar2) : null);
        return sb.toString();
    }

    private final void aH(ics icsVar) {
        jee jeeVar;
        hum humVar;
        jed jedVar;
        jee jeeVar2 = this.v;
        boolean zJ = jeeVar2.j(16);
        boolean zJ2 = jeeVar2.j(1024);
        this.S = icsVar;
        icr icrVar = jeeVar2.f;
        jed jedVar2 = jeeVar2.b;
        if (icrVar == jedVar2) {
            itw.d("padChain called on already padded chain");
        }
        icr icrVar2 = jeeVar2.f;
        icrVar2.v = jedVar2;
        jedVar2.w = icrVar2;
        hum humVar2 = jeeVar2.g;
        int i = humVar2 != null ? humVar2.b : 0;
        hum humVar3 = jeeVar2.h;
        if (humVar3 == null) {
            humVar3 = new hum(new icq[16]);
        }
        hum humVar4 = jeeVar2.i;
        humVar4.n(icsVar);
        jef jefVar = null;
        while (true) {
            int i2 = humVar4.b;
            if (i2 == 0) {
                break;
            }
            ics icsVar2 = (ics) humVar4.c(i2 - 1);
            if (icsVar2 instanceof icf) {
                icf icfVar = (icf) icsVar2;
                humVar4.n(icfVar.b);
                humVar4.n(icfVar.a);
            } else if (icsVar2 instanceof icq) {
                humVar3.n(icsVar2);
            } else {
                if (jefVar == null) {
                    jefVar = new jef(humVar3);
                }
                icsVar2.c(jefVar);
            }
        }
        int i3 = humVar3.b;
        boolean z = true;
        if (i3 == i) {
            icr icrVar3 = jedVar2.w;
            int i4 = 0;
            while (true) {
                if (icrVar3 == null || i4 >= i) {
                    break;
                }
                if (humVar2 == null) {
                    itw.b("expected prior modifier list to be non-empty");
                    throw new fcta();
                }
                icq icqVar = (icq) humVar2.a[i4];
                icq icqVar2 = (icq) humVar3.a[i4];
                int iA = jeg.a(icqVar, icqVar2);
                if (iA == 0) {
                    icrVar3 = icrVar3.v;
                    break;
                }
                if (iA == 1) {
                    jee.m(icqVar, icqVar2, icrVar3);
                }
                icrVar3 = icrVar3.w;
                i4++;
            }
            if (i4 < i) {
                if (humVar2 == null) {
                    itw.b("expected prior modifier list to be non-empty");
                    throw new fcta();
                }
                if (icrVar3 == null) {
                    itw.b("structuralUpdate requires a non-null tail");
                    throw new fcta();
                }
                humVar = humVar3;
                icr icrVar4 = icrVar3;
                jeeVar = jeeVar2;
                jeeVar.g(i4, humVar2, humVar, icrVar4, !jeeVar2.a.aj());
                jedVar = jedVar2;
            }
            jeeVar = jeeVar2;
            humVar = humVar3;
            jedVar = jedVar2;
            z = false;
        } else {
            jcr jcrVar = jeeVar2.a;
            if (jcrVar.aj() && i == 0) {
                icr icrVarK = jedVar2;
                for (int i5 = 0; i5 < humVar3.b; i5++) {
                    icrVarK = jee.k((icq) humVar3.a[i5], icrVarK);
                }
                jeeVar2.h();
                jeeVar = jeeVar2;
                humVar = humVar3;
                jedVar = jedVar2;
            } else if (i3 != 0) {
                if (humVar2 == null) {
                    humVar2 = new hum(new icq[16]);
                }
                jeeVar = jeeVar2;
                humVar = humVar3;
                jedVar = jedVar2;
                jeeVar.g(0, humVar2, humVar, jedVar, !jcrVar.aj());
            } else {
                if (humVar2 == null) {
                    itw.b("expected prior modifier list to be non-empty");
                    throw new fcta();
                }
                icr icrVar5 = jedVar2.w;
                for (int i6 = 0; icrVar5 != null && i6 < humVar2.b; i6++) {
                    icrVar5 = jee.l(icrVar5).w;
                }
                jbx jbxVar = jeeVar2.c;
                jcr jcrVarS = jcrVar.s();
                jbxVar.x = jcrVarS != null ? jcrVarS.w() : null;
                jeeVar2.d = jbxVar;
                jeeVar = jeeVar2;
                humVar = humVar3;
                jedVar = jedVar2;
                z = false;
            }
        }
        jeeVar.g = humVar;
        if (humVar2 != null) {
            humVar2.g();
        } else {
            humVar2 = null;
        }
        jeeVar.h = humVar2;
        icr icrVar6 = jedVar.w;
        if (icrVar6 == null) {
            icrVar6 = jeeVar.e;
        }
        icrVar6.v = null;
        jedVar.w = null;
        jedVar.u = -1;
        jedVar.y = null;
        if (icrVar6 == jedVar) {
            itw.d("trimChain did not update the head");
        }
        jeeVar.f = icrVar6;
        if (z) {
            jeeVar.i();
        }
        boolean zJ3 = jeeVar.j(16);
        boolean zJ4 = jeeVar.j(1024);
        this.w.m();
        if (this.j == null && jeeVar.j(512)) {
            aL(this);
        }
        if (zJ == zJ3 && zJ2 == zJ4) {
            return;
        }
        jua juaVar = ((AndroidComposeView) jcv.a(this)).p;
        if (d()) {
            jty jtyVar = juaVar.a;
            int i7 = this.c & 67108863;
            long[] jArr = jtyVar.a;
            int i8 = jtyVar.c;
            for (int i9 = 0; i9 < jArr.length - 2 && i9 < i8; i9 += 3) {
                int i10 = i9 + 2;
                long j = jArr[i10];
                if ((((int) j) & 67108863) == i7) {
                    jArr[i10] = ((zJ3 ? 1L : 0L) * Long.MIN_VALUE) | (4611686018427387903L & j) | ((zJ4 ? 1L : 0L) * 4611686018427387904L);
                    return;
                }
            }
        }
    }

    private final void aI() {
        jcr jcrVar;
        if (this.H > 0) {
            this.K = true;
        }
        if (!this.G || (jcrVar = this.L) == null) {
            return;
        }
        jcrVar.aI();
    }

    private final void aJ(jcr jcrVar) {
        if (jcrVar.w.k > 0) {
            this.w.g(r0.k - 1);
        }
        if (this.k != null) {
            jcrVar.K();
        }
        jcrVar.L = null;
        jcrVar.x().x = null;
        if (jcrVar.G) {
            this.H--;
            hum humVar = jcrVar.I.a;
            Object[] objArr = humVar.a;
            int i = humVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((jcr) objArr[i2]).x().x = null;
            }
        }
        aI();
        X();
    }

    private final void aK() {
        Q();
        jcr jcrVarS = s();
        if (jcrVarS != null) {
            jcrVarS.O();
        }
        P();
    }

    private final void aL(jcr jcrVar) {
        if (fdbq.f(jcrVar, this.j)) {
            return;
        }
        this.j = jcrVar;
        if (jcrVar != null) {
            jcw jcwVar = this.w;
            if (jcwVar.p == null) {
                jcwVar.p = new jdm(jcwVar);
            }
            jer jerVar = w().w;
            for (jer jerVarX = x(); !fdbq.f(jerVarX, jerVar) && jerVarX != null; jerVarX = jerVarX.w) {
                jerVarX.D();
            }
        } else {
            jcw jcwVar2 = this.w;
            jcwVar2.p = null;
            jcwVar2.e = false;
            jcwVar2.d = false;
        }
        Q();
    }

    static /* synthetic */ String as(jcr jcrVar) {
        return jcrVar.aF(0);
    }

    public static /* synthetic */ void aw(jcr jcrVar, boolean z, int i) {
        jcr jcrVarS;
        if (jcrVar.j == null) {
            itw.d("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        jfh jfhVar = jcrVar.k;
        if (jfhVar == null || jcrVar.n || jcrVar.G) {
            return;
        }
        int i2 = i & 2;
        int i3 = i & 1;
        int i4 = i & 4;
        boolean z2 = i2 != 0;
        boolean z3 = 1 == ((z ? 1 : 0) & (i3 ^ 1));
        jfhVar.u(jcrVar, true, z3, z2);
        if (i4 != 0) {
            jdm jdmVarU = jcrVar.u();
            jdmVarU.getClass();
            jcr jcrVarS2 = jdmVarU.o().s();
            int i5 = jdmVarU.o().C;
            if (jcrVarS2 == null || i5 == 3) {
                return;
            }
            while (jcrVarS2.C == i5 && (jcrVarS = jcrVarS2.s()) != null) {
                jcrVarS2 = jcrVarS;
            }
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 == 0) {
                if (jcrVarS2.j != null) {
                    aw(jcrVarS2, z3, 6);
                    return;
                } else {
                    ay(jcrVarS2, z3, 6);
                    return;
                }
            }
            if (i6 != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (jcrVarS2.j != null) {
                jcrVarS2.ab(z3);
            } else {
                jcrVarS2.ac(z3);
            }
        }
    }

    public static /* synthetic */ void ay(jcr jcrVar, boolean z, int i) {
        jfh jfhVar;
        jcr jcrVarS;
        if (jcrVar.n || jcrVar.G || (jfhVar = jcrVar.k) == null) {
            return;
        }
        int i2 = i & 2;
        int i3 = i & 1;
        int i4 = i & 4;
        boolean z2 = i2 != 0;
        boolean z3 = 1 == ((z ? 1 : 0) & (i3 ^ 1));
        jfhVar.u(jcrVar, false, z3, z2);
        if (i4 != 0) {
            jdv jdvVarV = jcrVar.v();
            jcr jcrVarS2 = jdvVarV.o().s();
            int i5 = jdvVarV.o().C;
            if (jcrVarS2 == null || i5 == 3) {
                return;
            }
            while (jcrVarS2.C == i5 && (jcrVarS = jcrVarS2.s()) != null) {
                jcrVarS2 = jcrVarS;
            }
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 == 0) {
                ay(jcrVarS2, z3, 6);
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                jcrVarS2.ac(z3);
            }
        }
    }

    public final Boolean A() {
        jdm jdmVarU = u();
        if (jdmVarU != null) {
            return Boolean.valueOf(jdmVarU.n());
        }
        return null;
    }

    @Override // defpackage.jfi
    public final boolean B() {
        return d();
    }

    public final List C() {
        jdm jdmVarU = u();
        jdmVarU.getClass();
        jdmVarU.o().E();
        if (!jdmVarU.r) {
            return jdmVarU.q.e();
        }
        jcr jcrVarO = jdmVarU.o();
        hum humVar = jdmVarU.q;
        hum humVarQ = jcrVarO.q();
        Object[] objArr = humVarQ.a;
        int i = humVarQ.b;
        for (int i2 = 0; i2 < i; i2++) {
            jcr jcrVar = (jcr) objArr[i2];
            if (humVar.b <= i2) {
                jdm jdmVar = jcrVar.w.p;
                jdmVar.getClass();
                humVar.n(jdmVar);
            } else {
                jdm jdmVar2 = jcrVar.w.p;
                jdmVar2.getClass();
                humVar.d(i2, jdmVar2);
            }
        }
        humVar.h(jcrVarO.E().size(), humVar.b);
        jdmVarU.r = false;
        return humVar.e();
    }

    public final List D() {
        return v().q();
    }

    public final List E() {
        return q().e();
    }

    @Override // defpackage.jse
    public final List F() {
        return E();
    }

    public final List G() {
        return this.I.a.e();
    }

    public final void H(jfh jfhVar) {
        jcr jcrVar;
        jsc jscVarY;
        if (this.k != null) {
            itw.d("Cannot attach " + this + " as it already is attached.  Tree: " + as(this));
        }
        jcr jcrVar2 = this.L;
        if (jcrVar2 != null && !fdbq.f(jcrVar2.k, jfhVar)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(jfhVar);
            sb.append(") than the parent's owner(");
            jcr jcrVarS = s();
            sb.append(jcrVarS != null ? jcrVarS.k : null);
            sb.append("). This tree: ");
            sb.append(as(this));
            sb.append(" Parent tree: ");
            jcr jcrVar3 = this.L;
            sb.append(jcrVar3 != null ? as(jcrVar3) : null);
            itw.d(sb.toString());
        }
        jcr jcrVarS2 = s();
        if (jcrVarS2 == null) {
            v().s = true;
            jdm jdmVarU = u();
            if (jdmVarU != null) {
                jdmVarU.x = 1;
            }
        }
        x().x = jcrVarS2 != null ? jcrVarS2.w() : null;
        this.k = jfhVar;
        this.m = (jcrVarS2 != null ? jcrVarS2.m : -1) + 1;
        ics icsVar = this.T;
        if (icsVar != null) {
            aH(icsVar);
        }
        this.T = null;
        AndroidComposeView androidComposeView = (AndroidComposeView) jfhVar;
        androidComposeView.o.f(this.c, this);
        if (this.i) {
            aL(this);
        } else {
            jcr jcrVar4 = this.L;
            if (jcrVar4 == null || (jcrVar = jcrVar4.j) == null) {
                jcrVar = this.j;
            }
            aL(jcrVar);
            if (this.j == null && this.v.j(512)) {
                aL(this);
            }
        }
        if (!this.B) {
            this.v.b();
        }
        hum humVar = this.I.a;
        Object[] objArr = humVar.a;
        int i = humVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((jcr) objArr[i2]).H(jfhVar);
        }
        if (!this.B) {
            this.v.e();
        }
        Q();
        if (jcrVarS2 != null) {
            jcrVarS2.Q();
        }
        jer jerVar = w().w;
        for (jer jerVarX = x(); !fdbq.f(jerVarX, jerVar) && jerVarX != null; jerVarX = jerVarX.w) {
            jerVarX.az(jerVarX.y, true);
            jfe jfeVar = jerVarX.E;
            if (jfeVar != null) {
                jfeVar.invalidate();
            }
        }
        fdap fdapVar = this.y;
        if (fdapVar != null) {
            fdapVar.invoke(jfhVar);
        }
        this.w.m();
        if (!this.B && this.v.j(8)) {
            R();
        }
        idh idhVar = androidComposeView.x;
        if (idhVar == null || (jscVarY = y()) == null || !idi.b(jscVarY)) {
            return;
        }
        idhVar.g.d(this.c);
        idhVar.i.a(idhVar.b, this.c, true);
    }

    public final void I() {
        this.U = this.C;
        this.C = 3;
        hum humVarQ = q();
        Object[] objArr = humVarQ.a;
        int i = humVarQ.b;
        for (int i2 = 0; i2 < i; i2++) {
            jcr jcrVar = (jcr) objArr[i2];
            if (jcrVar.C != 3) {
                jcrVar.I();
            }
        }
    }

    public final void J() {
        this.U = this.C;
        this.C = 3;
        hum humVarQ = q();
        Object[] objArr = humVarQ.a;
        int i = humVarQ.b;
        for (int i2 = 0; i2 < i; i2++) {
            jcr jcrVar = (jcr) objArr[i2];
            if (jcrVar.C == 2) {
                jcrVar.J();
            }
        }
    }

    public final void K() {
        jaj jajVar;
        jfh jfhVar = this.k;
        if (jfhVar == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            jcr jcrVarS = s();
            sb.append(jcrVarS != null ? as(jcrVarS) : null);
            itw.b(sb.toString());
            throw new fcta();
        }
        jcr jcrVarS2 = s();
        if (jcrVarS2 != null) {
            jcrVarS2.O();
            jcrVarS2.Q();
            v().G = 3;
            jdm jdmVarU = u();
            if (jdmVarU != null) {
                jdmVarU.w = 3;
            }
        }
        jcw jcwVar = this.w;
        jcwVar.o.w.h();
        jdm jdmVar = jcwVar.p;
        if (jdmVar != null && (jajVar = jdmVar.p) != null) {
            jajVar.h();
        }
        fdap fdapVar = this.z;
        if (fdapVar != null) {
            fdapVar.invoke(jfhVar);
        }
        jee jeeVar = this.v;
        jeeVar.f();
        this.n = true;
        hum humVar = this.I.a;
        Object[] objArr = humVar.a;
        int i = humVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((jcr) objArr[i2]).K();
        }
        this.n = false;
        jeeVar.c();
        AndroidComposeView androidComposeView = (AndroidComposeView) jfhVar;
        androidComposeView.o.d(this.c);
        jdo jdoVar = androidComposeView.D;
        jdoVar.b.d(this);
        jdoVar.e.a.m(this);
        androidComposeView.L();
        androidComposeView.p.f(this);
        idh idhVar = androidComposeView.x;
        if (idhVar != null && idhVar.g.e(this.c)) {
            idhVar.i.a(idhVar.b, this.c, false);
        }
        this.k = null;
        aL(null);
        this.m = 0;
        jdv jdvVarV = v();
        jdvVarV.i = Alert.DURATION_SHOW_INDEFINITELY;
        jdvVarV.h = Alert.DURATION_SHOW_INDEFINITELY;
        jdvVarV.s = false;
        jdm jdmVarU2 = u();
        if (jdmVarU2 != null) {
            jdmVarU2.i = Alert.DURATION_SHOW_INDEFINITELY;
            jdmVarU2.h = Alert.DURATION_SHOW_INDEFINITELY;
            jdmVarU2.x = 3;
        }
        if (jeeVar.j(8)) {
            jsc jscVar = this.M;
            this.M = null;
            this.o = false;
            androidComposeView.q.b(this, jscVar);
            jfhVar.w();
        }
    }

    public final void L(ijb ijbVar, ini iniVar) throws Throwable {
        try {
            x().ai(ijbVar, iniVar);
        } catch (Throwable th) {
            az(th);
            throw new fcta();
        }
    }

    public final void M(long j, jbu jbuVar, int i, boolean z) {
        x().al(jer.r, jer.aD(x(), j), jbuVar, i, z);
    }

    public final void N(int i, jcr jcrVar) {
        if (jcrVar.L != null && jcrVar.k != null) {
            itw.d(aG(jcrVar));
        }
        jcrVar.L = this;
        this.I.b(i, jcrVar);
        X();
        if (jcrVar.G) {
            this.H++;
        }
        aI();
        jfh jfhVar = this.k;
        if (jfhVar != null) {
            jcrVar.H(jfhVar);
        }
        if (jcrVar.w.k > 0) {
            jcw jcwVar = this.w;
            jcwVar.g(jcwVar.k + 1);
        }
    }

    public final void O() {
        if (this.R) {
            jer jerVarW = w();
            jer jerVar = x().x;
            this.Q = null;
            while (true) {
                if (fdbq.f(jerVarW, jerVar)) {
                    break;
                }
                if ((jerVarW != null ? jerVarW.E : null) != null) {
                    this.Q = jerVarW;
                    break;
                }
                jerVarW = jerVarW != null ? jerVarW.x : null;
            }
        }
        jer jerVar2 = this.Q;
        if (jerVar2 != null && jerVar2.E == null) {
            itw.b("layer was not set");
            throw new fcta();
        }
        if (jerVar2 != null) {
            jerVar2.am();
            return;
        }
        jcr jcrVarS = s();
        if (jcrVarS != null) {
            jcrVarS.O();
        }
    }

    public final void P() {
        jer jerVarX = x();
        jer jerVarW = w();
        while (jerVarX != jerVarW) {
            jerVarX.getClass();
            jcg jcgVar = (jcg) jerVarX;
            jfe jfeVar = jcgVar.E;
            if (jfeVar != null) {
                jfeVar.invalidate();
            }
            jerVarX = jcgVar.w;
        }
        jfe jfeVar2 = w().E;
        if (jfeVar2 != null) {
            jfeVar2.invalidate();
        }
    }

    public final void Q() {
        if (this.G) {
            jcr jcrVarS = s();
            if (jcrVarS != null) {
                jcrVarS.Q();
                return;
            }
            return;
        }
        this.g = true;
        if (this.j != null) {
            aw(this, false, 7);
        } else {
            ay(this, false, 7);
        }
    }

    public final void R() {
        if (this.p) {
            return;
        }
        if (this.v.b.w != null || aj()) {
            this.o = true;
            return;
        }
        jsc jscVar = this.M;
        this.p = true;
        fdci fdciVar = new fdci();
        fdciVar.a = new jsc();
        jfr jfrVar = ((AndroidComposeView) jcv.a(this)).A;
        jfrVar.d(this, jfrVar.b, new jcq(this, fdciVar));
        this.p = false;
        this.M = (jsc) fdciVar.a;
        this.o = false;
        jfh jfhVarA = jcv.a(this);
        ((AndroidComposeView) jfhVarA).q.b(this, jscVar);
        jfhVarA.w();
    }

    public final void S() {
        jcr jcrVarS;
        if (this.C == 3) {
            J();
        }
        jdm jdmVarU = u();
        jdmVarU.getClass();
        try {
            jdmVarU.g = true;
            if (!jdmVarU.k) {
                itw.d("replace() called on item that was not placed");
            }
            jdmVarU.v = false;
            boolean zN = jdmVarU.n();
            jdmVarU.D(jdmVarU.m, jdmVarU.n, jdmVarU.o);
            if (zN && !jdmVarU.v && (jcrVarS = jdmVarU.o().s()) != null) {
                jcrVarS.ab(false);
            }
        } finally {
            jdmVarU.g = false;
        }
    }

    public final void T() {
        this.w.o.r();
    }

    public final void U() {
        this.w.d = true;
    }

    public final void V() {
        this.w.o.s();
    }

    public final void W(int i, int i2, int i3) {
        if (i != i2) {
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i > i2 ? i + i4 : i;
                int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
                jea jeaVar = this.I;
                jeaVar.b(i6, (jcr) jeaVar.a(i5));
            }
            X();
            aI();
            Q();
        }
    }

    public final void X() {
        if (!this.G) {
            this.O = true;
            return;
        }
        jcr jcrVarS = s();
        if (jcrVarS != null) {
            jcrVarS.X();
        }
    }

    public final void Y() {
        jea jeaVar = this.I;
        hum humVar = jeaVar.a;
        int i = humVar.b;
        while (true) {
            i--;
            if (i < 0) {
                humVar.g();
                jeaVar.b.invoke();
                return;
            }
            aJ((jcr) humVar.a[i]);
        }
    }

    public final void Z(int i, int i2) {
        if (i2 < 0) {
            itw.c(a.e(i2, "count (", ") must be greater than 0"));
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            jea jeaVar = this.I;
            aJ((jcr) jeaVar.a.a[i3]);
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    @Override // defpackage.iwd
    public final int a() {
        return this.c;
    }

    public final void aA() {
        this.R = true;
    }

    public final void aB() {
        this.g = false;
    }

    public final int aC() {
        return this.w.q;
    }

    public final int aD() {
        return v().G;
    }

    public final int aE() {
        int i;
        jdm jdmVarU = u();
        if (jdmVarU == null || (i = jdmVarU.w) == 0) {
            return 3;
        }
        return i;
    }

    public final void aa() {
        jcr jcrVarS;
        if (this.C == 3) {
            J();
        }
        jdv jdvVarV = v();
        try {
            jdvVarV.g = true;
            if (!jdvVarV.k) {
                itw.d("replace called on unplaced item");
            }
            boolean z = jdvVarV.s;
            jdvVarV.B(jdvVarV.m, jdvVarV.p, jdvVarV.n, jdvVarV.o);
            if (z && !jdvVarV.B && (jcrVarS = jdvVarV.o().s()) != null) {
                jcrVarS.ac(false);
            }
        } finally {
        }
    }

    public final void ab(boolean z) {
        jfh jfhVar;
        if (this.G || (jfhVar = this.k) == null) {
            return;
        }
        jfhVar.v(this, true, z);
    }

    public final void ac(boolean z) {
        jfh jfhVar;
        this.g = true;
        if (this.G || (jfhVar = this.k) == null) {
            return;
        }
        jfhVar.v(this, false, z);
    }

    public final void ad(jcr jcrVar) {
        int iAC = jcrVar.aC();
        int i = iAC - 1;
        if (iAC == 0) {
            throw null;
        }
        if (i != 4) {
            int iAC2 = jcrVar.aC();
            Objects.toString(jcn.a(iAC2));
            throw new IllegalStateException("Unexpected state ".concat(jcn.a(iAC2)));
        }
        if (jcrVar.am()) {
            aw(jcrVar, true, 6);
            return;
        }
        if (jcrVar.al()) {
            jcrVar.ab(true);
        }
        if (jcrVar.an()) {
            ay(jcrVar, true, 6);
        } else if (jcrVar.ak()) {
            jcrVar.ac(true);
        }
    }

    public final void ae() {
        jee jeeVar = this.v;
        for (icr icrVar = jeeVar.e; icrVar != null; icrVar = icrVar.v) {
            if (icrVar.C) {
                icrVar.H();
            }
        }
        jeeVar.f();
        jeeVar.c();
    }

    public final void af() {
        hum humVarQ = q();
        Object[] objArr = humVarQ.a;
        int i = humVarQ.b;
        for (int i2 = 0; i2 < i; i2++) {
            jcr jcrVar = (jcr) objArr[i2];
            int i3 = jcrVar.U;
            jcrVar.C = i3;
            if (i3 != 3) {
                jcrVar.af();
            }
        }
    }

    public final void ag(kio kioVar) {
        if (fdbq.f(this.r, kioVar)) {
            return;
        }
        this.r = kioVar;
        aK();
        for (icr icrVar = this.v.f; icrVar != null; icrVar = icrVar.w) {
            icrVar.dM();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [icr] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [icr] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [hum] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [hum] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void ah(jou jouVar) {
        if (fdbq.f(this.t, jouVar)) {
            return;
        }
        this.t = jouVar;
        jee jeeVar = this.v;
        if ((jeeVar.a() & 16) != 0) {
            for (icr icrVar = jeeVar.f; icrVar != null; icrVar = icrVar.w) {
                if ((icrVar.t & 16) != 0) {
                    jbi jbiVarA = icrVar;
                    ?? humVar = 0;
                    while (jbiVarA != 0) {
                        if (jbiVarA instanceof jfv) {
                            ((jfv) jbiVarA).eb();
                        } else if ((jbiVarA.t & 16) != 0 && (jbiVarA instanceof jbi)) {
                            icr icrVar2 = jbiVarA.E;
                            int i = 0;
                            jbiVarA = jbiVarA;
                            humVar = humVar;
                            while (icrVar2 != null) {
                                if ((icrVar2.t & 16) != 0) {
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
                if ((icrVar.u & 16) == 0) {
                    return;
                }
            }
        }
    }

    public final void ai() {
        if (this.H <= 0 || !this.K) {
            return;
        }
        this.K = false;
        hum humVar = this.J;
        if (humVar == null) {
            humVar = new hum(new jcr[16]);
            this.J = humVar;
        }
        humVar.g();
        hum humVar2 = this.I.a;
        Object[] objArr = humVar2.a;
        int i = humVar2.b;
        for (int i2 = 0; i2 < i; i2++) {
            jcr jcrVar = (jcr) objArr[i2];
            if (jcrVar.G) {
                humVar.o(humVar.b, jcrVar.q());
            } else {
                humVar.n(jcrVar);
            }
        }
        this.w.d();
    }

    public final boolean aj() {
        return this.T != null;
    }

    public final boolean ak() {
        return this.w.n();
    }

    public final boolean al() {
        return this.w.e;
    }

    public final boolean am() {
        return this.w.d;
    }

    public final boolean an() {
        return this.w.o.u;
    }

    public final boolean ao() {
        return v().t;
    }

    @Override // defpackage.jse
    public final boolean ap() {
        return x().aB();
    }

    public final boolean aq(kil kilVar) {
        if (kilVar == null || this.j == null) {
            return false;
        }
        jdm jdmVarU = u();
        jdmVarU.getClass();
        return jdmVarU.C(kilVar.a);
    }

    public final boolean ar(kil kilVar) {
        if (kilVar == null) {
            return false;
        }
        if (this.C == 3) {
            I();
        }
        return v().C(kilVar.a);
    }

    public final void at(long j, jbu jbuVar, boolean z) {
        x().al(jer.s, jer.aD(x(), j), jbuVar, 1, z);
    }

    public final void az(Throwable th) throws Throwable {
        ibk ibkVar = (ibk) this.D.h(ibm.a);
        if (ibkVar == null) {
            throw th;
        }
        ibkVar.b(th, this);
        throw th;
    }

    @Override // defpackage.hmh
    public final void b() {
        kkt kktVar = this.l;
        if (kktVar != null) {
            kktVar.b();
        }
        iwy iwyVar = this.x;
        if (iwyVar != null) {
            iwyVar.b();
        }
        this.B = true;
        ae();
        if (d()) {
            this.M = null;
            this.o = false;
        }
        jfh jfhVar = this.k;
        if (jfhVar != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) jfhVar;
            androidComposeView.p.f(this);
            idh idhVar = androidComposeView.x;
            if (idhVar == null || !idhVar.g.e(this.c)) {
                return;
            }
            idhVar.i.a(idhVar.b, this.c, false);
        }
    }

    @Override // defpackage.hmh
    public final void c() {
        kkt kktVar = this.l;
        if (kktVar != null) {
            kktVar.c();
        }
        iwy iwyVar = this.x;
        if (iwyVar != null) {
            iwyVar.f();
        }
        jer jerVar = w().w;
        for (jer jerVarX = x(); !fdbq.f(jerVarX, jerVar) && jerVarX != null; jerVarX = jerVarX.w) {
            jerVarX.at();
        }
    }

    @Override // defpackage.iwd
    public final boolean d() {
        return this.k != null;
    }

    @Override // defpackage.iwd
    public final boolean e() {
        return this.B;
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
    @Override // defpackage.jfg
    public final void ew() {
        icr icrVar;
        jer jerVarW = w();
        boolean zH = jet.h(128);
        if (zH) {
            icrVar = ((jbx) jerVarW).f;
        } else {
            icrVar = ((jbx) jerVarW).f.v;
            if (icrVar == null) {
                return;
            }
        }
        for (icr icrVarAd = jerVarW.ad(zH); icrVarAd != null && (icrVarAd.u & 128) != 0; icrVarAd = icrVarAd.w) {
            if ((icrVarAd.t & 128) != 0) {
                jbi jbiVarA = icrVarAd;
                ?? humVar = 0;
                while (jbiVarA != 0) {
                    if (jbiVarA instanceof jcb) {
                        ((jcb) jbiVarA).ea(w());
                    } else if ((jbiVarA.t & 128) != 0 && (jbiVarA instanceof jbi)) {
                        icr icrVar2 = jbiVarA.E;
                        int i = 0;
                        jbiVarA = jbiVarA;
                        humVar = humVar;
                        while (icrVar2 != null) {
                            if ((icrVar2.t & 128) != 0) {
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
            if (icrVarAd == icrVar) {
                return;
            }
        }
    }

    @Override // defpackage.iwd
    public final boolean f() {
        return v().s;
    }

    @Override // defpackage.iyq
    public final void g() {
        if (this.j != null) {
            aw(this, false, 5);
        } else {
            ay(this, false, 5);
        }
        kil kilVarB = this.w.b();
        if (kilVarB != null) {
            jfh jfhVar = this.k;
            if (jfhVar != null) {
                jfhVar.r(this, kilVarB.a);
                return;
            }
            return;
        }
        jfh jfhVar2 = this.k;
        if (jfhVar2 != null) {
            jfhVar2.q(true);
        }
    }

    @Override // defpackage.jbc
    public final void h(ixm ixmVar) {
        if (fdbq.f(this.q, ixmVar)) {
            return;
        }
        this.q = ixmVar;
        jbz jbzVar = this.P;
        if (jbzVar != null) {
            jbzVar.b.b(ixmVar);
        }
        Q();
    }

    @Override // defpackage.jbc
    public final void i(ics icsVar) {
        if (this.G && this.S != ics.e) {
            itw.c("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.B) {
            itw.c("modifier is updated when deactivated");
        }
        if (!d()) {
            this.T = icsVar;
            return;
        }
        aH(icsVar);
        if (this.o) {
            R();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [icr] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [icr] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [hum] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [hum] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // defpackage.jbc
    public final void k(hxi hxiVar) {
        this.D = hxiVar;
        ag((kio) hxiVar.h(jmh.e));
        kji kjiVar = (kji) hxiVar.h(jmh.j);
        if (this.s != kjiVar) {
            this.s = kjiVar;
            aK();
            for (icr icrVar = this.v.f; icrVar != null; icrVar = icrVar.w) {
                icrVar.dL();
            }
        }
        ah((jou) hxiVar.h(jmh.n));
        jee jeeVar = this.v;
        if ((jeeVar.a() & 32768) != 0) {
            for (icr icrVar2 = jeeVar.f; icrVar2 != null; icrVar2 = icrVar2.w) {
                if ((icrVar2.t & 32768) != 0) {
                    jbi jbiVarA = icrVar2;
                    ?? humVar = 0;
                    while (jbiVarA != 0) {
                        if (jbiVarA instanceof jbd) {
                            icr icrVarD = ((jbd) jbiVarA).D();
                            if (icrVarD.C) {
                                jet.g(icrVarD);
                            } else {
                                icrVarD.A = true;
                            }
                        } else if ((jbiVarA.t & 32768) != 0 && (jbiVarA instanceof jbi)) {
                            icr icrVar3 = jbiVarA.E;
                            int i = 0;
                            jbiVarA = jbiVarA;
                            humVar = humVar;
                            while (icrVar3 != null) {
                                if ((icrVar3.t & 32768) != 0) {
                                    i++;
                                    humVar = humVar;
                                    if (i == 1) {
                                        jbiVarA = icrVar3;
                                    } else {
                                        if (humVar == 0) {
                                            humVar = new hum(new icr[16]);
                                        }
                                        if (jbiVarA != 0) {
                                            humVar.n(jbiVarA);
                                        }
                                        humVar.n(icrVar3);
                                        jbiVarA = 0;
                                    }
                                }
                                icrVar3 = icrVar3.w;
                                jbiVarA = jbiVarA;
                                humVar = humVar;
                            }
                            if (i != 1) {
                            }
                        }
                        jbiVarA = jbg.a(humVar);
                    }
                }
                if ((icrVar2.u & 32768) == 0) {
                    return;
                }
            }
        }
    }

    public final float l() {
        return v().A;
    }

    public final int m() {
        return this.w.o.b;
    }

    public final int n() {
        return v().i;
    }

    public final int o() {
        return this.w.o.a;
    }

    public final hum p() {
        if (this.O) {
            hum humVar = this.N;
            humVar.g();
            humVar.o(humVar.b, q());
            humVar.j(b);
            this.O = false;
        }
        return this.N;
    }

    public final hum q() {
        ai();
        if (this.H == 0) {
            return this.I.a;
        }
        hum humVar = this.J;
        humVar.getClass();
        return humVar;
    }

    public final jbz r() {
        jbz jbzVar = this.P;
        if (jbzVar != null) {
            return jbzVar;
        }
        jbz jbzVar2 = new jbz(this, this.q);
        this.P = jbzVar2;
        return jbzVar2;
    }

    public final jcr s() {
        jcr jcrVar = this.L;
        while (jcrVar != null && jcrVar.G) {
            jcrVar = jcrVar.L;
        }
        return jcrVar;
    }

    public final jcu t() {
        return ((AndroidComposeView) jcv.a(this)).g;
    }

    public final String toString() {
        return jnm.a(this) + " children: " + E().size() + " measurePolicy: " + this.q;
    }

    public final jdm u() {
        return this.w.p;
    }

    public final jdv v() {
        return this.w.o;
    }

    public final jer w() {
        return this.v.c;
    }

    public final jer x() {
        return this.v.d;
    }

    @Override // defpackage.jse
    public final jsc y() {
        if (d() && !this.B && this.v.j(8)) {
            return this.M;
        }
        return null;
    }

    @Override // defpackage.jse
    public final jse z() {
        return s();
    }

    public jcr(boolean z, int i) {
        this.G = z;
        this.c = i;
        this.d = 9223372034707292159L;
        this.e = 0L;
        this.f = 9223372034707292159L;
        this.g = true;
        this.I = new jea(new hum(new jcr[16]), new jcp(this));
        this.N = new hum(new jcr[16]);
        this.O = true;
        this.q = E;
        this.r = jcv.a;
        this.s = kji.a;
        this.t = F;
        this.D = hnk.a;
        this.C = 3;
        this.U = 3;
        this.v = new jee(this);
        this.w = new jcw(this);
        this.R = true;
        this.S = ics.e;
    }

    public /* synthetic */ jcr(boolean z, int i, byte[] bArr) {
        this(1 == ((z ? 1 : 0) & ((i & 1) ^ 1)), jsh.a());
    }

    @Override // defpackage.jbc
    public final void j() {
    }
}
