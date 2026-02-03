package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmeg implements cmea {
    public static final cqce a = cqce.g("BugleSearch", "SearchDataServiceImpl");
    public final cogw b;
    private final ecjh c;
    private final eosc d;

    public cmeg(ecjh ecjhVar, eosc eoscVar, cogw cogwVar) {
        this.c = ecjhVar;
        this.d = eoscVar;
        this.b = cogwVar;
    }

    @Override // defpackage.cmea
    public final eiju a() {
        return eiju.g(this.c.a()).h(new ejvr() { // from class: cmeb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                evvp evvpVar = ((cmdz) obj).d;
                if (evvpVar == null) {
                    evvpVar = evvp.a;
                }
                return evwz.d(evvpVar);
            }
        }, this.d);
    }

    @Override // defpackage.cmea
    public final eiju b() {
        return eiju.g(this.c.a()).h(new ejvr() { // from class: cmec
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Long.valueOf(((cmdz) obj).c);
            }
        }, this.d);
    }

    @Override // defpackage.cmea
    public final void c() {
        auvh.h(eiju.g(this.c.b(new ejvr() { // from class: cmee
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cmdy cmdyVar = (cmdy) ((cmdz) obj).toBuilder();
                evvp evvpVarB = evwz.b(this.a.b.f());
                cmdyVar.copyOnWrite();
                cmdz cmdzVar = (cmdz) cmdyVar.instance;
                evvpVarB.getClass();
                cmdzVar.d = evvpVarB;
                cmdzVar.b |= 32;
                return (cmdz) cmdyVar.build();
            }
        }, eoqg.a)));
    }

    @Override // defpackage.cmea
    public final void d() {
        eiju.g(this.c.b(new ejvr() { // from class: cmed
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cmdy cmdyVar = (cmdy) ((cmdz) obj).toBuilder();
                long epochMilli = this.a.b.f().toEpochMilli();
                cmdyVar.copyOnWrite();
                cmdz cmdzVar = (cmdz) cmdyVar.instance;
                cmdzVar.b |= 16;
                cmdzVar.c = epochMilli;
                return (cmdz) cmdyVar.build();
            }
        }, eoqg.a)).k(auwc.a(new cmef()), this.d);
    }
}
