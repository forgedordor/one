package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgby implements eora {
    final /* synthetic */ cgcb a;

    public cgby(cgcb cgcbVar) {
        this.a = cgcbVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List list = (List) obj;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.a.T((String) it.next());
        }
        cgcb cgcbVar = this.a;
        cgcbVar.T(null);
        if (list.isEmpty()) {
            return;
        }
        int i = ekgb.d;
        cgcbVar.X(ekoe.a);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ((eksl) ((eksl) ((eksl) cgcb.a.i()).g(th)).h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl$1", "onFailure", (char) 297, "BugleNotificationManagerImpl.java")).q("Failed to get reminder notification reminder IDs");
    }
}
