package defpackage;

import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfvu extends dgym {
    public final SettableFuture a = SettableFuture.create();
    private final dgzn b;

    public dfvu(dgzn dgznVar) {
        this.b = dgznVar;
        if (dgznVar.a == dgws.RUNNING) {
            i();
        } else if (dfog.F() && dgznVar.q()) {
            h(500, "Session already stopped");
        } else {
            dgznVar.aF(this);
        }
    }

    private final void d() {
        this.b.aU(this);
        dfvv dfvvVarF = dfvw.f();
        dfvvVarF.b(dgza.e);
        this.a.set(dfvvVarF.a());
    }

    @Override // defpackage.dgym, defpackage.dgwh
    public final void e() {
        d();
    }

    @Override // defpackage.dgym, defpackage.dgwh
    public final void f() {
        d();
    }

    @Override // defpackage.dgym, defpackage.dgwh
    public final void g(dhfu dhfuVar) {
        d();
    }

    @Override // defpackage.dgym, defpackage.dgwh
    public final void h(int i, String str) {
        dgzn dgznVar = this.b;
        dgznVar.aU(this);
        dfvv dfvvVarF = dfvw.f();
        dfvvVarF.b(dgznVar.S);
        this.a.set(dfvvVarF.a());
    }

    @Override // defpackage.dgym, defpackage.dgwh
    public final void i() {
        dgzn dgznVar = this.b;
        dgznVar.aU(this);
        dfvv dfvvVarF = dfvw.f();
        dfvvVarF.c(dgznVar);
        this.a.set(dfvvVarF.a());
    }

    @Override // defpackage.dgym, defpackage.dgwh
    public final void k() {
        d();
    }

    @Override // defpackage.dgym, defpackage.dgwh
    public final void l(dhfu dhfuVar) {
        d();
    }
}
