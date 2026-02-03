package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfw<S> extends dhz<S> {
    private final hox b;
    private final hox c;

    public dfw(Object obj) {
        hsi hsiVar = hsi.a;
        this.b = new hpl(obj, hsiVar);
        this.c = new hpl(obj, hsiVar);
    }

    @Override // defpackage.dhz
    public final Object a() {
        return this.b.a();
    }

    @Override // defpackage.dhz
    public final Object b() {
        return this.c.a();
    }

    @Override // defpackage.dhz
    public final void c(Object obj) {
        this.b.b(obj);
    }

    public final void d(Object obj) {
        this.c.b(obj);
    }
}
