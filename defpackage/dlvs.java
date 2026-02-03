package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlvs implements fdae {
    final /* synthetic */ ekhx a;

    public dlvs(ekhx ekhxVar) {
        this.a = ekhxVar;
    }

    @Override // defpackage.fdae
    public final /* synthetic */ Object invoke() {
        ekhx ekhxVar = this.a;
        Set setG = fcvq.a;
        Iterator<E> it = ekhxVar.iterator();
        while (it.hasNext()) {
            setG = fcwm.g(setG, ((dlvm) it.next()).i);
        }
        return new dlvn(dlvt.b(setG));
    }
}
