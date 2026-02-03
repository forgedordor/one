package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfrl implements dgzv {
    private final eosc a;
    private final dfrt b;

    public dfrl(eosc eoscVar, dfrt dfrtVar) {
        this.a = eoscVar;
        this.b = dfrtVar;
    }

    private final void g(ListenableFuture listenableFuture) {
        eork.r(listenableFuture, new dfrj(), this.a);
    }

    private final void h(dhaq dhaqVar) {
        dfqf dfqfVar = new dfqf();
        dfqfVar.c(dhaqVar);
        g(a(dfqfVar.a()));
    }

    private final void i(dhat dhatVar) {
        dfqf dfqfVar = new dfqf();
        dfqfVar.c(dhatVar);
        g(a(dfqfVar.a()));
    }

    public final ListenableFuture a(dftb dftbVar) {
        return this.b.a(dftbVar);
    }

    @Override // defpackage.dgzv
    public final void b(dgzn dgznVar) {
        i((dhat) dgznVar);
    }

    @Override // defpackage.dgzv
    public final void c(dgzn dgznVar) {
        h((dhaq) dgznVar);
    }

    @Override // defpackage.dgzv
    public final void d(dgzn dgznVar) {
        h((dhaq) dgznVar);
    }

    @Override // defpackage.dgzv
    public final void e(dgzn dgznVar) {
        i((dhat) dgznVar);
    }

    @Override // defpackage.dgzv
    public final void f(dgyx dgyxVar) {
        dfqf dfqfVar = new dfqf();
        dfqfVar.b(dgyxVar);
        g(a(dfqfVar.a()));
    }
}
