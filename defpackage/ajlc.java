package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajlc implements fcsu {
    private final fcsu a;
    private final fcsu b;
    private final eygg c;

    public ajlc(fcsu fcsuVar, final fcsu fcsuVar2) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        fcsuVar2.getClass();
        final ejxr ejxrVarA = ejxx.a(new ejxr() { // from class: ajla
            @Override // defpackage.ejxr
            public final Object get() {
                return fcsuVar2.b();
            }
        });
        ejxrVarA.getClass();
        this.c = new eygg() { // from class: ajlb
            @Override // defpackage.eygg
            public final Object b() {
                return ejxrVarA.get();
            }
        };
    }

    @Override // defpackage.fcsu
    public final Object b() {
        return ((Boolean) this.a.b()).booleanValue() ? this.c.b() : this.b.b();
    }
}
