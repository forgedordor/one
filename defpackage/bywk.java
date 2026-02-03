package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bywk {
    public static final eksp a = eksp.c("BugleCms");
    public final fcsu b;
    public final cmqj c;
    public final ciuv d;
    public final alrj e;
    public final byyp f;
    private final Context g;

    public bywk(Context context, fcsu fcsuVar, cmqj cmqjVar, ciuv ciuvVar, alrj alrjVar, byyp byypVar) {
        this.g = context;
        this.b = fcsuVar;
        this.c = cmqjVar;
        this.d = ciuvVar;
        this.e = alrjVar;
        this.f = byypVar;
    }

    public final long a(ekgb ekgbVar, bojh bojhVar) {
        if (ekgbVar.isEmpty()) {
            throw new bywh(String.format("No participants for conversation of cmsId = %s", bojhVar.S()));
        }
        long jG = this.c.g(this.g, cmmo.c, ekgbVar);
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(bzmz.h, bojhVar.S());
        ekslVar.X(cqnc.u, new cnqj(jG));
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsParticipantAndConversationToTelephonyPersister", "createTelephonyThreadIdBasedOnParticipants", 131, "CmsParticipantAndConversationToTelephonyPersister.java")).q("Get or Created");
        return jG;
    }
}
