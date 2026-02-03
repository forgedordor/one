package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgez extends dgdq {
    final /* synthetic */ dgfg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgez(dgfg dgfgVar) {
        super(dgfgVar);
        this.b = dgfgVar;
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public final String a() {
        return "StoppedState";
    }

    @Override // defpackage.dgdq, defpackage.dfna, defpackage.dfmy
    public final boolean e(Message message) {
        if (message.what != 7) {
            return super.e(message);
        }
        dgfg dgfgVar = this.b;
        if (dgfgVar.D == dezf.FCM_TICKLE_KEEP_ALIVE) {
            dgfgVar.w(dgfgVar.X);
            return true;
        }
        if (!((Boolean) dgfg.g.a()).booleanValue() || dgfgVar.G.a() <= 0) {
            dgfgVar.w(dgfgVar.X);
        } else {
            dhja.d(dgfgVar.m, "Wait for backoff timer before starting registration.", new Object[0]);
            dgfgVar.w(dgfgVar.ak);
        }
        return true;
    }
}
