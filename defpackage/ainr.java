package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ainr implements ains {
    private static final cqce a = cqce.g("BugleUsageStatistics", "ConfiguredClearcutCounterEventLogger");
    private final fcsu b;
    private final fcsu c;

    public ainr(fcsu fcsuVar, fcsu fcsuVar2) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    public static void j() {
        a.m("Clearcut loggings are disabled.");
    }

    private final boolean l() {
        return ((cqpz) this.b.b()).i("bugle_enable_analytics", true);
    }

    @Override // defpackage.ains
    public final void a() {
        if (!l()) {
            j();
            return;
        }
        fcsu fcsuVar = this.c;
        if (fcsuVar.b() != null) {
            ((aint) fcsuVar.b()).a();
        }
    }

    @Override // defpackage.ains
    public final void b(String str, elgm elgmVar, long j) {
        if (l()) {
            ((aint) this.c.b()).b(str, elgmVar, j);
        } else {
            j();
        }
    }

    @Override // defpackage.ains
    public final void c(String str) {
        if (l()) {
            ((aint) this.c.b()).c(str);
        } else {
            j();
        }
    }

    @Override // defpackage.ains
    public final void d(String str, int i) {
        if (l()) {
            ((aint) this.c.b()).d(str, Integer.valueOf(i));
        } else {
            j();
        }
    }

    @Override // defpackage.ains
    public final void e(String str, int i) {
        if (l()) {
            ((aint) this.c.b()).e(str, i);
        } else {
            j();
        }
    }

    @Override // defpackage.ains
    public final void f(String str, int i, long j) {
        if (l()) {
            ((aint) this.c.b()).f(str, i, j);
        } else {
            j();
        }
    }

    @Override // defpackage.ains
    public final void g(String str, long j) {
        if (l()) {
            ((aint) this.c.b()).g(str, j);
        } else {
            j();
        }
    }

    @Override // defpackage.ains
    public final void h(String str, long j, String str2) {
        if (l()) {
            ((aint) this.c.b()).h(str, j, str2);
        } else {
            j();
        }
    }

    @Override // defpackage.ains
    public final void k() {
        if (l()) {
            ((aint) this.c.b()).i();
        } else {
            j();
        }
    }

    @Override // defpackage.ains
    public final void i() {
    }
}
