package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlln implements fdau {
    final /* synthetic */ dlls a;

    public dlln(dlls dllsVar) {
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
            hmlVar.v(-1926753589);
            djrr djrrVar = dllsVar.b;
            if (djrrVar != null) {
                dllr.c(djrrVar, hmlVar, 0);
            }
            hmlVar.o();
            String str = dllsVar.a;
            boolean z = false;
            List list = dllsVar.c;
            if (dllsVar.d != null) {
                z = true;
            }
            dllr.g(egoVar, str, list, z, hmlVar, iIntValue & 14);
        }
        return fctx.a;
    }
}
