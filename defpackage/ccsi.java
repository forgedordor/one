package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccsi implements cmpi {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/outgoing/MlsRcsFileSender");
    private final fdjx b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;

    public ccsi(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        this.b = fdjxVar;
        this.c = fcsuVar2;
        this.d = fcsuVar6;
        this.e = fcsuVar7;
    }

    @Override // defpackage.cmpi
    public final eiju a(MessageCoreData messageCoreData, asrg asrgVar, Optional optional) {
        messageCoreData.getClass();
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleE2eeMls");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/e2ee/mls/outgoing/MlsRcsFileSender", "sendChatMessage", 74, "MlsRcsFileSender.kt")).t("SendFileChatMessage %s", messageCoreData.F());
        if (!messageCoreData.cY()) {
            throw new IllegalArgumentException("Message is not a file transfer message");
        }
        if (optional.isPresent()) {
            return auvw.c(this.b, fcyi.a, fdjz.a, new ccsg(this, messageCoreData, asrgVar, optional, null));
        }
        throw new IllegalArgumentException("Missing the file upload response");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r12, defpackage.asrg r13, defpackage.aucl r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccsi.b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, asrg, aucl, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r14, defpackage.asrg r15, defpackage.aucl r16, final defpackage.evqs r17, final defpackage.eyga r18, defpackage.aufx r19, defpackage.fcxy r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccsi.c(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, asrg, aucl, evqs, eyga, aufx, fcxy):java.lang.Object");
    }
}
