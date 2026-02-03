package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahpk implements eora {
    final /* synthetic */ ahpm a;

    public ahpk(ahpm ahpmVar) {
        this.a = ahpmVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List<String> list = (List) obj;
        if (list.isEmpty()) {
            return;
        }
        ahpm ahpmVar = this.a;
        List listAsList = Arrays.asList(ahpmVar.n());
        for (String str : list) {
            if (!listAsList.contains(str)) {
                cgcb cgcbVar = (cgcb) ahpmVar.c;
                cgcbVar.T(str);
                if (str != null) {
                    eika.l(cgcbVar.S(), new cgbz(cgcbVar, str), eoqg.a);
                }
            }
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ((eksl) ((eksl) ((eksl) ahpm.a.i()).g(th)).h("com/google/android/apps/messaging/reminder/notification/ReminderNotification$1", "onFailure", (char) 142, "ReminderNotification.java")).q("Failed to get reminder notification reminder IDs");
    }
}
