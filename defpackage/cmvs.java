package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmvs {
    public static final /* synthetic */ int c = 0;
    private static final eksp d = eksp.c("BugleSyncManager");
    public final ecjh a;
    public final cogw b;

    public cmvs(ecjh ecjhVar, cogw cogwVar) {
        this.a = ecjhVar;
        this.b = cogwVar;
    }

    public static Optional c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Optional.of(UUID.fromString(str));
            } catch (IllegalArgumentException e) {
                ((eksl) ((eksl) ((eksl) d.j()).g(e)).h("com/google/android/apps/messaging/shared/sms/datastore/SyncManagerDataStore", "uuidFromString", 109, "SyncManagerDataStore.java")).t("Failed to parse Current Sync Id: [%s]", str);
            }
        }
        return Optional.empty();
    }

    public final eiju a() {
        return eiju.g(this.a.a()).h(new ejvr() { // from class: cmvi
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Long.valueOf(((cmvh) obj).c);
            }
        }, eoqg.a);
    }

    public final eiju b(final long j) {
        return eiju.g(this.a.b(new ejvr() { // from class: cmvm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = cmvs.c;
                cmvg cmvgVar = (cmvg) ((cmvh) obj).toBuilder();
                cmvgVar.copyOnWrite();
                cmvh cmvhVar = (cmvh) cmvgVar.instance;
                cmvhVar.b |= 1;
                cmvhVar.c = j;
                return (cmvh) cmvgVar.build();
            }
        }, eoqg.a));
    }
}
