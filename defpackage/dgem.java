package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgem extends dgdq {
    final /* synthetic */ dgfg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgem(dgfg dgfgVar) {
        super(dgfgVar);
        this.b = dgfgVar;
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public final String a() {
        return "ReadyState";
    }

    @Override // defpackage.dgdq, defpackage.dfna, defpackage.dfmy
    public final void b() {
        super.b();
        this.b.F(new Runnable() { // from class: dgel
            @Override // java.lang.Runnable
            public final void run() {
                dgfg dgfgVar = this.a.b;
                if (dgfgVar.I != null) {
                    dgfgVar.w(dgfgVar.Y);
                } else {
                    dhja.h(dgfgVar.m, "IMS configuration is not available. Stopping.", new Object[0]);
                    dgfgVar.w(dgfgVar.W);
                }
            }
        });
    }

    @Override // defpackage.dgdq, defpackage.dfna, defpackage.dfmy
    public final boolean e(Message message) {
        int i = message.what;
        if (i == 8) {
            dgfg dgfgVar = this.b;
            dgfgVar.N(message.obj);
            dgfgVar.w(dgfgVar.W);
            return true;
        }
        if (i != 17) {
            return super.e(message);
        }
        dgfg dgfgVar2 = this.b;
        dgfgVar2.N(dezf.SIM_REMOVED);
        dgfgVar2.w(dgfgVar2.aj);
        return true;
    }
}
