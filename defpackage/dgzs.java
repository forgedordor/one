package defpackage;

import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.io.IOException;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgzs implements Runnable {
    final /* synthetic */ dgzu a;

    public dgzs(dgzu dgzuVar) {
        this.a = dgzuVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws ebmn {
        String[] strArr;
        while (true) {
            dgzu dgzuVar = this.a;
            if (dgzuVar.s) {
                return;
            }
            try {
                dgyx dgyxVar = (dgyx) dgzuVar.r.take();
                try {
                    strArr = (String[]) Collection.EL.toArray(new dgyh(dgzuVar.t.mMessageTech, dgyxVar.t).c(true), new IntFunction() { // from class: dgzr
                        @Override // java.util.function.IntFunction
                        public final Object apply(int i) {
                            dhip dhipVar = dgzu.g;
                            return new String[i];
                        }
                    });
                } catch (ebmn | IOException unused) {
                    this.a.u(dgyxVar, 50);
                }
                if (dgyxVar == null) {
                    throw new IllegalArgumentException("Message must not be null");
                }
                dhja.w(3, 3, "Pager message sending with messageid=%s", dgyxVar.k);
                String str = dgyxVar.b;
                if (Objects.isNull(str)) {
                    throw new IllegalArgumentException("Message receiver must not be null");
                }
                dfys dfysVar = dgzuVar.a;
                eblf eblfVarQ = dgzuVar.q();
                String strS = dgzuVar.s(str);
                ebky ebkyVar = new ebky(eblf.w(), 1, strS, dfysVar.e(), strS, eblfVarQ.q());
                dhja.l(dgzu.g, "Send first pager message", new Object[0]);
                ebqr ebqrVarC = dgzuVar.f.c(dgzuVar.q(), ebkyVar, dgyxVar.h, dgzu.y(dgyxVar), dgyxVar.b(), Optional.ofNullable(null));
                if (dgyxVar.a == dgyw.DISPOSITION_NOTIFICATION) {
                    dhja.w(5, 3, "Pager message created with messageid=%s", dgyxVar.k);
                }
                try {
                    dhjv.u(ebqrVarC, dgyxVar.e, strArr);
                    if (dfog.E()) {
                        dgyh dgyhVar = new dgyh(dgzuVar.t.mMessageTech, dgyxVar.t);
                        Optional optionalEmpty = !dgyhVar.e() ? Optional.empty() : dgyhVar.f() ? Optional.of("urn:urn-7:3gpp-service.ims.icsi.oma.cpm.msg") : Optional.of("urn:urn-7:3gpp-service.ims.icsi.oma.cpm.session");
                        if (optionalEmpty.isPresent()) {
                            try {
                                ebqrVarC.s("P-Preferred-Service", (String) optionalEmpty.get());
                            } catch (ebml e) {
                                dhja.r(dgzu.g, "Unable to add P-Preferred-Service.", new Object[0]);
                                throw new ebmn("Unable to add P-Preferred-Service.", e);
                            }
                        }
                    }
                    dgzuVar.q().k(ebqrVarC, new dgzt(dgzuVar, dgyxVar, ebkyVar));
                } catch (ebml e2) {
                    dhja.r(dgzu.g, "Unable to add appId!", new Object[0]);
                    e2.printStackTrace();
                }
            } catch (InterruptedException unused2) {
                dhja.d(dgzu.g, "Waiting for new pager mode messages got interrupted!", new Object[0]);
                return;
            }
        }
    }
}
