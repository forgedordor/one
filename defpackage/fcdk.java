package defpackage;

import io.grpc.Status;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fcdk implements fcan {
    @Override // defpackage.fcan
    public final fbmw a() {
        throw null;
    }

    @Override // defpackage.fcan
    public final void b(fceg fcegVar) {
        p().b(fcegVar);
    }

    @Override // defpackage.fcan
    public final void c(Status status) {
        p().c(status);
    }

    @Override // defpackage.fcmn
    public final void d() {
        p().d();
    }

    @Override // defpackage.fcan
    public final void e() {
        p().e();
    }

    @Override // defpackage.fcmn
    public final void f() {
        p().f();
    }

    @Override // defpackage.fcmn
    public final void g(int i) {
        p().g(i);
    }

    @Override // defpackage.fcmn
    public final void h(fbnr fbnrVar) {
        p().h(fbnrVar);
    }

    @Override // defpackage.fcan
    public final void i(fbol fbolVar) {
        p().i(fbolVar);
    }

    @Override // defpackage.fcan
    public final void j(fboo fbooVar) {
        p().j(fbooVar);
    }

    @Override // defpackage.fcan
    public final void k(int i) {
        p().k(i);
    }

    @Override // defpackage.fcan
    public final void l(int i) {
        p().l(i);
    }

    @Override // defpackage.fcan
    public void m(fcap fcapVar) {
        throw null;
    }

    @Override // defpackage.fcmn
    public final void n(InputStream inputStream) {
        p().n(inputStream);
    }

    @Override // defpackage.fcmn
    public final boolean o() {
        return p().o();
    }

    protected abstract fcan p();

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("delegate", p());
        return ejwfVarB.toString();
    }
}
