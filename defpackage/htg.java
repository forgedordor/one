package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htg extends hty {
    public static final htg a = new htg();

    private htg() {
        super(1, 0, 2);
    }

    @Override // defpackage.hty
    protected final void a(hud hudVar, hlw hlwVar, hre hreVar, hqs hqsVar, htz htzVar) {
        hlv hlvVar;
        int iA;
        int i;
        int i2;
        int iA2 = hudVar.a(0);
        if (hreVar.n != 0) {
            hmz.j("Cannot move a group while inserting");
        }
        if (iA2 < 0) {
            hmz.j("Parameter offset is out of bounds");
        }
        if (iA2 == 0) {
            return;
        }
        int i3 = hreVar.q;
        int i4 = hreVar.s;
        int i5 = hreVar.r;
        int iA3 = i3;
        while (iA2 > 0) {
            iA3 += hrc.a(hreVar.b, hreVar.h(iA3));
            if (iA3 > i5) {
                hmz.j("Parameter offset is out of bounds");
            }
            iA2--;
        }
        int iA4 = hrc.a(hreVar.b, hreVar.h(iA3));
        int iC = hreVar.c(hreVar.b, hreVar.h(hreVar.q));
        int iC2 = hreVar.c(hreVar.b, hreVar.h(iA3));
        int i6 = iA3 + iA4;
        int iC3 = hreVar.c(hreVar.b, hreVar.h(i6));
        int i7 = iC3 - iC2;
        hreVar.F(i7, Math.max(hreVar.q - 1, 0));
        hreVar.E(iA4);
        int[] iArr = hreVar.b;
        int iH = hreVar.h(i6) * 5;
        fcur.l(iArr, iArr, hreVar.h(i3) * 5, iH, (iA4 * 5) + iH);
        if (i7 > 0) {
            Object[] objArr = hreVar.c;
            int iD = hreVar.d(iC2 + i7);
            System.arraycopy(objArr, iD, objArr, iC, hreVar.d(iC3 + i7) - iD);
        }
        int i8 = iC2 + i7;
        int i9 = i8 - iC;
        int i10 = hreVar.k;
        int i11 = hreVar.l;
        int length = hreVar.c.length;
        int i12 = hreVar.m;
        int i13 = i3 + iA4;
        int i14 = i3;
        while (i14 < i13) {
            int iH2 = hreVar.h(i14);
            int i15 = i9;
            int iC4 = hreVar.c(iArr, iH2) - i15;
            if (i12 < iH2) {
                i = iH2;
                i2 = 0;
            } else {
                i = iH2;
                i2 = i10;
            }
            int[] iArr2 = iArr;
            iArr2[(i * 5) + 4] = hre.W(hre.W(iC4, i2, i11, length), hreVar.k, hreVar.l, hreVar.c.length);
            i14++;
            i9 = i15;
            iArr = iArr2;
            i10 = i10;
        }
        int i16 = i6 + iA4;
        int iF = hreVar.f();
        int iB = hrc.b(hreVar.d, i6, iF);
        ArrayList arrayList = new ArrayList();
        while (iB < hreVar.d.size() && (iA = hreVar.a((hlvVar = (hlv) hreVar.d.get(iB)))) >= i6 && iA < i16) {
            arrayList.add(hlvVar);
        }
        int i17 = i3 - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            hlv hlvVar2 = (hlv) arrayList.get(i18);
            int iA5 = hreVar.a(hlvVar2) + i17;
            if (iA5 >= hreVar.g) {
                hlvVar2.a = -(iF - iA5);
            } else {
                hlvVar2.a = iA5;
            }
            hreVar.d.add(hrc.b(hreVar.d, iA5, iF), hlvVar2);
        }
        if (hreVar.V(i6, iA4)) {
            hmz.j("Unexpectedly removed anchors");
        }
        hreVar.D(i4, hreVar.r, i3);
        if (i7 > 0) {
            hreVar.J(i8, i7, i6 - 1);
        }
    }
}
