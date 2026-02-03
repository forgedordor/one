package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cujp {
    final /* synthetic */ cujq a;
    private final int b;
    private int c;
    private int d;

    public cujp(cujq cujqVar, int i) {
        this.a = cujqVar;
        this.b = i;
    }

    final void a(int i) {
        int i2;
        int i3 = this.c;
        if (i3 == i) {
            return;
        }
        int i4 = this.d;
        if (i > i4) {
            this.d = i;
            i4 = i;
        }
        if (i == i4) {
            this.a.a.d(false);
        }
        int i5 = this.d - i;
        int i6 = this.b;
        if (i5 > i6) {
            daoe daoeVar = this.a.a;
            daoeVar.d(true);
            daoeVar.c(i5);
        } else if (i3 > 0 && (i2 = i - i3) > i6) {
            daoe daoeVar2 = this.a.a;
            daoeVar2.d(false);
            daoeVar2.c(i2);
        }
        this.c = i;
    }
}
