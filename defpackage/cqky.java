package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqky {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    private final fcsu d;

    public cqky(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.d = fcsuVar3;
        this.c = fcsuVar4;
    }

    public final boolean a() {
        if (b()) {
            return true;
        }
        return ((Boolean) this.d.b()).booleanValue();
    }

    public final boolean b() {
        return ((crqv) this.b.b()).q("debugging_features_enabled", ((Boolean) ccze.Y.e()).booleanValue());
    }
}
