package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwfg implements cmpq {
    private final cmsv c;
    private final cmnp d;
    private final bweq e;
    private final bvur f;
    private final atal g = new atal();
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeRcsMessageReceiptSender");
    public static final ejxr a = cdag.v("include_disposition_notification_required");

    public bwfg(cmsv cmsvVar, cmnp cmnpVar, bweq bweqVar, bvur bvurVar) {
        this.c = cmsvVar;
        this.d = cmnpVar;
        this.e = bweqVar;
        this.f = bvurVar;
    }

    private final aufx c(String str) {
        boolean z = this.f.p() && efne.d.h(str);
        aufw aufwVar = z ? aufw.CONTROL : aufw.USER;
        aufs aufsVar = (aufs) aufx.a.createBuilder();
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
        if (((Boolean) ((cczi) a.get()).e()).booleanValue() && !z) {
            aufsVar.copyOnWrite();
            aufx aufxVar4 = (aufx) aufsVar.instance;
            aufxVar4.b |= 8;
            aufxVar4.f = false;
        }
        return (aufx) aufsVar.build();
    }

    @Override // defpackage.cmpq
    public final eiju a(MessageCoreData messageCoreData, asrg asrgVar, int i) {
        auhk auhkVarA = cmpp.a(i);
        if (auhkVarA == auhk.UNKNOWN_RECEIPT_TYPE) {
            ekrw ekrwVarJ = b.j();
            ekrwVarJ.X(eksq.a, "BugleE2eeEtouffee");
            ekrd ekrdVar = (ekrd) ekrwVarJ;
            ekrdVar.X(cqnc.f, messageCoreData.F());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeRcsMessageReceiptSender", "sendDeliveryReceipt", 116, "EtouffeeRcsMessageReceiptSender.java")).q("Not sending delivery receipt for unknown receipt type");
            chwo chwoVar = new chwo();
            chwoVar.b = enxu.a;
            chwoVar.a = true;
            return eijx.e(chwoVar);
        }
        if (!messageCoreData.cB()) {
            return this.c.a(messageCoreData, asrgVar, i);
        }
        ekrw ekrwVarE = b.e();
        ekrwVarE.X(eksq.a, "BugleE2eeEtouffee");
        ekrd ekrdVar2 = (ekrd) ekrwVarE;
        ekrdVar2.X(cqnc.f, messageCoreData.F());
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeRcsMessageReceiptSender", "sendDeliveryReceipt", 130, "EtouffeeRcsMessageReceiptSender.java")).q("Attempt to send encrypted delivery report for RCS message");
        return this.d.h(messageCoreData, asrgVar, auhkVarA, this.e, new ejvr() { // from class: bwff
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ejxr ejxrVar = bwfg.a;
                return eyga.a;
            }
        }, c(messageCoreData.an()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [cmpo, java.lang.Object] */
    @Override // defpackage.cmpq
    public final eiju b(basd basdVar, Instant instant, asrg asrgVar, Optional optional, aubq aubqVar, Bundle bundle) {
        if (!optional.isPresent()) {
            return this.c.b(basdVar, instant, asrgVar, optional, aubqVar, bundle);
        }
        ?? r6 = optional.get();
        atal atalVar = this.g;
        auhk auhkVar = auhk.DELIVERY;
        aubx aubxVar = r6.a(auhkVar, basdVar, instant).c;
        if (aubxVar == null) {
            aubxVar = aubx.a;
        }
        return this.d.d(basdVar, asrgVar, auhkVar, instant, r6, c(((ContentType) atalVar.fM(aubxVar)).toString()), aubqVar);
    }
}
