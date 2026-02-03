package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zxv implements fdat {
    final /* synthetic */ gun a;
    final /* synthetic */ zxa b;
    final /* synthetic */ float c;

    public zxv(gun gunVar, zxa zxaVar, float f) {
        this.a = gunVar;
        this.b = zxaVar;
        this.c = f;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ics icsVarA;
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            gun gunVar = this.a;
            hmlVar.v(-1404539360);
            if (this.b.r.b) {
                float f = this.c;
                ico icoVar = ics.e;
                kio kioVar = (kio) hmlVar.e(jmh.e);
                icsVarA = efy.j(icoVar, 0.0f, 0.0f, 0.0f, ((kir) fddu.n(new kir(f - kioVar.el(ehv.g(hmlVar).a(kioVar))), new kir(0.0f))).a, 7);
            } else {
                icsVarA = ehr.a(ics.e);
            }
            hmlVar.o();
            guj.a(gunVar, icsVarA, null, hmlVar, 6, 4);
        }
        return fctx.a;
    }
}
