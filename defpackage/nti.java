package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nti {
    public final nox a;
    public ntz d;
    public nte e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final String j;
    public boolean k;
    public final nty b = new nty();
    public final mfr c = new mfr();
    private final mfr l = new mfr(1);
    private final mfr m = new mfr();

    public nti(nox noxVar, ntz ntzVar, nte nteVar, String str) {
        this.a = noxVar;
        this.d = ntzVar;
        this.e = nteVar;
        this.j = str;
        e(ntzVar, nteVar);
    }

    public final int a() {
        int i = !this.k ? this.d.g[this.f] : this.b.j[this.f] ? 1 : 0;
        return d() != null ? i | 1073741824 : i;
    }

    public final int b(int i, int i2) {
        mfr mfrVar;
        ntx ntxVarD = d();
        if (ntxVarD == null) {
            return 0;
        }
        int i3 = ntxVarD.d;
        if (i3 != 0) {
            mfrVar = this.b.n;
        } else {
            byte[] bArr = ntxVarD.e;
            String str = mgb.a;
            mfr mfrVar2 = this.m;
            int length = bArr.length;
            mfrVar2.I(bArr, length);
            mfrVar = mfrVar2;
            i3 = length;
        }
        nty ntyVar = this.b;
        boolean zC = ntyVar.c(this.f);
        boolean z = zC || i2 != 0;
        mfr mfrVar3 = this.l;
        mfrVar3.a[0] = (byte) ((true != z ? 0 : 128) | i3);
        mfrVar3.K(0);
        nox noxVar = this.a;
        noxVar.n(mfrVar3, 1, 1);
        noxVar.n(mfrVar, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!zC) {
            mfr mfrVar4 = this.c;
            mfrVar4.G(8);
            byte[] bArr2 = mfrVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i2;
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            noxVar.n(mfrVar4, 8, 1);
            return i3 + 9;
        }
        int i4 = i3 + 1;
        mfr mfrVar5 = ntyVar.n;
        int iN = mfrVar5.n();
        mfrVar5.L(-2);
        int i5 = (iN * 6) + 2;
        if (i2 != 0) {
            mfr mfrVar6 = this.c;
            mfrVar6.G(i5);
            byte[] bArr3 = mfrVar6.a;
            mfrVar5.F(bArr3, 0, i5);
            int i6 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i6 >> 8) & 255);
            bArr3[3] = (byte) (i6 & 255);
            mfrVar5 = mfrVar6;
        }
        noxVar.n(mfrVar5, i5, 1);
        return i4 + i5;
    }

    public final long c() {
        return !this.k ? this.d.c[this.f] : this.b.f[this.h];
    }

    public final ntx d() {
        if (!this.k) {
            return null;
        }
        nty ntyVar = this.b;
        nte nteVar = ntyVar.a;
        String str = mgb.a;
        int i = nteVar.a;
        ntx ntxVarB = ntyVar.m;
        if (ntxVarB == null) {
            ntxVarB = this.d.a.b(i);
        }
        if (ntxVarB == null || !ntxVarB.a) {
            return null;
        }
        return ntxVarB;
    }

    public final void e(ntz ntzVar, nte nteVar) {
        this.d = ntzVar;
        this.e = nteVar;
        mat matVar = new mat(ntzVar.a.g);
        matVar.a(this.j);
        this.a.i(new mau(matVar));
        f();
    }

    public final void f() {
        nty ntyVar = this.b;
        ntyVar.d = 0;
        ntyVar.p = 0L;
        ntyVar.q = false;
        ntyVar.k = false;
        ntyVar.o = false;
        ntyVar.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.k = false;
    }

    public final boolean g() {
        this.f++;
        if (!this.k) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }
}
