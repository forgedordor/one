package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evb extends dll {
    public boolean j;
    public fdap k;
    public final fdae l;

    public evb(final boolean z, ebk ebkVar, dnk dnkVar, boolean z2, boolean z3, jrw jrwVar, final fdap fdapVar) {
        super(ebkVar, dnkVar, z2, z3, null, jrwVar, new fdae() { // from class: euz
            @Override // defpackage.fdae
            public final Object invoke() {
                fdapVar.invoke(Boolean.valueOf(!z));
                return fctx.a;
            }
        });
        this.j = z;
        this.k = fdapVar;
        this.l = new fdae() { // from class: eva
            @Override // defpackage.fdae
            public final Object invoke() {
                this.a.k.invoke(Boolean.valueOf(!r0.j));
                return fctx.a;
            }
        };
    }

    @Override // defpackage.dkd
    public final void g(jto jtoVar) {
        jtk.y(jtoVar, juf.a(this.j));
    }
}
