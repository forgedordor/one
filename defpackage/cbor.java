package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbor {
    public final fcsu a;
    private final fctc b;

    public cbor(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        this.b = fctd.a(new fdae() { // from class: cboq
            @Override // defpackage.fdae
            public final Object invoke() {
                ecem.b();
                cmgk cmgkVar = (cmgk) this.a.a.b();
                cmgg cmggVarC = cmgh.c();
                cmggVarC.d(cmfn.HEAVY_OPERATION_SEQUENCER_STATE);
                cmggVarC.f(cbow.a);
                return cmgkVar.a(cmggVarC.a());
            }
        });
    }

    public final cmfo a() {
        return (cmfo) this.b.a();
    }
}
