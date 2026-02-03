package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fccu implements fcap {
    public final fcap a;
    public volatile boolean b;
    public List c = new ArrayList();

    public fccu(fcap fcapVar) {
        this.a = fcapVar;
    }

    private final void b(Runnable runnable) {
        synchronized (this) {
            if (this.b) {
                runnable.run();
            } else {
                this.c.add(runnable);
            }
        }
    }

    @Override // defpackage.fcap
    public final void a(Status status, fcao fcaoVar, fbrg fbrgVar) {
        b(new fcct(this, status, fcaoVar, fbrgVar));
    }

    @Override // defpackage.fcap
    public final void c(fbrg fbrgVar) {
        b(new fccs(this, fbrgVar));
    }

    @Override // defpackage.fcmp
    public final void d(fcmo fcmoVar) {
        if (this.b) {
            this.a.d(fcmoVar);
        } else {
            b(new fccq(this, fcmoVar));
        }
    }

    @Override // defpackage.fcmp
    public final void e() {
        if (this.b) {
            this.a.e();
        } else {
            b(new fccr(this));
        }
    }
}
