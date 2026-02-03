package defpackage;

import io.grpc.Status;
import java.util.Collection;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcgw {
    final Object a = new Object();
    Collection b = new HashSet();
    Status c;
    final /* synthetic */ fcgx d;

    public fcgw(fcgx fcgxVar) {
        this.d = fcgxVar;
    }

    final void a(Status status) {
        synchronized (this.a) {
            if (this.c != null) {
                return;
            }
            this.c = status;
            boolean zIsEmpty = this.b.isEmpty();
            if (zIsEmpty) {
                this.d.z.n(status);
            }
        }
    }
}
