package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dotp extends fdcy {
    final /* synthetic */ dots a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dotp(dots dotsVar) {
        super(null);
        this.a = dotsVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        dpxo dpxoVar = (dpxo) obj2;
        final dpxo dpxoVar2 = (dpxo) obj;
        if (dpxoVar2 != null) {
            dpxoVar2.bf();
            dots dotsVar = this.a;
            dpux dpuxVar = dotsVar.i;
            if (dpuxVar == null) {
                fdbq.c("renderingStrategy");
                dpuxVar = null;
            }
            fr frVarI = dotsVar.e.I();
            frVarI.getClass();
            dpuy.a(dpuxVar, frVarI, true, new fdap() { // from class: doth
                @Override // defpackage.fdap
                public final Object invoke(Object obj3) {
                    gg ggVar = (gg) obj3;
                    int i = dots.k;
                    ggVar.getClass();
                    ggVar.l(dpxoVar2);
                    return fctx.a;
                }
            });
        }
        if (dpxoVar != null) {
            this.a.f(dpxoVar);
        }
        this.a.f.invoke(dpxoVar);
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
