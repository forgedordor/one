package defpackage;

import java.util.HashSet;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acxq extends mr {
    private static final eksp b = eksp.c("Bugle");
    final Map a;

    public acxq(Map map) {
        this.a = map;
    }

    @Override // defpackage.mr
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        adao adaoVar = (adao) obj;
        adao adaoVar2 = (adao) obj2;
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : ((ekgp) this.a).entrySet()) {
            adar adarVar = (adar) entry.getKey();
            if (((adaq) entry.getValue()).e(adaoVar, adaoVar2)) {
                hashSet.add(adarVar);
            }
        }
        if (!hashSet.isEmpty()) {
            ((eksl) ((eksl) b.h()).h("com/google/android/apps/messaging/home/list/DiffCallback", "getChangePayload", 61, "DiffCallback.java")).t("ConversationListViewParts to be rebound %s", hashSet);
        }
        return new adai(ekhx.o(hashSet), false);
    }

    @Override // defpackage.mr
    public final /* synthetic */ boolean b(Object obj, Object obj2) {
        return ((adao) obj).equals((adao) obj2);
    }

    @Override // defpackage.mr
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return ((adao) obj).k().w().equals(((adao) obj2).k().w());
    }
}
