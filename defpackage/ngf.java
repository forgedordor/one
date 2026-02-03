package defpackage;

import java.util.Arrays;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngf {
    public final Random a;
    public final int[] b;
    public final int[] c;

    public ngf() {
        this(new Random());
    }

    public final int a() {
        return this.b.length;
    }

    public final ngf b(int i) {
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        int i2 = 0;
        while (i2 < i) {
            Random random = this.a;
            iArr[i2] = random.nextInt(this.b.length + 1);
            int i3 = i2 + 1;
            int iNextInt = random.nextInt(i3);
            iArr2[i2] = iArr2[iNextInt];
            iArr2[iNextInt] = i2;
            i2 = i3;
        }
        Arrays.sort(iArr);
        int[] iArr3 = this.b;
        int[] iArr4 = new int[iArr3.length + i];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < iArr3.length + i; i6++) {
            if (i4 >= i || i5 != iArr[i4]) {
                int i7 = i5 + 1;
                int i8 = iArr3[i5];
                iArr4[i6] = i8;
                if (i8 >= 0) {
                    iArr4[i6] = i8 + i;
                }
                i5 = i7;
            } else {
                iArr4[i6] = iArr2[i4];
                i4++;
            }
        }
        return new ngf(iArr4, new Random(this.a.nextLong()));
    }

    public ngf(Random random) {
        this(new int[0], random);
    }

    public ngf(int[] iArr, Random random) {
        this.b = iArr;
        this.a = random;
        this.c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.c[iArr[i]] = i;
        }
    }
}
