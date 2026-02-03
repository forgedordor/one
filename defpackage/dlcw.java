package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlcw implements fdau {
    public static final dlcw a = new dlcw();

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dlfg dlfgVar = (dlfg) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        dlfgVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(dlfgVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else if (dlfgVar instanceof dlfr) {
            hmlVar.v(1142326694);
            dldw.e((dlfr) dlfgVar, null, hmlVar, 0, 2);
            hmlVar.o();
        } else {
            if (!(dlfgVar instanceof dldf)) {
                hmlVar.v(1142324827);
                hmlVar.o();
                throw new fctg();
            }
            hmlVar.v(1142328909);
            dldc.a((dldf) dlfgVar, null, hmlVar, 0, 2);
            hmlVar.o();
        }
        return fctx.a;
    }
}
