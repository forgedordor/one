package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afc {
    private final String a;
    private int b = 2;

    public afc(String str) {
        lcg.i(str);
        this.a = str;
    }

    public final afd a() {
        return new afd(new ajy(this.a, 5, this.b, null, null, null, null, null, null));
    }

    public final void b(int i) {
        lcg.f(i, 1, 3, "cardinality");
        this.b = i;
    }
}
