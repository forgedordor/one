package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbup extends fbur {
    final /* synthetic */ fbur[] a;

    public fbup(fbur[] fburVarArr) {
        this.a = fburVarArr;
    }

    @Override // defpackage.fbur
    public final Status a(int i) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            fbur[] fburVarArr = this.a;
            if (i2 >= fburVarArr.length) {
                Iterator it = arrayList.iterator();
                Status statusB = (Status) it.next();
                while (it.hasNext()) {
                    Status status = (Status) it.next();
                    statusB = statusB.b(status.getDescription());
                    Throwable th = status.t;
                    if (th != null) {
                        Throwable th2 = statusB.t;
                        if (th2 != null) {
                            th2.addSuppressed(th);
                        } else {
                            statusB = statusB.d(th);
                        }
                    }
                }
                return statusB;
            }
            Status statusA = fburVarArr[i2].a(i);
            if (statusA.f()) {
                return statusA;
            }
            arrayList.add(statusA);
            i2++;
        }
    }
}
