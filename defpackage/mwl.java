package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mwl {
    public final String a;
    public int b;
    public long c;
    public nen d;
    public boolean e;
    public boolean f;
    final /* synthetic */ mwm g;

    public mwl(mwm mwmVar, String str, int i, nen nenVar) {
        this.g = mwmVar;
        this.a = str;
        this.b = i;
        this.c = nenVar == null ? -1L : nenVar.d;
        if (nenVar == null || !nenVar.b()) {
            return;
        }
        this.d = nenVar;
    }

    public final boolean a(mtv mtvVar) {
        nen nenVar = mtvVar.d;
        if (nenVar == null) {
            return this.b != mtvVar.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        long j2 = nenVar.d;
        if (j2 > j) {
            return true;
        }
        if (this.d == null) {
            return false;
        }
        mcl mclVar = mtvVar.b;
        int iA = mclVar.a(nenVar.a);
        int iA2 = mclVar.a(this.d.a);
        nen nenVar2 = this.d;
        if (j2 < nenVar2.d || iA < iA2) {
            return false;
        }
        if (iA > iA2) {
            return true;
        }
        if (!nenVar.b()) {
            int i = nenVar.e;
            return i == -1 || i > nenVar2.b;
        }
        int i2 = nenVar.b;
        int i3 = nenVar.c;
        int i4 = nenVar2.b;
        if (i2 <= i4) {
            return i2 == i4 && i3 > nenVar2.c;
        }
        return true;
    }
}
