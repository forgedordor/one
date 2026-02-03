package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nsu {
    public final int a;
    public int b;
    public int c;
    public long d;
    private final boolean e;
    private final mfr f;
    private final mfr g;
    private int h;
    private int i;

    public nsu(mfr mfrVar, mfr mfrVar2, boolean z) throws mby {
        this.g = mfrVar;
        this.f = mfrVar2;
        this.e = z;
        mfrVar2.K(12);
        this.a = mfrVar2.m();
        mfrVar.K(12);
        this.i = mfrVar.m();
        nnv.b(mfrVar.e() == 1, "first_chunk must be 1");
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        this.d = this.e ? this.f.s() : this.f.r();
        if (this.b == this.h) {
            mfr mfrVar = this.g;
            this.c = mfrVar.m();
            mfrVar.L(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? (-1) + mfrVar.m() : -1;
        }
        return true;
    }
}
