package defpackage;

import android.os.Message;
import android.telephony.ims.SipDelegateConnection;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgbm extends dgbb {
    final /* synthetic */ dgbn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgbm(dgbn dgbnVar) {
        super(dgbnVar);
        this.b = dgbnVar;
    }

    private final void f(SipDelegateConnection sipDelegateConnection) {
        if (sipDelegateConnection != null) {
            this.b.y.destroySipDelegate(sipDelegateConnection, 2);
        }
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public final String a() {
        return "TerminatedState";
    }

    @Override // defpackage.dgbb, defpackage.dfna, defpackage.dfmy
    public final void b() {
        super.b();
        dgbn dgbnVar = this.b;
        f(dgbnVar.D);
        dgbnVar.x.c();
    }

    @Override // defpackage.dgbb, defpackage.dfna, defpackage.dfmy
    public final boolean e(Message message) {
        if (message.what != 1) {
            return false;
        }
        dhja.r(this.b.i, "Race condition detected: connection created after transitioning to terminated.", new Object[0]);
        f((SipDelegateConnection) message.obj);
        return true;
    }
}
