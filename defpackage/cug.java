package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cug extends cth {
    public cug() {
        this((byte[]) null);
    }

    public final int c(int i) {
        if (i < 0 || i >= this.b) {
            cwh.c("Index must be between 0 and size");
        }
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (i != this.b - 1) {
            fcur.l(iArr, iArr, i, i + 1, this.b);
        }
        this.b--;
        return i2;
    }

    public final void d() {
        this.b = 0;
    }

    public final void e(int i) {
        int[] iArr = this.a;
        int length = iArr.length;
        if (length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i, (length * 3) / 2));
            iArrCopyOf.getClass();
            this.a = iArrCopyOf;
        }
    }

    public final void f(int i) {
        e(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        iArr[i2] = i;
        this.b = i2 + 1;
    }

    public final void g(int i, int i2) {
        if (i < 0 || i >= this.b) {
            cwh.c("Index must be between 0 and size");
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public cug(int i) {
        super(i);
    }

    public /* synthetic */ cug(byte[] bArr) {
        super(16);
    }
}
