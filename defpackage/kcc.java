package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kcc implements Comparable {
    public static final kcc a;
    public static final kcc b;
    public static final kcc c;
    public static final kcc d;
    public static final kcc e;
    public static final kcc f;
    public static final kcc g;
    public static final kcc h;
    private static final kcc j;
    private static final kcc k;
    private static final kcc l;
    private static final kcc m;
    private static final kcc n;
    private static final kcc o;
    public final int i;

    static {
        kcc kccVar = new kcc(100);
        j = kccVar;
        kcc kccVar2 = new kcc(BasePaymentResult.ERROR_REQUEST_FAILED);
        k = kccVar2;
        kcc kccVar3 = new kcc(300);
        l = kccVar3;
        kcc kccVar4 = new kcc(400);
        a = kccVar4;
        kcc kccVar5 = new kcc(500);
        b = kccVar5;
        kcc kccVar6 = new kcc(600);
        c = kccVar6;
        kcc kccVar7 = new kcc(700);
        m = kccVar7;
        kcc kccVar8 = new kcc(800);
        n = kccVar8;
        kcc kccVar9 = new kcc(900);
        o = kccVar9;
        d = kccVar3;
        e = kccVar4;
        f = kccVar5;
        g = kccVar6;
        h = kccVar7;
        fcva.g(kccVar, kccVar2, kccVar3, kccVar4, kccVar5, kccVar6, kccVar7, kccVar8, kccVar9);
    }

    public kcc(int i) {
        this.i = i;
        if (i <= 0 || i >= 1001) {
            kfq.b("Font weight can be in range [1, 1000]. Current value: " + i);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(kcc kccVar) {
        return fdbq.a(this.i, kccVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kcc) && this.i == ((kcc) obj).i;
    }

    public final int hashCode() {
        return this.i;
    }

    public final String toString() {
        return "FontWeight(weight=" + this.i + ')';
    }
}
