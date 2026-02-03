package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qiu implements qiq {
    public final pex a;
    public final pfn b;
    public final pfn c;
    private final pdn d;

    public qiu(pex pexVar) {
        this.a = pexVar;
        this.d = new qir(pexVar);
        this.b = new qis(pexVar);
        this.c = new qit(pexVar);
    }

    @Override // defpackage.qiq
    public final void a(qio qioVar) {
        pex pexVar = this.a;
        pexVar.m();
        pexVar.n();
        try {
            this.d.a(qioVar);
            pexVar.q();
        } finally {
            this.a.o();
        }
    }
}
