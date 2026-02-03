package defpackage;

import android.os.Bundle;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgej extends dgdq {
    final /* synthetic */ dgfg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgej(dgfg dgfgVar) {
        super(dgfgVar);
        this.b = dgfgVar;
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public final String a() {
        return "DeregisteringState";
    }

    @Override // defpackage.dgdq, defpackage.dfna, defpackage.dfmy
    public final void b() {
        super.b();
        this.b.F(new Runnable() { // from class: dgei
            @Override // java.lang.Runnable
            public final void run() {
                dgej dgejVar = this.a;
                try {
                    dgejVar.b.L();
                } catch (dfzh | ebmn e) {
                    dgfg dgfgVar = dgejVar.b;
                    dhja.j(e, dgfgVar.m, "Can't sent deREGISTER.", new Object[0]);
                    dgfgVar.w(dgfgVar.ah);
                }
            }
        });
    }

    @Override // defpackage.dgdq, defpackage.dfna, defpackage.dfmy
    public final boolean e(Message message) {
        int i = message.what;
        if (i != 2) {
            if (i == 3) {
                dgfg dgfgVar = this.b;
                dhja.h(dgfgVar.m, "Deregistration timeout.", new Object[0]);
                dgfgVar.w(dgfgVar.ah);
                return true;
            }
            if (i == 5) {
                Bundle bundle = (Bundle) message.obj;
                this.b.C(bundle.getString("transport_id"), (Throwable) bundle.getSerializable("transport_error_cause"));
                return true;
            }
            if (i != 8) {
                if (i != 17) {
                    return super.e(message);
                }
                this.b.N(dezf.SIM_REMOVED);
                return true;
            }
            dgfg dgfgVar2 = this.b;
            dgfgVar2.N(message.obj);
            dhja.d(dgfgVar2.m, "Deregistration in progress.", new Object[0]);
            return true;
        }
        if (message.obj instanceof ebqs) {
            ebqs ebqsVar = (ebqs) message.obj;
            if (ebqsVar.y() == 200) {
                dgfg dgfgVar3 = this.b;
                dgfgVar3.w(dgfgVar3.ah);
            } else if (ebqsVar.y() == 401) {
                dgfg dgfgVar4 = this.b;
                dhip dhipVar = dgfgVar4.m;
                dhja.d(dhipVar, "401 response received", new Object[0]);
                try {
                    dgfgVar4.K.b(ebqsVar);
                    dhja.d(dhipVar, "Send second de-REGISTER", new Object[0]);
                    dgfgVar4.L();
                } catch (dfzh | ebmn e) {
                    dhja.j(e, this.b.m, "Send second de-REGISTER failed.", new Object[0]);
                }
            } else {
                dgfg dgfgVar5 = this.b;
                dhja.h(dgfgVar5.m, "Deregistration failed (%d %s).", Integer.valueOf(ebqsVar.y()), ebqsVar.A());
                dgfgVar5.w(dgfgVar5.ah);
            }
        } else {
            ebmn ebmnVar = (ebmn) message.obj;
            dgfg dgfgVar6 = this.b;
            dhja.j(ebmnVar, dgfgVar6.m, "Deregistration failed.", new Object[0]);
            dgfgVar6.w(dgfgVar6.ah);
        }
        return true;
    }
}
