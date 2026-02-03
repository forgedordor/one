package defpackage;

import j$.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nyd implements nyf {
    private final mfr a;
    private final String c;
    private final int d;
    private String f;
    private nox g;
    private int i;
    private int j;
    private long k;
    private mau l;
    private int m;
    private int n;
    private int h = 0;
    private long q = -9223372036854775807L;
    private final AtomicInteger b = new AtomicInteger();
    private int o = -1;
    private int p = -1;
    private final String e = "video/mp2t";

    public nyd(String str, int i, int i2) {
        this.a = new mfr(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    private final void f(nnp nnpVar) {
        int i;
        int i2 = nnpVar.b;
        if (i2 == -2147483647 || (i = nnpVar.c) == -1) {
            return;
        }
        mau mauVar = this.l;
        if (mauVar != null && i == mauVar.G && i2 == mauVar.H && Objects.equals(nnpVar.a, mauVar.o)) {
            return;
        }
        mau mauVar2 = this.l;
        mat matVar = mauVar2 == null ? new mat() : new mat(mauVar2);
        matVar.a = this.f;
        matVar.a(this.e);
        matVar.c(nnpVar.a);
        matVar.E = i;
        matVar.F = i2;
        matVar.d = this.c;
        matVar.f = this.d;
        mau mauVar3 = new mau(matVar);
        this.l = mauVar3;
        this.g.i(mauVar3);
    }

    private final boolean g(mfr mfrVar, byte[] bArr, int i) {
        int iMin = Math.min(mfrVar.a(), i - this.i);
        mfrVar.F(bArr, this.i, iMin);
        int i2 = this.i + iMin;
        this.i = i2;
        return i2 == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04a3  */
    @Override // defpackage.nyf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.mfr r31) throws defpackage.mby {
        /*
            Method dump skipped, instructions count: 1385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nyd.a(mfr):void");
    }

    @Override // defpackage.nyf
    public final void b(nnu nnuVar, nzq nzqVar) {
        nzqVar.c();
        this.f = nzqVar.b();
        this.g = nnuVar.p(nzqVar.a(), 1);
    }

    @Override // defpackage.nyf
    public final void d(long j, int i) {
        this.q = j;
    }

    @Override // defpackage.nyf
    public final void e() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.q = -9223372036854775807L;
        this.b.set(0);
    }

    @Override // defpackage.nyf
    public final void c(boolean z) {
    }
}
