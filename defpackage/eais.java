package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eais {
    public final hox a;
    public final hox b;
    public final hox c;
    public final hox d;

    public eais(eain eainVar, ihu ihuVar, eaio eaioVar) {
        eaioVar.getClass();
        hsi hsiVar = hsi.a;
        new hpl(eainVar, hsiVar);
        this.a = new hpl(ihuVar, hsiVar);
        new hpl(dea.b(0.0f, 0.0f, null, 7), hsiVar);
        new hpl(dea.b(0.0f, 0.0f, null, 7), hsiVar);
        this.b = new hpl(eaioVar, hsiVar);
        fdae fdaeVar = new fdae() { // from class: eaiq
            @Override // defpackage.fdae
            public final Object invoke() {
                eais eaisVar = this.a;
                int iOrdinal = ((eaio) eaisVar.b.a()).ordinal();
                return new dkj(iOrdinal != 1 ? iOrdinal != 2 ? ((dkj) eaisVar.d.a()).a : 0 : 2);
            }
        };
        hxn hxnVar = hrp.a;
        new hnt(fdaeVar, null);
        this.c = new hpl(new ihu(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY), hsiVar);
        new hnt(new fdae() { // from class: eair
            @Override // defpackage.fdae
            public final Object invoke() {
                ihu ihuVar2 = (ihu) this.a.c.a();
                fdap fdapVar = new fdap() { // from class: eaip
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(((Float) obj).floatValue() > 0.0f);
                    }
                };
                boolean z = true;
                if (!((Boolean) fdapVar.invoke(Float.valueOf(ihuVar2.b))).booleanValue() && !((Boolean) fdapVar.invoke(Float.valueOf(ihuVar2.c))).booleanValue() && !((Boolean) fdapVar.invoke(Float.valueOf(ihuVar2.d))).booleanValue() && !((Boolean) fdapVar.invoke(Float.valueOf(ihuVar2.e))).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }, null);
        this.d = new hpl(new dkj(2), hsiVar);
    }
}
