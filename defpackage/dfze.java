package defpackage;

import android.content.Context;
import android.net.NetworkInfo;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfze {
    public final Context a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final dfzd c;
    public int d;

    public dfze(Context context) {
        this.a = context;
        d();
        dhja.c("Use network callbacks", new Object[0]);
        this.c = new dfzc(this);
    }

    public final void a(dfyl dfylVar) {
        this.b.add(dfylVar);
    }

    final void b(boolean z) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            dfyl dfylVar = (dfyl) it.next();
            if (dfylVar.shouldTriggerOnCapabilitiesChanged() || !z) {
                dfylVar.onConnectivityChange(this.a, this.d);
            }
        }
    }

    public final void c(dfyl dfylVar) {
        this.b.remove(dfylVar);
    }

    public final void d() {
        NetworkInfo networkInfoD;
        try {
            networkInfoD = dhkq.f(this.a).d();
        } catch (dhkf e) {
            dhja.s(e, "Can't get active network info, missing permissions.", new Object[0]);
            networkInfoD = null;
        }
        int i = 2;
        if (networkInfoD != null && networkInfoD.isConnected()) {
            i = 1;
        }
        this.d = i;
    }
}
