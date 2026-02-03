package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqng implements ehqi, ccyz, cqkz {
    public final fcsu a;
    public final cczn e;
    private final eosc f;
    private final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicInteger b = new AtomicInteger(((Integer) ((cczg) cqni.b).c).intValue());
    public final AtomicInteger c = new AtomicInteger(((Integer) ((cczg) cqni.c).c).intValue());
    public final AtomicInteger d = new AtomicInteger(((Integer) ((cczg) cqni.d).c).intValue());

    public cqng(eosc eoscVar, fcsu fcsuVar, cczn ccznVar) {
        this.e = ccznVar;
        this.a = fcsuVar;
        this.f = eoscVar;
    }

    private final void j() {
        eijx.g(new Callable() { // from class: cqnf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqng cqngVar = this.a;
                cqngVar.e.a();
                cqngVar.b.set(((Integer) cqni.b.e()).intValue());
                cqngVar.c.set(((Integer) cqni.c.e()).intValue());
                int iIntValue = ((Integer) cqni.d.e()).intValue();
                if (((cqky) cqngVar.a.b()).a()) {
                    iIntValue = Math.min(iIntValue, Level.FINE.intValue());
                }
                cqngVar.d.set(iIntValue);
                return null;
            }
        }, this.f).k(auvh.b(), eoqg.a);
    }

    @Override // defpackage.ccyz
    public final void a() {
        j();
    }

    @Override // defpackage.cqkz
    public final void c() {
        j();
    }

    @Override // defpackage.ehqi
    public final int d() {
        return this.b.get();
    }

    @Override // defpackage.ehqi
    public final int e() {
        return this.c.get();
    }

    @Override // defpackage.ehqi
    public final String f() {
        return "logs";
    }

    @Override // defpackage.ehqi
    public final String g() {
        return "flogger_bugle.log";
    }

    @Override // defpackage.ccyz
    public final boolean gd() {
        return false;
    }

    @Override // defpackage.ehqi
    public final boolean h() {
        return true;
    }

    @Override // defpackage.ehqi
    public final boolean i(Level level) {
        if (this.g.compareAndSet(false, true)) {
            j();
        }
        return level.intValue() >= this.d.get();
    }
}
