package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwea implements koa {
    final /* synthetic */ kji a;
    final /* synthetic */ long b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;

    public cwea(kji kjiVar, long j, int i, int i2, int i3, int i4, int i5) {
        this.a = kjiVar;
        this.b = j;
        this.c = i;
        this.g = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }

    @Override // defpackage.koa
    public final long a(kjd kjdVar, long j, kji kjiVar, long j2) {
        int iA;
        int iB;
        kjiVar.getClass();
        if (this.a == kji.b) {
            iA = kjb.a(this.b) - this.c;
        } else {
            iA = kjb.a(this.b);
        }
        int i = this.g;
        if (i == 4 || i == 3) {
            iB = kjb.b(this.b) - this.d;
        } else {
            long j3 = this.b;
            iB = (kjb.b(j3) - this.e) + this.f;
        }
        return (iB & 4294967295L) | (iA << 32);
    }
}
