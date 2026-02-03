package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edxn implements fdat {
    public static final edxn a = new edxn();

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            final long j = glz.a(hmlVar).F;
            ics icsVarC = egq.c(ics.e, 1.0f);
            hmlVar.v(5004770);
            boolean zC = hmlVar.C(j);
            Object objF = hmlVar.f();
            if (zC || objF == hmk.a) {
                objF = new fdap() { // from class: edxm
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        imz imzVar = (imz) obj3;
                        imzVar.getClass();
                        imzVar.r(j, 0L, (126 & 4) != 0 ? imy.c(imzVar.b(), 0L) : imzVar.b(), (126 & 8) != 0 ? 1.0f : 0.0f, (126 & 16) != 0 ? inc.a : null, (126 & 32) != 0 ? null : null, (126 & 64) != 0 ? 3 : 0);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            dlb.a(icsVarC, (fdap) objF, hmlVar, 6);
        }
        return fctx.a;
    }
}
