package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cohh {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;

    public cohh(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.e = fcsuVar5;
    }

    public final conr a() {
        return (((cozg) this.e.b()).d() == enmr.TRANSPORT_TACHYGRAM || ((Boolean) ((cczi) ateo.a.get()).e()).booleanValue()) ? (conr) this.a.b() : (conr) this.b.b();
    }

    public final covy b() {
        return ((cozg) this.e.b()).d() == enmr.TRANSPORT_TACHYGRAM ? (covy) this.c.b() : (covy) this.d.b();
    }
}
