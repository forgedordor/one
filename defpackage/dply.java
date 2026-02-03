package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dply implements dplv {
    public final hox a;
    private final long b;
    private final dfw c;
    private final hsf d;
    private final hsf e;

    public dply(long j, hox hoxVar, hsf hsfVar, hsf hsfVar2, dfw dfwVar) {
        this.b = j;
        this.a = hoxVar;
        this.c = dfwVar;
        this.d = hsfVar;
        this.e = hsfVar2;
    }

    @Override // defpackage.dplt
    public final long a() {
        return this.b;
    }

    @Override // defpackage.dplz
    public final boolean b() {
        return !((Boolean) this.c.b()).booleanValue();
    }

    @Override // defpackage.dpmb
    public final dpmf c() {
        return (dpmf) this.e.a();
    }

    @Override // defpackage.dpmd
    public final /* synthetic */ ics d(ics icsVar, hml hmlVar) {
        icsVar.getClass();
        hmlVar.v(681801301);
        kio kioVar = (kio) hmlVar.e(jmh.e);
        dpmf dpmfVar = (dpmf) this.d.a();
        ics icsVarJ = efy.j(icsVar, 0.0f, kioVar.el(dpmfVar != null ? (int) (dpmfVar.a & 4294967295L) : 0), 0.0f, 0.0f, 13);
        ((hmw) hmlVar).ab();
        return icsVarJ;
    }

    @Override // defpackage.dpmb
    public final /* synthetic */ ics e(ics icsVar, hml hmlVar) {
        return dpma.a(this, icsVar, hmlVar);
    }

    @Override // defpackage.dplv
    public final ics f(ics icsVar, boolean z) {
        icsVar.getClass();
        ics icsVarA = ixy.a(icsVar, new fdap() { // from class: dplx
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ivy ivyVar = (ivy) obj;
                ivyVar.getClass();
                long jG = ivyVar.g();
                long jA = ivz.a(ivyVar);
                this.a.a.b(new dpmf(jG, (Math.round(Float.intBitsToFloat((int) (jA >> 32))) << 32) | (4294967295L & Math.round(Float.intBitsToFloat((int) (jA & 4294967295L))))));
                return fctx.a;
            }
        });
        if (!z) {
            return icsVarA;
        }
        ico icoVar = ics.e;
        icoVar.getClass();
        return icsVarA.a(dli.c(icoVar, null, null, false, null, null, new fdae() { // from class: dplw
            @Override // defpackage.fdae
            public final Object invoke() {
                this.a.h();
                return fctx.a;
            }
        }, 28));
    }

    @Override // defpackage.dplv
    public final void g() {
        this.c.d(false);
    }

    @Override // defpackage.dplv
    public final void h() {
        this.c.d(Boolean.valueOf(b()));
    }
}
