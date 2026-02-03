package defpackage;

import io.grpc.Status;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcfz extends fbot {
    public final fbog a;
    private final fbpk b;
    private final fbnd c;
    private final Executor d;
    private final fbrk e;
    private fbnc f;
    private fbnh g;

    public fcfz(fbpk fbpkVar, fbnd fbndVar, Executor executor, fbrk fbrkVar, fbnc fbncVar) {
        this.b = fbpkVar;
        this.c = fbndVar;
        this.e = fbrkVar;
        Executor executor2 = fbncVar.c;
        executor = executor2 != null ? executor2 : executor;
        this.d = executor;
        this.f = fbncVar.c(executor);
        this.a = fbog.k();
    }

    @Override // defpackage.fbot, defpackage.fbnh
    public final void a(fbng fbngVar, fbrg fbrgVar) {
        fbrk fbrkVar = this.e;
        new fcit(fbrkVar, fbrgVar, this.f, fcgx.f);
        fbpj fbpjVarA = this.b.a();
        Status status = fbpjVarA.a;
        if (!status.f()) {
            this.d.execute(new fcfy(this, fbngVar, fcdy.b(status)));
            this.g = fcgx.g;
        } else {
            fchi fchiVarB = ((fchk) fbpjVarA.b).b(fbrkVar);
            if (fchiVarB != null) {
                this.f = this.f.f(fchi.a, fchiVarB);
            }
            fbnh fbnhVarA = this.c.a(fbrkVar, this.f);
            this.g = fbnhVarA;
            fbnhVarA.a(fbngVar, fbrgVar);
        }
    }

    @Override // defpackage.fbry, defpackage.fbnh
    public final void c(String str, Throwable th) {
        fbnh fbnhVar = this.g;
        if (fbnhVar != null) {
            fbnhVar.c(str, th);
        }
    }

    @Override // defpackage.fbot, defpackage.fbry
    protected final fbnh g() {
        return this.g;
    }
}
