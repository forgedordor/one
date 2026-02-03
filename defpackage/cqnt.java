package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqnt implements ccyz {
    public final eosc a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicLong c = new AtomicLong(0);
    public final cczn d;

    public cqnt(eosc eoscVar, cczn ccznVar) {
        this.d = ccznVar;
        this.a = eoscVar;
    }

    @Override // defpackage.ccyz
    public final void a() {
        eieu eieuVarK = eiiy.k("PhenotypeFlagsInitializer#onBuglePhenotypeFlagChanged");
        try {
            this.c.incrementAndGet();
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

    @Override // defpackage.ccyz
    public final boolean gd() {
        return false;
    }
}
