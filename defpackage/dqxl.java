package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqxl implements dqxe {
    private final String a;
    private final Object[] b;

    public dqxl(String str, Object[] objArr) {
        this.a = str;
        this.b = objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0247 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String c(java.util.List r22, defpackage.dqxp r23) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqxl.c(java.util.List, dqxp):java.lang.String");
    }

    @Override // defpackage.dqxe
    public final String ai(dqxp dqxpVar) {
        return c(null, dqxpVar);
    }

    @Override // defpackage.dqxe
    public final String aj(dqxp dqxpVar, List list) {
        return c(list, dqxpVar);
    }

    @Override // defpackage.dqxe
    public final void ak(dqpu dqpuVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            String str = this.a;
            int iIndexOf = str.indexOf("$", i);
            if (iIndexOf == -1) {
                return;
            }
            if (iIndexOf == str.length() - 1) {
                throw new IllegalArgumentException("bad format specifier in format: ".concat(str));
            }
            i = iIndexOf + 1;
            Object[] objArr = this.b;
            char cCharAt = str.charAt(i);
            if (i2 >= objArr.length) {
                throw new IllegalArgumentException("too few args for format: ".concat(str));
            }
            int i3 = i2 + 1;
            Object obj = objArr[i2];
            if (cCharAt == 'V' && (obj instanceof dqpo)) {
                dqpuVar.b(obj.toString(), null);
            }
            i2 = i3;
        }
    }
}
