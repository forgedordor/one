package defpackage;

import android.util.Pair;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class nij extends nim {
    protected abstract Pair k(nii niiVar, int[][][] iArr, int[] iArr2);

    @Override // defpackage.nim
    public final nin n(mtk[] mtkVarArr, ngo ngoVar) {
        int length;
        boolean z;
        ekgb ekgbVarR;
        int length2;
        int[] iArr;
        ngo ngoVar2 = ngoVar;
        boolean z2 = true;
        int length3 = mtkVarArr.length + 1;
        int[] iArr2 = new int[length3];
        mcm[][] mcmVarArr = new mcm[length3][];
        int[][][] iArr3 = new int[length3][][];
        for (int i = 0; i < length3; i++) {
            int i2 = ngoVar2.b;
            mcmVarArr[i] = new mcm[i2];
            iArr3[i] = new int[i2][];
        }
        int length4 = mtkVarArr.length;
        int[] iArr4 = new int[length4];
        for (int i3 = 0; i3 < length4; i3++) {
            iArr4[i3] = mtkVarArr[i3].e();
        }
        int i4 = 0;
        while (i4 < ngoVar2.b) {
            mcm mcmVarB = ngoVar2.b(i4);
            int i5 = mcmVarB.c;
            int length5 = mtkVarArr.length;
            boolean z3 = z2;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                length2 = mtkVarArr.length;
                if (i6 >= length2) {
                    break;
                }
                mtk mtkVar = mtkVarArr[i6];
                boolean z4 = z2;
                int iMax = 0;
                for (int i8 = 0; i8 < mcmVarB.a; i8++) {
                    iMax = Math.max(iMax, mti.e(mtkVar.V(mcmVarB.a(i8))));
                }
                boolean z5 = iArr2[i6] == 0 ? z4 : false;
                if (iMax > i7) {
                    z3 = z5;
                    length5 = i6;
                    i7 = iMax;
                } else if (iMax == i7 && i5 == 5 && !z3 && z5) {
                    length5 = i6;
                    i7 = iMax;
                    z3 = z4;
                }
                i6++;
                z2 = z4;
            }
            boolean z6 = z2;
            if (length5 == length2) {
                iArr = new int[mcmVarB.a];
            } else {
                mtk mtkVar2 = mtkVarArr[length5];
                int i9 = mcmVarB.a;
                int[] iArr5 = new int[i9];
                for (int i10 = 0; i10 < i9; i10++) {
                    iArr5[i10] = mtkVar2.V(mcmVarB.a(i10));
                }
                iArr = iArr5;
            }
            int i11 = iArr2[length5];
            mcmVarArr[length5][i11] = mcmVarB;
            iArr3[length5][i11] = iArr;
            iArr2[length5] = i11 + 1;
            i4++;
            ngoVar2 = ngoVar;
            z2 = z6;
        }
        boolean z7 = z2;
        int length6 = mtkVarArr.length;
        ngo[] ngoVarArr = new ngo[length6];
        String[] strArr = new String[length6];
        int[] iArr6 = new int[length6];
        int i12 = 0;
        while (true) {
            length = mtkVarArr.length;
            if (i12 >= length) {
                break;
            }
            int i13 = iArr2[i12];
            ngoVarArr[i12] = new ngo((mcm[]) mgb.ag(mcmVarArr[i12], i13));
            iArr3[i12] = (int[][]) mgb.ag(iArr3[i12], i13);
            strArr[i12] = mtkVarArr[i12].R();
            iArr6[i12] = mtkVarArr[i12].eM();
            i12++;
        }
        nii niiVar = new nii(iArr6, ngoVarArr, iArr4, iArr3, new ngo((mcm[]) mgb.ag(mcmVarArr[length], iArr2[length])));
        Pair pairK = k(niiVar, iArr3, iArr4);
        nik[] nikVarArr = (nik[]) pairK.second;
        List[] listArr = new List[nikVarArr.length];
        for (int i14 = 0; i14 < nikVarArr.length; i14++) {
            nik nikVar = nikVarArr[i14];
            if (nikVar != null) {
                ekgbVarR = ekgb.r(nikVar);
            } else {
                int i15 = ekgb.d;
                ekgbVarR = ekoe.a;
            }
            listArr[i14] = ekgbVarR;
        }
        ekfw ekfwVar = new ekfw();
        for (int i16 = 0; i16 < niiVar.a; i16++) {
            ngo ngoVarC = niiVar.c(i16);
            List list = listArr[i16];
            int i17 = 0;
            while (i17 < ngoVarC.b) {
                mcm mcmVarB2 = ngoVarC.b(i17);
                ngo[] ngoVarArr2 = niiVar.b;
                int i18 = ngoVarArr2[i16].b(i17).a;
                int[] iArr7 = new int[i18];
                int i19 = 0;
                for (int i20 = 0; i20 < i18; i20++) {
                    if (niiVar.b(i16, i17, i20) == 4) {
                        iArr7[i19] = i20;
                        i19++;
                    }
                }
                int[] iArrCopyOf = Arrays.copyOf(iArr7, i19);
                String str = null;
                int iMin = 16;
                List[] listArr2 = listArr;
                int i21 = 0;
                boolean z8 = false;
                int i22 = 0;
                while (i21 < iArrCopyOf.length) {
                    int[] iArr8 = iArrCopyOf;
                    String str2 = ngoVarArr2[i16].b(i17).a(iArrCopyOf[i21]).o;
                    int i23 = i22 + 1;
                    if (i22 == 0) {
                        str = str2;
                    } else {
                        z8 |= !Objects.equals(str, str2);
                    }
                    iMin = Math.min(iMin, niiVar.d[i16][i17][i21] & 24);
                    i21++;
                    iArrCopyOf = iArr8;
                    i22 = i23;
                }
                if (z8) {
                    iMin = Math.min(iMin, niiVar.c[i16]);
                }
                boolean z9 = iMin != 0 ? z7 : false;
                int i24 = mcmVarB2.a;
                int[] iArr9 = new int[i24];
                boolean[] zArr = new boolean[i24];
                for (int i25 = 0; i25 < i24; i25++) {
                    iArr9[i25] = niiVar.b(i16, i17, i25);
                    int i26 = 0;
                    while (true) {
                        if (i26 >= list.size()) {
                            z = false;
                            break;
                        }
                        nik nikVar2 = (nik) list.get(i26);
                        if (nikVar2.c().equals(mcmVarB2) && nikVar2.g(i25) != -1) {
                            z = z7;
                            break;
                        }
                        i26++;
                    }
                    zArr[i25] = z;
                }
                ekfwVar.h(new mcr(mcmVarB2, z9, iArr9, zArr));
                i17++;
                listArr = listArr2;
            }
        }
        ngo ngoVar3 = niiVar.e;
        for (int i27 = 0; i27 < ngoVar3.b; i27++) {
            mcm mcmVarB3 = ngoVar3.b(i27);
            int i28 = mcmVarB3.a;
            int[] iArr10 = new int[i28];
            Arrays.fill(iArr10, 0);
            ekfwVar.h(new mcr(mcmVarB3, false, iArr10, new boolean[i28]));
        }
        return new nin((mtl[]) pairK.first, (nif[]) pairK.second, new mcs(ekfwVar.g()), niiVar);
    }

    @Override // defpackage.nim
    public final void m() {
    }
}
