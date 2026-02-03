package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dljl {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;

    public dljl() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dljl)) {
            return false;
        }
        dljl dljlVar = (dljl) obj;
        int i = dljlVar.a;
        int i2 = dljlVar.b;
        int i3 = dljlVar.c;
        int i4 = dljlVar.d;
        int i5 = dljlVar.e;
        int i6 = dljlVar.f;
        int i7 = dljlVar.g;
        int i8 = dljlVar.h;
        int i9 = dljlVar.i;
        int i10 = dljlVar.j;
        int i11 = dljlVar.k;
        int i12 = dljlVar.l;
        int i13 = dljlVar.m;
        int i14 = dljlVar.n;
        int i15 = dljlVar.o;
        int i16 = dljlVar.p;
        return true;
    }

    public final int hashCode() {
        return -566205836;
    }

    public final String toString() {
        return "Duration(extraLong1=700, extraLong2=800, extraLong3=900, extraLong4=1000, long1=450, long2=500, long3=550, long4=600, medium1=250, medium2=300, medium3=350, medium4=400, short1=50, short2=100, short3=150, short4=200)";
    }

    public /* synthetic */ dljl(byte[] bArr) {
        this.a = 700;
        this.b = 800;
        this.c = 900;
        this.d = 1000;
        this.e = 450;
        this.f = 500;
        this.g = 550;
        this.h = 600;
        this.i = 250;
        this.j = 300;
        this.k = 350;
        this.l = 400;
        this.m = 50;
        this.n = 100;
        this.o = 150;
        this.p = BasePaymentResult.ERROR_REQUEST_FAILED;
    }
}
