package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecmy {
    final /* synthetic */ ecng a;

    public ecmy(ecng ecngVar) {
        this.a = ecngVar;
    }

    public final void a() {
        ecng ecngVar = this.a;
        synchronized (ecngVar.j) {
            int i = ecngVar.m;
            ejwl.n(i > 0, "Refcount went negative!", i);
            ecngVar.m--;
            ecngVar.d();
        }
    }

    public final void b() {
        ecng ecngVar = this.a;
        synchronized (ecngVar.j) {
            int i = ecngVar.m;
            if (i == 0) {
                throw new CancellationException("database is closed");
            }
            ejwl.n(i > 0, "Refcount went negative!", i);
            ecngVar.m++;
        }
    }
}
