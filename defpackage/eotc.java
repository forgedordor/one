package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eotc extends eoqs implements RunnableFuture {
    private volatile eory a;

    public eotc(eooy eooyVar) {
        this.a = new eota(this, eooyVar);
    }

    static eotc d(Runnable runnable, Object obj) {
        return new eotc(Executors.callable(runnable, obj));
    }

    @Override // defpackage.eooi
    protected final String gu() {
        eory eoryVar = this.a;
        return eoryVar != null ? a.b(eoryVar, "task=[", "]") : super.gu();
    }

    @Override // defpackage.eooi
    protected final void gv() {
        eory eoryVar;
        if (p() && (eoryVar = this.a) != null) {
            eoryVar.h();
        }
        this.a = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        eory eoryVar = this.a;
        if (eoryVar != null) {
            eoryVar.run();
        }
        this.a = null;
    }

    public eotc(Callable callable) {
        this.a = new eotb(this, callable);
    }
}
