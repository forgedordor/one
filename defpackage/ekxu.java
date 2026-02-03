package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekxu {
    public static ekyd a(ekyd ekydVar) {
        if (ekydVar.i()) {
            return ekydVar;
        }
        double dA = 3.141592653589793d - ekydVar.b.a();
        ekxe ekxeVar = ekydVar.a;
        double dMax = Math.max(0.0d, dA - 5.551115123125783E-16d);
        double dMax2 = Math.max(ekxeVar.a, -ekxeVar.b);
        double d = ekxeVar.a + 1.5707963267948966d;
        double d2 = 1.5707963267948966d - ekxeVar.b;
        if (dMax2 >= 0.0d) {
            if (dMax2 + dMax2 + dMax < 1.354E-15d) {
                return ekyd.f();
            }
        } else if (dMax >= 1.5707963267948966d) {
            if (d + d2 < 1.687E-15d) {
                return ekyd.f();
            }
        } else if (Math.max(d, d2) * dMax < 1.765E-15d) {
            return ekyd.f();
        }
        return ekydVar.e(new ekyb(1.9984014443252818E-15d, dMax > 0.0d ? 0.0d : 3.141592653589793d)).g();
    }
}
