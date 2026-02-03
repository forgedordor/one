package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhb extends icr implements jcd, jbp, jfy {
    public juo a;
    public jyq b;
    public kbi c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public ijh h;
    public fdap i;
    public fha j;
    private fdap k;
    private List l;
    private fdap m;
    private fgr n;
    private Map o;
    private fgl p;
    private fdap q;

    public /* synthetic */ fhb(juo juoVar, jyq jyqVar, kbi kbiVar, fdap fdapVar, int i, boolean z, int i2, int i3, List list, fdap fdapVar2, fgr fgrVar, ijh ijhVar, fdap fdapVar3) {
        this.a = juoVar;
        this.b = jyqVar;
        this.c = kbiVar;
        this.k = fdapVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.l = list;
        this.m = fdapVar2;
        this.n = fgrVar;
        this.h = ijhVar;
        this.i = fdapVar3;
    }

    private final fgl q(kio kioVar) {
        fgl fglVar;
        fha fhaVar = this.j;
        if (fhaVar != null && fhaVar.c && (fglVar = fhaVar.d) != null) {
            fglVar.g(kioVar);
            return fglVar;
        }
        fgl fglVarA = a();
        fglVarA.g(kioVar);
        return fglVarA;
    }

    public final fgl a() {
        if (this.p == null) {
            this.p = new fgl(this.a, this.b, this.c, this.d, this.e, this.f, this.l);
        }
        fgl fglVar = this.p;
        fglVar.getClass();
        return fglVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008a A[Catch: all -> 0x0117, TryCatch #0 {all -> 0x0117, blocks: (B:3:0x0005, B:26:0x0072, B:28:0x007d, B:30:0x008a, B:32:0x0091, B:33:0x0094, B:35:0x0098, B:37:0x009e, B:39:0x00ac, B:40:0x00b3, B:41:0x00bc, B:43:0x00c0, B:44:0x00c6, B:45:0x00e6, B:47:0x00ea, B:48:0x00ef, B:6:0x0018, B:8:0x0022, B:10:0x0028, B:22:0x0055, B:25:0x0066, B:13:0x0031, B:15:0x003b, B:17:0x0045, B:19:0x0050), top: B:54:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea A[Catch: all -> 0x0117, TryCatch #0 {all -> 0x0117, blocks: (B:3:0x0005, B:26:0x0072, B:28:0x007d, B:30:0x008a, B:32:0x0091, B:33:0x0094, B:35:0x0098, B:37:0x009e, B:39:0x00ac, B:40:0x00b3, B:41:0x00bc, B:43:0x00c0, B:44:0x00c6, B:45:0x00e6, B:47:0x00ea, B:48:0x00ef, B:6:0x0018, B:8:0x0022, B:10:0x0028, B:22:0x0055, B:25:0x0066, B:13:0x0031, B:15:0x003b, B:17:0x0045, B:19:0x0050), top: B:54:0x0005 }] */
    @Override // defpackage.jcd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ixn b(defpackage.ixp r9, defpackage.ixk r10, long r11) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhb.b(ixp, ixk, long):ixn");
    }

    @Override // defpackage.icr
    public final boolean dN() {
        return false;
    }

    @Override // defpackage.jfy
    public final /* synthetic */ boolean dP() {
        return false;
    }

    @Override // defpackage.jfy
    public final void dQ(jto jtoVar) {
        fdap fdapVar = this.q;
        if (fdapVar == null) {
            fdapVar = new fdap() { // from class: fgw
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    jyi jyiVarP;
                    fhb fhbVar = this.a;
                    List list = (List) obj;
                    jyi jyiVar = fhbVar.a().b;
                    if (jyiVar != null) {
                        jyq jyqVar = fhbVar.b;
                        ijh ijhVar = fhbVar.h;
                        jyq jyqVarZ = jyq.z(jyqVar, ijhVar != null ? ijhVar.a() : ije.h, 0L, null, null, 0L, 0, 0L, 16777214);
                        jyh jyhVar = jyiVar.a;
                        jyiVarP = jyiVar.p(new jyh(jyhVar.a, jyqVarZ, jyhVar.c, jyhVar.d, jyhVar.e, jyhVar.f, jyhVar.g, jyhVar.h, jyhVar.i, jyhVar.j), jyiVar.c);
                        list.add(jyiVarP);
                    } else {
                        jyiVarP = null;
                    }
                    return Boolean.valueOf(jyiVarP != null);
                }
            };
            this.q = fdapVar;
        }
        jtk.v(jtoVar, this.a);
        fha fhaVar = this.j;
        if (fhaVar != null) {
            jtk.x(jtoVar, fhaVar.b);
            jtk.s(jtoVar, fhaVar.c);
        }
        jtoVar.e(jsa.k, new jrn(null, new fdap() { // from class: fgx
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                fhb fhbVar = this.a;
                juo juoVar = (juo) obj;
                fha fhaVar2 = fhbVar.j;
                if (fhaVar2 == null) {
                    fha fhaVar3 = new fha(fhbVar.a, juoVar);
                    fgl fglVar = new fgl(juoVar, fhbVar.b, fhbVar.c, fhbVar.d, fhbVar.e, fhbVar.f, fcvo.a);
                    fglVar.g(fhbVar.a().a);
                    fhaVar3.d = fglVar;
                    fhbVar.j = fhaVar3;
                } else if (!fdbq.f(juoVar, fhaVar2.b)) {
                    fhaVar2.b = juoVar;
                    fgl fglVar2 = fhaVar2.d;
                    if (fglVar2 != null) {
                        fglVar2.h(juoVar, fhbVar.b, fhbVar.c, fhbVar.d, fhbVar.e, fhbVar.f, fcvo.a);
                    }
                }
                fhbVar.k();
                return true;
            }
        }));
        jtoVar.e(jsa.l, new jrn(null, new fdap() { // from class: fgy
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                boolean z;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                fhb fhbVar = this.a;
                fha fhaVar2 = fhbVar.j;
                if (fhaVar2 == null) {
                    z = false;
                } else {
                    fdap fdapVar2 = fhbVar.i;
                    if (fdapVar2 != null) {
                        fdapVar2.invoke(fhaVar2);
                    }
                    fha fhaVar3 = fhbVar.j;
                    if (fhaVar3 != null) {
                        fhaVar3.c = zBooleanValue;
                    }
                    fhbVar.k();
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }));
        jtoVar.e(jsa.m, new jrn(null, new fdae() { // from class: fgz
            @Override // defpackage.fdae
            public final Object invoke() {
                fhb fhbVar = this.a;
                fhbVar.i();
                fhbVar.k();
                return true;
            }
        }));
        jtoVar.e(jsa.a, new jrn(null, fdapVar));
    }

    @Override // defpackage.jcd
    public final int e(ivu ivuVar, ivt ivtVar, int i) {
        return q(ivuVar).a(i, ivuVar.q());
    }

    @Override // defpackage.jcd
    public final int f(ivu ivuVar, ivt ivtVar, int i) {
        return fbg.a(q(ivuVar).c(ivuVar.q()).a());
    }

    @Override // defpackage.jcd
    public final int g(ivu ivuVar, ivt ivtVar, int i) {
        return q(ivuVar).a(i, ivuVar.q());
    }

    @Override // defpackage.jcd
    public final int h(ivu ivuVar, ivt ivtVar, int i) {
        return fbg.a(((Number) q(ivuVar).c(ivuVar.q()).c.a()).floatValue());
    }

    public final void i() {
        this.j = null;
    }

    public final void j(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            a().h(this.a, this.b, this.c, this.d, this.e, this.f, this.l);
        }
        if (this.C) {
            if (z2 || (z && this.q != null)) {
                jfz.a(this);
            }
            if (z2 || z3 || z4) {
                jci.b(this);
                jbq.a(this);
            }
            if (z) {
                jbq.a(this);
            }
        }
    }

    public final void k() {
        jfz.a(this);
        jci.b(this);
        jbq.a(this);
    }

    public final boolean l(fdap fdapVar, fdap fdapVar2, fgr fgrVar, fdap fdapVar3) {
        boolean z;
        if (this.k != fdapVar) {
            this.k = fdapVar;
            z = true;
        } else {
            z = false;
        }
        if (this.m != fdapVar2) {
            this.m = fdapVar2;
            z = true;
        }
        if (!fdbq.f(this.n, fgrVar)) {
            this.n = fgrVar;
            z = true;
        }
        if (this.i == fdapVar3) {
            return z;
        }
        this.i = fdapVar3;
        return true;
    }

    public final boolean n(ijh ijhVar, jyq jyqVar) {
        boolean zF = fdbq.f(ijhVar, this.h);
        this.h = ijhVar;
        return (zF && jyqVar.w(this.b)) ? false : true;
    }

    public final boolean o(juo juoVar) {
        boolean zF = fdbq.f(this.a.b, juoVar.b);
        boolean zF2 = fdbq.f(this.a.a, juoVar.a);
        boolean z = true;
        if (zF && zF2) {
            z = false;
        }
        if (z) {
            this.a = juoVar;
        }
        if (!zF) {
            i();
        }
        return z;
    }

    public final boolean p(jyq jyqVar, List list, int i, int i2, boolean z, kbi kbiVar, int i3) {
        boolean z2 = !this.b.x(jyqVar);
        this.b = jyqVar;
        if (!fdbq.f(this.l, list)) {
            this.l = list;
            z2 = true;
        }
        if (this.g != i) {
            this.g = i;
            z2 = true;
        }
        if (this.f != i2) {
            this.f = i2;
            z2 = true;
        }
        if (this.e != z) {
            this.e = z;
            z2 = true;
        }
        if (!fdbq.f(this.c, kbiVar)) {
            this.c = kbiVar;
            z2 = true;
        }
        if (!khx.a(this.d, i3)) {
            this.d = i3;
            z2 = true;
        }
        if (fdbq.f(null, null)) {
            return z2;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    @Override // defpackage.jbp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(defpackage.imw r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhb.r(imw):void");
    }

    @Override // defpackage.jfy
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // defpackage.jbp
    public final /* synthetic */ void t() {
    }
}
