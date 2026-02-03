package defpackage;

import android.os.Message;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgeh extends dgdq {
    final /* synthetic */ dgfg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgeh(dgfg dgfgVar) {
        super(dgfgVar);
        this.b = dgfgVar;
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public final String a() {
        return "DeregisteredState";
    }

    @Override // defpackage.dgdq, defpackage.dfna, defpackage.dfmy
    public final void b() {
        super.b();
        dgfg dgfgVar = this.b;
        dhja.d(dgfgVar.m, "Deregistered. reason=%s", dgfgVar.D);
        dgfgVar.I();
        dgfgVar.y = null;
        dgfgVar.w = null;
        dgfgVar.O();
        ebqv ebqvVar = dgfgVar.x;
        if (!Objects.isNull(ebqvVar)) {
            ebqvVar.j(new ebqw() { // from class: dgdh
                @Override // defpackage.ebqw
                public final void a(String str, Throwable th) {
                    dfny dfnyVar = dgfg.d;
                }
            });
        }
        dgfgVar.x = null;
        dgfgVar.A();
        dgfgVar.F(new Runnable() { // from class: dgeg
            @Override // java.lang.Runnable
            public final void run() {
                dezf dezfVar = dezf.DISABLED;
                dgfg dgfgVar2 = this.a.b;
                if (dezfVar.equals(dgfgVar2.D) || dezf.CANCELED.equals(dgfgVar2.D) || dezf.SHUTDOWN.equals(dgfgVar2.D) || dezf.NO_RETRY_NO_DEREGISTER_FOR_TEST.equals(dgfgVar2.D)) {
                    dhja.d(dgfgVar2.m, "Stopping registration. reason=%s", dgfgVar2.D);
                    dgfgVar2.w(dgfgVar2.W);
                } else if (dezf.SIM_REMOVED.equals(dgfgVar2.D)) {
                    dgfgVar2.w(dgfgVar2.aj);
                } else {
                    dgfgVar2.w(dgfgVar2.ak);
                }
            }
        });
    }

    @Override // defpackage.dgdq, defpackage.dfna, defpackage.dfmy
    public final boolean e(Message message) {
        if (message.what != 17) {
            return super.e(message);
        }
        dgfg dgfgVar = this.b;
        dgfgVar.N(dezf.SIM_REMOVED);
        dgfgVar.w(dgfgVar.aj);
        return true;
    }
}
