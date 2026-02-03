package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.rcs.client.messaging.data.MessageReceipt;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmst implements cmpo {
    private final efob a;
    private final atak b;
    private final dflp c;

    public cmst(efob efobVar, atak atakVar, dflp dflpVar) {
        this.a = efobVar;
        this.b = atakVar;
        this.c = dflpVar;
    }

    @Override // defpackage.cmpo
    public final aubt a(auhk auhkVar, basd basdVar, Instant instant) {
        MessageReceipt messageReceiptM;
        dflp dflpVar = this.c;
        int iOrdinal = auhkVar.ordinal();
        if (iOrdinal == 1) {
            efia efiaVar = new efia();
            efkk efkkVar = efkk.DELIVERY;
            efiaVar.l(efkkVar);
            efiaVar.j(efkkVar.f);
            efiaVar.i(basd.e(basdVar));
            efiaVar.k(instant);
            efiaVar.a = dflpVar;
            messageReceiptM = efiaVar.m();
        } else if (iOrdinal == 2) {
            efia efiaVar2 = new efia();
            efkk efkkVar2 = efkk.DISPLAY;
            efiaVar2.l(efkkVar2);
            efiaVar2.j(efkkVar2.f);
            efiaVar2.i(basd.e(basdVar));
            efiaVar2.k(instant);
            efiaVar2.a = dflpVar;
            messageReceiptM = efiaVar2.m();
        } else {
            if (iOrdinal != 3) {
                throw new IllegalArgumentException("Unsupported receipt type: %s".concat(String.valueOf(auhkVar.name())));
            }
            efia efiaVar3 = new efia();
            efiaVar3.l(efkk.DELIVERY);
            efiaVar3.j("failed");
            efiaVar3.i(basd.e(basdVar));
            efiaVar3.k(instant);
            efiaVar3.a = dflpVar;
            messageReceiptM = efiaVar3.m();
        }
        try {
            return (aubt) this.b.fM(this.a.b(MessageReceipt.class).b(messageReceiptM));
        } catch (efoc e) {
            throw new cmph(e);
        }
    }

    @Override // defpackage.cmpo
    public final eiju b(basd basdVar, eyga eygaVar, Instant instant, aubq aubqVar, asrg asrgVar) {
        return eijx.d(new UnsupportedOperationException("this converter only supports unencrypted receipts"));
    }

    @Override // defpackage.cmpo
    public final eiju c(auhk auhkVar, MessageCoreData messageCoreData, asrg asrgVar) {
        return eijx.e(a(auhkVar, messageCoreData.F(), Instant.ofEpochMilli(messageCoreData.r())));
    }
}
