package defpackage;

import defpackage.eooi;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eoox extends eooi.f {
    public static final eoou a;
    private static final eorz sQ = new eorz(eoox.class);
    volatile int remainingField;
    volatile Set<Throwable> seenExceptionsField = null;

    static {
        Throwable th;
        eoou eoowVar;
        try {
            eoowVar = new eoov();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            eoowVar = new eoow();
        }
        Throwable th3 = th;
        a = eoowVar;
        if (th3 != null) {
            sQ.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }

    public eoox(int i) {
        this.remainingField = i;
    }

    public abstract void d(Set set);
}
