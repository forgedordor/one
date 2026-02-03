package defpackage;

import java.math.BigDecimal;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekyq {
    public static final /* synthetic */ int a = 0;

    static {
        ekxj.c(2.0d - ekxm.b);
        new BigDecimal("0.25");
        new BigDecimal("0.5");
        new BigDecimal("2");
        new BigDecimal("4");
    }

    public static int a(ekyj ekyjVar, ekyj ekyjVar2, ekyj ekyjVar3) {
        double dF = ekyj.f(ekyjVar3, ekyjVar, ekyjVar2);
        int i = dF >= 1.6E-15d ? 1 : dF <= -1.6E-15d ? -1 : 0;
        return i == 0 ? ekyp.b(ekyjVar, ekyjVar2, ekyjVar3) : i;
    }

    public static boolean b(ekyj ekyjVar, ekyj ekyjVar2, ekyj ekyjVar3, ekyj ekyjVar4) {
        int iA = a(ekyjVar2, ekyjVar4, ekyjVar);
        int iA2 = a(ekyjVar3, ekyjVar4, ekyjVar2);
        int i = iA >= 0 ? 1 : 0;
        if (iA2 >= 0) {
            i++;
        }
        if (a(ekyjVar, ekyjVar4, ekyjVar3) > 0) {
            i++;
        }
        return i >= 2;
    }
}
