package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rsw {
    final Class a;
    final rez b;
    private final Class c;

    public rsw(Class cls, Class cls2, rez rezVar) {
        this.c = cls;
        this.a = cls2;
        this.b = rezVar;
    }

    public final boolean a(Class cls, Class cls2) {
        return this.c.isAssignableFrom(cls) && cls2.isAssignableFrom(this.a);
    }
}
