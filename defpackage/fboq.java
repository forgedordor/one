package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fboq extends fbqo {
    protected fboq() {
    }

    @Override // defpackage.fbqo
    public fbqm a() {
        return b().a();
    }

    protected abstract fbqo b();

    @Override // defpackage.fbqo
    public void c(fbns fbnsVar) {
        b().c(fbnsVar);
    }

    @Override // defpackage.fbqo
    public void d(fboo fbooVar) {
        b().d(fbooVar);
    }

    @Override // defpackage.fbqo
    public void e(Map map) {
        b().e(map);
    }

    @Override // defpackage.fbqo
    public void f() {
        b().f();
    }

    @Override // defpackage.fbqo
    public void g(Executor executor) {
        b().g(executor);
    }

    @Override // defpackage.fbqo
    public void h(long j, TimeUnit timeUnit) {
        b().h(j, timeUnit);
    }

    @Override // defpackage.fbqo
    public void i(fbni... fbniVarArr) {
        b().i(fbniVarArr);
    }

    @Override // defpackage.fbqo
    @Deprecated
    public void j(fbrp fbrpVar) {
        b().j(fbrpVar);
    }

    @Override // defpackage.fbqo
    public void k(Executor executor) {
        b().k(executor);
    }

    @Override // defpackage.fbqo
    public void l(String str) {
        b().l(str);
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("delegate", b());
        return ejwfVarB.toString();
    }
}
