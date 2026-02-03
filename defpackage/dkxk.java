package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkxk {
    public static final dkxo a(dkwb dkwbVar) {
        int i;
        int i2;
        int i3;
        int i4 = dkwbVar.b;
        int i5 = dkwbVar.d;
        int i6 = dkwbVar.f;
        int i7 = dkwbVar.h;
        int i8 = i4 + i5 + i6 + i7;
        int i9 = dkwbVar.i;
        int i10 = i8 + i9;
        int i11 = dkwbVar.a;
        if (i10 <= i11) {
            return new dkxo(i4, i5, i6, dkwbVar.g.size(), i9, false);
        }
        int i12 = dkwbVar.e;
        int i13 = i11 - i4;
        int i14 = ((i13 - i5) - i7) - i9;
        if (i14 >= i12) {
            return new dkxo(i4, i5, i14, dkwbVar.g.size(), i9, c(i12, i6, i14));
        }
        int i15 = dkwbVar.c;
        int i16 = ((i13 - i12) - i7) - i9;
        boolean z = true;
        if (i16 < i15) {
            dkxo dkxoVarB = b(dkwbVar, i15, i12, i5, i6);
            if (dkxoVarB != null || (dkxoVarB = b(dkwbVar, i15, 0, i5, i6)) != null) {
                return dkxoVarB;
            }
            dkxo dkxoVarB2 = b(dkwbVar, 0, 0, i5, i6);
            if (dkxoVarB2 == null || dkxoVarB2.d <= 0) {
                dkxoVarB2 = null;
            }
            if (dkxoVarB2 == null) {
                return new dkxo(0, 0, 0, 0, 0, (i15 == 0 && i12 == 0) ? false : true);
            }
            return dkxoVarB2;
        }
        List list = dkwbVar.g;
        boolean zC = c(i15, i5, i16);
        int size = list.size();
        if (zC || i12 < i6) {
            i = i12;
            i2 = i16;
            i3 = size;
        } else {
            i = i12;
            i2 = i16;
            i3 = size;
            z = false;
        }
        return new dkxo(i4, i2, i, i3, i9, z);
    }

    private static final dkxo b(dkwb dkwbVar, int i, int i2, int i3, int i4) {
        int iNextIndex;
        int i5 = dkwbVar.a;
        int i6 = dkwbVar.b;
        int i7 = dkwbVar.i;
        int i8 = (((i5 - i6) - i) - i2) - i7;
        if (i8 < (-i7) / 2) {
            return null;
        }
        List list = dkwbVar.g;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (((Number) listIterator.previous()).intValue() <= i8) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        return new dkxo(i6, i, i2, iNextIndex + 1, i7 + fddu.g(i8, 0), i3 > i || i4 > i2);
    }

    private static final boolean c(int i, int i2, int i3) {
        return i2 > i && i3 < i2;
    }
}
