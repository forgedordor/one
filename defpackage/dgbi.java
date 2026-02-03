package defpackage;

import android.os.Message;
import android.telephony.ims.DelegateRegistrationState;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgbi extends dgbk {
    final /* synthetic */ dgbn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgbi(dgbn dgbnVar) {
        super(dgbnVar);
        this.b = dgbnVar;
    }

    @Override // defpackage.dgbk, defpackage.dfna, defpackage.dfmy
    public final String a() {
        return "ReceiveFeatureTagsState";
    }

    @Override // defpackage.dgbk, defpackage.dgbb, defpackage.dfna, defpackage.dfmy
    public final boolean e(Message message) {
        if (message.what != 5) {
            return super.e(message);
        }
        dgbn dgbnVar = this.b;
        dgbnVar.L((DelegateRegistrationState) message.obj);
        dgbnVar.D();
        return true;
    }
}
