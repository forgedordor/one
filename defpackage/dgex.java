package defpackage;

import android.os.Message;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgex extends dgdq {
    final /* synthetic */ dgfg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgex(dgfg dgfgVar) {
        super(dgfgVar);
        this.b = dgfgVar;
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public final String a() {
        return "RetryState";
    }

    @Override // defpackage.dgdq, defpackage.dfna, defpackage.dfmy
    public final void b() {
        super.b();
        dgfg dgfgVar = this.b;
        dgfgVar.H = 0L;
        dgfgVar.F(new Runnable() { // from class: dgev
            @Override // java.lang.Runnable
            public final void run() {
                final dgex dgexVar = this.a;
                dgfg dgfgVar2 = dgexVar.b;
                dgch dgchVar = dgfgVar2.G;
                long jA = dgchVar.a();
                if (jA == 0) {
                    dgfgVar2.w(dgfgVar2.Y);
                } else {
                    dhja.l(dgfgVar2.m, "Scheduling MSG_RETRY_TIMEOUT for %ds.", Long.valueOf(jA));
                    dgfgVar2.J(new Runnable() { // from class: dgew
                        @Override // java.lang.Runnable
                        public final void run() {
                            dgexVar.b.q(15);
                        }
                    }, jA, TimeUnit.SECONDS);
                    dgfgVar2.H = dhkl.a().longValue() + (jA * 1000);
                }
                dgchVar.b();
            }
        });
    }

    @Override // defpackage.dgdq, defpackage.dfna, defpackage.dfmy
    public final void c() {
        super.c();
        dgfg dgfgVar = this.b;
        dgfgVar.z();
        dgfgVar.G.a = 0;
        dgfgVar.p(15);
    }

    @Override // defpackage.dgdq, defpackage.dfna, defpackage.dfmy
    public final boolean e(Message message) {
        int i = message.what;
        if (i == 4) {
            dgfg dgfgVar = this.b;
            dhja.d(dgfgVar.m, "Ignore connectivity event. Next retry in %dms", Long.valueOf(dgfgVar.H - dhkl.a().longValue()));
            return true;
        }
        if (i == 8) {
            dgfg dgfgVar2 = this.b;
            dgfgVar2.N(message.obj);
            dgfgVar2.w(dgfgVar2.W);
            return true;
        }
        if (i != 15) {
            return super.e(message);
        }
        dgfg dgfgVar3 = this.b;
        dhja.d(dgfgVar3.m, "Triggering registration retry.", new Object[0]);
        dgfgVar3.w(dgfgVar3.Y);
        return true;
    }
}
