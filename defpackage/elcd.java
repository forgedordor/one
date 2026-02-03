package defpackage;

import java.util.Deque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elcd extends elcf {
    public elcd(elca elcaVar) {
        super(elcaVar);
    }

    @Override // defpackage.elcf
    public final Object a(Deque deque) {
        Iterator it = (Iterator) deque.getFirst();
        if (!it.hasNext()) {
            deque.removeFirst();
            return null;
        }
        Object next = it.next();
        next.getClass();
        return next;
    }
}
