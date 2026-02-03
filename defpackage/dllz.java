package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dllz implements fdat {
    final /* synthetic */ dlmg a;
    final /* synthetic */ long b;
    final /* synthetic */ hcj c;

    public dllz(dlmg dlmgVar, long j, hcj hcjVar) {
        this.a = dlmgVar;
        this.b = j;
        this.c = hcjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dlmg dlmgVar = this.a;
            long j = this.b;
            hmlVar.v(5004770);
            final hcj hcjVar = this.c;
            boolean zF = hmlVar.F(hcjVar);
            Object objF = hmlVar.f();
            if (zF || objF == hmk.a) {
                objF = new fdae() { // from class: dlly
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        hcjVar.b();
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            dlmf.a(dlmgVar.b, j, (fdae) objF, hmlVar, 0);
        }
        return fctx.a;
    }
}
