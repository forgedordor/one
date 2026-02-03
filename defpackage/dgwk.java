package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgwk implements eblu {
    final /* synthetic */ dgwm a;

    public dgwk(dgwm dgwmVar) {
        this.a = dgwmVar;
    }

    @Override // defpackage.eblu
    public final void a(eblm eblmVar) {
        this.a.f(408, "timeout");
    }

    @Override // defpackage.eblu
    public final void b(eblm eblmVar) throws ebmn {
        if (!eblmVar.g()) {
            this.a.f(408, "timeout");
            return;
        }
        ebqs ebqsVarB = eblmVar.b();
        if (ebqsVarB == null) {
            dhja.g("SIP response is null.", new Object[0]);
            return;
        }
        int iA = eblmVar.a();
        if (iA == 200 || iA == 202) {
            dgwm dgwmVar = this.a;
            dgwmVar.o(ebqsVarB);
            Iterator it = dgwmVar.a.iterator();
            while (it.hasNext()) {
                ((dgwo) it.next()).t();
            }
            return;
        }
        if (iA == 403) {
            dgwm dgwmVar2 = this.a;
            if (dgwmVar2.h) {
                dgwmVar2.f(403, ebqsVarB.A());
                return;
            } else {
                dgwmVar2.h = true;
                dgwmVar2.l(false);
                return;
            }
        }
        if (iA != 407) {
            if (iA != 423) {
                this.a.f(iA, ebqsVarB.A());
                return;
            }
            dgwm dgwmVar3 = this.a;
            try {
                dhja.k("423 response received", new Object[0]);
                String strJ = ebqsVarB.j("Min-Expires");
                dgwmVar3.e = dgwmVar3.b(dgwmVar3.c);
                dhja.k("Send second Subscribe", new Object[0]);
                String[] strArr = dgwmVar3.j;
                if (strArr == null) {
                    strArr = new String[0];
                }
                dgwmVar3.k(dgwmVar3.m.e(dgwmVar3.c(), dgwmVar3.e, strJ == null ? 0 : Integer.parseInt(strJ), dgwmVar3.b, strArr));
                return;
            } catch (Exception e) {
                dhja.i(e, "Subscription failed", new Object[0]);
                dgwmVar3.g(new dhfv(e));
                return;
            }
        }
        dgwm dgwmVar4 = this.a;
        try {
            dhja.k("407 response received", new Object[0]);
            dgwmVar4.o(ebqsVarB);
            dhfw dhfwVar = dgwmVar4.d;
            dhfwVar.a(ebqsVarB);
            dgwmVar4.e.a();
            dhja.k("Send second Subscribe", new Object[0]);
            String[] strArr2 = dgwmVar4.j;
            if (strArr2 == null) {
                strArr2 = new String[0];
            }
            ebqr ebqrVarE = dgwmVar4.m.e(dgwmVar4.c(), dgwmVar4.e, 3600, dgwmVar4.b, strArr2);
            dhfwVar.b(ebqrVarE);
            ebos ebosVar = ebqrVarE.y().f;
            if (ebosVar == null) {
                throw new ebmn("subscribe.getStackRequest().getToHeader() returned null");
            }
            ebosVar.e();
            dgwmVar4.k(ebqrVarE);
        } catch (Exception e2) {
            dhja.i(e2, "Subscription failed", new Object[0]);
            dgwmVar4.g(new dhfv(e2));
        }
    }

    @Override // defpackage.eblu
    public final void c(eblm eblmVar) {
        this.a.f(408, "timeout");
    }
}
