package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebst {
    public Boolean a;
    private final ekfw b;
    private final ekfw c;
    private boolean d;

    public ebst() {
        int i = ekgb.d;
        this.b = new ekfw();
        this.c = new ekfw();
        this.d = false;
    }

    public final ebsu a() {
        this.a.getClass();
        return new ebsu(this.a.booleanValue(), this.d, this.b.g(), this.c.g());
    }

    public final void b(ebsz ebszVar) {
        this.a.getClass();
        this.b.h(ebszVar);
    }

    public final void c() {
        this.d = true;
    }

    public final void d() {
        ejwl.m(this.a == null, "A SourcePolicy can only set internal() or external() once.");
        this.a = false;
    }
}
