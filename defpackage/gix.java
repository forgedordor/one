package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gix extends jbi implements jbd, jew {
    public final boolean a;
    public final float b;
    public final ijh c;
    public jbf d;
    public final ebk e;

    public gix(ebk ebkVar, boolean z, float f, ijh ijhVar) {
        this.e = ebkVar;
        this.a = z;
        this.b = f;
        this.c = ijhVar;
    }

    private final void a() {
        jex.a(this, new fdae() { // from class: giu
            @Override // defpackage.fdae
            public final Object invoke() {
                final gix gixVar = this.a;
                if (((gqy) jbe.a(gixVar, grb.a)) == null) {
                    jbf jbfVar = gixVar.d;
                    if (jbfVar != null) {
                        gixVar.M(jbfVar);
                    }
                    gixVar.d = null;
                } else if (gixVar.d == null) {
                    giw giwVar = new giw(gixVar);
                    fdae fdaeVar = new fdae() { // from class: giv
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            return gqz.a;
                        }
                    };
                    ebk ebkVar = gixVar.e;
                    boolean z = gixVar.a;
                    float f = gixVar.b;
                    dia diaVar = fxd.a;
                    fwv fwvVar = new fwv(ebkVar, z, f, giwVar, fdaeVar);
                    gixVar.N(fwvVar);
                    gixVar.d = fwvVar;
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
