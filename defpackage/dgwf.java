package defpackage;

import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgwf extends TimerTask {
    final /* synthetic */ dgwe a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dgwg c;

    public dgwf(dgwg dgwgVar, dgwe dgweVar, boolean z) {
        this.a = dgweVar;
        this.b = z;
        this.c = dgwgVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() throws ebmn {
        dgwe dgweVar = this.a;
        if (dgweVar.a == dgws.RUNNING) {
            if (this.b) {
                dgwt dgwtVar = dgweVar.v;
                try {
                    dgwe dgweVar2 = dgwtVar.a;
                    ebky ebkyVar = dgweVar2.l;
                    ebkyVar.a();
                    eblf eblfVar = ((eblg) dgwtVar.c).a;
                    dhjt dhjtVar = dgwtVar.d;
                    dfys dfysVar = dgwtVar.b;
                    ebqr ebqrVarR = dhjtVar.r(eblfVar, ebkyVar);
                    dgwe dgweVarA = dgweVar2.i.c.a(dgweVar2.y(), dgweVar2);
                    dhjv.u(ebqrVarR, dgweVarA != null ? dgweVarA.x() : null, dgweVar2.al());
                    eblm eblmVarL = eblfVar.l(ebqrVarR);
                    dhja.c("Created: %s", dhja.a(eblmVarL.c));
                    if (eblmVarL.h(10) != 2) {
                        if (eblmVarL.g()) {
                            ebqs ebqsVarB = eblmVarL.b();
                            if (ebqsVarB == null) {
                                throw new ebmn("SIP response is null");
                            }
                            ebkyVar.q = ebqsVarB;
                            eblfVar.s(dhjtVar.q(eblfVar, ebkyVar));
                            if (ebqsVarB.y() == 200) {
                                dgwtVar.b(ebkyVar, ebqsVarB);
                            } else {
                                ebqsVarB.y();
                            }
                        } else {
                            dhja.g("Refreshing session failed - time out", new Object[0]);
                            dgweVar2.o(new dhft(408, "Timeout"), 1, 1);
                        }
                    }
                } catch (Exception e) {
                    String str = String.format("Error while refreshing session: %s", e.getMessage());
                    dhja.i(e, "%s", str);
                    dgwtVar.a.o(new dhft(0, str), 1, 1);
                }
            } else {
                dgwe dgweVar3 = this.a;
                long jCurrentTimeMillis = System.currentTimeMillis();
                dgwt dgwtVar2 = dgweVar3.v;
                if (jCurrentTimeMillis - dgwtVar2.f > dgwtVar2.e * 1000) {
                    dhja.c("Session inactivity detected - terminating", new Object[0]);
                    dgwtVar2.a.n(1, 1);
                }
            }
        }
        this.c.d.remove(this.a);
    }
}
