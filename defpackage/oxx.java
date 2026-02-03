package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oxx {
    private static final Comparator e = new oxv();
    final int[] a;
    final int[] b;
    final List c;
    final oya[] d;
    private final float[] f = new float[3];

    public oxx(int[] iArr, int i, oya[] oyaVarArr) {
        oxw oxwVar;
        int iMin;
        this.d = oyaVarArr;
        int[] iArr2 = new int[32768];
        this.b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            int iG = g(Color.blue(i3), 8, 5) | (g(Color.red(i3), 8, 5) << 10) | (g(Color.green(i3), 8, 5) << 5);
            iArr[i2] = iG;
            iArr2[iG] = iArr2[iG] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0) {
                int iF = f(i5);
                kzb.j(iF, this.f);
                if (h(iF, this.f)) {
                    iArr2[i5] = 0;
                }
            }
            if (iArr2[i5] > 0) {
                i4++;
            }
        }
        int[] iArr3 = new int[i4];
        this.a = iArr3;
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr2[i7] > 0) {
                iArr3[i6] = i7;
                i6++;
            }
        }
        if (i4 <= i) {
            this.c = new ArrayList();
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = iArr3[i8];
                this.c.add(new oyb(f(i9), iArr2[i9]));
            }
            return;
        }
        PriorityQueue<oxw> priorityQueue = new PriorityQueue(i, e);
        priorityQueue.offer(new oxw(this, 0, this.a.length - 1));
        while (priorityQueue.size() < i && (oxwVar = (oxw) priorityQueue.poll()) != null && oxwVar.c()) {
            if (!oxwVar.c()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int i10 = oxwVar.e - oxwVar.d;
            int i11 = oxwVar.g - oxwVar.f;
            int i12 = oxwVar.i - oxwVar.h;
            int i13 = (i10 < i11 || i10 < i12) ? (i11 < i10 || i11 < i12) ? -1 : -2 : -3;
            oxx oxxVar = oxwVar.j;
            int[] iArr4 = oxxVar.a;
            int[] iArr5 = oxxVar.b;
            e(iArr4, i13, oxwVar.a, oxwVar.b);
            Arrays.sort(iArr4, oxwVar.a, oxwVar.b + 1);
            e(iArr4, i13, oxwVar.a, oxwVar.b);
            int i14 = oxwVar.c / 2;
            int i15 = oxwVar.a;
            int i16 = 0;
            while (true) {
                int i17 = oxwVar.b;
                if (i15 > i17) {
                    iMin = oxwVar.a;
                    break;
                }
                i16 += iArr5[iArr4[i15]];
                if (i16 >= i14) {
                    iMin = Math.min(i17 - 1, i15);
                    break;
                }
                i15++;
            }
            oxw oxwVar2 = new oxw(oxwVar.j, iMin + 1, oxwVar.b);
            oxwVar.b = iMin;
            oxwVar.b();
            priorityQueue.offer(oxwVar2);
            priorityQueue.offer(oxwVar);
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        for (oxw oxwVar3 : priorityQueue) {
            oxx oxxVar2 = oxwVar3.j;
            int[] iArr6 = oxxVar2.a;
            int[] iArr7 = oxxVar2.b;
            int iD = 0;
            int i18 = 0;
            int iC = 0;
            int iB = 0;
            for (int i19 = oxwVar3.a; i19 <= oxwVar3.b; i19++) {
                int i20 = iArr6[i19];
                int i21 = iArr7[i20];
                i18 += i21;
                iD += d(i20) * i21;
                iC += c(i20) * i21;
                iB += i21 * b(i20);
            }
            float f = i18;
            oyb oybVar = new oyb(a(Math.round(iD / f), Math.round(iC / f), Math.round(iB / f)), i18);
            if (!h(oybVar.a, oybVar.a())) {
                arrayList.add(oybVar);
            }
        }
        this.c = arrayList;
    }

    static int a(int i, int i2, int i3) {
        return Color.rgb(g(i, 5, 8), g(i2, 5, 8), g(i3, 5, 8));
    }

    static int b(int i) {
        return i & 31;
    }

    static int c(int i) {
        return (i >> 5) & 31;
    }

    static int d(int i) {
        return (i >> 10) & 31;
    }

    static void e(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = b(i4) | (c(i4) << 10) | (d(i4) << 5);
                i2++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = d(i5) | (b(i5) << 10) | (c(i5) << 5);
            i2++;
        }
    }

    private static int f(int i) {
        return a(d(i), c(i), b(i));
    }

    private static int g(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    private final boolean h(int i, float[] fArr) {
        oya[] oyaVarArr = this.d;
        if (oyaVarArr != null && (oyaVarArr.length) > 0) {
            for (oya oyaVar : oyaVarArr) {
                if (!oyaVar.a(i, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }
}
