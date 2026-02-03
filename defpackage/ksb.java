package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ksb {
    public krz a = null;
    int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    final /* synthetic */ ksc h;
    private int i;
    private kry j;
    private kry k;
    private kry l;
    private kry m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;

    public ksb(ksc kscVar, int i, kry kryVar, kry kryVar2, kry kryVar3, kry kryVar4, int i2) {
        this.h = kscVar;
        this.o = 0;
        this.q = 0;
        this.i = i;
        this.j = kryVar;
        this.k = kryVar2;
        this.l = kryVar3;
        this.m = kryVar4;
        this.n = kscVar.aR;
        this.o = kscVar.aN;
        this.p = kscVar.aS;
        this.q = kscVar.aO;
        this.r = i2;
    }

    public final int a() {
        return this.i == 1 ? this.d - this.h.aD : this.d;
    }

    public final int b() {
        return this.i == 0 ? this.c - this.h.aC : this.c;
    }

    public final void c(krz krzVar) {
        if (this.i == 0) {
            ksc kscVar = this.h;
            int iAe = kscVar.ae(krzVar, this.r);
            if (krzVar.X() == 3) {
                this.g++;
                iAe = 0;
            }
            this.c += iAe + (krzVar.ar != 8 ? kscVar.aC : 0);
            int iC = kscVar.c(krzVar, this.r);
            if (this.a == null || this.b < iC) {
                this.a = krzVar;
                this.b = iC;
                this.d = iC;
            }
        } else {
            ksc kscVar2 = this.h;
            int iAe2 = kscVar2.ae(krzVar, this.r);
            int iC2 = kscVar2.c(krzVar, this.r);
            if (krzVar.Y() == 3) {
                this.g++;
                iC2 = 0;
            }
            this.d += iC2 + (krzVar.ar != 8 ? kscVar2.aD : 0);
            if (this.a == null || this.b < iAe2) {
                this.a = krzVar;
                this.b = iAe2;
                this.c = iAe2;
            }
        }
        this.f++;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ksb.d(boolean, int, boolean):void");
    }

    public final void e(int i) {
        int i2 = this.g;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f;
        int i4 = i / i2;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = this.e + i5;
            ksc kscVar = this.h;
            if (i6 >= kscVar.aK) {
                break;
            }
            krz krzVar = kscVar.aJ[i6];
            if (this.i == 0) {
                if (krzVar != null && krzVar.X() == 3 && krzVar.C == 0) {
                    kscVar.ak(krzVar, 1, i4, krzVar.Y(), krzVar.h());
                }
            } else if (krzVar != null && krzVar.Y() == 3 && krzVar.D == 0) {
                int i7 = i4;
                kscVar.ak(krzVar, krzVar.X(), krzVar.j(), 1, i7);
                i4 = i7;
            }
        }
        this.c = 0;
        this.d = 0;
        this.a = null;
        this.b = 0;
        int i8 = this.f;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.e + i9;
            ksc kscVar2 = this.h;
            if (i10 >= kscVar2.aK) {
                return;
            }
            krz krzVar2 = kscVar2.aJ[i10];
            if (this.i == 0) {
                int iJ = krzVar2.j();
                int i11 = kscVar2.aC;
                if (krzVar2.ar == 8) {
                    i11 = 0;
                }
                this.c += iJ + i11;
                int iC = kscVar2.c(krzVar2, this.r);
                if (this.a == null || this.b < iC) {
                    this.a = krzVar2;
                    this.b = iC;
                    this.d = iC;
                }
            } else {
                int iAe = kscVar2.ae(krzVar2, this.r);
                int iC2 = kscVar2.c(krzVar2, this.r);
                int i12 = kscVar2.aD;
                if (krzVar2.ar == 8) {
                    i12 = 0;
                }
                this.d += iC2 + i12;
                if (this.a == null || this.b < iAe) {
                    this.a = krzVar2;
                    this.b = iAe;
                    this.c = iAe;
                }
            }
        }
    }

    public final void f(int i, kry kryVar, kry kryVar2, kry kryVar3, kry kryVar4, int i2, int i3, int i4, int i5, int i6) {
        this.i = i;
        this.j = kryVar;
        this.k = kryVar2;
        this.l = kryVar3;
        this.m = kryVar4;
        this.n = i2;
        this.o = i3;
        this.p = i4;
        this.q = i5;
        this.r = i6;
    }
}
