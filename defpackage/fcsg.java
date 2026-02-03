package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fcsg extends fbqa {
    @Override // defpackage.fbqa
    public final fbqf b(fbpx fbpxVar) {
        return g().b(fbpxVar);
    }

    @Override // defpackage.fbqa
    public final fbtk c() {
        return g().c();
    }

    @Override // defpackage.fbqa
    public final ScheduledExecutorService d() {
        return g().d();
    }

    @Override // defpackage.fbqa
    public final void e() {
        g().e();
    }

    @Override // defpackage.fbqa
    public void f(fbnv fbnvVar, fbqg fbqgVar) {
        throw null;
    }

    protected abstract fbqa g();

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("delegate", g());
        return ejwfVarB.toString();
    }
}
