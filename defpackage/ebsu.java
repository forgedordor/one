package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebsu {
    public static final ebsu a;
    public static final ebsu b;
    public static final ebsu c;
    public final boolean d;
    public final boolean e;
    public final ekgb f;
    public final ekgb g;

    static {
        ebst ebstVar = new ebst();
        ebstVar.d();
        a = ebstVar.a();
        ebst ebstVar2 = new ebst();
        ebstVar2.d();
        ebstVar2.b(new ebss());
        b = ebstVar2.a();
        ebst ebstVar3 = new ebst();
        ejwl.m(ebstVar3.a == null, "A SourcePolicy can only set internal() or external() once.");
        ebstVar3.a = true;
        c = ebstVar3.a();
    }

    public ebsu(boolean z, boolean z2, ekgb ekgbVar, ekgb ekgbVar2) {
        this.d = z;
        this.e = z2;
        this.f = ekgbVar;
        this.g = ekgbVar2;
    }

    public static ebsu a(String str) {
        ebst ebstVar = new ebst();
        ebstVar.d();
        ebstVar.c();
        ebstVar.b(new ebsr(str));
        return ebstVar.a();
    }
}
