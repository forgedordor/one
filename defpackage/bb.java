package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bb {
    public final ArrayList a = new ArrayList();

    public final void a(bc bcVar) {
        float f;
        float f2;
        float f3;
        ArrayList arrayList = this.a;
        arrayList.clear();
        int i = 1;
        while (true) {
            f = 0.0f;
            if (i >= bcVar.e) {
                break;
            }
            be beVar = bcVar.g.a[i];
            for (int i2 = 0; i2 < 6; i2++) {
                beVar.e[i2] = 0.0f;
            }
            beVar.e[beVar.c] = 1.0f;
            if (beVar.h == 4) {
                arrayList.add(beVar);
            }
            i++;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            be beVar2 = (be) arrayList.get(i3);
            int i4 = beVar2.b;
            if (i4 != -1) {
                ay ayVar = bcVar.c[i4].d;
                int i5 = ayVar.a;
                int i6 = 0;
                while (i6 < i5) {
                    be beVarD = ayVar.d(i6);
                    if (beVarD == null) {
                        f3 = f;
                    } else {
                        float fB = ayVar.b(i6);
                        int i7 = 0;
                        while (i7 < 6) {
                            float[] fArr = beVarD.e;
                            fArr[i7] = fArr[i7] + (beVar2.e[i7] * fB);
                            i7++;
                            f = f;
                        }
                        f3 = f;
                        if (!arrayList.contains(beVarD)) {
                            arrayList.add(beVarD);
                        }
                    }
                    i6++;
                    f = f3;
                }
                f2 = f;
                for (int i8 = 0; i8 < 6; i8++) {
                    beVar2.e[i8] = f2;
                }
            } else {
                f2 = f;
            }
            i3++;
            f = f2;
        }
    }

    public final String toString() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        String strConcat = "Goal: ";
        for (int i = 0; i < size; i++) {
            be beVar = (be) arrayList.get(i);
            Objects.toString(beVar);
            String strConcat2 = "null[";
            int i2 = 0;
            while (true) {
                float[] fArr = beVar.e;
                if (i2 < 6) {
                    strConcat2 = (strConcat2 + fArr[i2]).concat(i2 < 5 ? ", " : "] ");
                    i2++;
                }
            }
            strConcat = strConcat.concat(strConcat2);
        }
        return strConcat;
    }
}
