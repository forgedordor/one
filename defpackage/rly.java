package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rly {
    final Class a;
    final rlr b;
    private final Class c;

    public rly(Class cls, Class cls2, rlr rlrVar) {
        this.c = cls;
        this.a = cls2;
        this.b = rlrVar;
    }

    public final boolean a(Class cls) {
        return this.c.isAssignableFrom(cls);
    }
}
