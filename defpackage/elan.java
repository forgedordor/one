package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class elan extends elat {
    private final int a;
    private final int[] b;

    public elan(int i, int[] iArr) {
        this.a = i;
        this.b = iArr;
    }

    @Override // defpackage.elat
    public final int c(int i) {
        return this.b[i];
    }

    @Override // defpackage.elat
    public final int d() {
        return this.b.length;
    }

    @Override // defpackage.elat
    public final int e() {
        return this.a;
    }
}
