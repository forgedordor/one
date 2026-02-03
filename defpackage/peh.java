package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class peh {
    public final pdu a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public peh(pdu pduVar, int[] iArr, String[] strArr) {
        iArr.getClass();
        strArr.getClass();
        this.a = pduVar;
        this.b = iArr;
        this.c = strArr;
        int length = iArr.length;
        int length2 = strArr.length;
        if (length != length2) {
            throw new IllegalStateException("Check failed.");
        }
        this.d = length2 == 0 ? fcvq.a : fcwm.b(strArr[0]);
    }
}
