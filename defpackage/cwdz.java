package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwdz implements fdat {
    final /* synthetic */ boolean a;
    final /* synthetic */ hox b;
    final /* synthetic */ cwem c;
    final /* synthetic */ hox d;
    final /* synthetic */ int e;

    public cwdz(boolean z, int i, hox hoxVar, cwem cwemVar, hox hoxVar2) {
        this.a = z;
        this.e = i;
        this.b = hoxVar;
        this.c = cwemVar;
        this.d = hoxVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            boolean z = this.a;
            den denVar = cwdd.a;
            dia diaVarC = dea.c(350, 0, cwdd.b, 2);
            int i = this.e;
            cye.b(z, null, dae.c(diaVarC, 0.0f, cweb.c(i, hmlVar)), dae.f(dea.c(150, 0, cwdd.a, 2), 0.25f, cweb.c(i, hmlVar)), null, hxe.d(-368526049, new cwdy(this.b, this.c, this.d), hmlVar), hmlVar, 196608, 18);
        }
        return fctx.a;
    }
}
