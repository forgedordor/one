package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qjg implements qjc {
    public final pex a;
    public final pfn b;
    private final pfn c;

    public qjg(pex pexVar) {
        this.a = pexVar;
        new qjd(pexVar);
        this.c = new qje(pexVar);
        this.b = new qjf(pexVar);
    }

    @Override // defpackage.qjc
    public final void a(String str) {
        pex pexVar = this.a;
        pexVar.m();
        pkl pklVarD = this.c.d();
        pklVarD.g(1, str);
        try {
            pexVar.n();
            try {
                pklVarD.a();
                pexVar.q();
            } finally {
                this.a.o();
            }
        } finally {
            this.c.f(pklVarD);
        }
    }
}
