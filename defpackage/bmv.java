package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bmv {
    public static final bmu[] b = {bmu.S720P_16_9, bmu.S1080P_4_3, bmu.S1080P_16_9, bmu.S1440P_16_9, bmu.UHD, bmu.X_VGA};

    public static int d(int i) {
        if (i == 35) {
            return 2;
        }
        if (i == 256) {
            return 3;
        }
        if (i == 4101) {
            return 4;
        }
        return i == 32 ? 5 : 1;
    }

    public static bmv e(int i, Size size, bmw bmwVar, int i2) {
        bmu bmuVar;
        bmu bmuVar2 = bmu.NOT_SUPPORT;
        int iA = bsd.a(size);
        if (i2 == 1) {
            Size sizeH = bmwVar.h(i);
            bmu[] bmuVarArr = b;
            int length = bmuVarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= 6) {
                    bmuVar = bmuVar2;
                    break;
                }
                bmuVar = bmuVarArr[i3];
                if (size.equals(bmuVar.q)) {
                    break;
                }
                i3++;
            }
            bmuVar2 = (bmuVar == bmuVar2 && size.equals(sizeH)) ? bmu.MAXIMUM : bmuVar;
        } else {
            bhq bhqVar = (bhq) bmwVar;
            if (iA <= bsd.a(bhqVar.a)) {
                bmuVar2 = bmu.VGA;
            } else if (iA <= bsd.a(bhqVar.c)) {
                bmuVar2 = bmu.PREVIEW;
            } else if (iA <= bsd.a(bhqVar.e)) {
                bmuVar2 = bmu.RECORD;
            } else {
                Size sizeH2 = bmwVar.h(i);
                Size size2 = (Size) bhqVar.g.get(Integer.valueOf(i));
                if (sizeH2 == null || iA <= bsd.a(sizeH2)) {
                    bmuVar2 = bmu.MAXIMUM;
                } else if (size2 != null && iA <= bsd.a(size2)) {
                    bmuVar2 = bmu.ULTRA_MAXIMUM;
                }
            }
        }
        return new bhp(d(i), bmuVar2, 0L);
    }

    public abstract long a();

    public abstract bmu b();

    public abstract int c();
}
