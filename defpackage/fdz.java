package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fdz implements kel {
    private final kel a;
    private final int b;
    private final int c;

    public fdz(kel kelVar, int i, int i2) {
        this.a = kelVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.kel
    public final int a(int i) {
        int iA = this.a.a(i);
        if (i >= 0 && i <= this.b) {
            fea.b(iA, this.c, i);
        }
        return iA;
    }

    @Override // defpackage.kel
    public final int b(int i) {
        int iB = this.a.b(i);
        if (i >= 0 && i <= this.c) {
            fea.c(iB, this.b, i);
        }
        return iB;
    }
}
