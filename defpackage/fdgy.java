package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes6.dex */
public class fdgy extends fdgx {
    public static final Integer g(String str) {
        boolean z;
        int i;
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        int i3 = -2147483647;
        if (fdbq.a(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i3 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i = 0;
        }
        int i4 = -59652323;
        while (i < length) {
            int iB = fdfv.b(str.charAt(i));
            if (iB < 0) {
                return null;
            }
            if (i2 < i4) {
                if (i4 == -59652323) {
                    i4 = -214748364;
                    if (i2 < -214748364) {
                    }
                }
                return null;
            }
            int i5 = i2 * 10;
            if (i5 < i3 + iB) {
                return null;
            }
            i2 = i5 - iB;
            i++;
        }
        return z ? Integer.valueOf(i2) : Integer.valueOf(-i2);
    }

    public static final Long h(String str) {
        int i;
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return null;
        }
        boolean z = false;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (fdbq.a(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt != '+') {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                z = true;
            }
        } else {
            i = 0;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i < length) {
            int iB = fdfv.b(str.charAt(i));
            if (iB < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 == -256204778801521550L) {
                    j3 = -922337203685477580L;
                    if (j2 < -922337203685477580L) {
                    }
                }
                return null;
            }
            long j4 = j2 * 10;
            long j5 = iB;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i++;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }
}
