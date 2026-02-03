package defpackage;

import java.io.IOException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgpt implements fgqf, fgqd {
    private final String a;
    private final String b;
    private final boolean c;
    private final int d;

    public fgpt(String str, String str2, boolean z, int i) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
    }

    private static final int e(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        for (int iMin = Math.min(charSequence.length() - i, i2); iMin > 0; iMin--) {
            char cCharAt = charSequence.charAt(i + i3);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            i3++;
        }
        return i3;
    }

    @Override // defpackage.fgqd
    public final int a() {
        return b();
    }

    @Override // defpackage.fgqf
    public final int b() {
        int i = true != this.c ? 6 : 7;
        String str = this.a;
        return (str == null || str.length() <= i) ? i : str.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b3, code lost:
    
        if (r0 == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4  */
    @Override // defpackage.fgqd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(defpackage.fgpz r12, java.lang.CharSequence r13, int r14) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgpt.c(fgpz, java.lang.CharSequence, int):int");
    }

    @Override // defpackage.fgqf
    public final void d(Appendable appendable, long j, fgmq fgmqVar, int i, fgmz fgmzVar, Locale locale) throws IOException {
        int i2;
        int i3;
        if (fgmzVar == null) {
            return;
        }
        if (i == 0) {
            String str = this.a;
            if (str != null) {
                appendable.append(str);
                return;
            }
            i = 0;
        }
        if (i >= 0) {
            appendable.append('+');
        } else {
            appendable.append('-');
            i = -i;
        }
        int i4 = i / 3600000;
        fgqb.b(appendable, i4, 2);
        int i5 = i - (i4 * 3600000);
        int i6 = i5 != 0 ? i5 : 0;
        boolean z = this.c;
        if (z) {
            appendable.append(':');
        }
        int i7 = i6 / 60000;
        fgqb.b(appendable, i7, 2);
        int i8 = this.d;
        if (i8 == 2 || (i2 = i6 - (i7 * 60000)) == 0) {
            return;
        }
        int i9 = i2 / 1000;
        if (z) {
            appendable.append(':');
        }
        fgqb.b(appendable, i9, 2);
        if (i8 == 3 || (i3 = i2 - (i9 * 1000)) == 0) {
            return;
        }
        if (z) {
            appendable.append('.');
        }
        fgqb.b(appendable, i3, 3);
    }
}
