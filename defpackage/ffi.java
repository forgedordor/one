package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffi extends jbi implements jfy {
    public kfm a;
    public kew b;
    public faj c;
    public boolean d;
    public final boolean e;
    public kel f;
    public fmx g;
    public kdy h;
    public igr i;

    public ffi(kfm kfmVar, kew kewVar, faj fajVar, boolean z, boolean z2, kel kelVar, fmx fmxVar, kdy kdyVar, igr igrVar) {
        this.a = kfmVar;
        this.b = kewVar;
        this.c = fajVar;
        this.d = z;
        this.e = z2;
        this.f = kelVar;
        this.g = fmxVar;
        this.h = kdyVar;
        this.i = igrVar;
        fmxVar.g = new fdae() { // from class: fez
            @Override // defpackage.fdae
            public final Object invoke() {
                jbg.i(this.a);
                return fctx.a;
            }
        };
    }

    public static final void a(faj fajVar, String str, boolean z) {
        if (z) {
            kfl kflVar = fajVar.c;
            if (kflVar != null) {
                fbo.b(fcva.g(new kdj(), new kde(str, 1)), fajVar.b, fajVar.p, kflVar);
                return;
            }
            fdap fdapVar = fajVar.p;
            int length = str.length();
            long jA = jyp.a(length, length);
            long j = jyo.a;
            fdapVar.invoke(new kew(str, jA, 4));
        }
    }

    @Override // defpackage.jfy
    public final /* synthetic */ boolean dP() {
        return false;
    }

    @Override // defpackage.jfy
    public final void dQ(jto jtoVar) {
        juo juoVar = this.b.b;
        fdeh[] fdehVarArr = jtk.a;
        jtn jtnVar = jte.D;
        fdeh[] fdehVarArr2 = jtk.a;
        fdeh fdehVar = fdehVarArr2[17];
        jtnVar.a(jtoVar, juoVar);
        juo juoVar2 = this.a.a;
        jtn jtnVar2 = jte.E;
        fdeh fdehVar2 = fdehVarArr2[18];
        jtnVar2.a(jtoVar, juoVar2);
        jtk.w(jtoVar, this.b.c);
        idj idjVar = idq.a;
        jtn jtnVar3 = jte.r;
        fdeh fdehVar3 = fdehVarArr2[9];
        jtnVar3.a(jtoVar, idjVar);
        jtoVar.e(jsa.g, new jrn(null, new fdap() { // from class: ffa
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ffi ffiVar = this.a;
                ffiVar.c.j(true);
                ffiVar.c.f(true);
                ffi.a(ffiVar.c, ((juo) obj).b, ffiVar.d);
                return true;
            }
        }));
        if (!this.d) {
            jtk.c(jtoVar);
        }
        boolean z = this.e;
        if (z) {
            jtoVar.e(jte.J, fctx.a);
        }
        boolean z2 = this.d;
        jtn jtnVar4 = jte.M;
        fdeh fdehVar4 = fdehVarArr2[25];
        jtnVar4.a(jtoVar, Boolean.valueOf(z2));
        jtoVar.e(jsa.a, new jrn(null, new fdap() { // from class: ffc
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                boolean z3;
                ffi ffiVar = this.a;
                List list = (List) obj;
                if (ffiVar.c.d() != null) {
                    fda fdaVarD = ffiVar.c.d();
                    fdaVarD.getClass();
                    list.add(fdaVarD.a);
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            }
        }));
        if (z2) {
            jtoVar.e(jsa.j, new jrn(null, new fdap() { // from class: ffd
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    String str = ((juo) obj).b;
                    ffi ffiVar = this.a;
                    ffi.a(ffiVar.c, str, ffiVar.d);
                    return true;
                }
            }));
            jtoVar.e(jsa.n, new jrn(null, new fdap() { // from class: ffe
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ffi ffiVar = this.a;
                    juo juoVar3 = (juo) obj;
                    boolean z3 = false;
                    if (ffiVar.d) {
                        kfl kflVar = ffiVar.c.c;
                        if (kflVar != null) {
                            List listG = fcva.g(new kds(), new kde(juoVar3, 1));
                            faj fajVar = ffiVar.c;
                            fbo.b(listG, fajVar.b, fajVar.p, kflVar);
                        } else {
                            String string = fdgn.w(ffiVar.b.a(), jyo.e(ffiVar.b.c), jyo.a(ffiVar.b.c), juoVar3).toString();
                            int iE = jyo.e(ffiVar.b.c) + juoVar3.a();
                            ffiVar.c.p.invoke(new kew(string, jyp.a(iE, iE), 4));
                        }
                        z3 = true;
                    }
                    return Boolean.valueOf(z3);
                }
            }));
        }
        jtoVar.e(jsa.i, new jrn(null, new fdau() { // from class: fff
            @Override // defpackage.fdau
            public final Object a(Object obj, Object obj2, Object obj3) {
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                ffi ffiVar = this.a;
                if (!zBooleanValue) {
                    iIntValue = ffiVar.f.b(iIntValue);
                }
                if (!zBooleanValue) {
                    iIntValue2 = ffiVar.f.b(iIntValue2);
                }
                boolean z3 = false;
                if (ffiVar.d && (iIntValue != jyo.e(ffiVar.b.c) || iIntValue2 != jyo.a(ffiVar.b.c))) {
                    if (Math.min(iIntValue, iIntValue2) < 0 || Math.max(iIntValue, iIntValue2) > ffiVar.b.b.a()) {
                        ffiVar.g.k();
                    } else {
                        if (zBooleanValue || iIntValue == iIntValue2) {
                            ffiVar.g.k();
                        } else {
                            ffiVar.g.j(true);
                        }
                        ffiVar.c.p.invoke(new kew(ffiVar.b.b, jyp.a(iIntValue, iIntValue2)));
                        z3 = true;
                    }
                }
                return Boolean.valueOf(z3);
            }
        }));
        int i = this.h.f;
        fdae fdaeVar = new fdae() { // from class: ffg
            @Override // defpackage.fdae
            public final Object invoke() {
                ffi ffiVar = this.a;
                ffiVar.c.q.invoke(new kdw(ffiVar.h.f));
                return true;
            }
        };
        jtoVar.e(jte.G, new kdw(i));
        jtoVar.e(jsa.o, new jrn(null, fdaeVar));
        jtk.h(jtoVar, null, new fdae() { // from class: ffh
            @Override // defpackage.fdae
            public final Object invoke() {
                ffi ffiVar = this.a;
                ezh.i(ffiVar.c, ffiVar.i);
                return true;
            }
        });
        jtk.i(jtoVar, null, new fdae() { // from class: few
            @Override // defpackage.fdae
            public final Object invoke() {
                this.a.g.j(true);
                return true;
            }
        });
        if (!jyo.i(this.b.c) && !z) {
            jtoVar.e(jsa.p, new jrn(null, new fdae() { // from class: fex
                @Override // defpackage.fdae
                public final Object invoke() {
                    this.a.g.H(true);
                    return true;
                }
            }));
            if (this.d) {
                jtoVar.e(jsa.q, new jrn(null, new fdae() { // from class: fey
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        this.a.g.D();
                        return true;
                    }
                }));
            }
        }
        if (this.d) {
            jtoVar.e(jsa.r, new jrn(null, new fdae() { // from class: ffb
                @Override // defpackage.fdae
                public final Object invoke() {
                    this.a.g.G();
                    return true;
                }
            }));
        }
    }

    @Override // defpackage.jfy
    public final boolean u() {
        return true;
    }
}
