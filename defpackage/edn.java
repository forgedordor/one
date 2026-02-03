package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edn implements ixm, egh {
    public final ibx a;
    private final ecq b;

    public edn(ecq ecqVar, ibx ibxVar) {
        this.b = ecqVar;
        this.a = ibxVar;
    }

    @Override // defpackage.ixm
    public final int a(ivu ivuVar, List list, int i) {
        int iEp = ivuVar.ep(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            ivt ivtVar = (ivt) list.get(i3);
            float fA = egg.a(egg.b(ivtVar));
            int iA = ivtVar.a(i);
            if (fA == 0.0f) {
                i2 += iA;
            } else if (fA > 0.0f) {
                f += fA;
                iMax = Math.max(iMax, Math.round(iA / fA));
            }
        }
        return Math.round(iMax * f) + i2 + ((list.size() - 1) * iEp);
    }

    @Override // defpackage.ixm
    public final int b(ivu ivuVar, List list, int i) {
        int iEp = ivuVar.ep(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iEp, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            ivt ivtVar = (ivt) list.get(i2);
            float fA = egg.a(egg.b(ivtVar));
            if (fA == 0.0f) {
                int iMin2 = Math.min(ivtVar.a(Alert.DURATION_SHOW_INDEFINITELY), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, ivtVar.b(iMin2));
            } else if (fA > 0.0f) {
                f += fA;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ivt ivtVar2 = (ivt) list.get(i3);
            float fA2 = egg.a(egg.b(ivtVar2));
            if (fA2 > 0.0f) {
                iMax = Math.max(iMax, ivtVar2.b(iRound != Integer.MAX_VALUE ? Math.round(iRound * fA2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.ixm
    public final int c(ivu ivuVar, List list, int i) {
        int iEp = ivuVar.ep(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            ivt ivtVar = (ivt) list.get(i3);
            float fA = egg.a(egg.b(ivtVar));
            int iC = ivtVar.c(i);
            if (fA == 0.0f) {
                i2 += iC;
            } else if (fA > 0.0f) {
                f += fA;
                iMax = Math.max(iMax, Math.round(iC / fA));
            }
        }
        return Math.round(iMax * f) + i2 + ((list.size() - 1) * iEp);
    }

    @Override // defpackage.ixm
    public final int d(ivu ivuVar, List list, int i) {
        int iEp = ivuVar.ep(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iEp, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            ivt ivtVar = (ivt) list.get(i2);
            float fA = egg.a(egg.b(ivtVar));
            if (fA == 0.0f) {
                int iMin2 = Math.min(ivtVar.a(Alert.DURATION_SHOW_INDEFINITELY), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, ivtVar.d(iMin2));
            } else if (fA > 0.0f) {
                f += fA;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ivt ivtVar2 = (ivt) list.get(i3);
            float fA2 = egg.a(egg.b(ivtVar2));
            if (fA2 > 0.0f) {
                iMax = Math.max(iMax, ivtVar2.d(iRound != Integer.MAX_VALUE ? Math.round(iRound * fA2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.ixm
    public final ixn e(ixp ixpVar, List list, long j) {
        return egi.a(this, kil.c(j), kil.d(j), kil.a(j), kil.b(j), ixpVar.ep(this.b.a()), ixpVar, list, new iyl[list.size()], 0, list.size(), null, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edn)) {
            return false;
        }
        edn ednVar = (edn) obj;
        return fdbq.f(this.b, ednVar.b) && fdbq.f(this.a, ednVar.a);
    }

    @Override // defpackage.egh
    public final int f(iyl iylVar) {
        return iylVar.a;
    }

    @Override // defpackage.egh
    public final int g(iyl iylVar) {
        return iylVar.b;
    }

    @Override // defpackage.egh
    public final void h(int i, int[] iArr, int[] iArr2, ixp ixpVar) {
        this.b.b(ixpVar, i, iArr, iArr2);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.egh
    public final long i(int i, int i2, int i3, boolean z) {
        return !z ? kim.d(0, i3, i, i2) : kik.a(0, i3, i, i2);
    }

    @Override // defpackage.egh
    public final ixn j(final iyl[] iylVarArr, final ixp ixpVar, final int[] iArr, int i, final int i2, int[] iArr2, int i3, int i4, int i5) {
        return ixpVar.ej(i2, i, fcvp.a, new fdap() { // from class: edm
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                int iA;
                iyk iykVar = (iyk) obj;
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    iyl[] iylVarArr2 = iylVarArr;
                    if (i6 >= iylVarArr2.length) {
                        return fctx.a;
                    }
                    ixp ixpVar2 = ixpVar;
                    iyl iylVar = iylVarArr2[i6];
                    int i8 = i7 + 1;
                    iylVar.getClass();
                    egj egjVarC = egg.c(iylVar);
                    kji kjiVarQ = ixpVar2.q();
                    edx edxVar = egjVarC != null ? egjVarC.c : null;
                    int i9 = i2;
                    if (edxVar != null) {
                        iA = edxVar.a(i9 - iylVar.a, kjiVarQ);
                    } else {
                        iA = this.a.a(0, i9 - iylVar.a, kjiVarQ);
                    }
                    iykVar.s(iylVar, iA, iArr[i7], 0.0f);
                    i6++;
                    i7 = i8;
                }
            }
        });
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.b + ", horizontalAlignment=" + this.a + ')';
    }
}
