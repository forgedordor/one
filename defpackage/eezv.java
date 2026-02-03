package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eezv extends eezo {
    final /* synthetic */ IBinder a;
    final /* synthetic */ eezx b;

    public eezv(eezx eezxVar, IBinder iBinder) {
        this.a = iBinder;
        this.b = eezxVar;
    }

    @Override // defpackage.eezo
    public final void a() throws RemoteException {
        eezy eezyVar = this.b.a;
        eezyVar.n = (IInterface) eezyVar.i.a(this.a);
        eezyVar.b.d("linkToDeath", new Object[0]);
        try {
            eezyVar.n.asBinder().linkToDeath(eezyVar.k, 0);
        } catch (RemoteException e) {
            eezyVar.b.c(e, "linkToDeath failed", new Object[0]);
        }
        eezy eezyVar2 = this.b.a;
        eezyVar2.g = false;
        List list = eezyVar2.d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list.clear();
    }
}
