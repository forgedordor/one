package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnhu {
    private final fcsu a;
    private final cogw b;
    private final atau c;

    public cnhu(fcsu fcsuVar, cogw cogwVar, atau atauVar) {
        this.a = fcsuVar;
        this.b = cogwVar;
        this.c = atauVar;
    }

    public final void a(augw augwVar) {
        if ((augwVar.b & 2048) != 0) {
            auib auibVar = augwVar.n;
            if (auibVar == null) {
                auibVar = auib.a;
            }
            d(auibVar, basd.a(augwVar.h), 4);
        }
    }

    public final void b(augw augwVar) {
        if ((augwVar.b & 2048) != 0) {
            auib auibVar = augwVar.n;
            if (auibVar == null) {
                auibVar = auib.a;
            }
            d(auibVar, basd.a(augwVar.h), 9);
        }
    }

    public final void c(fhaz fhazVar, basd basdVar, int i, int i2) {
        if (cqdz.a(fhazVar)) {
            aill aillVar = (aill) this.a.b();
            ellg ellgVar = (ellg) ellh.a.createBuilder();
            ellf ellfVar = ellf.XSL_REQUEST_EVENT;
            ellgVar.copyOnWrite();
            ellh ellhVar = (ellh) ellgVar.instance;
            ellhVar.j = ellfVar.f11do;
            ellhVar.b |= 1;
            febx febxVar = (febx) fecc.a.createBuilder();
            febxVar.copyOnWrite();
            fecc feccVar = (fecc) febxVar.instance;
            fhazVar.getClass();
            feccVar.c = fhazVar;
            feccVar.b |= 1;
            febv febvVar = (febv) febw.a.createBuilder();
            febvVar.a(basdVar.f());
            febxVar.copyOnWrite();
            fecc feccVar2 = (fecc) febxVar.instance;
            febw febwVar = (febw) febvVar.build();
            febwVar.getClass();
            feccVar2.d = febwVar;
            feccVar2.b |= 2;
            febxVar.copyOnWrite();
            ((fecc) febxVar.instance).f = fhba.a(27);
            febxVar.copyOnWrite();
            ((fecc) febxVar.instance).e = fecb.a(i);
            febxVar.copyOnWrite();
            ((fecc) febxVar.instance).g = feca.a(i2);
            evvp evvpVarC = evxc.c(this.b.f().toEpochMilli());
            febxVar.copyOnWrite();
            fecc feccVar3 = (fecc) febxVar.instance;
            evvpVarC.getClass();
            feccVar3.h = evvpVarC;
            feccVar3.b |= 4;
            ellgVar.copyOnWrite();
            ellh ellhVar2 = (ellh) ellgVar.instance;
            fecc feccVar4 = (fecc) febxVar.build();
            feccVar4.getClass();
            ellhVar2.aS = feccVar4;
            ellhVar2.e |= 16777216;
            aillVar.j(ellgVar);
        }
    }

    public final void d(auib auibVar, basd basdVar, int i) {
        c((fhaz) this.c.fH().fM(auibVar), basdVar, i, 42);
    }
}
