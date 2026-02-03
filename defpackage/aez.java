package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aez {
    private final String a;
    private int b = 2;

    public aez(String str) {
        lcg.i(str);
        this.a = str;
    }

    public final afa a() {
        return new afa(new ajy(this.a, 4, this.b, null, null, null, null, null, null));
    }

    public final void b(int i) {
        lcg.f(i, 1, 3, "cardinality");
        this.b = i;
    }
}
