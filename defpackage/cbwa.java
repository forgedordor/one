package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbwa implements cbvk {
    private final ccuq a;

    public cbwa(ccuq ccuqVar) {
        this.a = ccuqVar;
    }

    @Override // defpackage.cbvk
    public final ccfx a(final enba enbaVar, final int i) {
        enbaVar.getClass();
        return (ccfx) this.a.a("generateKeyPackagesSync", new fdap() { // from class: cbvq
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cbvk cbvkVar = (cbvk) obj;
                cbvkVar.getClass();
                return cbvkVar.a(enbaVar, i);
            }
        });
    }

    @Override // defpackage.cbvk
    public final eprb b(final ccep ccepVar, final List list, final enba enbaVar) {
        ccepVar.getClass();
        list.getClass();
        enbaVar.getClass();
        return (eprb) this.a.a("createGroupAndAddMembersSync", new fdap() { // from class: cbvr
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cbvk cbvkVar = (cbvk) obj;
                cbvkVar.getClass();
                return cbvkVar.b(ccepVar, list, enbaVar);
            }
        });
    }

    @Override // defpackage.cbvk
    public final epun c(final cbwd cbwdVar, final cchc cchcVar, final epsb epsbVar, final int i, final enba enbaVar) {
        cbwdVar.getClass();
        cchcVar.getClass();
        epsbVar.getClass();
        enbaVar.getClass();
        return (epun) this.a.a("processDisplayReceiptSync", new fdap() { // from class: cbvo
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cbvk cbvkVar = (cbvk) obj;
                cbvkVar.getClass();
                return cbvkVar.c(cbwdVar, cchcVar, epsbVar, i, enbaVar);
            }
        });
    }

    @Override // defpackage.cbvk
    public final epun d(final cbwd cbwdVar, final cchc cchcVar, final eprw eprwVar, final ccep ccepVar, final int i, final enba enbaVar) {
        cbwdVar.getClass();
        eprwVar.getClass();
        enbaVar.getClass();
        return (epun) this.a.a("processNegativeDeliveryReceiptSync", new fdap() { // from class: cbvy
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cbvk cbvkVar = (cbvk) obj;
                cbvkVar.getClass();
                return cbvkVar.d(cbwdVar, cchcVar, eprwVar, ccepVar, i, enbaVar);
            }
        });
    }

    @Override // defpackage.cbvk
    public final epun e(final cbwd cbwdVar, final cchc cchcVar, final eprw eprwVar, final int i, final enba enbaVar) {
        cbwdVar.getClass();
        cchcVar.getClass();
        eprwVar.getClass();
        enbaVar.getClass();
        return (epun) this.a.a("processPositiveDeliveryReceiptSync", new fdap() { // from class: cbvn
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cbvk cbvkVar = (cbvk) obj;
                cbvkVar.getClass();
                return cbvkVar.e(cbwdVar, cchcVar, eprwVar, i, enbaVar);
            }
        });
    }

    @Override // defpackage.cbvk
    public final epuq f(final cbwd cbwdVar, final ccep ccepVar, final basd basdVar, final ccct ccctVar, final enba enbaVar) {
        cbwdVar.getClass();
        ccepVar.getClass();
        basdVar.getClass();
        ccctVar.getClass();
        enbaVar.getClass();
        return (epuq) this.a.a("encryptSync", new fdap() { // from class: cbvu
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cbvk cbvkVar = (cbvk) obj;
                cbvkVar.getClass();
                return cbvkVar.f(cbwdVar, ccepVar, basdVar, ccctVar, enbaVar);
            }
        });
    }

    @Override // defpackage.cbvk
    public final epuq g(final ccep ccepVar, final eprw eprwVar, final enba enbaVar) {
        ccepVar.getClass();
        eprwVar.getClass();
        enbaVar.getClass();
        return (epuq) this.a.a("generateDeliveryReceiptSignatureSync", new fdap() { // from class: cbvv
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cbvk cbvkVar = (cbvk) obj;
                cbvkVar.getClass();
                return cbvkVar.g(ccepVar, eprwVar, enbaVar);
            }
        });
    }

    @Override // defpackage.cbvk
    public final epuq h(final ccep ccepVar, final epsb epsbVar, final enba enbaVar) {
        ccepVar.getClass();
        epsbVar.getClass();
        enbaVar.getClass();
        return (epuq) this.a.a("generateDisplayReceiptSignatureSync", new fdap() { // from class: cbvx
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cbvk cbvkVar = (cbvk) obj;
                cbvkVar.getClass();
                return cbvkVar.h(ccepVar, epsbVar, enbaVar);
            }
        });
    }

    @Override // defpackage.cbvk
    public final epuq i(final enba enbaVar, final ccep ccepVar) {
        enbaVar.getClass();
        ccepVar.getClass();
        return (epuq) this.a.a("generateEndMlsCommitSync", new fdap() { // from class: cbvt
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cbvk cbvkVar = (cbvk) obj;
                cbvkVar.getClass();
                return cbvkVar.i(enbaVar, ccepVar);
            }
        });
    }

    @Override // defpackage.cbvk
    public final epuq k(final ccep ccepVar, final epti eptiVar, final enba enbaVar) {
        ccepVar.getClass();
        eptiVar.getClass();
        enbaVar.getClass();
        return (epuq) this.a.a("maybeRefresh", new fdap() { // from class: cbvm
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cbvk cbvkVar = (cbvk) obj;
                cbvkVar.getClass();
                return cbvkVar.k(ccepVar, eptiVar, enbaVar);
            }
        });
    }

    @Override // defpackage.cbvk
    public final epuq l(final cbwd cbwdVar, final List list, final evqs evqsVar, final enba enbaVar) {
        cbwdVar.getClass();
        list.getClass();
        evqsVar.getClass();
        enbaVar.getClass();
        return (epuq) this.a.a("processAdvanceEraRequest", new fdap() { // from class: cbvl
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cbvk cbvkVar = (cbvk) obj;
                cbvkVar.getClass();
                return cbvkVar.l(cbwdVar, list, evqsVar, enbaVar);
            }
        });
    }

    @Override // defpackage.cbvk
    public final epuq m(final cbwd cbwdVar, final eyxu eyxuVar) {
        cbwdVar.getClass();
        eyxuVar.getClass();
        return (epuq) this.a.a("processGroupInfoMessage", new fdap() { // from class: cbvs
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cbvk cbvkVar = (cbvk) obj;
                cbvkVar.getClass();
                return cbvkVar.m(cbwdVar, eyxuVar);
            }
        });
    }

    @Override // defpackage.cbvk
    public final epuq n(final cbwd cbwdVar, final cchc cchcVar, final int i, final evqs evqsVar, final aubq aubqVar, final enba enbaVar, final basd basdVar) {
        cbwdVar.getClass();
        cchcVar.getClass();
        aubqVar.getClass();
        enbaVar.getClass();
        basdVar.getClass();
        return (epuq) this.a.a("processMessageSync", new fdap() { // from class: cbvz
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cbvk cbvkVar = (cbvk) obj;
                cbvkVar.getClass();
                return cbvkVar.n(cbwdVar, cchcVar, i, evqsVar, aubqVar, enbaVar, basdVar);
            }
        });
    }

    @Override // defpackage.cbvk
    public final void o(final enba enbaVar) {
        enbaVar.getClass();
        this.a.a("runMaintenance", new fdap() { // from class: cbvp
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cbvk cbvkVar = (cbvk) obj;
                cbvkVar.getClass();
                cbvkVar.o(enbaVar);
                return fctx.a;
            }
        });
    }

    @Override // defpackage.cbvk
    public final boolean p(final ccep ccepVar, final enba enbaVar) {
        ccepVar.getClass();
        enbaVar.getClass();
        return ((Boolean) this.a.a("deleteGroupSync", new fdap() { // from class: cbvw
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cbvk cbvkVar = (cbvk) obj;
                cbvkVar.getClass();
                return Boolean.valueOf(cbvkVar.p(ccepVar, enbaVar));
            }
        })).booleanValue();
    }
}
