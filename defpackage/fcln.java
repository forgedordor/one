package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcln implements fclz {
    final /* synthetic */ fclv a;

    public fcln(fclv fclvVar) {
        this.a = fclvVar;
    }

    @Override // defpackage.fclz
    public final fcmd a(fcmc fcmcVar) {
        fclv fclvVar = this.a;
        synchronized (fclvVar.l) {
            fclvVar.n.add(fcmcVar);
        }
        fclu fcluVar = new fclu(this.a, fcmcVar);
        fclv fclvVar2 = fcluVar.c;
        long j = fclvVar2.i;
        if (j != Long.MAX_VALUE) {
            fcluVar.b = fcluVar.a.r().schedule(new fcls(fcluVar), j, TimeUnit.MILLISECONDS);
        } else {
            fcluVar.b = new FutureTask(new fclo(), null);
        }
        fbpi fbpiVar = fclvVar2.q;
        fbpi.b((fbph) fbpiVar.g.get(Long.valueOf(fbpi.a(fclvVar2))), fcluVar.a);
        return fcluVar;
    }

    @Override // defpackage.fclz
    public final void c() {
        fclv fclvVar = this.a;
        synchronized (fclvVar.l) {
            if (fclvVar.k) {
                return;
            }
            ArrayList arrayList = new ArrayList(fclvVar.n);
            Status status = fclvVar.j;
            fclvVar.k = true;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                fcmc fcmcVar = (fcmc) arrayList.get(i);
                if (status == null) {
                    fcmcVar.f();
                } else {
                    fcmcVar.o(status);
                }
            }
            fclv fclvVar2 = this.a;
            synchronized (fclvVar2.l) {
                fclvVar2.m = true;
                fclvVar2.e();
            }
        }
    }
}
