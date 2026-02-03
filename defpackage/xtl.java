package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xtl implements fdat {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ boolean c;
    final /* synthetic */ xsi d;
    final /* synthetic */ fdap e;

    public xtl(int i, String str, boolean z, xsi xsiVar, fdap fdapVar) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = xsiVar;
        this.e = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            int i = this.a;
            ics icsVarJ = ics.e;
            if (i <= 2) {
                icsVarJ = efy.j(icsVarJ, 0.0f, 28.0f, 0.0f, 0.0f, 13);
            }
            String str = this.b;
            boolean z = this.c;
            final xsi xsiVar = this.d;
            boolean z2 = xsiVar == null;
            String str2 = "ThemeHolder " + (i + 1);
            hmlVar.v(-1633490746);
            final fdap fdapVar = this.e;
            boolean zD = hmlVar.D(fdapVar) | hmlVar.F(xsiVar);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdae() { // from class: xtk
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        fdapVar.invoke(xsiVar);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            xtn.l(icsVarJ, str, z, z2, str2, (fdae) objF, hmlVar, 0);
        }
        return fctx.a;
    }
}
