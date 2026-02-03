package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nxf implements nvn {
    private final mfr a = new mfr();
    private final boolean b;
    private final int c;
    private final int d;
    private final String e;
    private final float f;
    private final int g;

    public nxf(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.c = 0;
            this.d = -1;
            this.e = "sans-serif";
            this.b = false;
            this.f = 0.85f;
            this.g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.c = bArr[24];
        this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.e = true == "Serif".equals(mgb.K(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.g = i;
        boolean z = (bArr[0] & 32) != 0;
        this.b = z;
        if (z) {
            this.f = mgb.a(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f = 0.85f;
        }
    }

    private static void d(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            int i8 = i & 2;
            boolean z = true;
            if (i7 != 0) {
                if (i8 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                    z = false;
                }
            } else if (i8 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            } else {
                z = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            } else {
                if (i7 != 0 || z) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    @Override // defpackage.nvn
    public final /* synthetic */ nva a(byte[] bArr, int i, int i2) {
        return nvj.a(this, bArr, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nvn
    public final void b(byte[] bArr, int i, int i2, nvm nvmVar, meo meoVar) {
        String strZ;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        mfr mfrVar = this.a;
        mfrVar.I(bArr, i + i2);
        mfrVar.K(i);
        int i12 = 1;
        int i13 = 0;
        int i14 = 2;
        mee.a(mfrVar.a() >= 2);
        int iN = mfrVar.n();
        if (iN == 0) {
            strZ = "";
        } else {
            int i15 = mfrVar.b;
            Charset charsetA = mfrVar.A();
            int i16 = mfrVar.b - i15;
            if (charsetA == null) {
                charsetA = StandardCharsets.UTF_8;
            }
            strZ = mfrVar.z(iN - i16, charsetA);
        }
        if (strZ.isEmpty()) {
            int i17 = ekgb.d;
            meoVar.a(new nut(ekoe.a, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strZ);
        int i18 = this.c;
        e(spannableStringBuilder, i18, 0, 0, spannableStringBuilder.length(), 16711680);
        int i19 = i18;
        int i20 = this.d;
        d(spannableStringBuilder, i20, -1, 0, spannableStringBuilder.length(), 16711680);
        int i21 = i20;
        String str = this.e;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fA = this.f;
        while (mfrVar.a() >= 8) {
            int i22 = mfrVar.b;
            int iE = mfrVar.e();
            int iE2 = mfrVar.e();
            if (iE2 == 1937013100) {
                mee.a(mfrVar.a() >= i14 ? i12 : i13);
                int iN2 = mfrVar.n();
                int i23 = i13;
                while (i23 < iN2) {
                    mee.a(mfrVar.a() >= 12 ? i12 : i13);
                    int iN3 = mfrVar.n();
                    int iN4 = mfrVar.n();
                    mfrVar.L(i14);
                    int i24 = iN2;
                    int iJ = mfrVar.j();
                    mfrVar.L(i12);
                    int iE3 = mfrVar.e();
                    if (iN4 > spannableStringBuilder.length()) {
                        i6 = i19;
                        i7 = i21;
                        mff.f("Tx3gParser", "Truncating styl end (" + iN4 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
                        iN4 = spannableStringBuilder.length();
                    } else {
                        i6 = i19;
                        i7 = i21;
                    }
                    if (iN3 >= iN4) {
                        mff.f("Tx3gParser", a.z(iN4, iN3, "Ignoring styl with start (", ") >= end (", ")."));
                        i10 = i6;
                        i9 = i23;
                        i8 = i24;
                        i11 = i7;
                    } else {
                        i8 = i24;
                        i9 = i23;
                        int i25 = i6;
                        e(spannableStringBuilder, iJ, i25, iN3, iN4, 0);
                        i10 = i25;
                        i11 = i7;
                        d(spannableStringBuilder, iE3, i11, iN3, iN4, 0);
                    }
                    iN2 = i8;
                    i19 = i10;
                    i21 = i11;
                    i12 = 1;
                    i14 = 2;
                    i23 = i9 + 1;
                    i13 = 0;
                }
                i3 = i19;
                i4 = i21;
                i5 = i14;
            } else {
                i3 = i19;
                i4 = i21;
                if (iE2 == 1952608120 && this.b) {
                    i5 = 2;
                    mee.a(mfrVar.a() >= 2);
                    fA = mgb.a(mfrVar.n() / this.g, 0.0f, 0.95f);
                } else {
                    i5 = 2;
                }
            }
            mfrVar.K(i22 + iE);
            i19 = i3;
            i14 = i5;
            i21 = i4;
            i12 = 1;
            i13 = 0;
        }
        mdt mdtVar = new mdt();
        mdtVar.a = spannableStringBuilder;
        mdtVar.c(fA, 0);
        mdtVar.e = 0;
        meoVar.a(new nut(ekgb.r(mdtVar.a()), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // defpackage.nvn
    public final /* synthetic */ void c() {
    }
}
