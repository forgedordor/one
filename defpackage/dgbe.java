package defpackage;

import android.os.Message;
import android.telephony.ims.DelegateRegistrationState;
import android.telephony.ims.SipDelegateConfiguration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgbe extends dgbb {
    final /* synthetic */ dgbn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgbe(dgbn dgbnVar) {
        super(dgbnVar);
        this.b = dgbnVar;
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public final String a() {
        return "InactiveState";
    }

    @Override // defpackage.dgbb, defpackage.dfna, defpackage.dfmy
    public final void b() {
        super.b();
        dhja.d(this.b.i, "Delegate is deregistered.", new Object[0]);
    }

    @Override // defpackage.dgbb, defpackage.dfna, defpackage.dfmy
    public final boolean e(Message message) {
        int i = message.what;
        if (i == 2) {
            dgbn dgbnVar = this.b;
            dgbnVar.M((SipDelegateConfiguration) message.obj);
            dgbnVar.K((SipDelegateConfiguration) message.obj);
            return true;
        }
        if (i == 8) {
            this.b.C(message.arg1);
            return true;
        }
        if (i == 4) {
            dgbn dgbnVar2 = this.b;
            dgbnVar2.w(dgbnVar2.q);
            return true;
        }
        if (i != 5) {
            return false;
        }
        dgbn dgbnVar3 = this.b;
        dgbnVar3.L((DelegateRegistrationState) message.obj);
        dgbnVar3.w(dgbnVar3.o);
        return true;
    }
}
