package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccvw implements cmpq {
    private final cmpq a;

    public ccvw(cmpq cmpqVar, apwn apwnVar) {
        apwnVar.getClass();
        this.a = cmpqVar;
    }

    @Override // defpackage.cmpq
    public final eiju a(MessageCoreData messageCoreData, asrg asrgVar, int i) {
        messageCoreData.getClass();
        eiju eijuVarA = this.a.a(messageCoreData, asrgVar, i);
        eijuVarA.getClass();
        return eijuVarA;
    }

    @Override // defpackage.cmpq
    public final eiju b(basd basdVar, Instant instant, asrg asrgVar, Optional optional, aubq aubqVar, Bundle bundle) {
        instant.getClass();
        aubqVar.getClass();
        eiju eijuVarB = this.a.b(basdVar, instant, asrgVar, optional, aubqVar, bundle);
        eijuVarB.getClass();
        return eijuVarB;
    }
}
