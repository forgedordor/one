package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaft {
    public final fduj a;
    private final fdue b;

    public aaft() {
        fdue fdueVarD = fdun.d(1, 50, 2);
        this.b = fdueVarD;
        this.a = fdueVarD;
    }

    public final Object a(final aafw aafwVar, fcxy fcxyVar) {
        Object objFO = this.b.fO(new aafw(aafwVar.a, aafwVar.b, aafwVar.c, aafwVar.d, aafwVar.g, new fdae() { // from class: aafr
            @Override // defpackage.fdae
            public final Object invoke() {
                aaft aaftVar = this.a;
                aafw aafwVar2 = aafwVar;
                aaftVar.b(aafwVar2);
                aafwVar2.e.invoke();
                return fctx.a;
            }
        }, new fdae() { // from class: aafs
            @Override // defpackage.fdae
            public final Object invoke() {
                aaft aaftVar = this.a;
                aafw aafwVar2 = aafwVar;
                aaftVar.b(aafwVar2);
                aafwVar2.f.invoke();
                return fctx.a;
            }
        }), fcxyVar);
        return objFO == fcyl.a ? objFO : fctx.a;
    }

    public final void b(aafw aafwVar) {
        fdue fdueVar = this.b;
        aafw aafwVar2 = (aafw) fcva.P(fdueVar.d());
        if (fdbq.f(aafwVar.a, aafwVar2 != null ? aafwVar2.a : null)) {
            fdueVar.e();
            fdueVar.h(null);
        }
    }
}
