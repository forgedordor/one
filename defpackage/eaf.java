package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eaf implements eat {
    final /* synthetic */ etv a;
    final /* synthetic */ fdau b;
    final /* synthetic */ eti c;

    public eaf(etv etvVar, fdau fdauVar, eti etiVar) {
        this.a = etvVar;
        this.b = fdauVar;
        this.c = etiVar;
    }

    @Override // defpackage.eat
    public final float a(float f, float f2) {
        etv etvVar = this.a;
        int iK = etvVar.k() + etvVar.m();
        if (iK != 0) {
            int i = f < 0.0f ? etvVar.f + 1 : etvVar.f;
            int i2 = fddu.i(((int) (f2 / iK)) + i, 0, etvVar.b());
            eti etiVar = this.c;
            etvVar.k();
            etvVar.m();
            int iF = fddu.f(Math.abs((fddu.i(etiVar.a(i, i2), 0, etvVar.b()) - i) * iK) - iK, 0);
            if (iF != 0) {
                return iF * Math.signum(f);
            }
        }
        return 0.0f;
    }

    @Override // defpackage.eat
    public final float b(float f) {
        etv etvVar = this.a;
        eaw eawVar = etvVar.x().n;
        List list = c().a;
        int size = list.size();
        float f2 = Float.POSITIVE_INFINITY;
        float f3 = Float.NEGATIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            erx erxVar = (erx) list.get(i);
            float fA = eax.a(esq.a(c()), c().a(), c().d, c().b, erxVar.h, erxVar.a, eawVar, etvVar.b());
            if (fA <= 0.0f && fA > f3) {
                f3 = fA;
            }
            if (fA >= 0.0f && fA < f2) {
                f2 = fA;
            }
        }
        if (f3 == Float.NEGATIVE_INFINITY) {
            f3 = f2;
        }
        if (f2 == Float.POSITIVE_INFINITY) {
            f2 = f3;
        }
        if (!etvVar.h()) {
            if (eag.b(etvVar, f)) {
                f3 = 0.0f;
                f2 = 0.0f;
            } else {
                f2 = 0.0f;
            }
        }
        if (!etvVar.g()) {
            if (eag.b(etvVar, f)) {
                f3 = 0.0f;
            } else {
                f3 = 0.0f;
                f2 = 0.0f;
            }
        }
        fcti fctiVar = new fcti(Float.valueOf(f3), Float.valueOf(f2));
        float fFloatValue = ((Number) fctiVar.a).floatValue();
        float fFloatValue2 = ((Number) fctiVar.b).floatValue();
        float fFloatValue3 = ((Number) this.b.a(Float.valueOf(f), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue();
        if (fFloatValue3 != fFloatValue && fFloatValue3 != fFloatValue2 && fFloatValue3 != 0.0f) {
            ebs.d("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
        }
        if (fFloatValue3 == Float.POSITIVE_INFINITY || fFloatValue3 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return fFloatValue3;
    }

    public final etd c() {
        return this.a.x();
    }
}
