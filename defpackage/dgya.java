package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgya extends dgvq {
    public final Map g;
    public dhbd h;
    private final fcsu i;
    private eblx j;

    public dgya(dfys dfysVar, dgwg dgwgVar, fcsu fcsuVar, dhjt dhjtVar) {
        super(dfysVar, dgwgVar, dhjtVar);
        this.g = DesugarCollections.synchronizedMap(new HashMap());
        this.i = fcsuVar;
    }

    @Override // defpackage.dgvq
    protected final void f() {
        dfys dfysVar = this.a;
        if (dfysVar.a().mConfirmationServiceIdentity == null) {
            dhja.q("No confirmation service identity configured!", new Object[0]);
            k(dezf.DISABLED);
            return;
        }
        try {
            ebkr ebkrVar = dhjv.a;
            this.j = ebkr.e(dfysVar.a().mConfirmationServiceIdentity);
        } catch (ebml e) {
            dhja.i(e, "Error while parsing identity: %s", e.getMessage());
            this.j = null;
        }
    }

    public final void p(ebqr ebqrVar) throws dgyb {
        try {
            ((eblg) this.i).a.s(this.f.n(ebqrVar));
        } catch (ebmn e) {
            dhja.i(e, "Can't send 200 OK for MESSAGE: %s", e.getMessage());
            throw new dgyb("Error while sending response: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    public final void q(ebqr ebqrVar) {
        try {
            ((eblg) this.i).a.s(this.f.o(ebqrVar, 400, 2));
        } catch (ebmn e) {
            dhja.i(e, "Can't send 200 OK for MESSAGE: %s", e.getMessage());
        }
    }

    public final boolean r(ebqr ebqrVar) {
        eblx eblxVar = this.j;
        if (eblxVar == null) {
            return true;
        }
        String strJ = ebqrVar.j("P-Asserted-Identity");
        if (strJ == null) {
            return false;
        }
        try {
            ebkr ebkrVar = dhjv.a;
            eblx eblxVar2 = (eblx) ebkr.b(strJ).b;
            if (Objects.equals(eblxVar2.e(), eblxVar.e())) {
                if (Objects.equals(eblxVar2.b(), eblxVar.b())) {
                    return true;
                }
            }
        } catch (ebml unused) {
        }
        return false;
    }

    @Override // defpackage.dgvq
    public final void n() {
    }

    @Override // defpackage.dgvq
    public final void o() {
    }
}
