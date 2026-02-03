package defpackage;

import android.os.Message;
import android.telephony.ims.SipDelegateConnection;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgbc extends dgbb {
    final /* synthetic */ dgbn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgbc(dgbn dgbnVar) {
        super(dgbnVar);
        this.b = dgbnVar;
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public final String a() {
        return "ConnectingState";
    }

    @Override // defpackage.dgbb, defpackage.dfna, defpackage.dfmy
    public final void b() {
        super.b();
        this.b.B();
    }

    @Override // defpackage.dgbb, defpackage.dfna, defpackage.dfmy
    public final boolean e(Message message) {
        int i = message.what;
        if (i == 1) {
            dgbn dgbnVar = this.b;
            dgbnVar.D = (SipDelegateConnection) message.obj;
            dgbnVar.w(dgbnVar.n);
            return true;
        }
        if (i == 4) {
            dgbn dgbnVar2 = this.b;
            dgbnVar2.w(dgbnVar2.q);
            return true;
        }
        if (i == 8) {
            this.b.C(message.arg1);
            return true;
        }
        if (i != 16) {
            return false;
        }
        dgbn dgbnVar3 = this.b;
        dhja.l(dgbnVar3.i, "StateConnecting: Timeout for registration, going to retry", new Object[0]);
        dgbnVar3.w(dgbnVar3.s);
        return true;
    }
}
