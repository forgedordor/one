package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecnk {
    public ecnm a;
    private final ekfw b;
    private final ekfw c;
    private final ejwi d = ejud.a;

    public ecnk() {
        int i = ekgb.d;
        this.b = new ekfw();
        this.c = new ekfw();
    }

    public final ecnr a() {
        if (this.a == null) {
            this.a = new ecnm();
        }
        return new ecnr(this.d, this.b.g(), this.c.g(), this.a);
    }

    public final void b(ecnq ecnqVar) {
        this.b.h(ecnqVar);
    }

    public final void c(String str) {
        this.b.h(new ecnn(str));
    }

    public final void d(ecnp ecnpVar) {
        this.c.h(ecnpVar);
    }
}
