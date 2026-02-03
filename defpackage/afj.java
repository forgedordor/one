package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afj {
    private final String a;
    private int b = 2;
    private int c = 0;

    public afj(String str) {
        lcg.i(str);
        this.a = str;
    }

    public final afk a() {
        return new afk(new ajy(this.a, 2, this.b, null, null, null, new ajv(this.c), null, null));
    }

    public final void b(int i) {
        lcg.f(i, 1, 3, "cardinality");
        this.b = i;
    }

    public final void c(int i) {
        lcg.f(i, 0, 1, "indexingType");
        this.c = i;
    }
}
