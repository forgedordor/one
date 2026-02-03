package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbvj implements cbum {
    private final ccuq a;
    private final cbwk b;

    public cbvj(ccuq ccuqVar, cbwk cbwkVar) {
        this.a = ccuqVar;
        this.b = cbwkVar;
    }

    @Override // defpackage.cbum
    public final epvv a(final byte[] bArr) {
        return (epvv) this.a.a("convertFromSerializedTlsToCommitList", new fdap() { // from class: cbup
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cbum cbumVar = (cbum) obj;
                cbumVar.getClass();
                return cbumVar.a(bArr);
            }
        });
    }

    @Override // defpackage.cbum
    public final epwj b(final byte[] bArr) {
        return (epwj) this.a.a("convertFromSerializedTlsToProposalList", new fdap() { // from class: cbuq
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cbum cbumVar = (cbum) obj;
                cbumVar.getClass();
                return cbumVar.b(bArr);
            }
        });
    }

    @Override // defpackage.cbum
    public final Object c(ccep ccepVar, List list, enba enbaVar, fcxy fcxyVar) {
        return this.b.b(new cbur(ccepVar, list, enbaVar, null), fcxyVar);
    }

    @Override // defpackage.cbum
    public final Object d(ccep ccepVar, enba enbaVar, fcxy fcxyVar) {
        return this.b.b(new cbus(ccepVar, enbaVar, null), fcxyVar);
    }

    @Override // defpackage.cbum
    public final Object e(cbwd cbwdVar, ccep ccepVar, basd basdVar, ccct ccctVar, enba enbaVar, fcxy fcxyVar) {
        return this.b.b(new cbut(cbwdVar, ccepVar, basdVar, ccctVar, enbaVar, null), fcxyVar);
    }

    @Override // defpackage.cbum
    public final Object f(ccep ccepVar, eprw eprwVar, enba enbaVar, fcxy fcxyVar) {
        return this.b.b(new cbuu(ccepVar, eprwVar, enbaVar, null), fcxyVar);
    }

    @Override // defpackage.cbum
    public final Object g(ccep ccepVar, epsb epsbVar, enba enbaVar, fcxy fcxyVar) {
        return this.b.b(new cbuv(ccepVar, epsbVar, enbaVar, null), fcxyVar);
    }

    @Override // defpackage.cbum
    public final Object h(ccep ccepVar, enba enbaVar, fcxy fcxyVar) {
        return this.b.b(new cbuw(ccepVar, enbaVar, null), fcxyVar);
    }

    @Override // defpackage.cbum
    public final Object i(int i, enba enbaVar, fcxy fcxyVar) {
        return this.b.b(new cbux(i, enbaVar, null), fcxyVar);
    }

    @Override // defpackage.cbum
    public final Object j(fcxy fcxyVar) {
        return this.b.b(new cbuy(null), fcxyVar);
    }

    @Override // defpackage.cbum
    public final Object k(fcxy fcxyVar) {
        return this.b.b(new cbuz(null), fcxyVar);
    }

    @Override // defpackage.cbum
    public final Object l(ccep ccepVar, epti eptiVar, enba enbaVar, fcxy fcxyVar) {
        return this.b.b(new cbva(ccepVar, eptiVar, enbaVar, null), fcxyVar);
    }

    @Override // defpackage.cbum
    public final Object m(cbwd cbwdVar, List list, evqs evqsVar, enba enbaVar, fcxy fcxyVar) {
        return this.b.b(new cbvb(cbwdVar, list, evqsVar, enbaVar, null), fcxyVar);
    }

    @Override // defpackage.cbum
    public final Object n(cbwd cbwdVar, cchc cchcVar, epsb epsbVar, int i, enba enbaVar, fcxy fcxyVar) {
        return this.b.b(new cbvc(cbwdVar, cchcVar, epsbVar, i, enbaVar, null), fcxyVar);
    }

    @Override // defpackage.cbum
    public final Object o(cbwd cbwdVar, eyxu eyxuVar, fcxy fcxyVar) {
        return this.b.b(new cbvd(cbwdVar, eyxuVar, null), fcxyVar);
    }

    @Override // defpackage.cbum
    public final Object p(cbwd cbwdVar, cchc cchcVar, int i, evqs evqsVar, aubq aubqVar, enba enbaVar, basd basdVar, fcxy fcxyVar) {
        return this.b.b(new cbve(cbwdVar, cchcVar, evqsVar, aubqVar, enbaVar, basdVar, null), fcxyVar);
    }

    @Override // defpackage.cbum
    public final Object q(cbwd cbwdVar, cchc cchcVar, eprw eprwVar, ccep ccepVar, int i, enba enbaVar, fcxy fcxyVar) {
        return this.b.b(new cbvf(cbwdVar, cchcVar, eprwVar, ccepVar, i, enbaVar, null), fcxyVar);
    }

    @Override // defpackage.cbum
    public final Object r(cbwd cbwdVar, cchc cchcVar, eprw eprwVar, int i, enba enbaVar, fcxy fcxyVar) {
        return this.b.b(new cbvg(cbwdVar, cchcVar, eprwVar, i, enbaVar, null), fcxyVar);
    }

    @Override // defpackage.cbum
    public final Object s(fcxy fcxyVar) {
        Object objB = this.b.b(new cbvh(null), fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }

    @Override // defpackage.cbum
    public final Object t(enba enbaVar, fcxy fcxyVar) {
        Object objB = this.b.b(new cbvi(enbaVar, null), fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }

    @Override // defpackage.cbum
    public final byte[] u(final epws epwsVar) {
        return (byte[]) this.a.a("convertToSerializedTls", new fdap() { // from class: cbuo
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cbum cbumVar = (cbum) obj;
                cbumVar.getClass();
                return cbumVar.u(epwsVar);
            }
        });
    }
}
