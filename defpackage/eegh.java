package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eegh {
    public final eegg a;
    public final List b;
    public final List c;
    public final float d;
    public final float e;
    private final float[] f;
    private final float[] g;

    public eegh(eegg eeggVar, List list, List list2) {
        this.a = eeggVar;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = DesugarCollections.unmodifiableList(list2);
        float f = ((eegg) list.get(list.size() - 1)).b().a - eeggVar.b().a;
        this.d = f;
        float f2 = eeggVar.d().a - ((eegg) list2.get(list2.size() - 1)).d().a;
        this.e = f2;
        this.f = g(f, list, true);
        this.g = g(f2, list2, false);
    }

    public static eegg d(eegg eeggVar, int i, int i2, float f, int i3, int i4, int i5) {
        ArrayList arrayList = new ArrayList(eeggVar.c);
        arrayList.add(i2, (eegf) arrayList.remove(i));
        eege eegeVar = new eege(eeggVar.a, i5);
        int i6 = 0;
        while (i6 < arrayList.size()) {
            eegf eegfVar = (eegf) arrayList.get(i6);
            float f2 = eegfVar.d;
            eegeVar.g(f + (f2 / 2.0f), eegfVar.c, f2, i6 >= i3 && i6 <= i4, eegfVar.e, eegfVar.f);
            f += f2;
            i6++;
        }
        return eegeVar.b();
    }

    public static eegg e(eegg eeggVar, float f, int i) {
        return d(eeggVar, 0, 0, f, eeggVar.d, eeggVar.e, i);
    }

    public static eegg f(eegg eeggVar, float f, int i, boolean z, float f2) {
        boolean z2;
        int i2;
        List list = eeggVar.c;
        ArrayList arrayList = new ArrayList(list);
        float f3 = eeggVar.a;
        eege eegeVar = new eege(f3, i);
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (((eegf) it.next()).e) {
                i3++;
            }
        }
        float size = f / (list.size() - i3);
        boolean z3 = true;
        float f4 = true != z ? 0.0f : f;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            eegf eegfVar = (eegf) arrayList.get(i4);
            if (eegfVar.e) {
                eegeVar.g(eegfVar.b, eegfVar.c, eegfVar.d, false, true, eegfVar.f);
                z2 = z3;
                i2 = i4;
            } else {
                boolean z4 = (i4 < eeggVar.d || i4 > eeggVar.e) ? false : z3;
                float f5 = eegfVar.d - size;
                float fA = eegc.a(f5, f3, f2);
                float f6 = f4 + (f5 / 2.0f);
                float fAbs = Math.abs(f6 - eegfVar.b);
                float f7 = eegfVar.f;
                float f8 = z3 != z ? 0.0f : fAbs;
                if (z3 == z) {
                    fAbs = 0.0f;
                }
                float f9 = f8;
                z2 = z3;
                float f10 = fAbs;
                i2 = i4;
                eegeVar.d(f6, fA, f5, z4, false, f7, f9, f10);
                f4 += f5;
            }
            i4 = i2 + 1;
            z3 = z2;
        }
        return eegeVar.b();
    }

    private static float[] g(float f, List list, boolean z) {
        int size = list.size();
        float[] fArr = new float[size];
        int i = 1;
        while (i < size) {
            int i2 = i - 1;
            eegg eeggVar = (eegg) list.get(i2);
            eegg eeggVar2 = (eegg) list.get(i);
            fArr[i] = i == size + (-1) ? 1.0f : fArr[i2] + ((z ? eeggVar2.b().a - eeggVar.b().a : eeggVar.d().a - eeggVar2.d().a) / f);
            i++;
        }
        return fArr;
    }

    public final eegg a() {
        return (eegg) this.c.get(r0.size() - 1);
    }

    public final eegg b(float f, float f2, float f3) {
        float fA;
        List list;
        float[] fArr;
        float[] fArr2;
        float f4 = c().a().g;
        float f5 = a().a().h;
        float f6 = this.d;
        float f7 = f6 + f2;
        if (f6 == f4) {
            f7 += f4;
        }
        float f8 = this.e;
        float f9 = f3 - f8;
        if (f8 == f5) {
            f9 -= f5;
        }
        if (f < f7) {
            fA = eecd.a(1.0f, 0.0f, f2, f7, f);
            list = this.b;
            fArr = this.f;
        } else {
            if (f <= f9) {
                return this.a;
            }
            fA = eecd.a(0.0f, 1.0f, f9, f3, f);
            list = this.c;
            fArr = this.g;
        }
        int size = list.size();
        float f10 = fArr[0];
        int i = 1;
        while (true) {
            if (i >= size) {
                fArr2 = new float[]{0.0f, 0.0f, 0.0f};
                break;
            }
            float f11 = fArr[i];
            if (fA <= f11) {
                fArr2 = new float[]{eecd.a(0.0f, 1.0f, f10, f11, fA), i - 1, i};
                break;
            }
            i++;
            f10 = f11;
        }
        eegg eeggVar = (eegg) list.get((int) fArr2[1]);
        eegg eeggVar2 = (eegg) list.get((int) fArr2[2]);
        float f12 = fArr2[0];
        float f13 = eeggVar.a;
        if (f13 != eeggVar2.a) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List list2 = eeggVar.c;
        List list3 = eeggVar2.c;
        if (list2.size() != list3.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list2.size(); i2++) {
            eegf eegfVar = (eegf) list2.get(i2);
            eegf eegfVar2 = (eegf) list3.get(i2);
            float f14 = eegfVar.a;
            float f15 = f14 + ((eegfVar2.a - f14) * f12);
            float f16 = eegfVar.b;
            float f17 = f16 + ((eegfVar2.b - f16) * f12);
            float f18 = eegfVar.c;
            float f19 = f18 + ((eegfVar2.c - f18) * f12);
            float f20 = eegfVar.d;
            arrayList.add(new eegf(f15, f17, f19, f20 + ((eegfVar2.d - f20) * f12), false, 0.0f, 0.0f, 0.0f));
        }
        return new eegg(f13, arrayList, eecd.b(eeggVar.d, eeggVar2.d, f12), eecd.b(eeggVar.e, eeggVar2.e, f12), eeggVar.f);
    }

    public final eegg c() {
        return (eegg) this.b.get(r0.size() - 1);
    }
}
