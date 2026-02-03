package defpackage;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eswc implements ebby {
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private final eswb b;
    private final ejwi c;

    public eswc(eswb eswbVar, ejwi ejwiVar) {
        this.b = eswbVar;
        this.c = ejwiVar;
    }

    @Override // defpackage.ebby
    public final void a() {
        if (Process.isIsolated() || a.getAndSet(true)) {
            return;
        }
        eieu eieuVarK = eiiy.k("AndroidLoggerConfig");
        try {
            eswb eswbVar = this.b;
            Object obj = ((ejwt) this.c).a;
            if (!ekuf.a.compareAndSet(false, true)) {
                throw new IllegalStateException("Logger backend configuration may only occur once.");
            }
            AtomicReference atomicReference = ekun.d;
            while (!atomicReference.compareAndSet(null, eswbVar)) {
                if (atomicReference.get() != null) {
                    throw new IllegalStateException("Logger backends can only be configured once.");
                }
            }
            ekun.e();
            ekuo.a.b.set(obj);
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
