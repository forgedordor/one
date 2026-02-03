package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rri {
    final Class a;
    final Class b;
    final rrh c;

    public rri(Class cls, Class cls2, rrh rrhVar) {
        this.a = cls;
        this.b = cls2;
        this.c = rrhVar;
    }

    public final boolean a(Class cls, Class cls2) {
        return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.b);
    }
}
