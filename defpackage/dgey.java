package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgey extends dgdq {
    final /* synthetic */ dgfg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgey(dgfg dgfgVar) {
        super(dgfgVar);
        this.b = dgfgVar;
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public final String a() {
        return "SimRemovedState";
    }

    @Override // defpackage.dgdq, defpackage.dfna, defpackage.dfmy
    public final void b() {
        super.b();
        dgfg dgfgVar = this.b;
        if (dgfgVar.V.getAndSet(false)) {
            dgfgVar.q(16);
        }
    }

    @Override // defpackage.dgdq, defpackage.dfna, defpackage.dfmy
    public final boolean e(Message message) {
        int i = message.what;
        if (i == 7) {
            dgfg dgfgVar = this.b;
            if (dgfgVar.D.equals(dezf.FCM_TICKLE_KEEP_ALIVE)) {
                dhja.d(dgfgVar.m, "Ignore FCM Tickle.", new Object[0]);
            } else {
                dgfgVar.w(dgfgVar.X);
            }
        } else {
            if (i != 8) {
                if (i != 16) {
                    return super.e(message);
                }
                dgfg dgfgVar2 = this.b;
                dgfgVar2.w(dgfgVar2.Y);
                return true;
            }
            dezf dezfVar = (dezf) message.obj;
            dgfg dgfgVar3 = this.b;
            dgfgVar3.N(dezfVar);
            if (dezfVar.equals(dezf.FCM_TICKLE_KEEP_ALIVE)) {
                dhja.d(dgfgVar3.m, "Ignore FCM Tickle.", new Object[0]);
            } else {
                dgfgVar3.w(dgfgVar3.W);
            }
        }
        return true;
    }
}
