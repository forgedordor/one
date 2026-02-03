package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmxb implements fdat {
    final /* synthetic */ dmvm a;
    final /* synthetic */ fdae b;
    final /* synthetic */ hox c;
    final /* synthetic */ hrg d;

    public dmxb(dmvm dmvmVar, fdae fdaeVar, hrg hrgVar, hox hoxVar) {
        this.a = dmvmVar;
        this.b = fdaeVar;
        this.d = hrgVar;
        this.c = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            float fA = dmxm.a(this.d.c());
            if (fA > 0.0f) {
                dmvm dmvmVar = this.a;
                fdae fdaeVar = this.b;
                fdpl fdplVarA = dmvmVar.a();
                hmlVar.v(5004770);
                final hox hoxVar = this.c;
                Object objF = hmlVar.f();
                if (objF == hmk.a) {
                    objF = new fdap() { // from class: dmxa
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj3) {
                            dmxg.c(hoxVar, ((kir) obj3).a);
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF);
                }
                hmlVar.o();
                dmxm.i(fdplVarA, fA, fdaeVar, (fdap) objF, hmlVar, 3072);
            } else {
                dmxg.c(this.c, 64.0f);
            }
        }
        return fctx.a;
    }
}
