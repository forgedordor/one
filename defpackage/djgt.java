package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djgt implements fdau {
    final /* synthetic */ djis a;

    public djgt(djis djisVar) {
        this.a = djisVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        ((cyg) obj).getClass();
        hmlVar.v(5004770);
        final djis djisVar = this.a;
        boolean zD = hmlVar.D(djisVar);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            objF = new fdap() { // from class: djgr
                @Override // defpackage.fdap
                public final Object invoke(Object obj4) {
                    ((hny) obj4).getClass();
                    djis djisVar2 = djisVar;
                    if (djisVar2 != null) {
                        djisVar2.a.invoke();
                    }
                    return new djgs(djisVar2);
                }
            };
            hmlVar.y(objF);
        }
        hmlVar.o();
        hob.c(djisVar, (fdap) objF, hmlVar);
        djgw.g(hmlVar, 0);
        return fctx.a;
    }
}
