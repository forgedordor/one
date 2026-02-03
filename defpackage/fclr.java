package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fclr extends fcbf {
    final /* synthetic */ fbnz a;
    final /* synthetic */ String b;
    final /* synthetic */ fcma c;
    final /* synthetic */ fcll d;
    final /* synthetic */ SettableFuture e;
    final /* synthetic */ fcmm f;
    final /* synthetic */ fbrg g;
    final /* synthetic */ fclu h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fclr(fclu fcluVar, fbnz fbnzVar, String str, fcma fcmaVar, fcll fcllVar, SettableFuture settableFuture, fcmm fcmmVar, fbrg fbrgVar) {
        super(fbnzVar);
        this.a = fbnzVar;
        this.b = str;
        this.c = fcmaVar;
        this.d = fcllVar;
        this.e = settableFuture;
        this.f = fcmmVar;
        this.g = fbrgVar;
        this.h = fcluVar;
    }

    @Override // defpackage.fcbf
    public final void a() {
        int i = fcsr.a;
        try {
            fclv fclvVar = this.h.c;
            fbpc fbpcVar = fclvVar.e;
            String str = this.b;
            fbsr fbsrVarA = fbpcVar.a(str);
            if (fbsrVarA == null) {
                fbpc fbpcVar2 = fclvVar.f;
                this.c.m();
                fbsrVarA = fbpcVar2.a(str);
            }
            if (fbsrVarA == null) {
                Status statusWithDescription = Status.n.withDescription(a.v(str, "Method not found: "));
                this.d.g(fclv.c);
                this.c.e(statusWithDescription, new fbrg());
                this.a.j(null);
                this.e.cancel(false);
                return;
            }
            fcma fcmaVar = this.c;
            fcmm fcmmVar = this.f;
            fcmaVar.a();
            fcmaVar.m();
            fbtg[] fbtgVarArr = fcmmVar.b;
            if (fbtgVarArr.length > 0) {
                throw null;
            }
            fbsn fbsnVar = fbsrVarA.b;
            fbso[] fbsoVarArr = fclvVar.h;
            int length = fbsoVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                fbsp fbspVar = new fbsp(fbsoVarArr[i2], fbsnVar);
                i2++;
                fbsnVar = fbspVar;
            }
            fbsr fbsrVarA2 = fbsrVarA.a(fbsnVar);
            this.e.set(new fclt(new fclf(fcmaVar, fbsrVarA2.a, this.g, this.a, fclvVar.p, fclvVar.r), fbsrVarA2.b));
        } catch (Throwable th) {
            this.d.g(fclv.c);
            this.c.e(Status.c(th), new fbrg());
            this.a.j(null);
            this.e.cancel(false);
            throw th;
        }
    }
}
