package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajcz implements fdap {
    final /* synthetic */ List a;

    public ajcz(List list) {
        this.a = list;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ajcq ajcqVar = (ajcq) obj;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            ajcqVar.copyOnWrite();
            ajct ajctVar = (ajct) ajcqVar.instance;
            ajct ajctVar2 = ajct.a;
            ajctVar.a().remove(Integer.valueOf(iIntValue));
        }
        return fctx.a;
    }
}
