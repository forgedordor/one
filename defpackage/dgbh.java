package defpackage;

import android.os.Message;
import android.telephony.ims.SipDelegateConfiguration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgbh extends dgbk {
    final /* synthetic */ dgbn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgbh(dgbn dgbnVar) {
        super(dgbnVar);
        this.b = dgbnVar;
    }

    @Override // defpackage.dgbk, defpackage.dfna, defpackage.dfmy
    public final String a() {
        return "ReceiveConfigurationState";
    }

    @Override // defpackage.dgbk, defpackage.dgbb, defpackage.dfna, defpackage.dfmy
    public final boolean e(Message message) {
        if (message.what != 2) {
            return super.e(message);
        }
        SipDelegateConfiguration sipDelegateConfiguration = (SipDelegateConfiguration) message.obj;
        dgbn dgbnVar = this.b;
        dhja.l(dgbnVar.i, "applying configuration in state:%s with version %d", "ReceiveConfigurationState", Long.valueOf(sipDelegateConfiguration.getVersion()));
        dgbnVar.M(sipDelegateConfiguration);
        dgbnVar.K(sipDelegateConfiguration);
        dgbnVar.D();
        return true;
    }
}
