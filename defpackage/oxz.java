package defpackage;

import android.graphics.Bitmap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oxz {
    public static final oyc a(Bitmap bitmap, List list, int i, List list2) {
        int i2;
        float f;
        int width = bitmap.getWidth() * bitmap.getHeight();
        double dSqrt = width > 12544 ? Math.sqrt(12544.0d / width) : -1.0d;
        int i3 = 0;
        Bitmap bitmapCreateScaledBitmap = dSqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dSqrt), (int) Math.ceil(bitmap.getHeight() * dSqrt), false);
        int width2 = bitmapCreateScaledBitmap.getWidth();
        int height = bitmapCreateScaledBitmap.getHeight();
        int[] iArr = new int[width2 * height];
        bitmapCreateScaledBitmap.getPixels(iArr, 0, width2, 0, 0, width2, height);
        oxx oxxVar = new oxx(iArr, i, list2.isEmpty() ? null : (oya[]) list2.toArray(new oya[list2.size()]));
        if (bitmapCreateScaledBitmap != bitmap) {
            bitmapCreateScaledBitmap.recycle();
        }
        oyc oycVar = new oyc(oxxVar.c, list);
        List list3 = oycVar.c;
        int size = list3.size();
        int i4 = 0;
        while (i4 < size) {
            oyd oydVar = (oyd) list3.get(i4);
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i5 = i3; i5 < 3; i5++) {
                float f4 = oydVar.i[i5];
                if (f4 > 0.0f) {
                    f3 += f4;
                }
            }
            if (f3 != 0.0f) {
                for (int i6 = i3; i6 < 3; i6++) {
                    float[] fArr = oydVar.i;
                    float f5 = fArr[i6];
                    if (f5 > 0.0f) {
                        fArr[i6] = f5 / f3;
                    }
                }
            }
            cvw cvwVar = oycVar.d;
            List list4 = oycVar.b;
            int size2 = list4.size();
            int i7 = i3;
            float f6 = 0.0f;
            oyb oybVar = null;
            while (i7 < size2) {
                oyb oybVar2 = (oyb) list4.get(i7);
                float[] fArrA = oybVar2.a();
                float f7 = fArrA[1];
                float[] fArr2 = oydVar.g;
                if (f7 < fArr2[i3] || f7 > fArr2[2]) {
                    i2 = i3;
                } else {
                    float f8 = fArrA[2];
                    i2 = i3;
                    float[] fArr3 = oydVar.h;
                    if (f8 >= fArr3[i2] && f8 <= fArr3[2]) {
                        f = f2;
                        if (!oycVar.e.get(oybVar2.a)) {
                            float[] fArrA2 = oybVar2.a();
                            oyb oybVar3 = oycVar.f;
                            float fC = (oydVar.c() > f ? oydVar.c() * (1.0f - Math.abs(fArrA2[1] - fArr2[1])) : f) + (oydVar.a() > f ? oydVar.a() * (1.0f - Math.abs(fArrA2[2] - fArr3[1])) : f) + (oydVar.b() > f ? oydVar.b() * (oybVar2.b / (oybVar3 != null ? oybVar3.b : 1)) : f);
                            if (oybVar == null || fC > f6) {
                                oybVar = oybVar2;
                                f6 = fC;
                            }
                        }
                    }
                    i7++;
                    f2 = f;
                    i3 = i2;
                }
                f = f2;
                i7++;
                f2 = f;
                i3 = i2;
            }
            int i8 = i3;
            if (oybVar != null) {
                boolean z = oydVar.j;
                oycVar.e.append(oybVar.a, true);
            } else {
                oybVar = null;
            }
            cvwVar.put(oydVar, oybVar);
            i4++;
            i3 = i8;
        }
        oycVar.e.clear();
        return oycVar;
    }
}
