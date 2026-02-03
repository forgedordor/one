package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feyn implements Iterable, fdcn {
    private final String[] a;

    public feyn(String[] strArr) {
        this.a = strArr;
    }

    public final int a() {
        return this.a.length >> 1;
    }

    public final String b(String str) {
        String[] strArr = this.a;
        int length = strArr.length - 2;
        int iA = fczg.a(length, 0, -2);
        if (iA <= length) {
            while (!fdgn.j(str, strArr[length], true)) {
                if (length != iA) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String c(int i) {
        return this.a[i + i];
    }

    public final String d(int i) {
        return this.a[i + i + 1];
    }

    public final feyl e() {
        feyl feylVar = new feyl();
        fcva.z(feylVar.a, this.a);
        return feylVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof feyn) && Arrays.equals(this.a, ((feyn) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator<fcti<String, String>> iterator() {
        int iA = a();
        fcti[] fctiVarArr = new fcti[iA];
        for (int i = 0; i < iA; i++) {
            fctiVarArr[i] = new fcti(c(i), d(i));
        }
        return fdbd.a(fctiVarArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iA = a();
        for (int i = 0; i < iA; i++) {
            String strC = c(i);
            String strD = d(i);
            sb.append(strC);
            sb.append(": ");
            if (true == fezr.x(strC)) {
                strD = "██";
            }
            sb.append(strD);
            sb.append("\n");
        }
        return sb.toString();
    }
}
