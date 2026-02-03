package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecyg {
    public final dsvd a;
    public final dsvh b;

    public ecyg(dsvd dsvdVar, dsvh dsvhVar) {
        dsvhVar.getClass();
        this.a = dsvdVar;
        this.b = dsvhVar;
    }

    public final fdae a(final fdae fdaeVar) {
        fdaeVar.getClass();
        return new fdae() { // from class: ecyf
            @Override // defpackage.fdae
            public final Object invoke() {
                ecyg ecygVar = this.a;
                ecygVar.b.b(dsvg.e(), ecygVar.a);
                fdaeVar.invoke();
                return fctx.a;
            }
        };
    }
}
