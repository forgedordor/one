package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmnr implements cmpo {
    private final cmnt a;
    private final atal b = new atal();

    public cmnr(String str, byte[] bArr) {
        this.a = new cmml(str, bArr);
    }

    @Override // defpackage.cmpo
    public final aubt a(auhk auhkVar, basd basdVar, Instant instant) {
        aubs aubsVar = (aubs) aubt.a.createBuilder();
        cmml cmmlVar = (cmml) this.a;
        aubx aubxVar = (aubx) this.b.fH().fM(ContentType.e(cmmlVar.a));
        aubsVar.copyOnWrite();
        aubt aubtVar = (aubt) aubsVar.instance;
        aubxVar.getClass();
        aubtVar.c = aubxVar;
        aubtVar.b |= 1;
        evqs evqsVarX = evqs.x(cmmlVar.b);
        aubsVar.copyOnWrite();
        aubt aubtVar2 = (aubt) aubsVar.instance;
        aubtVar2.b |= 2;
        aubtVar2.d = evqsVarX;
        return (aubt) aubsVar.build();
    }

    @Override // defpackage.cmpo
    public final eiju b(basd basdVar, eyga eygaVar, Instant instant, aubq aubqVar, asrg asrgVar) {
        return eijx.d(new UnsupportedOperationException("this converter only supports returning delivery receipts to blocked senders"));
    }

    @Override // defpackage.cmpo
    public final eiju c(auhk auhkVar, MessageCoreData messageCoreData, asrg asrgVar) {
        return eijx.d(new UnsupportedOperationException("this converter only supports returning receipts to blocked senders"));
    }
}
