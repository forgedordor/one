package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zxu implements fdat {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ kio c;
    final /* synthetic */ zxa d;
    final /* synthetic */ hcn e;
    final /* synthetic */ hox f;
    final /* synthetic */ hox g;

    public zxu(float f, float f2, kio kioVar, zxa zxaVar, hcn hcnVar, hox hoxVar, hox hoxVar2) {
        this.a = f;
        this.b = f2;
        this.c = kioVar;
        this.d = zxaVar;
        this.e = hcnVar;
        this.f = hoxVar;
        this.g = hoxVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            hmlVar.v(-1224400529);
            final float f = this.a;
            boolean zA = hmlVar.A(f);
            final float f2 = this.b;
            boolean zA2 = zA | hmlVar.A(f2);
            final kio kioVar = this.c;
            boolean zD = zA2 | hmlVar.D(kioVar);
            final hox hoxVar = this.f;
            final hox hoxVar2 = this.g;
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdap() { // from class: zxt
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        ((kio) obj3).getClass();
                        float fA = zya.a(hoxVar) - f;
                        hox hoxVar3 = hoxVar2;
                        int i = 0;
                        if (Float.compare(fA, f2) < 0) {
                            int iEn = (int) kioVar.en(-240.0f);
                            zya.b(hoxVar3, false);
                            i = iEn;
                        } else {
                            zya.b(hoxVar3, true);
                        }
                        return new kjb(i & 4294967295L);
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            ics icsVarA = efs.a(icoVar, (fdap) objF);
            zxa zxaVar = this.d;
            aahy.d(zxaVar.a, icsVarA, this.e, hmlVar, 0);
        }
        return fctx.a;
    }
}
