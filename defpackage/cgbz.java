package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgbz implements eora {
    final /* synthetic */ String a;
    final /* synthetic */ cgcb b;

    public cgbz(cgcb cgcbVar, String str) {
        this.a = str;
        this.b = cgcbVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List list = (List) obj;
        if (list.isEmpty()) {
            return;
        }
        String str = this.a;
        cgcb cgcbVar = this.b;
        ArrayList arrayList = new ArrayList(list);
        arrayList.remove(str);
        cgcbVar.X(arrayList);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ((eksl) ((eksl) ((eksl) cgcb.a.i()).g(th)).h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl$2", "onFailure", (char) 319, "BugleNotificationManagerImpl.java")).q("Failed to get reminder notification reminder IDs");
    }
}
