package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmsv implements cmpq {
    private static final cqce a = cqce.g("BugleRcs", "RcsMessageReceiptSender");
    private final cmnp b;
    private final cmst c;

    public cmsv(cmnp cmnpVar, cmst cmstVar) {
        this.b = cmnpVar;
        this.c = cmstVar;
    }

    @Override // defpackage.cmpq
    public final eiju a(MessageCoreData messageCoreData, asrg asrgVar, int i) {
        auhk auhkVarA = cmpp.a(i);
        if (auhkVarA == auhk.UNKNOWN_RECEIPT_TYPE) {
            ekrd ekrdVarK = a.k();
            ekrdVarK.X(cqnc.f, messageCoreData.F());
            ((ekrd) ekrdVarK.h("com/google/android/apps/messaging/shared/sms/UnencryptedRcsMessageReceiptSender", "sendDeliveryReceipt", 76, "UnencryptedRcsMessageReceiptSender.java")).q("Not sending delivery receipt for unknown receipt type");
            chwo chwoVar = new chwo();
            chwoVar.b = enxu.a;
            chwoVar.a = true;
            return eijx.e(chwoVar);
        }
        aufs aufsVar = (aufs) aufx.a.createBuilder();
        aufw aufwVar = aufw.CONTROL;
        aufsVar.copyOnWrite();
        aufx aufxVar = (aufx) aufsVar.instance;
        aufxVar.c = aufwVar.d;
        aufxVar.b = 1 | aufxVar.b;
        aufu aufuVar = aufu.HIGH;
        aufsVar.copyOnWrite();
        aufx aufxVar2 = (aufx) aufsVar.instance;
        aufxVar2.d = aufuVar.e;
        aufxVar2.b |= 2;
        aufsVar.copyOnWrite();
        aufx aufxVar3 = (aufx) aufsVar.instance;
        aufxVar3.b |= 4;
        aufxVar3.e = false;
        return this.b.h(messageCoreData, asrgVar, auhkVarA, this.c, new ejvr() { // from class: cmsu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return eyga.a;
            }
        }, (aufx) aufsVar.build());
    }

    @Override // defpackage.cmpq
    public final eiju b(basd basdVar, Instant instant, asrg asrgVar, Optional optional, aubq aubqVar, Bundle bundle) {
        aufs aufsVar = (aufs) aufx.a.createBuilder();
        aufw aufwVar = aufw.CONTROL;
        aufsVar.copyOnWrite();
        aufx aufxVar = (aufx) aufsVar.instance;
        aufxVar.c = aufwVar.d;
        aufxVar.b |= 1;
        aufu aufuVar = aufu.HIGH;
        aufsVar.copyOnWrite();
        aufx aufxVar2 = (aufx) aufsVar.instance;
        aufxVar2.d = aufuVar.e;
        aufxVar2.b |= 2;
        aufsVar.copyOnWrite();
        aufx aufxVar3 = (aufx) aufsVar.instance;
        aufxVar3.b |= 4;
        aufxVar3.e = false;
        return this.b.d(basdVar, asrgVar, auhk.DELIVERY, instant, this.c, (aufx) aufsVar.build(), aubqVar);
    }
}
