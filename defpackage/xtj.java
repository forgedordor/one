package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xtj implements fdat {
    final /* synthetic */ xsn a;
    final /* synthetic */ fdap b;
    final /* synthetic */ hsf c;
    final /* synthetic */ hox d;

    public xtj(xsn xsnVar, fdap fdapVar, hsf hsfVar, hox hoxVar) {
        this.a = xsnVar;
        this.b = fdapVar;
        this.c = hsfVar;
        this.d = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            gsp gspVarF = gos.f(true, hmlVar, 6, 2);
            long j = ije.g;
            evm evmVar = xsl.a;
            long jA = xsl.a(hmlVar);
            xsn xsnVar = this.a;
            diuy.c(null, gspVarF, j, jA, xsnVar, hxe.d(799993543, new xti(xsnVar, this.b, this.c, this.d), hmlVar), hmlVar, 196992, 1);
        }
        return fctx.a;
    }
}
