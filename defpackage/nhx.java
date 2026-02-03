package defpackage;

import androidx.car.app.model.Alert;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nhx extends nhz implements Comparable {
    private final int e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final boolean m;

    /* JADX WARN: Multi-variable type inference failed */
    public nhx(int i, mcm mcmVar, int i2, nhs nhsVar, int i3, String str, String str2) {
        int iA;
        int i4;
        super(i, mcmVar, i2);
        int i5 = 0;
        this.f = mti.g(i3, false);
        int i6 = this.d.e & (~nhsVar.y);
        this.g = 1 == (i6 & 1);
        this.h = (i6 & 2) != 0;
        ekgb ekgbVarR = str2 != null ? ekgb.r(str2) : nhsVar.v.isEmpty() ? ekgb.r("") : nhsVar.v;
        int i7 = 0;
        while (true) {
            if (i7 >= ((ekoe) ekgbVarR).c) {
                i7 = Alert.DURATION_SHOW_INDEFINITELY;
                iA = 0;
                break;
            }
            mau mauVar = this.d;
            String str3 = (String) ekgbVarR.get(i7);
            boolean z = nhsVar.z;
            iA = nid.a(mauVar, str3, false);
            if (iA > 0) {
                break;
            } else {
                i7++;
            }
        }
        this.i = i7;
        this.j = iA;
        if (str2 != null) {
            i4 = 1088;
        } else {
            int i8 = nhsVar.w;
            i4 = 0;
        }
        int iB = nid.b(this.d.f, i4);
        this.k = iB;
        this.m = (1088 & this.d.f) != 0;
        int iA2 = nid.a(this.d, str, nid.f(str) == null);
        this.l = iA2;
        boolean z2 = iA > 0 || (nhsVar.v.isEmpty() && iB > 0) || this.g || (this.h && iA2 > 0);
        if (mti.g(i3, nhsVar.R) && z2) {
            i5 = 1;
        }
        this.e = i5;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(nhx nhxVar) {
        ekdr ekdrVarE = ekdr.b.e(this.f, nhxVar.f);
        Integer numValueOf = Integer.valueOf(this.i);
        Integer numValueOf2 = Integer.valueOf(nhxVar.i);
        Comparator comparator = ekop.a;
        ekdr ekdrVarD = ekdrVarE.d(numValueOf, numValueOf2, comparator);
        int i = this.j;
        ekdr ekdrVarB = ekdrVarD.b(i, nhxVar.j);
        int i2 = this.k;
        ekdr ekdrVarE2 = ekdrVarB.b(i2, nhxVar.k).e(this.g, nhxVar.g);
        Boolean boolValueOf = Boolean.valueOf(this.h);
        Boolean boolValueOf2 = Boolean.valueOf(nhxVar.h);
        if (i == 0) {
            comparator = ekno.a;
        }
        ekdr ekdrVarB2 = ekdrVarE2.d(boolValueOf, boolValueOf2, comparator).b(this.l, nhxVar.l);
        if (i2 == 0) {
            ekdrVarB2 = ekdrVarB2.f(this.m, nhxVar.m);
        }
        return ekdrVarB2.a();
    }

    @Override // defpackage.nhz
    public final int b() {
        return this.e;
    }

    @Override // defpackage.nhz
    public final /* bridge */ /* synthetic */ boolean c(nhz nhzVar) {
        return false;
    }
}
