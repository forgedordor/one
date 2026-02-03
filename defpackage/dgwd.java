package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgwd extends Thread {
    final /* synthetic */ dgwe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgwd(dgwe dgweVar) {
        super("SessionUpdate");
        this.a = dgweVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            try {
                dgwe dgweVar = this.a;
                try {
                    eblf eblfVarV = dgweVar.v();
                    ebky ebkyVar = dgweVar.l;
                    ebqr ebqrVar = ebkyVar.i;
                    ebqrVar.getClass();
                    dhip dhipVar = dgwe.f;
                    dhja.l(dhipVar, "Updating session as terminating, invitation state = %s", Integer.valueOf(dgweVar.n));
                    int iS = dgweVar.s();
                    if (iS == 2 || iS == 0) {
                        dhja.d(dhipVar, "Session has been rejected on timeout", new Object[0]);
                        ebkyVar.t = null;
                        dgweVar.aq(ebqrVar, ebkyVar.d, 11);
                    } else {
                        dgweVar.D(null);
                        ebkyVar.r = null;
                        dhja.l(dhipVar, "Send 200 OK", new Object[0]);
                        ebqs ebqsVarF = dgweVar.A.f(eblfVarV, ebkyVar);
                        if (ebqsVarF == null) {
                            dhja.h(dhipVar, "Error generating 200 OK to INVITE.", new Object[0]);
                            dgweVar.n(9, 55);
                        } else {
                            dhjv.u(ebqsVarF, dgweVar.x(), dgweVar.al());
                            dgweVar.v.c(ebkyVar, ebqrVar, ebqsVarF);
                            Iterator it = dgweVar.g.iterator();
                            while (it.hasNext()) {
                                try {
                                    ((dgwh) it.next()).p();
                                } catch (Exception e) {
                                    dhja.j(e, dgwe.f, "handleSessionUpdating: Call to listener failed with error: ", new Object[0]);
                                }
                            }
                            eblm eblmVarL = eblfVarV.l(ebqsVarF);
                            eblmVarL.h(30);
                            if (eblmVarL.f()) {
                                dhja.l(dgwe.f, "ACK request received", new Object[0]);
                                ebky ebkyVar2 = dgweVar.l;
                                ebkyVar2.s = ebkyVar2.t;
                                Iterator it2 = dgweVar.g.iterator();
                                while (it2.hasNext()) {
                                    try {
                                        ((dgwh) it2.next()).o();
                                    } catch (Exception e2) {
                                        dhja.j(e2, dgwe.f, "handleSessionUpdated: Call to listener failed with error", new Object[0]);
                                    }
                                }
                            } else {
                                dhja.d(dgwe.f, "No ACK received for INVITE", new Object[0]);
                                Iterator it3 = dgweVar.g.iterator();
                                while (it3.hasNext()) {
                                    try {
                                        ((dgwh) it3.next()).s();
                                    } catch (Exception e3) {
                                        dhja.j(e3, dgwe.f, "handleSessionUpdateFailed: Call to listener failed with error", new Object[0]);
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e4) {
                    dhja.j(e4, dgwe.f, "Session initiation has failed", new Object[0]);
                    dgweVar.L(new dhfu(e4));
                }
            } catch (Exception e5) {
                dhja.j(e5, dgwe.f, "Error while updating session: %s", e5.getMessage());
            }
        } finally {
            this.a.s = null;
        }
    }
}
