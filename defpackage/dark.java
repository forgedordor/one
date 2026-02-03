package defpackage;

import j$.time.Duration;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dark implements ctap {
    public final cmfo a;
    public final cogw b;
    private final fcsu c;
    private final fdjx d;

    public dark(fcsu fcsuVar, cmfo cmfoVar, fdjx fdjxVar, fdjx fdjxVar2, cogw cogwVar) {
        fcsuVar.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        cogwVar.getClass();
        this.c = fcsuVar;
        this.a = cmfoVar;
        this.d = fdjxVar;
        this.b = cogwVar;
    }

    @Override // defpackage.ctap
    public final eiju a() throws IOException {
        eieu eieuVarH = eiiy.h("PairedWatchNodeDataServiceImpl#markDeviceOnline");
        try {
            eiju eijuVarC = auvw.c(this.d, fcyi.a, fdjz.a, new darj(this, null));
            fczl.a(eieuVarH, null);
            return eijuVarC;
        } finally {
        }
    }

    @Override // defpackage.ctap
    public final boolean b() throws IOException {
        eieu eieuVarH = eiiy.h("PairedWatchNodeDataServiceImpl#isRecentlyOnlineSync");
        try {
            boolean zC = c((dare) this.a.l());
            fczl.a(eieuVarH, null);
            return zC;
        } finally {
        }
    }

    public final boolean c(dare dareVar) {
        if ((dareVar.b & 1) != 0) {
            Object objB = this.c.b();
            objB.getClass();
            Duration durationOfDays = Duration.ofDays(((Number) objB).longValue());
            evvp evvpVar = dareVar.c;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
            evvpVar.getClass();
            if (durationOfDays.compareTo(Duration.between(evxd.d(evvpVar), this.b.f())) > 0) {
                return true;
            }
        }
        return false;
    }
}
