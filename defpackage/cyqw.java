package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyqw implements cyqs {
    public static final cqce a = cqce.g("BugleGDitto", "DevicePairingEntryPoint");
    public final ea b;
    public final efwo c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    private final egpr h;
    private final fcsu i;
    private final egps j = new cyqt(this);
    private final egps k = new cyqu(this);
    private final egps l = new cyqv();

    public cyqw(ea eaVar, efwo efwoVar, egpr egprVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.b = eaVar;
        this.c = efwoVar;
        this.h = egprVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.i = fcsuVar3;
        this.f = fcsuVar4;
        this.g = fcsuVar5;
    }

    @Override // defpackage.cyqs
    public final void a() {
        this.h.g(new egpq(((bvmu) this.i.b()).c()), this.j);
    }

    @Override // defpackage.cyqs
    public final void b() {
        this.h.g(new egpq(((bvmu) this.i.b()).d()), this.k);
    }

    @Override // defpackage.cyqs
    public final void c() {
        egpr egprVar = this.h;
        egprVar.j(this.j);
        egprVar.j(this.k);
        egprVar.j(this.l);
    }

    @Override // defpackage.cyqs
    public final void d() {
        ((ekrd) a.i().h("com/google/android/apps/messaging/ui/gaia/DevicePairingEntryPointImpl", "launchGaiaPairing", 113, "DevicePairingEntryPointImpl.java")).q("Launching GaiaPairing page.");
        ((cyrb) this.d.b()).a(this.b.fg(), true);
    }
}
