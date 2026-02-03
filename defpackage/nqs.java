package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqs implements mbs {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public nqs(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static nqs d(mfr mfrVar) {
        int iE = mfrVar.e();
        String strF = mbw.f(mfrVar.z(mfrVar.e(), StandardCharsets.US_ASCII));
        String strY = mfrVar.y(mfrVar.e());
        int iE2 = mfrVar.e();
        int iE3 = mfrVar.e();
        int iE4 = mfrVar.e();
        int iE5 = mfrVar.e();
        int iE6 = mfrVar.e();
        byte[] bArr = new byte[iE6];
        mfrVar.F(bArr, 0, iE6);
        return new nqs(iE, strF, strY, iE2, iE3, iE4, iE5, bArr);
    }

    @Override // defpackage.mbs
    public final /* synthetic */ mau a() {
        return null;
    }

    @Override // defpackage.mbs
    public final void b(mbq mbqVar) {
        mbqVar.a(this.h, this.a);
    }

    @Override // defpackage.mbs
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nqs nqsVar = (nqs) obj;
            if (this.a == nqsVar.a && this.b.equals(nqsVar.b) && this.c.equals(nqsVar.c) && this.d == nqsVar.d && this.e == nqsVar.e && this.f == nqsVar.f && this.g == nqsVar.g && Arrays.equals(this.h, nqsVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + Arrays.hashCode(this.h);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
