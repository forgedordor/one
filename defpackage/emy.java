package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emy {
    public static final int a(hum humVar, int i) {
        int i2 = humVar.b - 1;
        int i3 = 0;
        while (i3 < i2) {
            Object[] objArr = humVar.a;
            int i4 = ((i2 - i3) / 2) + i3;
            int i5 = ((emx) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((emx) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }
}
