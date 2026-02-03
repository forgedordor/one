package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdej extends fcuc {
    private final Iterator a;
    private final HashSet b = new HashSet();

    public fdej(Iterator it) {
        this.a = it;
    }

    @Override // defpackage.fcuc
    protected final void a() {
        Object next;
        do {
            Iterator it = this.a;
            if (!it.hasNext()) {
                b();
                return;
            }
            next = it.next();
        } while (!this.b.add(next));
        c(next);
    }
}
