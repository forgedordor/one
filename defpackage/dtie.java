package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtie implements koa {
    final /* synthetic */ int a;

    public dtie(int i) {
        this.a = i;
    }

    @Override // defpackage.koa
    public final long a(kjd kjdVar, long j, kji kjiVar, long j2) {
        kjiVar.getClass();
        int iB = kjdVar.b() - ((int) (j2 >> 32));
        int i = kjdVar.c - ((int) (j2 & 4294967295L));
        int i2 = this.a;
        int i3 = i - i2;
        if (i3 < 0) {
            i3 = kjdVar.e + i2;
        }
        return ((kjdVar.b + (iB / 2)) << 32) | (4294967295L & i3);
    }
}
