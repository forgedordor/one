package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class elai extends elat {
    private final int a;
    private final int b;
    private final int c;

    public elai(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.elat
    public final int c(int i) {
        return this.b + i;
    }

    @Override // defpackage.elat
    public final int d() {
        return this.c;
    }

    @Override // defpackage.elat
    public final int e() {
        return this.a;
    }
}
