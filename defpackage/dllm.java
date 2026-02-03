package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dllm implements fdau {
    final /* synthetic */ dlls a;

    public dllm(dlls dllsVar) {
        this.a = dllsVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ego egoVar = (ego) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        egoVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(egoVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dlls dllsVar = this.a;
            hmlVar.v(-723913947);
            djrr djrrVar = dllsVar.b;
            if (djrrVar != null) {
                dllr.d(djrrVar, hmlVar, 0);
            }
            hmlVar.o();
            dllr.h(egoVar, dllsVar.a, dllsVar.c, hmlVar, iIntValue & 14);
            fdae fdaeVar = dllsVar.d;
            if (fdaeVar != null) {
                dllr.b(fdaeVar, hmlVar, 0);
            }
        }
        return fctx.a;
    }
}
