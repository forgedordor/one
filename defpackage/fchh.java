package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fchh extends fcdn {
    private final fchg e;
    private static final ReferenceQueue c = new ReferenceQueue();
    private static final ConcurrentMap d = new ConcurrentHashMap();
    public static final Logger b = Logger.getLogger(fchh.class.getName());

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fchh(fbqm fbqmVar) {
        super(fbqmVar);
        ReferenceQueue referenceQueue = c;
        ConcurrentMap concurrentMap = d;
        this.e = new fchg(this, fbqmVar, referenceQueue, concurrentMap);
    }

    @Override // defpackage.fcdn, defpackage.fbqm
    public final fbqm d() {
        int i = fchg.b;
        fchg fchgVar = this.e;
        if (!fchgVar.a.getAndSet(true)) {
            fchgVar.clear();
        }
        fbqm fbqmVar = this.a;
        ((fcgx) fbqmVar).q();
        return fbqmVar;
    }
}
