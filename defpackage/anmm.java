package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anmm implements eyif {
    public static ekgp a(Set set, Map map) {
        ekgp ekgpVarJ = ekgp.j(map);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ekgpVarJ = ((anml) it.next()).a(ekgpVarJ);
        }
        ekgpVarJ.getClass();
        return ekgpVarJ;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
