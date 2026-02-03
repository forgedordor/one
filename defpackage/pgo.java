package defpackage;

import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pgo extends pdu {
    private final pdz b;
    private final WeakReference c;

    public pgo(pdz pdzVar, pdu pduVar) {
        super(pduVar.a);
        this.b = pdzVar;
        this.c = new WeakReference(pduVar);
    }

    @Override // defpackage.pdu
    public final void a(Set set) {
        set.getClass();
        pdu pduVar = (pdu) this.c.get();
        if (pduVar != null) {
            pduVar.a(set);
            return;
        }
        pdz pdzVar = this.b;
        ReentrantLock reentrantLock = pdzVar.d;
        reentrantLock.lock();
        try {
            peh pehVar = (peh) pdzVar.c.remove(this);
            if (pehVar != null) {
                pgn pgnVar = pdzVar.b;
                if (pgnVar.c.b(pehVar.b)) {
                    pgy.a(new pdx(pdzVar, null));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
