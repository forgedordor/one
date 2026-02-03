package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csig {
    public static final eksp a = eksp.c("BugleSpam");
    private final fcsu b;
    private final eosc c;

    public csig(fcsu fcsuVar, eosc eoscVar) {
        this.b = fcsuVar;
        this.c = eoscVar;
    }

    public final eiju a(MessageCoreData messageCoreData) {
        String strAs = messageCoreData.as();
        if (messageCoreData == null || strAs == null || strAs.trim().isEmpty()) {
            ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/util/spam/hades/MoiraiPrechecker", "allowedToRun", 34, "MoiraiPrechecker.java")).q("Null or empty message for moirai check, skipping.");
            return eijx.e(false);
        }
        if (messageCoreData.cI()) {
            crtw crtwVar = (crtw) this.b.b();
            return auvw.c(crtwVar.d, fcyi.a, fdjz.a, new crtv(crtwVar, messageCoreData, null)).h(new ejvr() { // from class: csif
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    csef csefVar = (csef) obj;
                    eksp ekspVar = csig.a;
                    boolean z = false;
                    if (csefVar == null) {
                        return false;
                    }
                    if (!csefVar.a) {
                        ((eksl) ((eksl) csig.a.e()).h("com/google/android/apps/messaging/shared/util/spam/hades/MoiraiPrechecker", "allowedToRun", 59, "MoiraiPrechecker.java")).q("Spam protection off, skipping moirai check.");
                    } else if (csefVar.b) {
                        ((eksl) ((eksl) csig.a.e()).h("com/google/android/apps/messaging/shared/util/spam/hades/MoiraiPrechecker", "allowedToRun", 64, "MoiraiPrechecker.java")).q("Message from contact, skipping moirai check.");
                    } else if (csefVar.f) {
                        ((eksl) ((eksl) csig.a.e()).h("com/google/android/apps/messaging/shared/util/spam/hades/MoiraiPrechecker", "allowedToRun", 69, "MoiraiPrechecker.java")).q("Message from rbm bot, skipping moirai check.");
                    } else {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            }, this.c);
        }
        ((eksl) ((eksl) a.e()).h("com/google/android/apps/messaging/shared/util/spam/hades/MoiraiPrechecker", "allowedToRun", 39, "MoiraiPrechecker.java")).q("Non-incoming message for moirai check, skipping.");
        return eijx.e(false);
    }
}
