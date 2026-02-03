package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xty implements xtr {
    public final xul a;
    public final xuo b;
    private final fdpl c = new auxq(new fdae() { // from class: xtu
        @Override // defpackage.fdae
        public final Object invoke() {
            final xty xtyVar = this.a;
            return new xtt("Satellite", false, fcva.g(new xtt("Force manual connection toolstone", false, null, new fdae() { // from class: xtv
                @Override // defpackage.fdae
                public final Object invoke() {
                    xul xulVar = xtyVar.a;
                    awxn awxnVar = (awxn) xulVar.b.c();
                    if (awxnVar != null) {
                        xulVar.a.f(awxnVar.b());
                    }
                    return fctx.a;
                }
            }, 14), new xtt("Connect to satellite", false, null, new fdae() { // from class: xtw
                @Override // defpackage.fdae
                public final Object invoke() {
                    xuo xuoVar = xtyVar.b;
                    auvw.k(xuoVar.a, null, null, new xun(xuoVar, null), 3);
                    return fctx.a;
                }
            }, 14)), new fdae() { // from class: xtx
                @Override // defpackage.fdae
                public final Object invoke() {
                    return fctx.a;
                }
            }, 2);
        }
    });

    public xty(xul xulVar, xuo xuoVar) {
        this.a = xulVar;
        this.b = xuoVar;
    }

    @Override // defpackage.xtr
    public final fdpl a() {
        return this.c;
    }

    @Override // defpackage.xtr
    public final void b() {
    }
}
