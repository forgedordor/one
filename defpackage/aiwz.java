package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiwz {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/analytics/mmsgroup/DeidentifiedMmsGroupEventLogger");
    private final fdjx b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final aimb f;
    private final fcsu g;
    private final cogw h;

    public aiwz(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, aimb aimbVar, fcsu fcsuVar4, cogw cogwVar) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        aimbVar.getClass();
        fcsuVar4.getClass();
        cogwVar.getClass();
        this.b = fdjxVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = aimbVar;
        this.g = fcsuVar4;
        this.h = cogwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
    
        if (r2 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:
    
        if (r2 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0140 A[LOOP:0: B:38:0x013a->B:40:0x0140, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016e A[LOOP:1: B:42:0x0168->B:44:0x016e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r12, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiwz.a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3 A[LOOP:1: B:44:0x00cd->B:46:0x00d3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r12, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r13, int r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiwz.b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, int, fcxy):java.lang.Object");
    }

    public final void c(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, int i) {
        ((ekrd) a.e().h("com/google/android/apps/messaging/shared/analytics/mmsgroup/DeidentifiedMmsGroupEventLogger", "logEvent", 79, "DeidentifiedMmsGroupEventLogger.kt")).t("Logging MMS group event: %s", i != 2 ? i != 3 ? i != 4 ? "MMS_GROUP_UPGRADE_NOT_ELIGIBLE" : "MMS_GROUP_UPGRADE_ELIGIBLE" : "MMS_GROUP_MESSAGE_RECEIVED" : "MMS_GROUP_MESSAGE_SENT");
        auvw.k(this.b, null, null, new aiwx(this, conversationIdType, selfIdentityId, i, null), 3);
    }
}
