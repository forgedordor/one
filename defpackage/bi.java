package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bi extends bm {
    int ag;
    int ah;
    private bl am;
    protected final bc af = new bc();
    private int an = 0;
    private int ao = 0;
    private bh[] ap = new bh[4];
    private bh[] aq = new bh[4];
    private bh[] ar = new bh[4];
    public int ai = 2;
    private final boolean[] as = new boolean[3];
    private final bh[] at = new bh[4];
    public boolean aj = false;
    public boolean ak = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014e  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int G(defpackage.bc r23, defpackage.bh[] r24, defpackage.bh r25, int r26, boolean[] r27) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi.G(bc, bh[], bh, int, boolean[]):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:249:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04c6 A[PHI: r4
      0x04c6: PHI (r4v9 bh) = (r4v8 bh), (r4v20 bh) binds: [B:256:0x04b8, B:259:0x04c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04f7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void H(defpackage.bc r37) {
        /*
            Method dump skipped, instructions count: 1350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi.H(bc):void");
    }

    final void A(bh bhVar, int i) {
        int i2 = 0;
        if (i == 0) {
            while (true) {
                bg bgVar = bhVar.i;
                bg bgVar2 = bgVar.b;
                if (bgVar2 == null) {
                    break;
                }
                bh bhVar2 = bgVar2.a;
                bg bgVar3 = bhVar2.k.b;
                if (bgVar3 == null || bgVar3 != bgVar || bhVar2 == bhVar) {
                    break;
                } else {
                    bhVar = bhVar2;
                }
            }
            while (true) {
                int i3 = this.an;
                if (i2 >= i3) {
                    int i4 = i3 + 1;
                    bh[] bhVarArr = this.ar;
                    int length = bhVarArr.length;
                    if (i4 >= length) {
                        this.ar = (bh[]) Arrays.copyOf(bhVarArr, length + length);
                    }
                    bh[] bhVarArr2 = this.ar;
                    int i5 = this.an;
                    bhVarArr2[i5] = bhVar;
                    this.an = i5 + 1;
                    return;
                }
                if (this.ar[i2] == bhVar) {
                    return;
                } else {
                    i2++;
                }
            }
        } else {
            while (true) {
                bg bgVar4 = bhVar.j;
                bg bgVar5 = bgVar4.b;
                if (bgVar5 == null) {
                    break;
                }
                bh bhVar3 = bgVar5.a;
                bg bgVar6 = bhVar3.l.b;
                if (bgVar6 == null || bgVar6 != bgVar4 || bhVar3 == bhVar) {
                    break;
                } else {
                    bhVar = bhVar3;
                }
            }
            while (true) {
                int i6 = this.ao;
                if (i2 >= i6) {
                    int i7 = i6 + 1;
                    bh[] bhVarArr3 = this.aq;
                    int length2 = bhVarArr3.length;
                    if (i7 >= length2) {
                        this.aq = (bh[]) Arrays.copyOf(bhVarArr3, length2 + length2);
                    }
                    bh[] bhVarArr4 = this.aq;
                    int i8 = this.ao;
                    bhVarArr4[i8] = bhVar;
                    this.ao = i8 + 1;
                    return;
                }
                if (this.aq[i2] == bhVar) {
                    return;
                } else {
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f A[PHI: r0 r7
      0x003f: PHI (r0v7 int) = (r0v2 int), (r0v2 int), (r0v3 int), (r0v3 int), (r0v8 int) binds: [B:95:0x0100, B:97:0x0106, B:114:0x0133, B:119:0x013e, B:26:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r7v13 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v16 int) binds: [B:95:0x0100, B:97:0x0106, B:114:0x0133, B:119:0x013e, B:26:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(defpackage.bh r12, boolean[] r13) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi.B(bh, boolean[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(defpackage.bh r12, boolean[] r13) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi.C(bh, boolean[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05af A[LOOP:16: B:274:0x05ad->B:275:0x05af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x039b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:337:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0258  */
    /* JADX WARN: Type inference failed for: r0v12, types: [bh] */
    /* JADX WARN: Type inference failed for: r0v126 */
    /* JADX WARN: Type inference failed for: r0v127 */
    /* JADX WARN: Type inference failed for: r0v36, types: [int] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r2v4, types: [bh] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25, types: [int] */
    /* JADX WARN: Type inference failed for: r4v29, types: [int] */
    @Override // defpackage.bm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() {
        /*
            Method dump skipped, instructions count: 1469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi.D():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0a1e  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0b1f  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0b22  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0b25  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0b3d  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0b41  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0b6c  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0b78  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0b85  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0bbe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0b79 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [bi] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r2v26, types: [bh] */
    /* JADX WARN: Type inference failed for: r2v4, types: [bh[]] */
    /* JADX WARN: Type inference failed for: r3v1, types: [bh] */
    /* JADX WARN: Type inference failed for: r6v44, types: [bh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(defpackage.bc r39) {
        /*
            Method dump skipped, instructions count: 3017
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi.E(bc):boolean");
    }

    @Override // defpackage.bm, defpackage.bh
    public final void i() {
        this.af.l();
        super.i();
    }
}
