package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nwm implements nvn {
    private static final byte[] a = {0, 7, 8, 15};
    private static final byte[] b = {0, 119, -120, -1};
    private static final byte[] c = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint d;
    private final Paint e;
    private final Canvas f;
    private final nwf g;
    private final nwe h;
    private final nwl i;
    private Bitmap j;

    public nwm(List list) {
        mfr mfrVar = new mfr((byte[]) list.get(0));
        int iN = mfrVar.n();
        int iN2 = mfrVar.n();
        Paint paint = new Paint();
        this.d = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f = new Canvas();
        this.g = new nwf(719, 575, 0, 719, 0, 575);
        this.h = new nwe(0, i(), j(), k());
        this.i = new nwl(iN, iN2);
    }

    private static int d(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    private static nwe e(mfq mfqVar, int i) {
        int iD;
        int iD2;
        int iD3;
        int iD4;
        mfq mfqVar2 = mfqVar;
        int i2 = 8;
        int iD5 = mfqVar2.d(8);
        mfqVar2.n(8);
        int[] iArrI = i();
        int[] iArrJ = j();
        int[] iArrK = k();
        int i3 = i - 2;
        while (i3 > 0) {
            int iD6 = mfqVar2.d(i2);
            int iD7 = mfqVar2.d(i2);
            int[] iArr = (iD7 & 128) != 0 ? iArrI : (iD7 & 64) != 0 ? iArrJ : iArrK;
            if ((iD7 & 1) != 0) {
                iD3 = mfqVar2.d(i2);
                iD4 = mfqVar2.d(i2);
                iD = mfqVar2.d(i2);
                iD2 = mfqVar2.d(i2);
                i3 -= 6;
            } else {
                int iD8 = mfqVar2.d(6) << 2;
                int iD9 = mfqVar2.d(4) << 4;
                i3 -= 4;
                iD = mfqVar2.d(4) << 4;
                iD2 = mfqVar2.d(2) << 6;
                iD3 = iD8;
                iD4 = iD9;
            }
            if (iD3 == 0) {
                iD2 = 255;
            }
            if (iD3 == 0) {
                iD = 0;
            }
            if (iD3 == 0) {
                iD4 = 0;
            }
            double d = iD3;
            double d2 = iD4 - 128;
            double d3 = iD - 128;
            iArr[iD6] = d((byte) (255 - (iD2 & 255)), mgb.d((int) (d + (1.402d * d2)), 0, 255), mgb.d((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), mgb.d((int) (d + (d3 * 1.772d)), 0, 255));
            mfqVar2 = mfqVar;
            iD5 = iD5;
            i2 = 8;
        }
        return new nwe(iD5, iArrI, iArrJ, iArrK);
    }

    private static nwg f(mfq mfqVar) {
        byte[] bArr;
        int iD = mfqVar.d(16);
        mfqVar.n(4);
        int iD2 = mfqVar.d(2);
        boolean zP = mfqVar.p();
        mfqVar.n(1);
        byte[] bArr2 = mgb.b;
        if (iD2 != 1) {
            if (iD2 == 0) {
                int iD3 = mfqVar.d(16);
                int iD4 = mfqVar.d(16);
                if (iD3 > 0) {
                    bArr2 = new byte[iD3];
                    mfqVar.r(bArr2, iD3);
                }
                if (iD4 > 0) {
                    bArr = new byte[iD4];
                    mfqVar.r(bArr, iD4);
                }
            }
            return new nwg(iD, zP, bArr2, bArr);
        }
        mfqVar.n(mfqVar.d(8) * 16);
        bArr = bArr2;
        return new nwg(iD, zP, bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0202 A[LOOP:3: B:88:0x0164->B:119:0x0202, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(byte[] r22, int[] r23, int r24, int r25, int r26, android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nwm.g(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] h(int i, int i2, mfq mfqVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) mfqVar.d(i2);
        }
        return bArr;
    }

    private static int[] i() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] j() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = d(255, 1 != i4 ? 0 : 255, i3 != 0 ? 255 : 0, i2 != 0 ? 255 : 0);
            } else {
                iArr[i] = d(255, 1 != i4 ? 0 : 127, i3 != 0 ? 127 : 0, i2 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] k() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = d(63, 1 != (i & 1) ? 0 : 255, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = d(255, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = d(127, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = d(255, (1 != (i & 1) ? 0 : 43) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = d(255, (1 != (i & 1) ? 0 : 43) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.nvn
    public final /* synthetic */ nva a(byte[] bArr, int i, int i2) {
        return nvj.a(this, bArr, i2);
    }

    @Override // defpackage.nvn
    public final void b(byte[] bArr, int i, int i2, nvm nvmVar, meo meoVar) {
        boolean z;
        nut nutVar;
        Canvas canvas;
        char c2;
        char c3;
        int i3;
        nwl nwlVar;
        ArrayList arrayList;
        int i4;
        int i5;
        int i6;
        SparseArray sparseArray;
        nwj nwjVar;
        int iD;
        int iD2;
        int i7;
        int iD3;
        mfq mfqVar = new mfq(bArr, i + i2);
        mfqVar.l(i);
        while (true) {
            z = true;
            if (mfqVar.a() >= 48 && mfqVar.d(8) == 15) {
                nwl nwlVar2 = this.i;
                int iD4 = mfqVar.d(8);
                int iD5 = mfqVar.d(16);
                int iD6 = mfqVar.d(16);
                int iB = mfqVar.b() + iD6;
                if (iD6 * 8 > mfqVar.a()) {
                    mff.f("DvbParser", "Data field length exceeds limit");
                    mfqVar.n(mfqVar.a());
                } else {
                    switch (iD4) {
                        case 16:
                            if (iD5 == nwlVar2.a) {
                                nwh nwhVar = nwlVar2.i;
                                mfqVar.d(8);
                                int iD7 = mfqVar.d(4);
                                int iD8 = mfqVar.d(2);
                                mfqVar.n(2);
                                SparseArray sparseArray2 = new SparseArray();
                                for (int i8 = iD6 - 2; i8 > 0; i8 -= 6) {
                                    int iD9 = mfqVar.d(8);
                                    mfqVar.n(8);
                                    sparseArray2.put(iD9, new nwi(mfqVar.d(16), mfqVar.d(16)));
                                }
                                nwh nwhVar2 = new nwh(iD7, iD8, sparseArray2);
                                if (nwhVar2.b != 0) {
                                    nwlVar2.i = nwhVar2;
                                    nwlVar2.c.clear();
                                    nwlVar2.d.clear();
                                    nwlVar2.e.clear();
                                    break;
                                } else if (nwhVar != null) {
                                    if (nwhVar.a != nwhVar2.a) {
                                        nwlVar2.i = nwhVar2;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 17:
                            nwh nwhVar3 = nwlVar2.i;
                            if (iD5 == nwlVar2.a && nwhVar3 != null) {
                                int iD10 = mfqVar.d(8);
                                mfqVar.n(4);
                                boolean zP = mfqVar.p();
                                mfqVar.n(3);
                                int iD11 = mfqVar.d(16);
                                int iD12 = mfqVar.d(16);
                                mfqVar.d(3);
                                int iD13 = mfqVar.d(3);
                                mfqVar.n(2);
                                int iD14 = mfqVar.d(8);
                                int iD15 = mfqVar.d(8);
                                int iD16 = mfqVar.d(4);
                                int iD17 = mfqVar.d(2);
                                mfqVar.n(2);
                                int i9 = iD6 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i9 > 0) {
                                    int iD18 = mfqVar.d(16);
                                    int iD19 = mfqVar.d(2);
                                    mfqVar.d(2);
                                    int iD20 = mfqVar.d(12);
                                    mfqVar.n(4);
                                    int iD21 = mfqVar.d(12);
                                    int i10 = i9 - 6;
                                    if (iD19 == 1 || iD19 == 2) {
                                        mfqVar.d(8);
                                        mfqVar.d(8);
                                        i9 -= 8;
                                    } else {
                                        i9 = i10;
                                    }
                                    sparseArray3.put(iD18, new nwk(iD20, iD21));
                                }
                                nwj nwjVar2 = new nwj(iD10, zP, iD11, iD12, iD13, iD14, iD15, iD16, iD17, sparseArray3);
                                if (nwhVar3.b == 0 && (nwjVar = (nwj) nwlVar2.c.get(nwjVar2.a)) != null) {
                                    int i11 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = nwjVar.j;
                                        if (i11 < sparseArray4.size()) {
                                            nwjVar2.j.put(sparseArray4.keyAt(i11), (nwk) sparseArray4.valueAt(i11));
                                            i11++;
                                        }
                                    }
                                }
                                nwlVar2.c.put(nwjVar2.a, nwjVar2);
                                break;
                            }
                            break;
                        case 18:
                            if (iD5 == nwlVar2.a) {
                                nwe nweVarE = e(mfqVar, iD6);
                                nwlVar2.d.put(nweVarE.a, nweVarE);
                                break;
                            } else if (iD5 == nwlVar2.b) {
                                nwe nweVarE2 = e(mfqVar, iD6);
                                nwlVar2.f.put(nweVarE2.a, nweVarE2);
                                break;
                            }
                            break;
                        case 19:
                            if (iD5 == nwlVar2.a) {
                                nwg nwgVarF = f(mfqVar);
                                nwlVar2.e.put(nwgVarF.a, nwgVarF);
                                break;
                            } else if (iD5 == nwlVar2.b) {
                                nwg nwgVarF2 = f(mfqVar);
                                nwlVar2.g.put(nwgVarF2.a, nwgVarF2);
                                break;
                            }
                            break;
                        case 20:
                            if (iD5 == nwlVar2.a) {
                                mfqVar.n(4);
                                boolean zP2 = mfqVar.p();
                                mfqVar.n(3);
                                int iD22 = mfqVar.d(16);
                                int iD23 = mfqVar.d(16);
                                if (zP2) {
                                    int iD24 = mfqVar.d(16);
                                    iD = mfqVar.d(16);
                                    iD3 = mfqVar.d(16);
                                    i7 = iD24;
                                    iD2 = mfqVar.d(16);
                                } else {
                                    iD = iD22;
                                    iD2 = iD23;
                                    i7 = 0;
                                    iD3 = 0;
                                }
                                nwlVar2.h = new nwf(iD22, iD23, i7, iD, iD3, iD2);
                                break;
                            }
                            break;
                    }
                    mfqVar.o(iB - mfqVar.b());
                }
            }
        }
        nwl nwlVar3 = this.i;
        nwh nwhVar4 = nwlVar3.i;
        if (nwhVar4 == null) {
            int i12 = ekgb.d;
            nutVar = new nut(ekoe.a, -9223372036854775807L, -9223372036854775807L);
        } else {
            nwf nwfVar = nwlVar3.h;
            if (nwfVar == null) {
                nwfVar = this.g;
            }
            Bitmap bitmap = this.j;
            if (bitmap == null || nwfVar.a + 1 != bitmap.getWidth() || nwfVar.b + 1 != this.j.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(nwfVar.a + 1, nwfVar.b + 1, Bitmap.Config.ARGB_8888);
                this.j = bitmapCreateBitmap;
                this.f.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray5 = nwhVar4.c;
            int i13 = 0;
            while (i13 < sparseArray5.size()) {
                Canvas canvas2 = this.f;
                canvas2.save();
                nwi nwiVar = (nwi) sparseArray5.valueAt(i13);
                nwj nwjVar3 = (nwj) nwlVar3.c.get(sparseArray5.keyAt(i13));
                int i14 = nwiVar.a + nwfVar.c;
                int i15 = nwiVar.b + nwfVar.e;
                int i16 = nwjVar3.c;
                int i17 = i14 + i16;
                int iMin = Math.min(i17, nwfVar.d);
                boolean z2 = z;
                int i18 = nwjVar3.d;
                int i19 = i15 + i18;
                canvas2.clipRect(i14, i15, iMin, Math.min(i19, nwfVar.f));
                SparseArray sparseArray6 = nwlVar3.d;
                int i20 = nwjVar3.f;
                nwe nweVar = (nwe) sparseArray6.get(i20);
                if (nweVar == null && (nweVar = (nwe) nwlVar3.f.get(i20)) == null) {
                    nweVar = this.h;
                }
                SparseArray sparseArray7 = nwjVar3.j;
                SparseArray sparseArray8 = sparseArray5;
                int i21 = i13;
                int i22 = 0;
                while (i22 < sparseArray7.size()) {
                    int iKeyAt = sparseArray7.keyAt(i22);
                    int i23 = i22;
                    nwk nwkVar = (nwk) sparseArray7.valueAt(i22);
                    Canvas canvas3 = canvas2;
                    nwg nwgVar = (nwg) nwlVar3.e.get(iKeyAt);
                    if (nwgVar == null) {
                        nwgVar = (nwg) nwlVar3.g.get(iKeyAt);
                    }
                    nwg nwgVar2 = nwgVar;
                    if (nwgVar2 != null) {
                        Paint paint = nwgVar2.b ? null : this.d;
                        int i24 = i16;
                        int i25 = nwjVar3.e;
                        nwlVar = nwlVar3;
                        int i26 = nwkVar.a + i14;
                        int i27 = nwkVar.b + i15;
                        int i28 = i14;
                        int[] iArr = i25 == 3 ? nweVar.d : i25 == 2 ? nweVar.c : nweVar.b;
                        i4 = i28;
                        i5 = i24;
                        sparseArray = sparseArray7;
                        arrayList = arrayList2;
                        i6 = i17;
                        g(nwgVar2.c, iArr, i25, i26, i27, paint, canvas3);
                        g(nwgVar2.d, iArr, i25, i26, i27 + 1, paint, canvas3);
                    } else {
                        nwlVar = nwlVar3;
                        arrayList = arrayList2;
                        i4 = i14;
                        i5 = i16;
                        i6 = i17;
                        sparseArray = sparseArray7;
                    }
                    i14 = i4;
                    i16 = i5;
                    i22 = i23 + 1;
                    i17 = i6;
                    canvas2 = canvas3;
                    nwlVar3 = nwlVar;
                    arrayList2 = arrayList;
                    sparseArray7 = sparseArray;
                }
                nwl nwlVar4 = nwlVar3;
                ArrayList arrayList3 = arrayList2;
                Canvas canvas4 = canvas2;
                int i29 = i14;
                int i30 = i16;
                int i31 = i17;
                float f = i15;
                float f2 = i29;
                if (nwjVar3.b) {
                    int i32 = nwjVar3.e;
                    if (i32 == 3) {
                        i3 = nweVar.d[nwjVar3.g];
                        c3 = 2;
                    } else {
                        c3 = 2;
                        i3 = i32 == 2 ? nweVar.c[nwjVar3.h] : nweVar.b[nwjVar3.i];
                    }
                    Paint paint2 = this.e;
                    paint2.setColor(i3);
                    c2 = c3;
                    canvas = canvas4;
                    canvas.drawRect(f2, f, i31, i19, paint2);
                } else {
                    canvas = canvas4;
                    c2 = 2;
                }
                mdt mdtVar = new mdt();
                mdtVar.b = Bitmap.createBitmap(this.j, i29, i15, i30, i18);
                float f3 = nwfVar.a;
                mdtVar.f = f2 / f3;
                mdtVar.g = 0;
                float f4 = nwfVar.b;
                mdtVar.c(f / f4, 0);
                mdtVar.e = 0;
                mdtVar.h = i30 / f3;
                mdtVar.i = i18 / f4;
                arrayList2 = arrayList3;
                arrayList2.add(mdtVar.a());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                z = z2;
                sparseArray5 = sparseArray8;
                i13 = i21 + 1;
                nwlVar3 = nwlVar4;
            }
            nutVar = new nut(arrayList2, -9223372036854775807L, -9223372036854775807L);
        }
        meoVar.a(nutVar);
    }

    @Override // defpackage.nvn
    public final void c() {
        nwl nwlVar = this.i;
        nwlVar.c.clear();
        nwlVar.d.clear();
        nwlVar.e.clear();
        nwlVar.f.clear();
        nwlVar.g.clear();
        nwlVar.h = null;
        nwlVar.i = null;
    }
}
