package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcdh extends fchx {
    private boolean a;
    private final Status b;
    private final fcao d;
    private final fbnm[] e;

    public fcdh(Status status, fcao fcaoVar, fbnm[] fbnmVarArr) {
        ejwl.b(!status.f(), "error must not be OK");
        this.b = status;
        this.d = fcaoVar;
        this.e = fbnmVarArr;
    }

    @Override // defpackage.fchx, defpackage.fcan
    public final void b(fceg fcegVar) {
        fcegVar.b("error", this.b);
        fcegVar.b("progress", this.d);
    }

    @Override // defpackage.fchx, defpackage.fcan
    public final void m(fcap fcapVar) {
        ejwl.m(!this.a, "already started");
        this.a = true;
        int i = 0;
        while (true) {
            fbnm[] fbnmVarArr = this.e;
            if (i >= fbnmVarArr.length) {
                fcapVar.a(this.b, this.d, new fbrg());
                return;
            } else {
                fbnmVarArr[i].e();
                i++;
            }
        }
    }

    public fcdh(Status status, fbnm[] fbnmVarArr) {
        this(status, fcao.PROCESSED, fbnmVarArr);
    }
}
