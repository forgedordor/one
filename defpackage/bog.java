package defpackage;

import android.util.Pair;
import java.nio.ByteOrder;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bog {
    final List b = Collections.list(new boe());
    public final ByteOrder c;
    private static final Pattern d = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
    private static final Pattern e = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    private static final Pattern f = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    static final List a = Collections.list(new bod());

    public bog(ByteOrder byteOrder) {
        this.c = byteOrder;
    }

    private static Pair d(String str) throws NumberFormatException {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairD = d(strArrSplit[0]);
            if (((Integer) pairD.first).intValue() != 2) {
                for (int i = 1; i < strArrSplit.length; i++) {
                    Pair pairD2 = d(strArrSplit[i]);
                    int iIntValue = (((Integer) pairD2.first).equals(pairD.first) || ((Integer) pairD2.second).equals(pairD.first)) ? ((Integer) pairD.first).intValue() : -1;
                    int iIntValue2 = (((Integer) pairD.second).intValue() == -1 || !(((Integer) pairD2.first).equals(pairD.second) || ((Integer) pairD2.second).equals(pairD.second))) ? -1 : ((Integer) pairD.second).intValue();
                    if (iIntValue == -1) {
                        if (iIntValue2 == -1) {
                            return new Pair(2, -1);
                        }
                        iIntValue = -1;
                    }
                    if (iIntValue == -1) {
                        pairD = new Pair(Integer.valueOf(iIntValue2), -1);
                    } else if (iIntValue2 == -1) {
                        pairD = new Pair(Integer.valueOf(iIntValue), -1);
                    }
                }
            }
            return pairD;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j = Long.parseLong(str);
                    return (j < 0 || j > 65535) ? j < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    Double.parseDouble(str);
                    return new Pair(12, -1);
                }
            } catch (NumberFormatException unused2) {
                return new Pair(2, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j2 >= 0 && j3 >= 0) {
                    if (j2 <= 2147483647L && j3 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if (r8 != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void e(java.lang.String r20, java.lang.String r21, java.util.List r22) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bog.e(java.lang.String, java.lang.String, java.util.List):void");
    }

    public final void a(String str, String str2, List list) throws NumberFormatException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Map) it.next()).containsKey(str)) {
                return;
            }
        }
        e(str, str2, list);
    }

    public final void b(String str, String str2) throws NumberFormatException {
        e(str, str2, this.b);
    }

    public final void c(int i) throws NumberFormatException {
        int i2;
        if (i == 0) {
            i2 = 1;
        } else if (i == 90) {
            i2 = 6;
        } else if (i == 180) {
            i2 = 3;
        } else if (i != 270) {
            bbs.f("ExifData", a.e(i, "Unexpected orientation value: ", ". Must be one of 0, 90, 180, 270."));
            i2 = 0;
        } else {
            i2 = 8;
        }
        b("Orientation", String.valueOf(i2));
    }
}
