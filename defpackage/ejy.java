package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejy implements dyb {
    public static final hyr a = hxu.a(new fdat() { // from class: ejo
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            ejy ejyVar = (ejy) obj2;
            hyr hyrVar = ejy.a;
            return fcva.g(Integer.valueOf(ejyVar.b()), Integer.valueOf(ejyVar.c()));
        }
    }, new fdap() { // from class: ejp
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            List list = (List) obj;
            return new ejy(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    });
    public boolean b;
    public ejh c;
    public boolean d;
    public final ejm e;
    public final hox f;
    public float g;
    public iyq h;
    public final iyr i;
    public final emt j;
    public final LazyLayoutItemAnimator k;
    public final enc l;
    public final epj m;
    public final epf n;
    public final hox o;
    public final hox p;
    public final epm q;
    public final eid r;
    public final ebk s;
    private final dyb t;
    private int u;
    private boolean v;
    private final hox w;
    private final hox x;
    private final eju y;

    public ejy() {
        this(0, 0, new eid(null));
    }

    public static /* synthetic */ Object n(ejy ejyVar, int i, fcxy fcxyVar) {
        Object objE = ejyVar.e(dod.a, new ejx(ejyVar, i, null), fcxyVar);
        return objE == fcyl.a ? objE : fctx.a;
    }

    @Override // defpackage.dyb
    public final float a(float f) {
        return this.t.a(f);
    }

    public final int b() {
        return this.e.a();
    }

    public final int c() {
        return this.e.b();
    }

    public final eja d() {
        return (eja) this.f.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r8.e(r6, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.dod r6, defpackage.fdat r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ejw
            if (r0 == 0) goto L13
            r0 = r8
            ejw r0 = (defpackage.ejw) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ejw r0 = new ejw
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)
            goto L5b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r7 = r0.a
            dod r6 = r0.e
            defpackage.fctl.b(r8)
            goto L4b
        L3a:
            defpackage.fctl.b(r8)
            emt r8 = r5.j
            r0.e = r6
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r8.d(r0)
            if (r8 == r1) goto L5e
        L4b:
            dyb r8 = r5.t
            r2 = 0
            r0.e = r2
            r0.a = r2
            r0.d = r3
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r1) goto L5b
            goto L5e
        L5b:
            fctx r6 = defpackage.fctx.a
            return r6
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejy.e(dod, fdat, fcxy):java.lang.Object");
    }

    public final kio f() {
        return ((ejh) this.f.a()).g;
    }

    @Override // defpackage.dyb
    public final boolean g() {
        return ((Boolean) this.x.a()).booleanValue();
    }

    @Override // defpackage.dyb
    public final boolean h() {
        return ((Boolean) this.w.a()).booleanValue();
    }

    @Override // defpackage.dyb
    public final boolean i() {
        return this.t.i();
    }

    public final Object j(int i, int i2, fcxy fcxyVar) {
        Object objE = e(dod.a, new ejs(this, i, i2, null), fcxyVar);
        return objE == fcyl.a ? objE : fctx.a;
    }

    public final void k(ejh ejhVar, boolean z, boolean z2) {
        eji ejiVar;
        List list = ejhVar.i;
        this.m.e = list.size();
        if (!z && this.b) {
            this.c = ejhVar;
            hzg hzgVarA = hzf.a();
            fdap fdapVarK = hzgVarA != null ? hzgVarA.k() : null;
            hzg hzgVarB = hzf.b(hzgVarA);
            try {
                epm epmVar = this.q;
                if (((Number) epmVar.b.a()).floatValue() != 0.0f && (ejiVar = ejhVar.a) != null) {
                    int i = ejiVar.a;
                    ejm ejmVar = this.e;
                    if (i == ejmVar.a() && ejhVar.b == ejmVar.b()) {
                        fdlr fdlrVar = epmVar.a;
                        if (fdlrVar != null) {
                            fdlrVar.t(null);
                        }
                        epmVar.b = new deb(diu.a, Float.valueOf(0.0f), null, 60);
                    }
                }
                return;
            } finally {
                hzf.e(hzgVarA, hzgVarB, fdapVarK);
            }
        }
        if (z) {
            this.b = true;
        }
        eji ejiVar2 = ejhVar.a;
        this.x.b(Boolean.valueOf(((ejiVar2 == null || ejiVar2.a == 0) && ejhVar.b == 0) ? false : true));
        this.w.b(Boolean.valueOf(ejhVar.c));
        this.g -= ejhVar.d;
        this.f.b(ejhVar);
        if (z2) {
            ejm ejmVar2 = this.e;
            int i2 = ejhVar.b;
            if (i2 < 0.0f) {
                ebs.d("scrollOffset should be non-negative");
            }
            ejmVar2.d(i2);
        } else {
            eji ejiVar3 = (eji) fcva.P(list);
            eji ejiVar4 = (eji) fcva.T(list);
            kjv.a("firstVisibleItem:index", ejiVar3 != null ? ejiVar3.a : -1L);
            kjv.a("lastVisibleItem:index", ejiVar4 != null ? ejiVar4.a : -1L);
            ejm ejmVar3 = this.e;
            ejmVar3.b = ejiVar2 != null ? ejiVar2.d : null;
            if (ejmVar3.a || ejhVar.k > 0) {
                ejmVar3.a = true;
                int i3 = ejhVar.b;
                if (i3 < 0.0f) {
                    ebs.d("scrollOffset should be non-negative");
                }
                ejmVar3.e(ejiVar2 != null ? ejiVar2.a : 0, i3);
            }
            if (this.v) {
                eid eidVar = this.r;
                if (eidVar.a != -1 && !list.isEmpty()) {
                    if (eidVar.a != (eidVar.c ? ((eji) fcva.S(list)).a + 1 : ((eji) fcva.N(list)).a - 1)) {
                        eidVar.a = -1;
                        epi epiVar = eidVar.b;
                        if (epiVar != null) {
                            epiVar.a();
                        }
                        eidVar.b = null;
                    }
                }
            }
        }
        if (z) {
            this.q.b(ejhVar.e, ejhVar.g, ejhVar.f);
        }
        this.u++;
    }

    public final void l(float f, eja ejaVar) {
        epi epiVar;
        epi epiVar2;
        epi epiVar3;
        if (this.v) {
            eid eidVar = this.r;
            eju ejuVar = this.y;
            if (ejaVar.i().isEmpty()) {
                return;
            }
            boolean z = f < 0.0f;
            int i = z ? ((eji) fcva.S(ejaVar.i())).a + 1 : ((eji) fcva.N(ejaVar.i())).a - 1;
            if (i < 0 || i >= ejaVar.d()) {
                return;
            }
            if (i != eidVar.a) {
                if (eidVar.c != z && (epiVar3 = eidVar.b) != null) {
                    epiVar3.a();
                }
                eidVar.c = z;
                eidVar.a = i;
                ejy ejyVar = ejuVar.a;
                hzg hzgVarA = hzf.a();
                fdap fdapVarK = hzgVarA != null ? hzgVarA.k() : null;
                hzg hzgVarB = hzf.b(hzgVarA);
                try {
                    ejh ejhVar = (ejh) ejyVar.f.a();
                    hzf.e(hzgVarA, hzgVarB, fdapVarK);
                    ejy ejyVar2 = ejuVar.a;
                    eidVar.b = ejyVar2.m.a(i, ejhVar.h, ejyVar2.d, new fdap() { // from class: ejt
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            return fctx.a;
                        }
                    });
                } catch (Throwable th) {
                    hzf.e(hzgVarA, hzgVarB, fdapVarK);
                    throw th;
                }
            }
            if (!z) {
                if (ejaVar.f() - ((eji) fcva.N(ejaVar.i())).g >= f || (epiVar = eidVar.b) == null) {
                    return;
                }
                epiVar.b();
                return;
            }
            eji ejiVar = (eji) fcva.S(ejaVar.i());
            if (((ejiVar.g + ejiVar.h) + ejaVar.c()) - ejaVar.e() >= (-f) || (epiVar2 = eidVar.b) == null) {
                return;
            }
            epiVar2.b();
        }
    }

    public final void o(int i, int i2) {
        ejm ejmVar = this.e;
        if (ejmVar.a() != i || ejmVar.b() != i2) {
            this.k.c();
        }
        ejmVar.e(i, i2);
        ejmVar.b = null;
        iyq iyqVar = this.h;
        if (iyqVar != null) {
            iyqVar.g();
        }
    }

    public ejy(int i, int i2) {
        this(i, i2, new eid(null));
    }

    public ejy(final int i, int i2, eid eidVar) {
        this.r = eidVar;
        this.e = new ejm(i, i2);
        ejh ejhVar = ekb.a;
        hpb hpbVar = hpb.a;
        this.f = new hpl(ejhVar, hpbVar);
        this.s = new ebk();
        this.t = new dtd(new fdap() { // from class: ejq
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ejh ejhVar2;
                float f = -((Float) obj).floatValue();
                ejy ejyVar = this.a;
                if ((f >= 0.0f || ejyVar.h()) && (f <= 0.0f || ejyVar.g())) {
                    if (Math.abs(ejyVar.g) > 0.5f) {
                        ebs.d("entered drag with non-zero pending scroll");
                    }
                    ejyVar.d = true;
                    float f2 = ejyVar.g + f;
                    ejyVar.g = f2;
                    if (Math.abs(f2) > 0.5f) {
                        float f3 = ejyVar.g;
                        int iRound = Math.round(f3);
                        ejh ejhVarL = ((ejh) ejyVar.f.a()).l(iRound, !ejyVar.b);
                        if (ejhVarL != null && (ejhVar2 = ejyVar.c) != null) {
                            ejh ejhVarL2 = ejhVar2.l(iRound, true);
                            if (ejhVarL2 != null) {
                                ejyVar.c = ejhVarL2;
                            } else {
                                ejhVarL = null;
                            }
                        }
                        if (ejhVarL != null) {
                            ejyVar.k(ejhVarL, ejyVar.b, true);
                            eqs.b(ejyVar.p);
                            ejyVar.l(f3 - ejyVar.g, ejhVarL);
                        } else {
                            iyq iyqVar = ejyVar.h;
                            if (iyqVar != null) {
                                iyqVar.g();
                            }
                            ejyVar.l(f3 - ejyVar.g, ejyVar.d());
                        }
                    }
                    if (Math.abs(ejyVar.g) > 0.5f) {
                        f -= ejyVar.g;
                        ejyVar.g = 0.0f;
                    }
                } else {
                    f = 0.0f;
                }
                return Float.valueOf(-f);
            }
        });
        this.v = true;
        this.i = new ejv(this);
        this.j = new emt();
        this.k = new LazyLayoutItemAnimator();
        this.l = new enc();
        this.m = new epj(new fdap() { // from class: ejr
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                eph ephVar = (eph) obj;
                hzg hzgVarA = hzf.a();
                hzf.e(hzgVarA, hzf.b(hzgVarA), hzgVarA != null ? hzgVarA.k() : null);
                int i3 = ephVar.a;
                if (i3 == -1) {
                    i3 = 2;
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    ephVar.a(i + i4);
                }
                return fctx.a;
            }
        });
        this.y = new eju(this);
        this.n = new epf();
        fctx fctxVar = fctx.a;
        this.o = new hpl(fctxVar, hpbVar);
        hsi hsiVar = hsi.a;
        this.w = new hpl(false, hsiVar);
        this.x = new hpl(false, hsiVar);
        this.p = new hpl(fctxVar, hpbVar);
        this.q = new epm();
    }
}
