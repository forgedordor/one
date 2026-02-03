package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebny extends ebob {
    protected Integer a;

    public ebny() {
        super("Expires");
    }

    @Override // defpackage.ebob
    public final String a() {
        return this.a.toString();
    }

    public final int b() {
        return this.a.intValue();
    }

    @Override // defpackage.ebob
    public final ebmk d() {
        return null;
    }

    public final void e(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(a.g(i, "bad argument "));
        }
        this.a = Integer.valueOf(i);
    }
}
