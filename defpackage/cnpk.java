package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnpk implements cnod {
    private static final cqce a = cqce.g("Bugle", "WorkQueueReverseTelephonySyncScheduler");
    private final cazj b;
    private final fcsu c;
    private final cogw d;
    private final fcsu e;

    public cnpk(cazj cazjVar, final cmgk cmgkVar, cogw cogwVar, fcsu fcsuVar) {
        this.b = cazjVar;
        this.c = new fcsu() { // from class: cnpj
            @Override // defpackage.fcsu
            public final Object b() {
                cmgg cmggVarC = cmgh.c();
                cmggVarC.d(cmfn.REVERSE_TELEPHONY_SYNC_STATE);
                cmggVarC.f(cnoh.a);
                return cmgkVar.a(cmggVarC.a());
            }
        };
        this.d = cogwVar;
        this.e = fcsuVar;
    }

    @Override // defpackage.cnod
    public final void a() {
        a.p("Scheduling reverse sync immediately");
        this.b.a(cbcu.f("ReverseTelephonySync", cnor.a));
    }

    @Override // defpackage.cnod
    public final void b(Duration duration) {
        cqbd cqbdVarC = a.c();
        cqbdVarC.I("Scheduling reverse sync with delay");
        cqbdVarC.A("initialDelay", duration);
        cqbdVarC.r();
        cnoq cnoqVar = (cnoq) cnor.a.createBuilder();
        evvp evvpVarC = evxc.c(this.d.f().toEpochMilli());
        cnoqVar.copyOnWrite();
        cnor cnorVar = (cnor) cnoqVar.instance;
        evvpVarC.getClass();
        cnorVar.c = evvpVarC;
        cnorVar.b |= 1;
        evrj evrjVarD = evwy.d(duration.toMillis());
        cnoqVar.copyOnWrite();
        cnor cnorVar2 = (cnor) cnoqVar.instance;
        evrjVarD.getClass();
        cnorVar2.d = evrjVarD;
        cnorVar2.b |= 2;
        this.b.a(cbcu.f("ReverseTelephonySync", cnoqVar.build()));
    }

    @Override // defpackage.cnod
    public final boolean c() {
        return ((cnoj) this.e.b()).a();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [cmfo, java.lang.Object] */
    @Override // defpackage.cnod
    public final boolean d() {
        try {
            cnog cnogVar = ((cnoh) this.c.b().l()).c;
            if (cnogVar == null) {
                cnogVar = cnog.a;
            }
            return cnogVar.b;
        } catch (evtj e) {
            a.s("Incorrect protobuf in settings store", e);
            return false;
        }
    }
}
