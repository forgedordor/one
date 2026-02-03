package defpackage;

import android.os.Message;
import android.telephony.ims.DelegateRegistrationState;
import android.telephony.ims.SipDelegateConfiguration;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dgbk extends dgbb {
    final /* synthetic */ dgbn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgbk(dgbn dgbnVar) {
        super(dgbnVar);
        this.c = dgbnVar;
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public String a() {
        return "RegisteringState";
    }

    @Override // defpackage.dgbb, defpackage.dfna, defpackage.dfmy
    public boolean e(Message message) {
        int i = message.what;
        if (i == 2) {
            SipDelegateConfiguration sipDelegateConfiguration = (SipDelegateConfiguration) message.obj;
            dgbn dgbnVar = this.c;
            dhja.l(dgbnVar.i, "applying configuration in state:%s with version %d", "RegisteringState", Long.valueOf(sipDelegateConfiguration.getVersion()));
            dgbnVar.M(sipDelegateConfiguration);
            dgbnVar.K(sipDelegateConfiguration);
            dgbnVar.w(dgbnVar.l);
            return true;
        }
        if (i == 16) {
            dgbn dgbnVar2 = this.c;
            dhja.l(dgbnVar2.i, "StateRegistering: Timeout for registration, going to retry", new Object[0]);
            dgbnVar2.w(dgbnVar2.s);
            return true;
        }
        if (i == 4) {
            dgbn dgbnVar3 = this.c;
            dgbnVar3.w(dgbnVar3.q);
            return true;
        }
        if (i == 5) {
            dgbn dgbnVar4 = this.c;
            dgbnVar4.L((DelegateRegistrationState) message.obj);
            dgbnVar4.w(dgbnVar4.m);
            return true;
        }
        if (i == 7) {
            this.c.E();
            return true;
        }
        if (i != 8) {
            return super.e(message);
        }
        this.c.C(message.arg1);
        return true;
    }
}
