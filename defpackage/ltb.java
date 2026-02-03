package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ltb {
    public final float[] a;

    public ltb() {
        this((byte[]) null);
    }

    public final float a() {
        return this.a[0];
    }

    public final float b() {
        return this.a[1];
    }

    public final float c() {
        return this.a[6];
    }

    public final float d() {
        return this.a[7];
    }

    public final float e() {
        return this.a[2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ltb) {
            return Arrays.equals(this.a, ((ltb) obj).a);
        }
        return false;
    }

    public final float f() {
        return this.a[3];
    }

    public final float g() {
        return this.a[4];
    }

    public final float h() {
        return this.a[5];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final long i(float f) {
        float f2 = 1.0f - f;
        float f3 = f2 * f2 * f2;
        float fA = a() * f3;
        float f4 = 3.0f * f;
        float f5 = f4 * f2 * f2;
        float fE = e() * f5;
        float f6 = f4 * f * f2;
        float fG = g() * f6;
        float f7 = f * f * f;
        float fC = c() * f7;
        float fB = b() * f3;
        float f8 = f() * f5;
        return csy.a(fA + fE + fG + fC, fB + f8 + (h() * f6) + (d() * f7));
    }

    public final ltb j(ltu ltuVar) {
        lts ltsVar = new lts();
        fcur.p(this.a, ltsVar.a, 0, 14);
        ltsVar.m(ltuVar, 0);
        ltsVar.m(ltuVar, 2);
        ltsVar.m(ltuVar, 4);
        ltsVar.m(ltuVar, 6);
        return ltsVar;
    }

    public final fcti k(float f) {
        long jI = i(f);
        float fA = a();
        float fB = b();
        float f2 = 1.0f - f;
        float fA2 = a() * f2;
        float fE = e() * f;
        float fB2 = b() * f2;
        float f3 = f() * f;
        float f4 = f2 * f2;
        float fA3 = a() * f4;
        float f5 = (f2 + f2) * f;
        float fE2 = e() * f5;
        float f6 = f * f;
        float fG = g() * f6;
        float fB3 = b() * f4;
        float f7 = f() * f5;
        ltb ltbVarA = ltc.a(fA, fB, fA2 + fE, fB2 + f3, fA3 + fE2 + fG, fB3 + f7 + (h() * f6), ltt.c(jI), ltt.d(jI));
        float fC = ltt.c(jI);
        float fD = ltt.d(jI);
        float fE3 = e() * f4;
        float fG2 = g() * f5;
        float fC2 = c() * f6;
        float f8 = f() * f4;
        float fH = h() * f5;
        return new fcti(ltbVarA, ltc.a(fC, fD, fE3 + fG2 + fC2, f8 + fH + (d() * f6), (g() * f2) + (c() * f), (h() * f2) + (d() * f), c(), d()));
    }

    public final boolean l() {
        return Math.abs(a() - c()) < 1.0E-4f && Math.abs(b() - d()) < 1.0E-4f;
    }

    public final String toString() {
        return "anchor0: (" + a() + ", " + b() + ") control0: (" + e() + ", " + f() + "), control1: (" + g() + ", " + h() + "), anchor1: (" + c() + ", " + d() + ')';
    }

    public ltb(float[] fArr) {
        this.a = fArr;
        if (fArr.length != 8) {
            throw new IllegalArgumentException("Points array size should be 8");
        }
    }

    public /* synthetic */ ltb(byte[] bArr) {
        this(new float[8]);
    }
}
