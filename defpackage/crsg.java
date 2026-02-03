package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crsg {
    public static final cqce a = cqce.g("Bugle", "GoogleTosHelper");
    public final fcsu b;
    public final cqbm c;
    private final fcsu d;
    private final fcsu e;

    public crsg(fcsu fcsuVar, cqbm cqbmVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.b = fcsuVar;
        this.c = cqbmVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
    }

    @Deprecated
    public final boolean a() {
        if (((aruf) this.e.b()).a()) {
            return false;
        }
        enwr enwrVarD = ((chza) this.c.a()).d();
        if (enwrVarD != enwr.CARRIER_SETUP_PENDING && enwrVarD != enwr.DISABLED_FROM_PREFERENCES && (!((arui) this.d.b()).a() || !new dgid(enwrVarD).b())) {
            cqbd cqbdVarA = a.a();
            cqbdVarA.I("Don't show Google ToS because rcs availability is not ready for provisioning");
            cqbdVarA.A("RCS availability:", enwrVarD.toString());
            cqbdVarA.r();
            return false;
        }
        if (dfar.b()) {
            cqbd cqbdVarA2 = a.a();
            cqbdVarA2.I("Show Google ToS");
            cqbdVarA2.r();
            return true;
        }
        cqbd cqbdVarA3 = a.a();
        cqbdVarA3.I("Not showing Google ToS");
        cqbdVarA3.r();
        return false;
    }
}
