package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwdn extends fcyz implements fdat {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ hox c;
    final /* synthetic */ knm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwdn(boolean z, hox hoxVar, knm knmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = z;
        this.c = hoxVar;
        this.d = knmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwdn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final hox hoxVar = this.c;
            float fFloatValue = ((Number) hoxVar.a()).floatValue();
            float f = true != this.b ? 0.43f : 1.0f;
            final knm knmVar = this.d;
            dia diaVarC = dea.c(300, 0, null, 6);
            fdat fdatVar = new fdat() { // from class: cwdm
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    Float f2 = (Float) obj2;
                    float fFloatValue2 = f2.floatValue();
                    ((Float) obj3).floatValue();
                    hoxVar.b(f2);
                    knmVar.a().setDimAmount(fFloatValue2);
                    return fctx.a;
                }
            };
            this.a = 1;
            if (dgv.h(fFloatValue, f, diaVarC, fdatVar, this, 4) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cwdn(this.b, this.c, this.d, fcxyVar);
    }
}
