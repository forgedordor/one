package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcbv extends fbng {
    public final fbng a;
    public volatile boolean b;
    public List c = new ArrayList();

    public fcbv(fbng fbngVar) {
        this.a = fbngVar;
    }

    private final void e(Runnable runnable) {
        synchronized (this) {
            if (this.b) {
                runnable.run();
            } else {
                this.c.add(runnable);
            }
        }
    }

    @Override // defpackage.fbng
    public final void a(Status status, fbrg fbrgVar) {
        e(new fcbt(this, status, fbrgVar));
    }

    @Override // defpackage.fbng
    public final void b(fbrg fbrgVar) {
        if (this.b) {
            this.a.b(fbrgVar);
        } else {
            e(new fcbr(this, fbrgVar));
        }
    }

    @Override // defpackage.fbng
    public final void c(Object obj) {
        if (this.b) {
            this.a.c(obj);
        } else {
            e(new fcbs(this, obj));
        }
    }

    @Override // defpackage.fbng
    public final void d() {
        if (this.b) {
            this.a.d();
        } else {
            e(new fcbu(this));
        }
    }
}
