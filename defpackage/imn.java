package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class imn extends ilg {
    private static final ilt q = new ilt() { // from class: ilz
        @Override // defpackage.ilt
        public final double a(double d) {
            return d;
        }
    };
    public final imq d;
    public final float e;
    public final float f;
    public final imp g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final ilt k;
    public final fdap l;
    public final ilt m;
    public final ilt n;
    public final fdap o;
    public final ilt p;
    private final boolean r;

    public imn(String str, float[] fArr, imq imqVar, final double d, float f, float f2, int i) {
        this(str, fArr, imqVar, null, d == 1.0d ? q : new ilt() { // from class: ima
            @Override // defpackage.ilt
            public final double a(double d2) {
                if (d2 < 0.0d) {
                    d2 = 0.0d;
                }
                return Math.pow(d2, 1.0d / d);
            }
        }, d == 1.0d ? q : new ilt() { // from class: imb
            @Override // defpackage.ilt
            public final double a(double d2) {
                if (d2 < 0.0d) {
                    d2 = 0.0d;
                }
                return Math.pow(d2, d);
            }
        }, f, f2, new imp(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }

    @Override // defpackage.ilg
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.ilg
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.ilg
    public final float c(float f, float f2, float f3) {
        ilt iltVar = this.p;
        float fA = (float) iltVar.a(f);
        float fA2 = (float) iltVar.a(f2);
        float fA3 = (float) iltVar.a(f3);
        float[] fArr = this.i;
        return (fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3);
    }

    @Override // defpackage.ilg
    public final long d(float f, float f2, float f3) {
        ilt iltVar = this.p;
        float fA = (float) iltVar.a(f);
        float fA2 = (float) iltVar.a(f2);
        float fA3 = (float) iltVar.a(f3);
        float[] fArr = this.i;
        int length = fArr.length;
        float f4 = fArr[0] * fA;
        float f5 = fArr[3] * fA2;
        float f6 = fArr[6] * fA3;
        float f7 = fArr[1] * fA;
        float f8 = fArr[4] * fA2;
        float f9 = fArr[7] * fA3;
        return (Float.floatToRawIntBits(f7 + f8 + f9) & 4294967295L) | (Float.floatToRawIntBits((f4 + f5) + f6) << 32);
    }

    @Override // defpackage.ilg
    public final long e(float f, float f2, float f3, float f4, ilg ilgVar) {
        float[] fArr = this.j;
        float f5 = fArr[0] * f;
        float f6 = fArr[3] * f2;
        float f7 = fArr[6] * f3;
        float f8 = fArr[1] * f;
        float f9 = fArr[4] * f2;
        float f10 = fArr[7] * f3;
        float f11 = fArr[2] * f;
        float f12 = fArr[5] * f2;
        float f13 = fArr[8] * f3;
        ilt iltVar = this.m;
        return ijg.f((float) iltVar.a(f5 + f6 + f7), (float) iltVar.a(f8 + f9 + f10), (float) iltVar.a(f11 + f12 + f13), f4, ilgVar);
    }

    @Override // defpackage.ilg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        imn imnVar = (imn) obj;
        if (Float.compare(imnVar.e, this.e) != 0 || Float.compare(imnVar.f, this.f) != 0 || !fdbq.f(this.d, imnVar.d) || !Arrays.equals(this.h, imnVar.h)) {
            return false;
        }
        imp impVar = this.g;
        if (impVar != null) {
            return fdbq.f(impVar, imnVar.g);
        }
        if (imnVar.g == null) {
            return true;
        }
        if (fdbq.f(this.k, imnVar.k)) {
            return fdbq.f(this.n, imnVar.n);
        }
        return false;
    }

    @Override // defpackage.ilg
    public final boolean f() {
        return this.r;
    }

    @Override // defpackage.ilg
    public final int hashCode() {
        int iHashCode = (((super.hashCode() * 31) + this.d.hashCode()) * 31) + Arrays.hashCode(this.h);
        float f = this.e;
        int iFloatToIntBits = ((iHashCode * 31) + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        imp impVar = this.g;
        int iHashCode2 = iFloatToIntBits2 + (impVar != null ? impVar.hashCode() : 0);
        return impVar == null ? (((iHashCode2 * 31) + this.k.hashCode()) * 31) + this.n.hashCode() : iHashCode2;
    }

    public imn(String str, float[] fArr, imq imqVar, final imp impVar, int i) {
        ilt iltVar;
        ilt iltVar2;
        if (impVar.a()) {
            iltVar = new ilt() { // from class: img
                @Override // defpackage.ilt
                public final double a(double d) {
                    float[] fArr2 = ilo.a;
                    return ilo.b(impVar, d);
                }
            };
        } else if (impVar.b()) {
            iltVar = new ilt() { // from class: imh
                @Override // defpackage.ilt
                public final double a(double d) {
                    float[] fArr2 = ilo.a;
                    return ilo.d(impVar, d);
                }
            };
        } else if (impVar.f == 0.0d && impVar.g == 0.0d) {
            iltVar = new ilt() { // from class: imi
                @Override // defpackage.ilt
                public final double a(double d) {
                    imp impVar2 = impVar;
                    return ilh.a(d, impVar2.b, impVar2.c, impVar2.d, impVar2.e, impVar2.a);
                }
            };
        } else {
            iltVar = new ilt() { // from class: imj
                @Override // defpackage.ilt
                public final double a(double d) {
                    imp impVar2 = impVar;
                    double d2 = impVar2.e;
                    double d3 = impVar2.d;
                    if (d < d2 * d3) {
                        return (d - impVar2.g) / d3;
                    }
                    double d4 = impVar2.a;
                    double d5 = impVar2.f;
                    double d6 = impVar2.c;
                    return (Math.pow(d - d5, 1.0d / d4) - d6) / impVar2.b;
                }
            };
        }
        ilt iltVar3 = iltVar;
        if (impVar.a()) {
            iltVar2 = new ilt() { // from class: imc
                @Override // defpackage.ilt
                public final double a(double d) {
                    float[] fArr2 = ilo.a;
                    return ilo.a(impVar, d);
                }
            };
        } else if (impVar.b()) {
            iltVar2 = new ilt() { // from class: imd
                @Override // defpackage.ilt
                public final double a(double d) {
                    float[] fArr2 = ilo.a;
                    return ilo.c(impVar, d);
                }
            };
        } else if (impVar.f == 0.0d && impVar.g == 0.0d) {
            iltVar2 = new ilt() { // from class: ime
                @Override // defpackage.ilt
                public final double a(double d) {
                    imp impVar2 = impVar;
                    return ilh.b(d, impVar2.b, impVar2.c, impVar2.d, impVar2.e, impVar2.a);
                }
            };
        } else {
            iltVar2 = new ilt() { // from class: imf
                @Override // defpackage.ilt
                public final double a(double d) {
                    imp impVar2 = impVar;
                    if (d < impVar2.e) {
                        return (impVar2.d * d) + impVar2.g;
                    }
                    double d2 = impVar2.a;
                    return Math.pow((impVar2.b * d) + impVar2.c, d2) + impVar2.f;
                }
            };
        }
        this(str, fArr, imqVar, null, iltVar3, iltVar2, 0.0f, 1.0f, impVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0147 A[EDGE_INSN: B:26:0x0147->B:41:0x0176 BREAK  A[LOOP:1: B:32:0x0157->B:40:0x016f], EDGE_INSN: B:46:0x0147->B:26:0x0147 BREAK  A[LOOP:0: B:17:0x011d->B:23:0x013a]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public imn(java.lang.String r33, float[] r34, defpackage.imq r35, float[] r36, defpackage.ilt r37, defpackage.ilt r38, float r39, float r40, defpackage.imp r41, int r42) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.imn.<init>(java.lang.String, float[], imq, float[], ilt, ilt, float, float, imp, int):void");
    }
}
