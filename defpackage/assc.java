package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class assc {
    private final fcsu a;
    private final cogw b;
    private final atau c;

    public assc(fcsu fcsuVar, cogw cogwVar, atau atauVar) {
        this.a = fcsuVar;
        this.b = cogwVar;
        this.c = atauVar;
    }

    public final void a(auib auibVar, basd basdVar) {
        e(auibVar, basdVar, 21, 8, 5);
    }

    public final void b(auib auibVar, basd basdVar) {
        e(auibVar, basdVar, 21, 8, 6);
    }

    public final void c(Optional optional, basd basdVar) {
        if (optional.isEmpty()) {
            return;
        }
        e((auib) optional.get(), basdVar, 21, 8, 4);
    }

    public final void d(Optional optional, basd basdVar) {
        if (optional.isEmpty()) {
            return;
        }
        e((auib) optional.get(), basdVar, 21, 8, 9);
    }

    public final void e(auib auibVar, basd basdVar, int i, int i2, int i3) {
        fhaz fhazVar = (fhaz) this.c.fH().fM(auibVar);
        if (cqdz.a(fhazVar)) {
            febx febxVar = (febx) fecc.a.createBuilder();
            febxVar.copyOnWrite();
            fecc feccVar = (fecc) febxVar.instance;
            fhazVar.getClass();
            feccVar.c = fhazVar;
            feccVar.b |= 1;
            if (basd.l(basdVar)) {
                febv febvVar = (febv) febw.a.createBuilder();
                febvVar.a(basdVar.f());
                febxVar.copyOnWrite();
                fecc feccVar2 = (fecc) febxVar.instance;
                febw febwVar = (febw) febvVar.build();
                febwVar.getClass();
                feccVar2.d = febwVar;
                feccVar2.b |= 2;
            }
            febxVar.copyOnWrite();
            ((fecc) febxVar.instance).f = fhba.a(i);
            febxVar.copyOnWrite();
            ((fecc) febxVar.instance).g = feca.a(i2);
            febxVar.copyOnWrite();
            ((fecc) febxVar.instance).e = fecb.a(i3);
            evvp evvpVarC = evxc.c(this.b.f().toEpochMilli());
            febxVar.copyOnWrite();
            fecc feccVar3 = (fecc) febxVar.instance;
            evvpVarC.getClass();
            feccVar3.h = evvpVarC;
            feccVar3.b |= 4;
            aill aillVar = (aill) this.a.b();
            ellg ellgVar = (ellg) ellh.a.createBuilder();
            ellf ellfVar = ellf.XSL_REQUEST_EVENT;
            ellgVar.copyOnWrite();
            ellh ellhVar = (ellh) ellgVar.instance;
            ellhVar.j = ellfVar.f11do;
            ellhVar.b |= 1;
            ellgVar.copyOnWrite();
            ellh ellhVar2 = (ellh) ellgVar.instance;
            fecc feccVar4 = (fecc) febxVar.build();
            feccVar4.getClass();
            ellhVar2.aS = feccVar4;
            ellhVar2.e |= 16777216;
            aillVar.j(ellgVar);
        }
    }
}
