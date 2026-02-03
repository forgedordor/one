package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qrb {
    public static final float a(qnm qnmVar, qrn qrnVar, float f) {
        if (f < 0.0f && qnmVar == null) {
            return 1.0f;
        }
        if (qnmVar == null) {
            return 0.0f;
        }
        if (f < 0.0f) {
            if (qrnVar == null) {
                return 1.0f;
            }
            return qrnVar.a(qnmVar);
        }
        if (qrnVar == null) {
            return 0.0f;
        }
        return qrnVar.b(qnmVar);
    }

    public static final Object b(qqr qqrVar, fcxy fcxyVar) {
        Object objA = qqq.a(qqrVar, null, a(qqrVar.j(), qqrVar.k(), qqrVar.f()), fcxyVar, 9);
        return objA == fcyl.a ? objA : fctx.a;
    }

    public static final qqr c(hml hmlVar) {
        hmlVar.v(2024497114);
        hmlVar.v(1849434622);
        Object objF = hmlVar.f();
        if (objF == hmk.a) {
            objF = new qra();
            hmlVar.y(objF);
        }
        qqr qqrVar = (qqr) objF;
        hmlVar.o();
        hmlVar.o();
        return qqrVar;
    }
}
