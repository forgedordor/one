package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class elad extends elat {
    private final int a;

    public elad(int i) {
        this.a = i;
    }

    @Override // defpackage.elat
    public final int c(int i) {
        throw new ArrayIndexOutOfBoundsException();
    }

    @Override // defpackage.elat
    public final int d() {
        return 0;
    }

    @Override // defpackage.elat
    public final int e() {
        return this.a;
    }

    @Override // defpackage.elat
    public final boolean f() {
        return true;
    }
}
