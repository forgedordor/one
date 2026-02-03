package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class babu {
    private String sz;

    public void fY(String str) {
        if (i() || str == null) {
            throw new IllegalStateException();
        }
        this.sz = str;
    }

    public void g(String str) {
        if (!j(str)) {
            throw new IllegalStateException();
        }
        this.sz = null;
        h();
    }

    protected abstract void h();

    protected boolean i() {
        return this.sz != null;
    }

    public final boolean j(String str) {
        return str.equals(this.sz);
    }
}
