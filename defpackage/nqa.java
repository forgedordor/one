package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nqa extends npz {
    private final mfr a;
    private final mfr b;
    private int c;
    private boolean e;
    private boolean f;
    private int g;

    public nqa(nox noxVar) {
        super(noxVar);
        this.a = new mfr(mgy.a);
        this.b = new mfr(4);
    }

    @Override // defpackage.npz
    protected final boolean a(mfr mfrVar) throws npy {
        int iJ = mfrVar.j();
        int i = iJ >> 4;
        int i2 = iJ & 15;
        if (i2 != 7) {
            throw new npy(a.g(i2, "Video format not supported: "));
        }
        this.g = i;
        return i != 5;
    }

    @Override // defpackage.npz
    protected final boolean b(mfr mfrVar, long j) {
        int i;
        int iJ = mfrVar.j();
        byte[] bArr = mfrVar.a;
        int i2 = mfrVar.b;
        int i3 = i2 + 1;
        mfrVar.b = i3;
        int i4 = bArr[i2] & 255;
        int i5 = i2 + 2;
        mfrVar.b = i5;
        int i6 = bArr[i3] & 255;
        mfrVar.b = i2 + 3;
        int i7 = bArr[i5] & 255;
        if (iJ == 0) {
            if (!this.e) {
                mfr mfrVar2 = new mfr(new byte[mfrVar.a()]);
                mfrVar.F(mfrVar2.a, 0, mfrVar.a());
                nmx nmxVarA = nmx.a(mfrVar2);
                this.c = nmxVarA.b;
                mat matVar = new mat();
                matVar.a("video/x-flv");
                matVar.c("video/avc");
                matVar.j = nmxVarA.l;
                matVar.t = nmxVarA.c;
                matVar.u = nmxVarA.d;
                matVar.z = nmxVarA.k;
                matVar.p = nmxVarA.a;
                this.d.i(new mau(matVar));
                this.e = true;
                return false;
            }
        } else if (iJ == 1 && this.e) {
            int i8 = this.g == 1 ? 1 : 0;
            if (this.f) {
                i = i8;
            } else if (i8 != 0) {
                i = 1;
            }
            mfr mfrVar3 = this.b;
            byte[] bArr2 = mfrVar3.a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i9 = 4 - this.c;
            int i10 = 0;
            while (mfrVar.a() > 0) {
                mfrVar.F(mfrVar3.a, i9, this.c);
                mfrVar3.K(0);
                int iM = mfrVar3.m();
                mfr mfrVar4 = this.a;
                mfrVar4.K(0);
                nox noxVar = this.d;
                noxVar.m(mfrVar4, 4);
                noxVar.m(mfrVar, iM);
                i10 = i10 + 4 + iM;
            }
            this.d.o(j + ((((i4 << 24) >> 8) | (i6 << 8) | i7) * 1000), i, i10, 0, null);
            this.f = true;
            return true;
        }
        return false;
    }
}
