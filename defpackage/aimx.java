package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aimx implements ains {
    private static final cqce a = cqce.g("BugleUsageStatistics", "ClearcutCounterEventLogger");
    private final fcsu b;
    private final fcsu c;
    private boolean d = false;

    public aimx(fcsu fcsuVar, fcsu fcsuVar2) {
        this.c = fcsuVar;
        this.b = fcsuVar2;
    }

    public static void j() {
        a.m("Clearcut loggings are disabled.");
    }

    @Override // defpackage.ains
    public final void a() {
        if (!this.d) {
            j();
            return;
        }
        fcsu fcsuVar = this.b;
        if (fcsuVar.b() != null) {
            ((aill) fcsuVar.b()).a();
        }
    }

    @Override // defpackage.ains
    public final void b(String str, elgm elgmVar, long j) {
        if (this.d) {
            ((aill) this.b.b()).c(str, elgmVar, j);
        } else {
            j();
        }
    }

    @Override // defpackage.ains
    public final void c(String str) {
        if (this.d) {
            ((aill) this.b.b()).d(str);
        } else {
            j();
        }
    }

    @Override // defpackage.ains
    public final void d(String str, int i) {
        if (this.d) {
            ((aill) this.b.b()).e(str, i);
        } else {
            j();
        }
    }

    @Override // defpackage.ains
    public final void e(String str, int i) {
        if (this.d) {
            ((aill) this.b.b()).f(str, i);
        } else {
            j();
        }
    }

    @Override // defpackage.ains
    public final void f(String str, int i, long j) {
        if (this.d) {
            ((aill) this.b.b()).g(str, i, j);
        } else {
            j();
        }
    }

    @Override // defpackage.ains
    public final void g(String str, long j) {
        if (this.d) {
            ((aill) this.b.b()).h(str, j);
        } else {
            j();
        }
    }

    @Override // defpackage.ains
    public final void h(String str, long j, String str2) {
        if (this.d) {
            ((aill) this.b.b()).i(str, j, str2);
        } else {
            j();
        }
    }

    @Override // defpackage.ains
    public final void i() {
        if (((cqpz) this.c.b()).i("bugle_enable_analytics", true)) {
            this.d = true;
        }
    }

    @Override // defpackage.ains
    public final void k() {
        if (this.d) {
            ((aill) this.b.b()).s();
        } else {
            j();
        }
    }
}
