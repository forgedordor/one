package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anxi implements anyx {
    public static final eksp a = eksp.c("BugleRecipients");
    private final fcsu b;

    public anxi(fcsu fcsuVar) {
        this.b = fcsuVar;
    }

    public static String b(alqm alqmVar) {
        return cqcv.c(alqmVar).toString();
    }

    @Override // defpackage.anyx
    public final eiju a(final alqm alqmVar) {
        if (alqmVar.e().isEmpty()) {
            eksl ekslVar = (eksl) a.h();
            ekslVar.X(cqnc.H, b(alqmVar));
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ChatApiRcsRecipientOnlineProvider", "isOnline", 38, "ChatApiRcsRecipientOnlineProvider.java")).q("Recipient Offline: No RCS Identifier.");
            return eijx.e(false);
        }
        eiju eijuVarD = ((aszp) ((Optional) this.b.b()).get()).d((aubq) alqmVar.e().get());
        ejvr ejvrVar = new ejvr() { // from class: anxg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                aszo aszoVar = (aszo) obj;
                eksl ekslVar2 = (eksl) anxi.a.h();
                ekslVar2.X(cqnc.H, anxi.b(alqmVar));
                ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ChatApiRcsRecipientOnlineProvider", "isOnline", 52, "ChatApiRcsRecipientOnlineProvider.java")).t("Recipient Online Status: %s.", aszoVar);
                return Boolean.valueOf(aszoVar == aszo.ONLINE);
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eijuVarD.h(ejvrVar, eoqgVar).e(Exception.class, new ejvr() { // from class: anxh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksl ekslVar2 = (eksl) anxi.a.j();
                ekslVar2.X(cqnc.H, anxi.b(alqmVar));
                ((eksl) ((eksl) ekslVar2.g((Exception) obj)).h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ChatApiRcsRecipientOnlineProvider", "isOnline", 63, "ChatApiRcsRecipientOnlineProvider.java")).q("Recipient Online Status: Failed.");
                return false;
            }
        }, eoqgVar);
    }
}
