package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnwj {
    private final fcsu a;
    private final fcsu b;

    public cnwj(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    public final Optional a() {
        boolean zValueOf;
        Object objE = ((cczi) cmqf.a.get()).e();
        try {
            zValueOf = Boolean.valueOf(((cnwl) ((cnxa) this.b.b()).g.l()).g);
        } catch (evtj unused) {
            zValueOf = false;
        }
        if (fdbq.f(objE, zValueOf)) {
            ejxr ejxrVar = cmqf.a;
            return (!(((Boolean) ((cczi) ejxrVar.get()).e()).booleanValue() && ((cnxa) this.b.b()).c() && !((cmqf) this.a.b()).u()) && (((Boolean) ((cczi) ejxrVar.get()).e()).booleanValue() || !((cnxa) this.b.b()).c())) ? Optional.empty() : Optional.of(enqq.APP_STARTUP_RESUME_SYNC);
        }
        ((cnxa) this.b.b()).g.m(new ejvr() { // from class: cnwu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cczi ccziVar = cnxa.a;
                cnwk cnwkVar = (cnwk) ((cnwl) obj).toBuilder();
                boolean zBooleanValue = ((Boolean) ((cczi) cmqf.a.get()).e()).booleanValue();
                cnwkVar.copyOnWrite();
                cnwl cnwlVar = (cnwl) cnwkVar.instance;
                cnwlVar.b |= 16;
                cnwlVar.g = zBooleanValue;
                return (cnwl) cnwkVar.build();
            }
        });
        return Optional.of(enqq.REDESIGN_FLAG_FLIP);
    }
}
