package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdzp {
    public static final boolean a(fgle fgleVar) {
        fgle fgleVarB = fgleVar.b();
        if ((fgleVarB instanceof fgli) || (fgleVarB instanceof fgkm)) {
            return true;
        }
        if (fgleVarB == null) {
            return false;
        }
        fgle fgleVarB2 = fgleVar.b();
        fgleVarB2.getClass();
        return a(fgleVarB2);
    }

    public static final boolean b(diip diipVar) {
        diipVar.getClass();
        return (diipVar instanceof diin) && c(((diin) diipVar).a);
    }

    public static final boolean c(dijs dijsVar) {
        return dijsVar == dijs.i || dijsVar == dijs.j;
    }

    public static final boolean d(List list) {
        if (list.isEmpty()) {
            return false;
        }
        diip diipVar = (diip) fcva.S(list);
        if (b(diipVar)) {
            return true;
        }
        if (list.size() >= 2) {
            for (int size = list.size() - 2; size >= 0; size--) {
                diip diipVar2 = (diip) list.get(size);
                if (b(diipVar2) && diipVar2.a() >= diipVar.a() && diipVar2.b() <= diipVar.b()) {
                    return true;
                }
            }
        }
        return false;
    }
}
