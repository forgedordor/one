package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yfn implements fdat {
    final /* synthetic */ ejy a;
    final /* synthetic */ yen b;
    final /* synthetic */ oxm c;
    final /* synthetic */ float d;
    final /* synthetic */ eais e;

    public yfn(ejy ejyVar, yen yenVar, oxm oxmVar, float f, eais eaisVar) {
        this.a = ejyVar;
        this.b = yenVar;
        this.c = oxmVar;
        this.d = f;
        this.e = eaisVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ejy ejyVar = this.a;
            yen yenVar = this.b;
            hmlVar.v(5004770);
            oxm oxmVar = this.c;
            boolean zD = hmlVar.D(oxmVar);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new yce(oxmVar);
                hmlVar.y(objF);
            }
            hmlVar.o();
            ygj.d(ejyVar, yenVar, (yce) objF, this.d, this.e, hmlVar, 0);
        }
        return fctx.a;
    }
}
