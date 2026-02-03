package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fpd extends jbi implements jbd, jew {
    public final boolean a;
    public final float b;
    public final ijh c;
    public jbf d;
    public final ebk e;

    public fpd(ebk ebkVar, boolean z, float f, ijh ijhVar) {
        this.e = ebkVar;
        this.a = z;
        this.b = f;
        this.c = ijhVar;
    }

    private final void a() {
        jex.a(this, new fdae() { // from class: fpa
            @Override // defpackage.fdae
            public final Object invoke() {
                final fpd fpdVar = this.a;
                if (((fsb) jbe.a(fpdVar, fsd.a)) == null) {
                    jbf jbfVar = fpdVar.d;
                    if (jbfVar != null) {
                        fpdVar.M(jbfVar);
                    }
                    fpdVar.d = null;
                } else if (fpdVar.d == null) {
                    fpc fpcVar = new fpc(fpdVar);
                    fdae fdaeVar = new fdae() { // from class: fpb
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            fpd fpdVar2 = fpdVar;
                            return ((fod) jbe.a(fpdVar2, fof.a)).m() ? ((double) ijg.a(((ije) jbe.a(fpdVar2, C0001for.a)).i)) > 0.5d ? fsd.b : fsd.c : fsd.d;
                        }
                    };
                    ebk ebkVar = fpdVar.e;
                    boolean z = fpdVar.a;
                    float f = fpdVar.b;
                    dia diaVar = fxd.a;
                    fwv fwvVar = new fwv(ebkVar, z, f, fpcVar, fdaeVar);
                    fpdVar.N(fwvVar);
                    fpdVar.d = fwvVar;
                }
                return fctx.a;
            }
        });
    }

    @Override // defpackage.icr
    public final void dU() {
        a();
    }

    @Override // defpackage.jew
    public final void n() {
        a();
    }
}
