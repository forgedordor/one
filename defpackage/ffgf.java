package defpackage;

import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffgf {
    public static final byte[] a = ffge.b("0123456789abcdef");
    public static final long[] b = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        r1 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0079, code lost:
    
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b A[LOOP:1: B:14:0x002a->B:36:0x006b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0064 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int a(defpackage.ffez r16, defpackage.fffn r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 163
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffgf.a(ffez, fffn, boolean):int");
    }

    public static final String b(ffez ffezVar, long j) throws EOFException {
        if (j > 0) {
            long j2 = (-1) + j;
            if (ffezVar.c(j2) == 13) {
                String strO = ffezVar.o(j2);
                ffezVar.D(2L);
                return strO;
            }
        }
        String strO2 = ffezVar.o(j);
        ffezVar.D(1L);
        return strO2;
    }

    public static final boolean c(fffw fffwVar, int i, byte[] bArr, int i2) {
        fffwVar.getClass();
        bArr.getClass();
        byte[] bArr2 = fffwVar.a;
        int i3 = fffwVar.c;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                fffwVar = fffwVar.f;
                fffwVar.getClass();
                byte[] bArr3 = fffwVar.a;
                int i5 = fffwVar.b;
                i3 = fffwVar.c;
                bArr2 = bArr3;
                i = i5;
            }
            if (bArr2[i] != bArr[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
