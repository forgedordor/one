package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zvk implements fdat {
    final /* synthetic */ fdap a;
    final /* synthetic */ ahat b;
    final /* synthetic */ zvl c;
    final /* synthetic */ Long d;
    final /* synthetic */ fdap e;
    final /* synthetic */ String f;
    final /* synthetic */ anhj g;
    final /* synthetic */ int h;

    public zvk(fdap fdapVar, ahat ahatVar, zvl zvlVar, Long l, fdap fdapVar2, int i, String str, anhj anhjVar) {
        this.a = fdapVar;
        this.b = ahatVar;
        this.c = zvlVar;
        this.d = l;
        this.e = fdapVar2;
        this.h = i;
        this.f = str;
        this.g = anhjVar;
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(5004770);
            final fdap fdapVar = this.a;
            boolean zD = hmlVar.D(fdapVar);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new aaag() { // from class: zvg
                    @Override // defpackage.aaag
                    public final void a(dnvg dnvgVar) {
                        dnvgVar.getClass();
                        fdapVar.invoke(anhp.b(dnvgVar));
                    }
                };
                hmlVar.y(objF);
            }
            aaag aaagVar = (aaag) objF;
            hmlVar.o();
            int i = this.h;
            String str = this.f;
            anhj anhjVar = this.g;
            aaap aaapVar = (aaap) aaar.a.createBuilder();
            aaapVar.getClass();
            aaas.d(i, aaapVar);
            if (str != null) {
                aaas.b(str, aaapVar);
            }
            angl anglVar = anhjVar instanceof angl ? (angl) anhjVar : null;
            if (anglVar != null) {
                aaas.c(anglVar.a, aaapVar);
            }
            aaar aaarVarA = aaas.a(aaapVar);
            hmlVar.v(5004770);
            final ahat ahatVar = this.b;
            boolean zF = hmlVar.F(ahatVar);
            Object objF2 = hmlVar.f();
            if (zF || objF2 == hmk.a) {
                objF2 = new fdae() { // from class: zvh
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        ahatVar.a();
                        return fctx.a;
                    }
                };
                hmlVar.y(objF2);
            }
            fdae fdaeVar = (fdae) objF2;
            hmlVar.o();
            hmlVar.v(-1633490746);
            final zvl zvlVar = this.c;
            boolean zF2 = hmlVar.F(zvlVar);
            final Long l = this.d;
            boolean zD2 = zF2 | hmlVar.D(l);
            Object objF3 = hmlVar.f();
            if (zD2 || objF3 == hmk.a) {
                objF3 = new fdae() { // from class: zvi
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        zvlVar.a.a(l);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF3);
            }
            fdae fdaeVar2 = (fdae) objF3;
            hmlVar.o();
            hmlVar.v(5004770);
            boolean zD3 = hmlVar.D(fdapVar);
            Object objF4 = hmlVar.f();
            if (zD3 || objF4 == hmk.a) {
                objF4 = new fdap() { // from class: zvj
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        String str2 = (String) obj3;
                        str2.getClass();
                        fdapVar.invoke(anhp.a(str2));
                        return fctx.a;
                    }
                };
                hmlVar.y(objF4);
            }
            hmlVar.o();
            aaal.a(new aaah(aaarVarA, fdaeVar, fdaeVar2, (fdap) objF4, aaagVar, this.e), hmlVar, 0);
        }
        return fctx.a;
    }
}
