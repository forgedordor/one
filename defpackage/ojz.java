package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ojz {
    public static final fdev a(oka okaVar) {
        return fdey.e(okaVar, new fdap() { // from class: ojy
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ojx ojxVar = (ojx) obj;
                ojxVar.getClass();
                if (!(ojxVar instanceof oka)) {
                    return null;
                }
                oka okaVar2 = (oka) ojxVar;
                return okaVar2.l(okaVar2.j());
            }
        });
    }

    public static final ojx b(oka okaVar) {
        okaVar.getClass();
        Iterator itA = a(okaVar).a();
        if (!itA.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = itA.next();
        while (itA.hasNext()) {
            next = itA.next();
        }
        return (ojx) next;
    }
}
