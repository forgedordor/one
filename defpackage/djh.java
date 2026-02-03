package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djh implements djb {
    public final int a;
    private final cth b;
    private final ctj c;
    private final des d;
    private int[] e = diz.a;
    private float[] f;
    private deh g;
    private deh h;
    private deh i;
    private deh j;
    private float[] k;
    private float[] l;
    private del m;

    public djh(cth cthVar, ctj ctjVar, int i, des desVar) {
        this.b = cthVar;
        this.c = ctjVar;
        this.a = i;
        this.d = desVar;
        float[] fArr = diz.b;
        this.f = fArr;
        this.k = fArr;
        this.l = fArr;
        this.m = diz.c;
    }

    private final float h(int i) {
        return i(j(i), i, false);
    }

    private final float i(int i, int i2, boolean z) {
        des desVar;
        float f;
        cth cthVar = this.b;
        if (i >= cthVar.b - 1) {
            f = i2;
        } else {
            int iA = cthVar.a(i);
            int iA2 = cthVar.a(i + 1);
            if (i2 == iA) {
                f = iA;
            } else {
                int i3 = iA2 - iA;
                djg djgVar = (djg) this.c.a(iA);
                if (djgVar == null || (desVar = djgVar.b) == null) {
                    desVar = this.d;
                }
                float f2 = i3;
                float fA = desVar.a((i2 - iA) / f2);
                if (z) {
                    return fA;
                }
                f = (f2 * fA) + iA;
            }
        }
        return f / 1000.0f;
    }

    private final int j(int i) {
        int i2;
        cth cthVar = this.b;
        int i3 = cthVar.b;
        if (i3 <= 0) {
            cwh.c("");
        }
        int i4 = i3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = cthVar.a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = -(i5 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb A[LOOP:5: B:37:0x00b9->B:38:0x00bb, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void k(defpackage.deh r10, defpackage.deh r11, defpackage.deh r12) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djh.k(deh, deh, deh):void");
    }

    @Override // defpackage.diw
    public final /* synthetic */ long a(deh dehVar, deh dehVar2, deh dehVar3) {
        return dja.a(this);
    }

    @Override // defpackage.diw
    public final /* synthetic */ deh b(deh dehVar, deh dehVar2, deh dehVar3) {
        return div.a(this, dehVar, dehVar2, dehVar3);
    }

    @Override // defpackage.diw
    public final deh c(long j, deh dehVar, deh dehVar2, deh dehVar3) {
        deh dehVar4;
        deh dehVar5;
        deh dehVar6 = dehVar;
        deh dehVar7 = dehVar2;
        int iA = (int) diz.a(this, j / 1000000);
        ctj ctjVar = this.c;
        djg djgVar = (djg) ctjVar.a(iA);
        if (djgVar != null) {
            return djgVar.a;
        }
        if (iA >= this.a) {
            return dehVar7;
        }
        if (iA <= 0) {
            return dehVar6;
        }
        k(dehVar6, dehVar7, dehVar3);
        deh dehVar8 = this.g;
        dehVar8.getClass();
        int i = 0;
        if (this.m != diz.c) {
            float fH = h(iA);
            float[] fArr = this.k;
            dek[][] dekVarArr = this.m.a;
            int length = dekVarArr.length;
            float f = dekVarArr[0][0].a;
            int i2 = length - 1;
            float f2 = dekVarArr[i2][0].b;
            int length2 = fArr.length;
            if (fH >= f && fH <= f2) {
                int i3 = 0;
                boolean z = false;
                while (i3 < length) {
                    int i4 = i;
                    int i5 = i4;
                    while (i4 < length2 - 1) {
                        dek dekVar = dekVarArr[i3][i5];
                        if (fH <= dekVar.b) {
                            int i6 = i4 + 1;
                            if (dekVar.g) {
                                fArr[i4] = dekVar.c(fH);
                                fArr[i6] = dekVar.d(fH);
                            } else {
                                dekVar.e(fH);
                                fArr[i4] = dekVar.h + (dekVar.e * dekVar.c);
                                fArr[i6] = dekVar.i + (dekVar.f * dekVar.d);
                            }
                            z = true;
                        }
                        i5++;
                        i4 += 2;
                    }
                    if (z) {
                        break;
                    }
                    i3++;
                    i = 0;
                }
            } else {
                int i7 = length2 - 1;
                if (fH > f2) {
                    f = f2;
                }
                if (fH <= f2) {
                    i2 = 0;
                }
                float f3 = fH - f;
                int i8 = 0;
                int i9 = 0;
                while (i8 < i7) {
                    int i10 = i8 + 1;
                    dek dekVar2 = dekVarArr[i2][i9];
                    if (dekVar2.g) {
                        fArr[i8] = dekVar2.c(f) + (dekVar2.h * f3);
                        fArr[i10] = dekVar2.d(f) + (dekVar2.i * f3);
                    } else {
                        dekVar2.e(f);
                        fArr[i8] = dekVar2.h + (dekVar2.e * dekVar2.c) + (dekVar2.a() * f3);
                        fArr[i10] = dekVar2.i + (dekVar2.f * dekVar2.d) + (dekVar2.b() * f3);
                    }
                    i8 += 2;
                    i9++;
                }
            }
            int length3 = fArr.length;
            for (int i11 = 0; i11 < length3; i11++) {
                dehVar8.e(i11, fArr[i11]);
            }
        } else {
            int iJ = j(iA);
            float fI = i(iJ, iA, true);
            cth cthVar = this.b;
            djg djgVar2 = (djg) ctjVar.a(cthVar.a(iJ));
            if (djgVar2 != null && (dehVar5 = djgVar2.a) != null) {
                dehVar6 = dehVar5;
            }
            djg djgVar3 = (djg) ctjVar.a(cthVar.a(iJ + 1));
            if (djgVar3 != null && (dehVar4 = djgVar3.a) != null) {
                dehVar7 = dehVar4;
            }
            int iB = dehVar8.b();
            for (int i12 = 0; i12 < iB; i12++) {
                dehVar8.e(i12, (dehVar6.a(i12) * (1.0f - fI)) + (dehVar7.a(i12) * fI));
            }
        }
        return dehVar8;
    }

    @Override // defpackage.diw
    public final deh d(long j, deh dehVar, deh dehVar2, deh dehVar3) {
        long jA = diz.a(this, j / 1000000);
        k(dehVar, dehVar2, dehVar3);
        deh dehVar4 = this.h;
        dehVar4.getClass();
        int i = 0;
        if (this.m != diz.c) {
            float fH = h((int) jA);
            float[] fArr = this.l;
            dek[][] dekVarArr = this.m.a;
            float f = dekVarArr[0][0].a;
            float f2 = dekVarArr[dekVarArr.length - 1][0].b;
            if (fH < f) {
                fH = f;
            }
            if (fH <= f2) {
                f2 = fH;
            }
            int length = fArr.length;
            boolean z = false;
            for (dek[] dekVarArr2 : dekVarArr) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < length - 1) {
                    dek dekVar = dekVarArr2[i3];
                    if (f2 <= dekVar.b) {
                        int i4 = i2 + 1;
                        if (dekVar.g) {
                            fArr[i2] = dekVar.h;
                            fArr[i4] = dekVar.i;
                        } else {
                            dekVar.e(f2);
                            fArr[i2] = dekVar.a();
                            fArr[i4] = dekVar.b();
                        }
                        z = true;
                    }
                    i2 += 2;
                    i3++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                dehVar4.e(i, fArr[i]);
                i++;
            }
        } else {
            deh dehVarB = diz.b(this, (-1) + jA, dehVar, dehVar2, dehVar3);
            deh dehVarB2 = diz.b(this, jA, dehVar, dehVar2, dehVar3);
            int iB = dehVarB.b();
            while (i < iB) {
                dehVar4.e(i, (dehVarB.a(i) - dehVarB2.a(i)) * 1000.0f);
                i++;
            }
        }
        return dehVar4;
    }

    @Override // defpackage.diw
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // defpackage.djb
    public final int f() {
        return 0;
    }

    @Override // defpackage.djb
    public final int g() {
        return this.a;
    }
}
