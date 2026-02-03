package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ghu implements fdat {
    final /* synthetic */ hhr a;
    final /* synthetic */ long b;
    final /* synthetic */ fddq c;
    final /* synthetic */ ics d;
    final /* synthetic */ geq e;
    final /* synthetic */ fdap f;
    final /* synthetic */ djll g;

    public ghu(hhr hhrVar, long j, fddq fddqVar, ics icsVar, geq geqVar, fdap fdapVar, djll djllVar) {
        this.a = hhrVar;
        this.b = j;
        this.c = fddqVar;
        this.d = icsVar;
        this.e = geqVar;
        this.f = fdapVar;
        this.g = djllVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (hmlVar.J((iIntValue & 3) != 2, iIntValue & 1)) {
            hhr hhrVar = this.a;
            final int i = hhrVar.f(hhrVar.c()).a;
            final int i2 = hhrVar.e(this.b).a;
            final fddq fddqVar = this.c;
            emi emiVarA = emm.a(Math.max(0, (i2 - fddqVar.a) - 3), hmlVar, 2);
            ekg ekgVar = new ekg();
            ics icsVar = this.d;
            final geq geqVar = this.e;
            ics icsVarA = dkl.a(icsVar, geqVar.a, ikj.a);
            ecj ecjVar = ecr.f;
            ecj ecjVarG = ecr.g(ghx.b);
            boolean zF = hmlVar.F(fddqVar) | hmlVar.B(i2) | hmlVar.B(i);
            final fdap fdapVar = this.f;
            boolean zD = zF | hmlVar.D(fdapVar);
            final djll djllVar = this.g;
            boolean zD2 = zD | hmlVar.D(djllVar) | hmlVar.D(geqVar);
            Object objF = hmlVar.f();
            if (zD2 || objF == hmk.a) {
                fdap fdapVar2 = new fdap() { // from class: ghr
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        fddq fddqVar2 = fddqVar;
                        elr.a((ekq) obj3, fcva.E(fddqVar2), null, new hxd(674613074, true, new ght(fddqVar2, i2, i, fdapVar, djllVar, geqVar)), 14);
                        return fctx.a;
                    }
                };
                hmlVar.y(fdapVar2);
                objF = fdapVar2;
            }
            ekn.b(ekgVar, icsVarA, emiVarA, null, ecjVarG, ecjVar, null, false, null, (fdap) objF, hmlVar, 1769472, 0, 920);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
