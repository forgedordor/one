package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqne implements esvf, ccyz {
    public final cczn b;
    private final eosc c;
    public final AtomicInteger a = new AtomicInteger(((Integer) ((cczg) cqni.a).c).intValue());
    private final AtomicBoolean d = new AtomicBoolean(false);

    public cqne(eosc eoscVar, cczn ccznVar) {
        this.b = ccznVar;
        this.c = eoscVar;
    }

    private final void g() {
        eijx.g(new Callable() { // from class: cqnd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqne cqneVar = this.a;
                cqneVar.b.a();
                cqneVar.a.set(((Integer) cqni.a.e()).intValue());
                return null;
            }
        }, this.c).k(auvh.b(), eoqg.a);
    }

    @Override // defpackage.ccyz
    public final void a() {
        eieu eieuVarK = eiiy.k("FloggerClientLoggingOptions");
        try {
            g();
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

    @Override // defpackage.esvf
    public final boolean c(Level level) {
        if (this.d.compareAndSet(false, true)) {
            g();
        }
        return level.intValue() >= this.a.get();
    }

    @Override // defpackage.ccyz
    public final boolean gd() {
        return false;
    }

    @Override // defpackage.esvf
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.esvf
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.esvf
    public final /* synthetic */ void f() {
    }
}
