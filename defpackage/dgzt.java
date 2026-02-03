package defpackage;

import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import j$.util.Objects;
import j$.util.Optional;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgzt implements eblu {
    final /* synthetic */ dgzu a;
    private final dgyx b;
    private final ebky c;

    public dgzt(dgzu dgzuVar, dgyx dgyxVar, ebky ebkyVar) {
        this.a = dgzuVar;
        this.b = dgyxVar;
        this.c = ebkyVar;
    }

    @Override // defpackage.eblu
    public final void a(eblm eblmVar) {
        this.a.u(this.b, 5);
    }

    @Override // defpackage.eblu
    public final void b(eblm eblmVar) {
        int iA = eblmVar.a();
        ebqs ebqsVarB = eblmVar.b();
        if (ebqsVarB == null) {
            dhja.h(dgzu.g, "SIP response is null.", new Object[0]);
            return;
        }
        if (iA == 200 || iA == 202) {
            dgzu dgzuVar = this.a;
            dgyx dgyxVar = this.b;
            Iterator it = dgzuVar.q.iterator();
            while (it.hasNext()) {
                ((dgzd) it.next()).b(dgyxVar);
            }
            return;
        }
        if (iA == 407) {
            dhip dhipVar = dgzu.g;
            dhja.l(dhipVar, "407 response received", new Object[0]);
            dgzu dgzuVar2 = this.a;
            dhfw dhfwVar = dgzuVar2.i;
            dhfwVar.a(ebqsVarB);
            ebky ebkyVar = this.c;
            ebkyVar.a();
            dhja.l(dhipVar, "Send second MESSAGE", new Object[0]);
            try {
                dgyx dgyxVar2 = this.b;
                ebqr ebqrVarC = dgzuVar2.f.c(dgzuVar2.q(), ebkyVar, dgyxVar2.h, dgzu.y(dgyxVar2), dgyxVar2.b(), Optional.empty());
                dhfwVar.b(ebqrVarC);
                dgzuVar2.q().s(ebqrVarC);
                return;
            } catch (ebmn | IOException e) {
                dhja.h(dgzu.g, "Unable to send second MESSAGE", new Object[0]);
                e.printStackTrace();
                return;
            }
        }
        if (iA == 403) {
            dgzu dgzuVar3 = this.a;
            dgzuVar3.u(this.b, dgzu.p(iA));
            dfyx dfyxVar = ((dfyj) dgzuVar3.a).b;
            if (Objects.isNull(dfyxVar)) {
                dhja.h(dgzu.g, "Reregistration required by registration controller not initialized", new Object[0]);
                return;
            } else {
                dfyxVar.h(dezf.REREGISTRATION_REQUIRED, iA);
                return;
            }
        }
        if (iA != 404) {
            this.a.u(this.b, dgzu.p(iA));
            return;
        }
        dhja.d(dgzu.g, "Remote user is not RCS user.", new Object[0]);
        String str = this.c.h;
        if (str != null) {
            dgzu dgzuVar4 = this.a;
            String strK = dhjv.k(str, dgzuVar4.j);
            if (strK != null) {
                dgxf dgxfVar = dgzuVar4.m;
                ImsCapabilities imsCapabilities = new ImsCapabilities(dgxfVar.b);
                imsCapabilities.c = false;
                imsCapabilities.d = false;
                dgxfVar.e(strK, imsCapabilities);
            }
        }
        this.a.u(this.b, dgzu.p(iA));
    }

    @Override // defpackage.eblu
    public final void c(eblm eblmVar) {
        this.a.u(this.b, 3);
    }
}
