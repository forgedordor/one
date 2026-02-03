package defpackage;

import com.android.vcard.VCardConstants;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mek {
    public static final byte[] a = {0, 0, 0, 1};
    private static final String[] b = {"", "A", VCardConstants.PARAM_ENCODING_B, "C"};
    private static final Pattern c = Pattern.compile("^\\D?(\\d+)$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair a(defpackage.mau r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mek.a(mau):android.util.Pair");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair b(java.lang.String r10, java.lang.String[] r11, defpackage.mag r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mek.b(java.lang.String, java.lang.String[], mag):android.util.Pair");
    }

    public static ekgb c(byte b2, byte b3, byte b4, byte b5) {
        return ekgb.r(new byte[]{1, 1, b2, 2, 1, b3, 3, 1, b4, 4, 1, b5});
    }

    public static String d(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String e(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        StringBuilder sb = new StringBuilder(mgb.I("hvc1.%s%d.%X.%c%d", b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(true != z ? 'L' : 'H'), Integer.valueOf(i4)));
        int i5 = 6;
        while (i5 > 0) {
            int i6 = i5 - 1;
            if (iArr[i6] != 0) {
                break;
            }
            i5 = i6;
        }
        for (int i7 = 0; i7 < i5; i7++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i7])));
        }
        return sb.toString();
    }
}
