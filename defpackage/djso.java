package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djso implements fdau {
    final /* synthetic */ long a;

    public djso(long j) {
        this.a = j;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ics icsVar = (ics) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        icsVar.getClass();
        hmlVar.v(-474393620);
        hmlVar.v(5004770);
        final long j = this.a;
        boolean zC = hmlVar.C(j);
        Object objF = hmlVar.f();
        if (zC || objF == hmk.a) {
            objF = new fdap() { // from class: djsn
                @Override // defpackage.fdap
                public final Object invoke(Object obj4) {
                    imw imwVar = (imw) obj4;
                    imwVar.getClass();
                    imwVar.p();
                    imwVar.r(j, 0L, (126 & 4) != 0 ? imy.c(imwVar.b(), 0L) : 0L, (126 & 8) != 0 ? 1.0f : 0.0f, (126 & 16) != 0 ? inc.a : null, (126 & 32) != 0 ? null : null, (126 & 64) != 0 ? 3 : 0);
                    return fctx.a;
                }
            };
            hmlVar.y(objF);
        }
        hmlVar.o();
        ics icsVarC = ifb.c(icsVar, (fdap) objF);
        hmlVar.o();
        return icsVarC;
    }
}
