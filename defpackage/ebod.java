package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebod extends ebob {
    protected int a;

    public ebod() {
        super("Max-Forwards");
    }

    @Override // defpackage.ebob
    public final String a() {
        int i = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        return sb.toString();
    }

    public final void b(int i) {
        if (i < 0 || i > 255) {
            throw new IllegalArgumentException(a.g(i, "bad max forwards value "));
        }
        this.a = i;
    }

    @Override // defpackage.ebob
    public final ebmk d() {
        return null;
    }
}
