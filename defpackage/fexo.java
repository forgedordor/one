package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fexo implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        str.getClass();
        str2.getClass();
        int iMin = Math.min(str.length(), str2.length());
        for (int i = 4; i < iMin; i++) {
            char cCharAt = str.charAt(i);
            char cCharAt2 = str2.charAt(i);
            if (cCharAt != cCharAt2) {
                return fdbq.a(cCharAt, cCharAt2) >= 0 ? 1 : -1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length != length2) {
            return length >= length2 ? 1 : -1;
        }
        return 0;
    }
}
