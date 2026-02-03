package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afg {
    private final String a;
    private int b = 2;

    public afg(String str) {
        lcg.i(str);
        this.a = str;
    }

    public final afh a() {
        return new afh(new ajy(this.a, 3, this.b, null, null, null, null, null, null));
    }

    public final void b(int i) {
        lcg.f(i, 1, 3, "cardinality");
        this.b = i;
    }
}
