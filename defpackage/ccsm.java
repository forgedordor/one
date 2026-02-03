package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccsm implements cmpq {
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/outgoing/MlsRcsMessageReceiptSender");
    public final cmnp a;
    public final cmst b;
    public final ccso c;
    private final fdjx e;

    public ccsm(cmnp cmnpVar, cmst cmstVar, ccso ccsoVar, cjpo cjpoVar, fdjx fdjxVar) {
        cmnpVar.getClass();
        ccsoVar.getClass();
        cjpoVar.getClass();
        fdjxVar.getClass();
        this.a = cmnpVar;
        this.b = cmstVar;
        this.c = ccsoVar;
        this.e = fdjxVar;
    }

    static /* synthetic */ chwo d(basd basdVar, auhk auhkVar, boolean z, String str) {
        return e(basdVar, auhkVar, z, str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final chwo e(basd basdVar, auhk auhkVar, boolean z, String str, Throwable th) {
        ekrw ekrwVarJ = d.j();
        ekrwVarJ.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarJ).g(th);
        ekrdVar.X(cqnc.f, basdVar);
        ekrdVar.X(cqnc.i, auhkVar.name());
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/outgoing/MlsRcsMessageReceiptSender", "logAndGetResult", 275, "MlsRcsMessageReceiptSender.kt")).q(str);
        chwo chwoVar = new chwo();
        chwoVar.b = enxu.a;
        chwoVar.a = z;
        return chwoVar;
    }

    @Override // defpackage.cmpq
    public final eiju a(MessageCoreData messageCoreData, asrg asrgVar, int i) {
        messageCoreData.getClass();
        auhk auhkVarA = cmpp.a(i);
        if (auhkVarA == auhk.UNKNOWN_RECEIPT_TYPE) {
            basd basdVarF = messageCoreData.F();
            basdVarF.getClass();
            auhkVarA.getClass();
            eiju eijuVarE = eijx.e(d(basdVarF, auhkVarA, true, "Skip sending message receipt for unknown receipt type"));
            eijuVarE.getClass();
            return eijuVarE;
        }
        auhkVarA.getClass();
        aufs aufsVar = (aufs) aufx.a.createBuilder();
        aufsVar.getClass();
        aufy.c(aufw.CONTROL, aufsVar);
        aufy.b(aufu.HIGH, aufsVar);
        aufy.d(aufsVar);
        aufx aufxVarA = aufy.a(aufsVar);
        ekrw ekrwVarE = d.e();
        ekrwVarE.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarE;
        ekrdVar.X(cqnc.f, messageCoreData.F());
        ekrdVar.X(cqnc.i, auhkVarA.name());
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/outgoing/MlsRcsMessageReceiptSender", "sendMessageReceipt", 209, "MlsRcsMessageReceiptSender.kt")).q("Attempting to send report");
        return auvw.c(this.e, fcyi.a, fdjz.a, new ccsl(messageCoreData, this, auhkVarA, asrgVar, aufxVarA, null));
    }

    @Override // defpackage.cmpq
    public final eiju b(basd basdVar, Instant instant, asrg asrgVar, Optional optional, aubq aubqVar, Bundle bundle) {
        instant.getClass();
        aubqVar.getClass();
        ekrw ekrwVarE = d.e();
        ekrwVarE.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarE;
        ekrdVar.X(cqnc.f, basdVar);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/outgoing/MlsRcsMessageReceiptSender", "sendDeliveryReceiptForBlockedUser", 121, "MlsRcsMessageReceiptSender.kt")).q("Attempting to send report");
        String string = bundle.getString("mls_group_id");
        if (string != null) {
            return auvw.c(this.e, fcyi.a, fdjz.a, new ccsj(this, basdVar, aubqVar, string, asrgVar, instant, null));
        }
        eiju eijuVarE = eijx.e(d(basdVar, auhk.DELIVERY, false, "Skip sending message receipt due to missing mlsGroupId"));
        eijuVarE.getClass();
        return eijuVarE;
    }
}
