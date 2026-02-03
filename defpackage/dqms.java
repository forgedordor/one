package defpackage;

import java.text.ParseException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqms {
    public static dqmr a(byte[] bArr, int i) throws ParseException {
        boolean z = false;
        int i2 = 0;
        long j = 0;
        long j2 = -1;
        long j3 = -1;
        int i3 = 0;
        while (i3 < i) {
            int i4 = i3 + 1;
            byte b = bArr[i3];
            if (b == 32) {
                if (!z) {
                    break;
                }
                if (i2 != 0) {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = j;
                } else {
                    j2 = j;
                }
                i2++;
                z = false;
                j = 0;
                i3 = i4;
            } else {
                if (b < 48 || b > 57 || j > 922337203685477580L) {
                    break;
                }
                j = (j * 10) + (b - 48);
                i3 = i4;
                z = true;
            }
        }
        if (i2 != 2) {
            throw new ParseException("Failed to parse SchedStat", i2);
        }
        dqmr dqmrVar = dqmr.d;
        return new dqmn(j2, j3, j);
    }
}
